
function movie(title, dir, year, gennre){// 생성자함수
    this.movie_title = title;
    this.movie_dir = dir;
    this.movie_year = year;
    this.movie_gennre = gennre;

}
movie.prototype.out=function(){
    return this.movie_title+""+this.movie_dir+""+this.movie_year+""+this.movie_gennre;
};
var movie_list = new Array(); // movie 객체 저장될 배열

window.onload=function(){
    var input = document.getElementsByClassName("movie");
    for(var i in input){
        input[i].addEventListener("focus", function(){
            this.classList.add("active");// focus했을 때 이벤트 발생
        });
        input[i].addEventListener("blur",function(){
            if(this.value ==0){ 
                this.classList.remove("active"); // focus했을 때 다른 애들은 blur 처리해주샴
                // blur 은 focus를 잃을 때 발생. 데이터 입력이 완료되었음을 의미
                // focus : 사용자가 폼 요소를 클릭하거나 Tab 키를 눌러 요소로 이동하면 해당 요소가 focus
            }
        });
    }
};

function enroll(){
    var val_temp = document.getElementsByClassName("movie");

    var data = new movie(val_temp[0].value, val_temp[1].value, val_temp[2].value, val_temp[3].value);

    movie_list.push(data);
};

function print(){
    var li = document.createElement("li");
    li.innerHTML = movie_list[movie_list.length-1]; // li를 movie_list 의 길이만큼 innerHTML 해주겠다. 인덱스번호는 0부터 시작이라 -1 해줘야 함.
    document.getElementById("movie_list").append(li);
};

/*
객체 : 사물, 사람, 동물 등 대표성을 지닌 독립적인 존재.

    모든 객체는 자신만의 속성(특징)을 가지며, 자신만의 행동을 갖는다.
    객체는 자신만의 속성을 가진다 -> 변수
    객체는 자신만의 행동을 갖는다.->함수

    객체 정의 : 추상화 시켜 놓은 것.
    추상화의 기본 : 속성과 행동을 나열하고 구성한다.
    멤버 변수 : 객체의 속성을 구성.
    멤버 함수 : 객체의 속성을 기반으로 행동을 구현 해놓은 코드.

    객체 생성 : new 연산을 통해서 생성
    생성된 객체는 변수에 저장하여 사용하는데 이 때 변수를 "참조변수"라고 한다.
    참조변수는 ram 의 주소를 저장하는 변수.


var obj = new Object();

    도형 객체
    도형.모양 = 사각형
    도형.위치 X축 = 120 (어디에다가 위치할 것이니?)
    도형.위치 Y축 = 50
    도형.그리기(함수)
    도형.지우기(함수)

    도형.모양 = 삼각형
    도형.위치 X축 = 200 (어디에다가 위치할 것이니?)
    도형.위치 Y축 = 120
    도형.그리기
    도형.지우기

    객체의 멤버로 접근하기 위한 연산자 (".") : access 연산자. 접근 연산자.
    접근연산자는 : "+", "-", "++", "&&", "||" 등 보다 우선 순위가 높음
    도형.위치 X축 +10; : "+" 보다 "." 이 먼저 동작이 됨. 접근 연산자 순위 약 4위!!
    
    동작하는 순위(자바,C언어에서도 마찬가지임!)
    1순위 ()
    2순위 []
    3순위 ->
    4순위 .

    객체 생성방법
 
var shape = {
    모양:"사각형", //자바스크립트에 네이밍 규칙?이 있어서 객체에 ""를 할 필요가 없음. 하지만 변수에는 무조건 ""를 넣어야 함!
    x축:120,
    y축:23,
    draw:function(){ //function() : 익명함수
        return "x축: "+this.x축+"y축: "+this.y축+"위치에"+this.모양+"그리기";
    }
}*/
    /* 객체의 값 출력 -> 객체.key
    객체 내부에서 함수 생성시, 변수(key)의 사용은 this 로 접근한다.
    
document.write("모양"+shape.모양);
document.write(shape.draw() );
*/
/* 
객체 생성방법
1. 객체 리터럴 방식 : 변수처럼 객체를 생성하는 방식

*/
/*
// 학생 객체 생성(학년, 반, 번호, 이름)
var name = "김춘추";
var student = { 
    학년:1,
    반:3,
    번호:202210327,
    이름:name //이성계는 문자열이니 ""써야 함. 필요하면 익명 함수 넣으샴
    // name 에 취소선이 넣어있는 이유는 사용가능하도록 지원은 하나 현재 상황에는 이 방식이 문제가 있으니 권장하지않음. 
};//중괄호 안에다가 객체와 key 를 넣어주면 됨. 데이터만 넣어주면 안됨. 이건 학년이고, 반이고 이런 것을 해줘야함. 
// 보통 한글을 쓰지않고 영어를 사용(한글이 인식이 되나 다른 외국 컴퓨터는 인식이 안될 수도 있으니 영어를 사용하쟈)
document.write("<br>"+student.이름)
*/
/*객체 생성 방법 2. 생성자 방식 -> new 연산자로 생성하는 방식
  생성자 방식 
    1) Object 객체로 생성
    2) 함수를 통한 생성

var music = new Object();
music.title = "라이언";
music["가수"] = "여자아이들";
music.link = '<iframe width="1280" height="720" src="https://www.youtube.com/embed/6oanIo_2Z4Q" title="(여자)아이들((G)I-DLE) - 'LION' Official Music Video" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>';

document.write("<a href='javascript:open("+music.link+")'>"+music['title']+""+music.가수+"</a>"+"<br>");

function open(link){
    document.getElementById("play").innerHTML=link;
}

var 제목 = "안녕";
var 가수 = "폴킴";
music.title = 제목;
music.가수 = 가수;

document.write( music["title"]+""+music.가수);
*/
/*
function movie(제목,감독,년도,장르){
    this.movie_title =제목;
    this.movie_dir = 감독;
    this.movie_year = 년도;
    this.movie_ger = 장르;
    // this.view = function(){
    //     return this.movie_title +""+this.movie_dir;
    // };
}
movie.prototype.view=function(){
    return this.movie_title +""+this.movie_dir;
};
var m1 = new movie("한산","김**",2022,"전쟁");
document.write(m1.movie_title);
var m2 = new movie("공조2","한**",2022,"액션");
document.write(m2.movie_ger);
// document.write(m2.view());
*/