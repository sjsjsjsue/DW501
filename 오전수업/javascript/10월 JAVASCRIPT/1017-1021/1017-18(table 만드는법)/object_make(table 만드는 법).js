var bt_cnt=0; // 어디서든 사용 가능 -> 전역변수
var bt_check = false;
var tb_list = new Array();

window.onload = function(){
    var add_bt = document.querySelector("#add");
    add_bt.addEventListener("click",add_button); //bt 버튼 클릭했을 때 이벤트 발생
    // 변수이름. addEventListener("이벤트명",실행할 함수명,(옵션))

    var T_put = document.getElementsByClassName("T_put");
    for(var i in T_put){
        T_put[i].addEventListener("keydown",function(){
            if( !bt_check){ // == "bt_check != true"
                // ! : 부정의 의미 == "!="
                alert("새로운 세팅버튼을 추가하세요 ^^")
                this.value=""; // T_put 의 값을 없애려고 사용.
            } //버튼을 누르지 않았을 때의 이벤트
        })
    }
}
function add_button(){
    if(bt_check){ //  bt_check 이 true 일 때 새버튼 생성 후 값 등록 안되었으면 새버튼 생성 금지 
        alert("값 먼저 등록해주세요!!");
        return;
    }

    var bt = document.createElement("button");
    bt.appendChild(document.createTextNode("세팅"+(++bt_cnt)));
    /*appendChild : 자식으로 소속시켜주겠다( ex)  <div> <button></button> </div> )
    // 즉, 위에서는 " document.createTextNode("세팅"+(++bt_cnt)) == button " 의미!!
    // ++i :  i의 값이 "먼저" 1 증가된 후 연산
    // i++ :  먼저 해당 "연산을 수행"하고 나서, i 의 값을 1 증가시킴. 
    */
   bt.setAttribute("data-value","0");
   bt.addEventListener("click",function(){
    if(this.dataset.value == 0) value_save(this);
    else //input 값 저장 이후
        table_draw(this);
   });
   document.getElementsByClassName("add_wrap")[0].appendChild(bt);
   bt_check = true; //bt를 눌렀을 때 true
}
function table_draw(obj){
    var draw = document.querySelector("#draw");
    var data = tb_list[parseInt(obj.dataset.value-1)];

    // var col = document.createElement(data.col);
    // var row = document.createElement(data.row);
    // var wid = document.createElement(data.width);
    // var hei = document.createElement(data.height);
    var out = "<table border=1>";
    for(var i=1; i<=data.col; i++){ //행을 표현
        out+="<tr>";
        for(var j=1; j<=data.row; j++){
            out +="<td width="+data.width+"height="+data.height+"></td>";
        }
        out+="</tr>";
    }
    out +="</table>";

    draw.innerHTML = out;

    // draw.innerHTML = data.col + " " + data.row+" "+ data.width + " " + data.height;
}
function value_save(obj){
    var input_label = ["행","열","너비","높이"];
    var T_put = document.getElementsByClassName("T_put");
    for(var i in T_put){
        if(T_put[i].value==""){
            alert(input_label[i]+"을 입력하세요.");
            T_put[i].focus();
            return;
        }
    }
    var temp = new tb(T_put[0].value, T_put[1].value, T_put[2].value, T_put[3].value);
    tb_list.push(temp);

    obj.dataset.value = bt_cnt;
    bt_check = false;
    for(var i=0; i<T_put.length; i++){
        T_put[i].value="";
    }
    //  +=, -=, /=, *= 가능
 
    
}
/*
객체명 : tb
행, 열, 너비, 높이 입력하고 세팅 버튼 클릭시 tb 객체에 값 저장
저장 후 tb 객체를 배열에 저장

저장이 완료된 세팅 버튼을 다시 클릭시 해당 객체 값을 
#draw 에 출력하기.
*/ 
function tb(col, row, wd, hg){
    this.col = col; // 행
    this.row = row; // 열
    this.width = wd; // 너비
    this.height = hg; //높이
}