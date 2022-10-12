/* 
-html 작업
1. input 1개 생성. (생년월일 입력: 1999.01.02)
    너비 : 200 / 높이 : 35 / 폰트: 17
2. 버튼 1개 생성
    text : 입력 / 너비 100 / 폰트 : 15
3. div#birthday 생성
4. ul 태그 아휘 li 태그 3개 
    (각 li에 태어난 년도, 태어난 월, 나이)

- Javascript 작업
1. 버튼 이벤트 생성, 함수 input
2. input 함수에서 value 값 가져오고 출력
3. getYear 함수(태어난 연도 구하기)
4. getMonth  함수(태어난 월 구하기)
5. getAge 함수 (나이 구하기)  

** return 쓰기

*/
window.onload = function(){
    document.getElementById("bt").addEventListener("click",input);
}
function input(){
    var bir = document.getElementById("input").value;//input 값 가져오기
    var res1 = document.getElementById("res1");
    var res2 = document.getElementById("res2");
    var res3 = document.getElementById("res3");
    res1.innerHTML = "태어난 연도는 "+getYear(bir)+"년 입니다.<br>";
    res2.innerHTML = "태어난 달은 "+getMonth(bir)+"월 입니다.<br>";
    res3.innerHTML = "나이는 "+getAge(bir)+"살 입니다.";
    // var birsplit = bir.split('.'); 
    // input에 쓴 거 '.' 으로 나누고싶음...
    // split 은 안에 있는 값을 가지고 와야하니 value 를 써야함!

    // var year ="";
    // var month = "";
    // var age = "";
    // for( var i in birsplit){
    //     year = birsplit[0];
    //     month = birsplit[1];
    //     age = birsplit[2];   
    // }
    getYear(bir);
    // alert(getYear(bir));
    getMonth(bir);
    getAge(bir);

    // A a클래스 = new a();

}
function getYear(bir){
    var year = bir.split(".")[0];
    return year; 
}
function getMonth(bir){
    var month = bir.split(".")[1];
    return month;
    
}
function getAge(bir){
    var age = 2022-bir.split(".")[0]+1;
    return age;
    
}

/*
window.onload = function(){
    document.getElementById("bt").addEventListener("click",input);
}
function input(){
    var birth=document.getElementById("birth").value;

    var birth_year = getYear(birth);
    var bitth_month = getMonth(birth);
    var bitth_age = getAge(birth);
}
function getYear(birth){
    year = birth.split(".")[0];
    return year; //input 함수에 돌아옴!
}
function getMonth(birth){
    month = birth.split(".")[1];
    return month; //input 함수에 돌아옴!
}
function getAge(birth){
    age =2022 - parseInt(year)+1;
    return year; //input 함수에 돌아옴!
}
*/