// boom.js


var board = new Array(400);
board.fill(0); // ()값을 배열에 채우기.

for(var i=0; i<200;){
    let pos = Math.floor(Math.random()*400);
    //400칸을 가지고 있는 거에 무작위로 넣기 위함.
    if(board[pos] != 1){
        board[pos] = 1;
        i++
    }
}

window.onload = function(){
    var table ="<table>";
    for(var i=0; i<20; i++){
        table+="<tr>";
        for(var k=0; k<20;k++){ 
            if(board[i*20+k] ==1){
                table+='<td><img src="../../image/bomb.png"></td>';
                // 같은 따옴표 안에 같은 따옴표를 오면 안되고, 큰 따옴표가 왔으면, 작은 따옴표. 
                // 작은 따옴표가 왔으면, 큰 따옴표가 나와야함.
            }
            else
            table+="<td>  </td>"; //폭탄을 랜덤으로 넣겠다.
        }
        table+="</tr>";
    }
    table +="</table>";
    document.getElementById("wrap").innerHTML=table;
}