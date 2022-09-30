
var bingo = new Array();
while (bingo.length != 25) {// 25에서 끝남
    let num = Math.floor(Math.random() * 100) + 1;
    if (bingo.indexOf(num) == -1) { // 값이 없으면 -1 이 나옴
        // indexOf() 배열의 몇번째 값 인지 알려줌. 값이 없으면 -1 이 나옴
        bingo.push(num); // 중복 값 제거
    }
}


window.onload = function () {
    var td = document.querySelectorAll(".box");
    // querySelectorAll == getElementsByClassname;

    for (var i = 0; i < td.length; i++) {
        td[i].innerHTML = bingo[i];

        td[i].addEventListener("click", function () {
            this.style.background = "green"; // 클릭했을 때 색깔 변함
            check(this.innerHTML);
        });
    }
}
function check(n) {
    // 체크 한 숫자를 빙고 배열에서 제외 시키기.
    for (var i in bingo) { // 선택한 숫자를 배열에서 찾기
        if (bingo[i] == n) {
            bingo[i] = 0;
            break;
        }
    }
    //5줄 빙고 확인
    var wd = 0; // 가로줄
    var hg = 0; // 세로줄
    var cr1 = 0, cr2 = 0, end = 0;
    //  == var cr1 = 0; var cr2=0; var end = 0;
    for (var i = 0; i < 5; i++) { // i :  줄
        for (var k = 0; k < 5; k++) {// k : 칸
            if (bingo[i * 5 + k] == 0) wd++;
            // 줄의 0이 몇개니?
            if (bingo[k * 5 + i] == 0) hg++;

        }
        if (bingo[i * 6] == 0) cr1++;
        if (bingo[i * 4 + 4] == 0) cr2++;

        if (cr2 == 5) end++;
        if (cr1 == 5) end++;
        if (wd == 5) end++;
        if (hg == 5) end++;

        // 한 줄에 0이 5개라면 1줄 빙고
        wd = 0; // 다음 줄 0 개수를 확인 하기 위해 다시 0으로 
        hg = 0;
    }
    if (end == 5) {
        alert("BINGO > 0 <");
    }
}