package jp.co.internous.action;

public class Test {
	public static void main(String[]args){
Person taro = new Person();

//演習1,4
taro.name="山田太郎";
taro.age=20;
taro.address="東京";
taro.phoneNumber="010-0101-0101";


System.out.println(taro.name);
System.out.println(taro.age);
System.out.println(taro.address);
System.out.println(taro.phoneNumber);

//演習2
Person jiro = new Person();
Person hanako = new Person();

jiro.name="木村次郎";
hanako.name="鈴木花子";

jiro.age=18;
hanako.age=16;

System.out.println(jiro.name);
System.out.println(jiro.age);
System.out.println(hanako.name);
System.out.println(hanako.age);
//演習6
taro.talk();
taro.walk();
taro.run();

//演習8
Robot aibo = new Robot();
Robot asimo = new Robot();
Robot pepper = new Robot();

aibo.name="aibo";
asimo.name="asimo";
pepper.name="pepper";

aibo.walk();
asimo.run();
pepper.talk();

	}

}