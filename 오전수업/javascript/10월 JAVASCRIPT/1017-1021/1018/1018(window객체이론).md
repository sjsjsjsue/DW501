# 1018 이론
1. window 객체 - 가장 최상위 객체
2. location 객체 (주소)
3. document 객체 (출력 화면)
4. history 객체(방문 내역)
5. screen 객체(브라우저와 브라우저가 표시되는 모니터 화면 전체)
6. navigator 객체(브라우저에 대한 정보)

## Window 객체 - 최상위 객체
- 브라우저를 열었을 때 생성되는 항상 존재하는 존재.
- 속성: classes, defalutStatus, document, frame, history, length, location, navigator 등...
    - classes  : HTML문서에서 정의된 모든 스타일 시트.
    - defalutStatus : 상태바에 표시 될 문자열 지정. 
    - frame : window에 포함된 프레임 수 반환. → 여러 프레임이 존재할 경우 배열 형태로 표시. 가능. (window.frames[0])
    - history : "윈도우"가 방문한 URL 정보.
    - innerHeight : 현재 브라우저의  document 영역의 높이
    - innerWidth : 현재 브라우저의 document 영역의 너비.
    - location : "현재 문서"의 URL 정보.
    - menubar : 메뉴바 표시 여부 지정.
    - opener : open() 함수로 생성한 윈도우 이름.
    ``` Javascript
    window.open("http://www.naver.com","","width=500 height=500");
    // 눌렀을 때 브라우저 창이 width, height 크기의 만큼 실행된다.
    ```
    - name : window 이름.
    - outerHeight : 윈도우 밖 테두리 높이.
    ```Javascipt
    alert(window.outerHeight); 
    // 브라우저의 높이의 크기가 나온다.
    ```
    - outerWidth : 윈도우 밖 테두리 너비.
    - pageXofffset : window에 표시되는 X의 위치.
    - pageYoffset : window 에 표시되는 Y의 위치.
    - scrollbars : 스크롤바 표시 여부.

### window 객체 매서드() 
- alert() : 메세지와  OK 버튼을 가진 메세지 박스.
- setInterval : 지정된 시간만큼 반복.
- setTimeout : 지정된 시간 이후에 반복.
- clearInterval : setInterval 해제.
- clearTimeout : setTimeout 해제.
- close() : window 닫기
```Javascipt
    window.close();
````
- confirm : 질문 다이얼로그 확인과 취소 버튼을 가진 박스
- back.forward : 뒤, 앞으로 이동.
-  moveBy(x,y) : 윈도우 이동(상대적).
- moveTo(x,y) : 윈도우 이동(절대적).
```Javascipt
    window.moveBy(300,200);
```
- resizeTo(x,y) : 윈도우 크기 변경(절대적).
- resizeby(x,y) : 윈도우 크기 변경(상대적).
- open : 새 윈도우 생성. 
    + → open (url. window_name.property) ;
        * url : 페이지 주소
        * window_name : " __" 안에 넣어줘야 함!
            * _blank (새 창에 열린다.) == " "
            * _parent(부모 프레임에 열린다.) 
                * 태그에 있는 창이 자기 창에 열린다.
            * _self (현재 페이지를 대체한다.)
                * 자기가 창이 변함?
                * parent vs self : 비슷한 것 같으나 부모자식의 관계이냐 아닌가?
            * _top (로드된 프레임셋 대체)
        * property : 새 window의 옵션 부여. (window창의 크기를 지정할 수 있음.)
            * height : 새 창의 높이 지정.
            * width : 새창의 너비 지정.
            * left : 모니터 화면 왼쪽에서 위치 (왼쪽에서 띄어서 창 표시)
            * top : 모니터 화면 위쪽에서 위치 (위쪽에서 띄어서 창 표시)
                * width와 height 을 적으면 ","로 구분
                * 윈도우 이름이 다르면 하나 더 창이 뜸 
                ex) 
                ```javascript
                window.open("http://www.naver.com","naver","width=700, height=500");
                window.open("http://www.naver.com","naver1","width=700, height=500");
                window.open("http://www.naver.com","_blank","width=700, height=500");
                ```
                + window.open vs a : window.open 은 창이 하나 더 생기지만, a 태그는 옆으로 창이 하나 더 생김.
           ### 🥟 모든 브라우저가 안될 수도 있음(적어져있는 것들은 크름은 사용이 안됨.)
            + channelmode : 전체화면 (yes or NO) 
            + fullscreen : 전체화면(yes or no)
            + location : 주소표시줄 표시여부(yes or no) => 오페라에서만 적용 됨.
            + menubar : 메뉴바 표시여부(yes or no) 
            + scrollbar : 스크롤바 표시여부(yes or no)
            + status : 상태바 표시여부 ( yes or no)
            + resizable : window 크기 번경 여부 (yes or no)
            + toobar : 툴바 표시 여부( yes or no)

            ### 공부사이트
            * W3 Schools(정식x 기초적인 것을 공부하기 위해)
            * MDN 공부 사이트(정석적인 방법 기초적인 지식이 있어야 함)