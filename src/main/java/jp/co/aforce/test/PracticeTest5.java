package jp.co.aforce.test;

public class PracticeTest5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//練習問題１
		int fortune =  new java.util.Random().nextInt(5)+1;
		
		switch(fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
		}
		
		//練習問題２
		int num = 1;
		int total = 0;
		
		while(num <= 100) {
			if(num % 7 == 0) {
				System.out.println(num);
			}
			total += num;
			num++;
		}
		System.out.println("7の倍数の総合計は" + total + "です");
		
		//練習問題３
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}

}
