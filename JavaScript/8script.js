var a1 =5;

if(a1>0){
    if(a1<10){
        document.write("A");
    }
}

document.write("<br>");

var a3=12;
if(a3>0){
    if(a3<10){document.write("A");}else if(a3>10){document.write("B");}
}
//a3が0以上かつ10以下ならA、そうでない場合はB
document.write("<br>");

var a4=5;
if(a4<3){
    document.write("A");
}else if(a4<5){document.write("B");}else{document.write("C");}

document.write("<br>");

var a5=6;
if(a5>10){document.write("A");}else if(a5<5||a5==6){document.write("B");}else{document.write("C");}

document.write("<br>");

var age =18;
var seibetsu ="女性";

if(age>=18){
    if(seibetsu=="女性"){
        document.write("Aさん");
    }else if(seibetsu =="男性"){document.write("Bさん");}else{document.write("Cさん");}
}

document.write("<br>");

var test1=80;
var test2=96;
if(test1>=80){
    if(test2<=89){document.write("不合格");}else if(test2 >=90){document.write("合格");}
}


