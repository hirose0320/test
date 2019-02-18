var a1=1;
switch(a1){
        
    case 0:
        document.write("A");
        break;
    case 1:
        document.write("B");
        break;
}
document.write("<br>");

var a2=3;
switch(a2){
    case 0:
        document.write("A");
        break;
    case 1:
        document.write("B");
        break;
    default:
        document.write("C");
}
document.write("<br>");

var score=19;

//break;を忘れがち
switch(score){
    case 99:
        document.write("osii!");
        break;
    case 100:
        document.write("parfect!");
        break;
    default:
        document.write(score+"点です！");
}