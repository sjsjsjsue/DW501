/* 
1. widows.onload 에서
전역으로 3개의 정수값 배열로 저장

2. 3개의 정수값은 중복 없음(범위 : 1 ~ 9 )

3. button 클릭하면 number_input 함수 실행

4. number_input 함수에서 세 개의 input 값 가져오기

5. number_input 함수에서 number_check 함수 실행

6. number_check 함수에 input 값 3개 전달

7. number_input 함수에서 input 값과 배열과 비교하기 

8. print 함수에서 div#result에 일치하는 값이 몇 개인지 출력



// 1.
var num1 = 0;
var num2 = 0;
var num3 = 0;

window.onload = function(){
    for( var i=1; i<10; i++){
        var num = Math.floor(Math.random()*9)+1; // 2?
    }
    
}
// 4.
function number_input(){
    num1 = document.getElementById("num1");
    num2 = document.getElementById("num2");
    num3 = document.getElementById("num3");

    number_check(num1,num2,num3); // 5?
}
function number_check(num1,num2,num3){ //6?

}
*/

var play = new Array();
window.onload=function(){
    for(var i=0;i<3;){ // 1번
        var tmp = Math.floor(Math.random()*9)+1; // 랜덤값 돌리기
        if(play.indexOf(tmp) == -1){  // 중복문 제거(2)
            play.push(tmp);
            i++;
        }
    }// 1-2번
    var bt = document.querySelector("#send");
    bt.addEventListener("click",number_input); //3
}; 

function number_input(){
    var user = new Array(); // 클래스 명으로 가지고 온다면
    var num = document.getElementsByClassName("num"); // 반복문 돌려
    user.push(parseInt(num[0].value) );
    user.push(parseInt(num[1].value));
    user.push(parseInt(num[2].value)); //4
    
    for( var i in num)num[i].value="";
    num[0].focus(); //input 태그 비워줌
    // focus : 거길로 cursor 올려줌.
    if(input_check(user)) {
        alert("잘못된 숫자 입력입니다. 중복 없이 1 ~ 9 중 에서 입력하세요!");
        return; // input_check 값이 true 일 때 !!
    }
    number_check(user); // number_check 로 대입
}
function input_check(user){
    for(var i in user){
        if(user[i]<1 || user[i]>9)
        return true;
    }
    if(user[0] == user[1]|| user[0] == user[2]|| user[1] == user[2])
        return true;

    return false;
}
function number_check(u){ 
    /* 
    var count = 0;
    // for(var i in play){
    //     if(u.indexOf(play[i])!= -1){
    //         count++;
    //     }
    // }
    // print(count);
    */
//    play = 7 , 5 , 9
//    user = 1 , 2 , 3
   var strike = 0, ball =0;
    if(u[0] == play[0]) strike++;
    if(u[1] == play[1]) strike++;
    if(u[2] == play[2]) strike++;
    if(u[0] == play[1] || u[0] == play[2]) ball++;
    if(u[1] == play[0] || u[1] == play[2]) ball++;
    if(u[2] == play[0] || u[2] == play[1]) ball++;

   print(strike, ball);
}
function print(strike, ball){
    var res = document.querySelector("#result");
    var div = document.createElement("div");
    var out = 3-strike-ball;
    div.appendChild(document.createTextNode(strike+"스트라이크"+ball+"볼"+out+"아웃"));
    res.prepend(div);
    // res.innerHTML = count+"개 일치";
}