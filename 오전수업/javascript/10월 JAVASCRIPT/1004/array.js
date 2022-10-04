//array.js

// window.onload : html문서의 모든내용이 브라우저에 표시된 이후에 동작
// window 객체 : 브라우저실행시키기 위한 프로그램 틀
// window 에만 onload 있는거 아님, 모든 객체 (html태그포함)에 존재
// load -> 불러오기 즉 onload는 불러오는 작입이 끝났을 때 동작 


var item_list = ["핸드폰거치대", "급속충전기", "C타입케이블", "강화유리", "스마트폰 링", "스마트폰 커버"];


window.onload = function () {
  var li = document.getElementsByClassName("item");
  // var li = document.querySelectorAll(".item");

  for (var i in li) {
    li[i].innerHTML = item_list[i];
  }
}
var item = new Array();

function enroll() {
  var name = document.getElementById("item_name");

  var prop = name.value;
  item.push(prop);
 
  var price = document.querySelector("#item_price");

  var ul = document.getElementById("item_list");
    var li = document.createElement("li"); // li tag 생성 

    li.innerHTML = item[item.length-1]; // li 태그 안에 제품명 삽임
    /*
      1. li.innerHTML = item[item.length -1] + "" +price.value+"원";
      
      2. var b = document.createElement("b");
         b.innerHTML = price.value +"원";
          li.appendChild(b);

*/ 
    var b = document.createElement("b");
    b.innerHTML = price.value +"원";
    li.appendChild(b);

    var bt = document.createElement("button"); //button tag 생성
    bt.setAttribute("class","del_bt");// class 명을 주려면 (class, 클래스 이름)
    bt.setAttribute("onclick","del(this)");
    // .setAttribute() : 선택한 요소(element)의 속성(attribute) 값을 정합니다.  
    bt.innerHTML = "삭제";

    li.appendChild(bt);
    ul.appendChild(li); //ul 태그 자식으로 li 추가
  
  // 새 태그 (엘리먼트,요소,객체)를 생성 하는 방법 : create 함수;

  // 태그(엘리먼트) 내부에 새로운 내용으로 삽입하는 방법 : innerHTML;
  // 태그(엘리먼트) 내부에 새로운 내용을 추가 하는 방법 : appendchild;
  // 태그(엘리먼트) 내부에 텍스트 형식으로 삽입하는 방법 : appendchild(textnode);
  // #a div

  /*
  Javascript 에서 HTML 요소를 만들 수 있다.
   - createElement() : 요소를 만드는 매서드
   - appendChild() : 선택한 요소 안에 자식요소를 추가한다.
   - createTextNode() : createElement()를 통해 만든 요소 안에 글자를 넣게 해줌.
  */
}

function del(obj){
  var parent_li = obj.parentNode; // li 태그
  // alert(parentli.parentNode);
    var parent_ul = parent_li.parentNode;
    parent_ul.removeChild(parent_li); // li tag delete
}

/* document.createElement : 새 태그 생성 
    ex) document.createElement("div"); div 생성

  appenChild : 자식 태그로 추가
    ex) p = document.creatElement("p");
    body.appendChild(p); body 에 p 태그 추가

  setAttribute : 태그에 새 속성 추가
    ex) p.setAttribute("id","ppp"); 해당 태그에 id=ppp 삽입

  removeChild : 자식 태그 삭제
   ex)body.removeChild(p); : body 태그에 해당 태그 삭제
*/

/*
  문제)
  제품 등록 하면서 제품 가격과 함께 등록 할 수 있게 만들기.
  제품 가격 입력하는 input 만들어서 등록.
   ex) 거치대 3000 원 삭제
*/
