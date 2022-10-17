/*
진행 순서 
total 함수 실행 -> score_input 함수의 kor, mat, eng 변수 값 total 에 전달
-> total 함수에서 kor, mat, eng 의 합을 tot 에 저장
-> tot 변수의 값 total 함수 실행 위치로 반환(return)
-> score_input 함수에서 total 함수로부터 반환된 값 tot 변수에 저장
-> score_input 함수에서 avg 함수 실행
-> score_input 함수의 tot 변수를 avg 함수에 전달
-> avg 함수에서 전달 받은 데이터를 tot 변수에 저장


⭐return -> 반환값은 1개만 가능! 다수의 데이터를 리턴시켜주고 싶을 때 배열을 사용해야 함!
*/



function score_input(){
    var kor = 99;
    var mat = 89;
    var eng = 79; // 지역변수 : {} 안에서만 활성화
    // 총점과 평균 구하기
    total(kor,mat,eng); // total 함수에서 사용하기 위해 사용
//    var tot = total(kor,mat,eng); 
    // avg(tot); // avg 함수에서 사용하기 위해 사용
    // var res = avg(tot);
    // result_print(res);
    return [kor,mat,eng]; // 다수의 데이터를 리턴시켜주고 싶을 때 배열을 사용해야 함!
}

function total(kor,mat,eng){ // 총점 계산
    var tot = kor+mat+eng;
    // return tot; // tot 을 다른 곳으로 대입시키기 위해 사용
    avg(tot); // 이렇게 사용하면 return 이 필요 없음.
}
function avg(tot){ // 평균 계산
    var res = tot/3; 
    return res;
}
function result_print(res){ // 결과 출력
    document.write("평균 :" +res);
}