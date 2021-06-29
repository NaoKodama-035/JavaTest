package jp.co.aforce.test;

public class PracticeTest2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int x = 10;
		int y = 28;
		double z = 3.14;
		
		//練習問題１
		System.out.println(x * y);
		
		//練習問題２
		System.out.println(y % x);
		
		//練習問題３
		//任意の変数をnumにする
		double num = y * z;
		System.out.println(num);
		
		//練習問題４
		num = ++num;
		System.out.println(num);
		
		//練習問題５
		int age = 22;
		int randomNumber = new java.util.Random().nextInt(100)+1;
		
		if(age > randomNumber) {
			System.out.println("私のほうが年上です");
		}else if(age < randomNumber) {
			System.out.println("私のほうが年下です");
		}else if (age == randomNumber) {
			System.out.println("私と同い年です");
		}
		System.out.println("randomNumber="+ randomNumber);
		
	}

}
