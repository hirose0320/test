var myoji=["高木","田中","山本"];
document.write(myoji);

document.write("<br>");

var color=["red","white","blue"];
document.write(color[0]);
document.write(color[1]);
document.write(color[2]);

document.write("<br>");

var a =["no1","no2","no3"];
delete a[0]
document.write(a);

document.write("<br>");

var pre2=["tokyo","kanagawa","satitama"];
delete pre2[0];
pre2[0]="chiva";
document.write(pre2);

//上書きできるからdelete pre2[0]はなくてもよさそう

document.write("<br>");

var month =["1月","2月","3月"];
month[2]="誕生日";
document.write(month);
document.write(month[2]);

document.write("<br>");

var number={"1番":"佐藤","2番":"山田","3番":"斉藤"};
document.write(number["1番"]+number["2番"]);

//括弧が違う