function a(apple,orange){
    return(apple*80)+(orange*60);
}

document.write(a(3,5)+"円"+"<br>");
document.write(a(6,8)+"円"+"<br>");

//function X (要素1,要素2){
//return(計算方法)()
//}
//document.write(X(要素の数));
document.write("<br>");

function nameHello(name){
    return name+"さん。こんにちは"
}
document.write(nameHello("高橋"));
document.write("<br>");
document.write(nameHello("鈴木"));
document.write("<br>");

function juusho(abc){
    return abc+"出身の方"
}

document.write(juusho("東京"));
document.write("<br>");
document.write(juusho("神奈川"));
document.write("<br>");
document.write(juusho("大阪"));
document.write("<br>");

function test(num){
    return "あなたの点数は"+num+"点です。";
}

document.write(test(90));
document.write("<br>");
document.write(test(88));
document.write("<br>");
document.write(test(79));
document.write("<br>");

function oshirase(num){
    return "会員Noは"+num+"です。";
}

document.write(oshirase(1022));
document.write("<br>");
document.write(oshirase(1199));
document.write("<br>");
document.write(oshirase(2047));