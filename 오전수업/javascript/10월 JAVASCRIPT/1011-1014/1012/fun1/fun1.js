// fun1.js

/*
htm1 작업
1. input 2개 생성 - 너비 150px 높이 35px 둥근 모서리
2. 버튼 1개 생성 -> text 입력 너비 80, 높이 35
    검정 바탕, 흰색글씨, 글씨 크기 15px
3.div 생성 - id : output 너비 300, 화면 가운데 표시

자바스크립트 작업
1. 입력 버튼 클릭시 이벤트 생성 = 함수명  input 
2. input함수 -> 두 input value 값 가져오기
3. list_push 함수 -> 두 개 value 값 input 함수로부터 받아서 
    배열 list 에 저장
4. output_list 함수 -> 배열 list의 값 div#output에 출력
    이름 출력 영역 너비 150, 높이 30
    직업 출력 영역 너비 150, 높이 30

var list = new Array();
window.onload=function(){
    var bt = document.querySelector("button");
    bt.addEventListener("click",input);
}//1. 입력 버튼 클릭시 이벤트 생성 = 함수명  input 
function input(){
    var input = document.querySelectorAll("input");//2.
    input.addEventListener("click",list_push)
}
function list_push(){
for(var i=0;i<input.length;i++){
        list_push(parseInt(input[0].value));
        list_push(parseInt(input[1].value));
    }//3.
}
function output_list(){

}
*/ 

window.onload = function(){
    document.getElementById("bt").addEventListener("click",input); //bt 에 이벤트 추가.(1)했음.
} //1.
function input(){
    var name = document.getElementById("name");
    var job = document.getElementById("job");
// input 가져오기
    list_push(name.value , job.value); 
    // input값 list_push 함수에 넘기기
    name.value=""; // name input 초기화
    job.value = ""; // job input 초기화
    name.focus(); // name input으로 커서 이동.
}// 2.
var list= new Array();
function list_push(name, job){
    var out="<span>"+name+"</span><span>"+job+"</span>";
    list.push(out);
    output_list(list);
    // list.push([name.job]);
    //  list.push({"n:name, j: job"});
} //3.
function output_list(list){
    var div = document.getElementById("output");
    var out = "";
    for(var i in list){
        out +=list[i]+"<br>";
    }
    div.innerHTML = out;
}