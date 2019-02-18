for(var i=1;i<=10;i++){
    if(i % 2 ==0){document.write(i);}
}

//10までの数字で2で割ってあまり0ならその数を表示

document.write("<br>");

for(var b=1;b<=9;b++){
    for(var c=1;c<=9;c++){
        document.write(b*c+"/");
    }
    document.write("→"+b+"の段<br>");
}

//()に複数の要素入れる時は+を使う

document.write("<br>");
for(var month=1;month<=12;month++){
    document.write(month+"月:");
    for(var day=1;day<=30;day++){
        document.write(day+"日/");
    }
    document.write("<br><br>");
}

for(var num=10;num>=0;num--){
    if(num==0){document.write("終了"+"<br>");}else{document.write(num+"<br>");}
    
}

for(var no1=0;no1<5;no1++){
    for(var no2=0;no2<=5;no2++){
        if(no2 % 2==0){
        document.write("★");
    }else{document.write("☆");}
    }
    
    document.write("<br>");
}

// A % B ==0 はAをBで割ったあまり A % 2==0なら偶数　

//no1が4(0~4の5回)になるまでループし、5回目に改行。さらにno2を2で割ってのあまりが0になるなら★、違うなら☆、それを5になるまで(6回)繰り返す。




document.write("<br>");
for(var xyz=1;xyz<30;xyz++){
    if(xyz % 2 ==0){
        document.write("2の倍数");
    }else if(xyz % 3==0){
        document.write("3の倍数");
    }else{document.write(xyz);}
    document.write("<br>");
}

//no1が29になるまでループし1ごとに改行、2で割れるなら2の倍数、3で割れるなら3の倍数、そうでないなら数字を代入。
//優先順位は2の倍数>3の倍数