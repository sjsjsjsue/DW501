## Spring Boot Final 평가

    해당 숙제는 수업 평가과제로 고용노동부에 기록합니다.
    구글링 열심히 해서 완성해주세요.

- 개발 기간 : 22.12.16 ~ 22.12.21 (13:40분까지)🙂
- 개발 툴 : Spring boot + (MyBatis or JPA) + Gradle
- 제출 방법 : 각자 github에 `spring-crud-jpa` 라고 repository 생성 후 push
- 프로젝트 인원 : 으쌰으쌰 같이 해도 상관없어요🤠

### 공지 사항👨‍🏫

1. 페이징 구현은 `선생님과 같이`합니다.(21일 14:00에 수업예정)
2. 테이블 설계는 여러분들이 직접 합니다.
3. 질문은 받지 않습니다. 구글링으로 해결해야 합니다.(궁서체)
4. 아래 개발 규칙을 `꼭` `제발` `부탁` 읽고 개발할 것.

### 개발 규칙 🧙‍♂️

1.  URL 마지막 문자로 슬래시(/)를 포함하지 않는다.

    - http://restapi.example.com/houses/apartments/ (X)
    - http://restapi.example.com/houses/apartments (0)

2.  밑줄(\_)은 URL에 사용하지 않는다. 대신 하이픈(-)을 사용하여 URL 가독성을 높이자

    - http://restapi.example.com/users/game_list (X)
    - http://restapi.example.com/users/game-list (0)

3.  URL 경로에는 `소문자`가 적합하다.

4.  행위(method)는 URL에 포함하지 않는다.

    - http://restapi.example.com/users/update/info (X)
    - http://restapi.example.com/users/info (0)

5.  메소드 이름은 `동사`로 표현하고 변수 이름은 `명사`로 표현한다.

6.  모든 메소드와 변수 표기는 `카멜문법`을 사용한다.

    - var userName
    - function getData()

7.  상수 변수명은 `대문자`로 표기한다.

    - const SECONDS_IN_A_DAY = 86400;

8.  메소드 인수(argument) 혹은 파라미터 값은 `3개`를 넘지 않는다. 3개를 넘을 경우 객체(class)를 이용하여 전달하자.

9.  되도록이면 `축약어`를 사용하지 않는다.

    - 사용자 핸드폰 변수 이름 : userP(x) -> userPhone (o)
    - int x = 10; x라고 하면 죽는다..^^.

10. 패지키 이름은 `소문자`, 클래스 이름은 `앞에 대문자`로 한다.

    - class Emp (클래스 이름)
    - com.dw.spring (패키지 이름)

11. DB 테이블 컬럼이름은 카멜이 아니라 `_(언더바)`를 이용한다.

    - userCharacter -> user_character

12. 프로젝트 일정을 꼭 엄수하자.👮‍♂️
