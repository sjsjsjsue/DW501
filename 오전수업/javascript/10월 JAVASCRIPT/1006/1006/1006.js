/*
함수,메소드 차이
귀속여부
함수는 독릭접인 코드
메소드는 귀속되어 사용 하는 코드.


함수 : 코드를 모듈화 한것으로 ,재사용성, 유지보수 효율성이
좋아지는 특징을 가진 -> 도뮬에는 이름을 지정해야 하며, 모듈
삽입 하게되는 사항과 모듈이 사용되었을 때 출력되는 사항을 
확인하는것이 필요


input 태그로부터 데이터를 입력받아서
데이터가 유효한 데이터인지 검사하고
저장하는 위치에 공간 확보가 되었는지 확인하고
파일 저장하가위해
파일이 생성되었는지 확인하고
생성되었다면 파일에 저장한다

input 태그로부터 데이터를 입력받는경우
1.함수 2.함수 3.함수 실행

함수의 구성 : 선언부, 정의부 ,실행부
선언부 및 정의부 
-> 함수도뮬의 출력형태와 이름, 삽입되는 사항과
코드블럭이 추가되어 있는 부분
function func1(ojb1,obj2){
  res = obj1 + obj2;
  return res;
}

실행부 : 함수의 이름과 데이터를 삽입하여
함수모듈을 실행하게 해주는 부분
func1(10,20)

함수 실행 순서
브라우저 실행 ->HTML앨리먼트 호출 > 코드해석
> 함수발견 > 함수실행 > 함수실행완료후 호출한 위치로 복귀
> 원래코드실행

변수의존속성
변수의 지역성 : 변수는 기본적으로 코드블럭 내에서만 존재
(코드블럭 - {} )
변수 선언 후 코드블럭이 종료될떄 까지 메모리상에 존재(지역변수)
코드블럭내에서 선언된 모든 변수는 모두 지역변수이다.

함수간 통신방법(데이터 이동)
함수는 기본적으로 폐쇠적인 구조 형태 > 함수간 데이터 공유 불가능
함수간 통신을 위한 방법 : 데이터 삽입부와 출력부를 이용해서 통신
데이터삽입(인수(파라미터,매개변수))실행함수에 데이터전달
sum(10,20,30,40)
> 10과 20 데이터를 매개변수 a,b에전달
a = 10; b = 20; 저장

function sum(a,b,c,d){
  return(a+b);
}
result = sum(23,12);
변수 result는 35라는 값을 가지게된다.



var res = total(5,20);
document.write(res + "<br>");
function total(a,b) {
  var sum = 0
  for (var i = a; i <= b; i++) {
    sum += i;
  }
  return sum;
}

//함수의 4가지 형태
//1. 입력x ,출력x
//  함수 중 가장 유명한 형태
function func1(){
  document.write("매개변수없고 반환도 없다.");
} 
// 2. 입력O, 출력 X
function func2(birth){
  var age = 2022-parseInt(birth.substring(0,4));
  document.write("나이는"+age+"살 먹었다.");
}
// 3. 입력 X ,출력 O, 이벤트 할 때 많이 사용하는 함수의 형태?
  function func3(){
    var num = document.querySelector("#number");
    num = parseInt(num);

    return num + "번 입니다.";
  } 
  // 4. 입력 O, 출력 O
  function func4(point, multi, state){
    if(state > 0) {multi=1;}

    return (point * multi);
  }

  function input_num(){ // 숫자 입력 받기 위한 함수
    // html 에서 데이터 받기
    // 
  }
*/

var number = 0;
var oldnumber = 0;
var opd = null;
var result = 0;
var flag = false;

window.onload=function(){
  var num = document.querySelectorAll(".num");
  var op = document.querySelectorAll(".op");

  for(var i=0; i<num.length; i++){
    num[i].addEventListener("click",function(){
      number = parseInt(this.dataset.value);
      calc();
    });
  }
  for(var i=0; i<op.length; i++){
    op[i].addEventListener("click",function(){
      opd=this.dataset.value; // 연산자를 클릭했을 때!!
      flag= true;
      calc();
    });
  }
}

function calc(){
  if(flag){ // opd 가 null 아닐 경우
    oldnumber = number; // oldnumber 에 number 를 넣어주겠다.
    flag=false;
    number = 0;
  }
  if(oldnumber!=0 && number!=0){
    selsectop();
    document.querySelector("#result").innerHTML = result;
  }
}
function selsectop(){
  switch(opd){
    case "+":
      result = oldnumber + number;
      break;
    case "-": 
    result = oldnumber - number;
    break;
    case "*":
      result = oldnumber * number;
      break;
    case "/":
      result = oldnumber / number;
      break;
  }
}