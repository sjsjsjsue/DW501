// boom.js


var board = new Array(400);
board.fill(0); // ()값을 배열에 채우기.

for (var i = 0; i < 398;) {
    let pos = Math.floor(Math.random() * 400);
    //400칸을 가지고 있는 거에 무작위로 넣기 위함.
    if (board[pos] != 1) {
        board[pos] = 1;
        i++
    }
}

window.onload = function () {
    var table = "<table>";
    for (var i = 0; i < 20; i++) {
        table += "<tr>";
        for (var k = 0; k < 20; k++) {

            // 같은 따옴표 안에 같은 따옴표를 오면 안되고, 큰 따옴표가 왔으면, 작은 따옴표. 
            // 작은 따옴표가 왔으면, 큰 따옴표가 나와야함.


            table += "<td class='bm' data-idx=" + (i * 20 + k) + "></td>"; //폭탄을 랜덤으로 넣겠다.
            // (i*20+k) -> 안에 값에 숫자(for 문)를 넣어주려고 "" 씀.
        }
        table += "</tr>";
    }
    table += "</table>";
    document.getElementById("wrap").innerHTML = table;
    var bm = document.getElementsByClassName("bm");

    // alert(bm.length); -> 400
    //bm[0].style.background = "red"; // 배열의 형태로 가져옴

    for (var i in bm) {
        bm[i].addEventListener("click", function () {
            // addEventListner : 이벤트를 추가로 생성 ex)onclick , 크기 바꾸는 것 등등
            let n = this.dataset.idx;
            if (board[n] == 1) {
                this.style.background = 
                "url(../../image/bomb.png) no-repeat center center";
                this.style.backgroundColor = "rgb(230,230,230)";
                    this.style.backgroundSize ="cover";
                // this.innerHTML = "<img src='../../image/bomb.png'>";
            }
            else this.style.background = "rgb(230,230,230)";
            // 여기서 this 는 bm[i]를 의미
        });
    }
}
