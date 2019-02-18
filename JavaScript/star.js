document.write("問い1");
document.write("<br>");
document.write("<br>");

for(var a=1;a<=5;a++){
    document.write("★");
}
document.write("<br>");
document.write("<br>");
document.write("問い2");
document.write("<br>");
document.write("<br>");

for(var b=1;b<=6;b++){
    if(b%4==0){document.write("<br>")}
    document.write("★");
}
document.write("<br>");
document.write("<br>");
document.write("問い3");
document.write("<br>");
document.write("<br>");

for(var c=1;c<=10;c++){
    if(c%6==0){document.write("<br>")}
    document.write("☆");
}
document.write("<br>");
document.write("<br>");
document.write("問い4");
document.write("<br>");
document.write("<br>");

for(var d=0;d<20;d++){
    if(d%5==0){document.write("<br>")}
    document.write("★");
}

document.write("<br>");
document.write("<br>");
document.write("問い5");
document.write("<br>");
document.write("<br>");

for(var e=0;e<12;e++){
    if(e%3==0){document.write("<br>")}
    document.write("★");
}

document.write("<br>");
document.write("<br>");
document.write("問い6");
document.write("<br>");
document.write("<br>");

for(var g=0;g<3;g++){
    for(var h=0;h<=2;h++){
        if(h % 2==0){
        document.write("★");
    }else{document.write("☆");}
    }
    
    document.write("<br>");
}

document.write("<br>");
document.write("<br>");
document.write("問い7");
document.write("<br>");
document.write("<br>");

for(var i=0;i<5;i++){
    for(var j=0;j<=4;j++){
        if(j % 2==0){
        document.write("★");
    }else{document.write("☆");}
    }
    
    document.write("<br>");
}

document.write("<br>");
document.write("<br>");
document.write("問い8");
document.write("<br>");
document.write("<br>");

for(var k=0;k<6;k++){
    for(var l=0;l<k;l++){
        document.write("★");
    }
    
    document.write("<br>");
}
