$(document).ready(function(){
  $('.menu-toggle').on("click",function(){
    $(".gnb").stop().slideToggle("fast");
  });
});

/*
시간 설정 가능 : fast, slow
Show();: 화면에 나타남 
hide(); : 숨겨짐 -> display-none
toggle() : 화면에 나타남 + 숨겨짐
fadein() : 화면에 나타남
fadeout() : 화면에 숨겨짐 -> 투명도로 설정
slideup(): 화면에 나타남
slidedown() : 화면에 숨겨짐
slideToggle() : slideup() + slidedown()
*/
