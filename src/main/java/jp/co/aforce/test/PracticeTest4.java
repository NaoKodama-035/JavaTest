package jp.co.aforce.test;

import java.util.ArrayList;

public class PracticeTest4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//練習問題１
		/* equalsはStrin型の文字列を比較する際に、"="はint型の整数の比較の際にに用いる*/
		
		//練習問題２
		ArrayList<String>animals = new ArrayList<>();
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
	    animals.add("へび");
	    
	    //練習問題３
	   String bird ="鳥";
	   
	   if(animals.contains(bird)) {
		   System.out.println(bird + "はリストに含まれています");
	   }else {
		   System.out.println(bird + "はリストに含まれていません");
	   }
	   
	   //練習問題４
	   int birthMonth = 7;
	   
	   switch(birthMonth) {
	   case 1:
		   System.out.println("元日、成人の日");
		   break;
	   case 2:
		   System.out.println("建国記念日、天皇誕生日");
		   break;
	   case 3:
		   System.out.println("春分の日");
		   break;
	   case 4:
		   System.out.println("昭和の日");
	       break;  
	   case 5:
		   System.out.println("憲法記念日、みどりの日、こどもの日");
		   break;
	   case 7:
		   System.out.println("海の日、スポーツの日");
		   break;
	   case 8:
		   System.out.println("山の日");
		   break;
	   case 9:
		   System.out.println("敬老の日、春分の日");
		   break;
	   case 11:
		   System.out.println("文化の日、勤労感謝の日");
		   break;
	   case 6:
	   case 10:
	   case 12:
		   System.out.println("なし");
		   break;
	   }
	   /* switchを選んだ理由
	    * if文よりも記述が短くて済むことと、祝日がない月が３つあるので
	    * その月を一つの工程にまとめることができるから。*/
	}

}
