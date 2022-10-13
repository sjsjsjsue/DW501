user();

function user(){ // user
    var u = parseInt(prompt("1.가위 2. 바위 3. 보"));
    var c = com();
    result(u,c);
}
function com(){ // 컴퓨터
    var c = Math.floor(Math.random()*3)+1; //1~3까지 숫자가 나옴.
    return c; // user 함수의  com()에 대입하겠다!!
}
function result(u,c){ //가위바위보 결과
    if(u==c){
        alert("비겼다!");
    }else if((u==1 && c==3) || (u==2 && c==1) || (u==3&&c===2)){
        alert("이겼다!"); 
    }else{
        alert("졌다!");
    }
}