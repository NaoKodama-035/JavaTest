package jp.co.aforce.test;

import java.util.HashMap;

public class PracticeTest3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//練習問題１
		String[] TaroTanaka = new String[4];
		
		TaroTanaka[0] = "1";
		TaroTanaka[1] = "田中太郎";
		TaroTanaka[2] = "男性";
		TaroTanaka[3] = "27";
		
		//練習問題２
		System.out.println(TaroTanaka[1]);
		
		//練習問題４
		
		
		//練習問題５
		HashMap<String,String>subjects = new HashMap<>();
		subjects.put("国語","90");
		subjects.put("数学","80");
		subjects.put("英語","65");
		
		 for (HashMap.Entry<String, String> subject : subjects.entrySet()) {
	            System.out.println(subject.getKey() + " : " + subject.getValue());
	            
	     //練習問題６
	     /*最初リストを使用したがリストでやってみると１つの教科に対して
	      点数とのすべての組み合わせのパターンをコンソールに表示してしまい
	      調べるとマップはキーと要素を別々で取れることが分かったから*/
		 }
		
	}
}
