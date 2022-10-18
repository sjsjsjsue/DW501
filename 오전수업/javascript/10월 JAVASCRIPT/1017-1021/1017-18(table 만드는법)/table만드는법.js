var out="<table border = '1'>";
for(var i=1; i<=data.col; i++){
    out += "<tr>"
    for(var j =1; j<=data.row; j++){
        out += "<td widht ="+ data.width +"height ="+ data.height +"></td>"
    }
    out += "</tr>"
}
out += "</table>"
draw.innertHTML = out;


// table도 감싸져 있는 구조고, 
// 이중 for문도 감싸져 있는 구조니까 같이 생각해봅시당!!
// <table> // for문 밖에 table 써주고
//     <tr> // 첫 번째 for문 안에 tr 올리고
//         <td></td> // 두번째 for문 안에 td 써주기!!
//     </tr>  
// </table>




// table 만드는 것 혼자 해보기

var out = "<table>";
for(var i=1; i<=col.length;i++){
    out+="<tr>";
    for(var i=1; i<=row.length;i++){
        out+="<td></td>";
    }
    out+="</tr>";
}
out+="</table>";