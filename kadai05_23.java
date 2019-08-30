package com.company;

import java.util.*;

public class kadai05_23 {
    public static void main(String[] args) {
        //スキャナーimport
        Scanner scanner = new Scanner(System.in);

        //名前の表示
        System.out.println("あなたの名前を入力してください");
        String yourname = new java.util.Scanner(System.in).nextLine();
        String message;
        message = yourname + "さん、こんにちは";
        System.out.println(message);
        System.out.println("私と貴方の相性診断を始めます。これからいくつか質問をしますので、お答えくださいね。");

        //質問をリスト化してランダムに表示にする準備
        List<String> question = new ArrayList<String>(5);
        question.add("ホラー映画は嫌いである");
        question.add("1人で旅行をしたりお店に入るのに抵抗は無い");
        question.add("ジェットコースターの様な絶叫系は苦手だ");
        question.add("横浜が好きだ・興味がある");
        question.add("新しいモノ・コトが好きだ");
        //シャッフルして、順番を変える(重複しない)
        Collections.shuffle(question);

        //質問１[開始]
        System.out.println("質問１：" + question.get(0));
        //選択肢を配列とforで作成
        String[] anser1 = {"１：とても当てはまる", "　２：当てはまる", "　３：あまり当てはまらない", "　４：当てはまらない"};
        for (int i = 0; i < anser1.length; i++) {
            System.out.print(anser1[i]);
        }
        //解答番号入力部分
        int answer1 = new java.util.Scanner(System.in).nextInt();

        //解答打ち切る質問と処理
        boolean yesOrNo01 = false; // boolean型の変数を宣言
        System.out.println("相性診断をやめますか？　１.はい　２.いいえ");
        int selected01 = new java.util.Scanner(System.in).nextInt();
        if (selected01 == 1) {
            System.out.println("処理を終了します");
            return;//途中で打ち切る処理
        }
        //質問１[終了]

        //質問２[開始]
        System.out.println("質問２：" + question.get(1));
        //選択肢を配列とforで作成
        String[] anser2 = {"１：とても当てはまる", "　２：当てはまる", "　３：あまり当てはまらない", "　４：当てはまらない"};
        for (int i = 0; i < anser2.length; i++) {
            System.out.print(anser2[i]);
        }
        //解答番号入力部分
        int answer2 = new java.util.Scanner(System.in).nextInt();

        //解答打ち切る質問と処理
        boolean yesOrNo02 = false; // boolean型の変数を宣言
        System.out.println("相性診断をやめますか？　１.はい　２.いいえ");
        int selected02 = new java.util.Scanner(System.in).nextInt();
        if (selected02 == 1) {
            System.out.println("処理を終了します");
            return;//途中で打ち切る処理
        }
        //質問２[終了]

        //質問３[開始]
        System.out.println("質問３：" + question.get(2));
        //選択肢を配列とforで作成
        String[] anser3 = {"１：とても当てはまる", "　２：当てはまる", "　３：あまり当てはまらない", "　４：当てはまらない"};
        for (int i = 0; i < anser3.length; i++) {
            System.out.print(anser3[i]);
        }
        //解答番号入力部分
        int answer3 = new java.util.Scanner(System.in).nextInt();

        //解答打ち切る質問と処理
        boolean yesOrNo03 = false; // boolean型の変数を宣言
        System.out.println("相性診断をやめますか？　１.はい　２.いいえ");
        int selected03 = new java.util.Scanner(System.in).nextInt();
        if (selected03 == 1) {
            System.out.println("処理を終了します");
            return;//途中で打ち切る処理
        }
        //質問３[終了]

        //質問４[開始]
        System.out.println("質問４：" + question.get(3));
        //選択肢を配列とforで作成
        String[] anser4 = {"１：とても当てはまる", "　２：当てはまる", "　３：あまり当てはまらない", "　４：当てはまらない"};
        for (int i = 0; i < anser4.length; i++) {
            System.out.print(anser4[i]);
        }
        //解答番号入力部分
        int answer4 = new java.util.Scanner(System.in).nextInt();

        //解答打ち切る質問と処理
        boolean yesOrNo04 = false; // boolean型の変数を宣言
        System.out.println("相性診断をやめますか？　１.はい　２.いいえ");
        int selected04 = new java.util.Scanner(System.in).nextInt();
        if (selected04 == 1) {
            System.out.println("処理を終了します");
            return;//途中で打ち切る処理
        }
        //質問４[終了]

        //質問５[開始]
        System.out.println("最後の質問です。");
        System.out.println("質問５：" + question.get(4));
        //選択肢を配列とforで作成
        String[] anser5 = {"１：とても当てはまる", "　２：当てはまる", "　３：あまり当てはまらない", "　４：当てはまらない"};
        for (int i = 0; i < anser5.length; i++) {
            System.out.print(anser5[i]);
        }
        //解答番号入力部分
        int answer5 = new java.util.Scanner(System.in).nextInt();
        //質問５[終了]

        //質問終了


        //入力されたポイントの合計を計算
        int sum = answer1 + answer2 + answer3 + answer4 + answer5;

        //相性診断結果表示
        System.out.println("診断結果");
        System.out.println("あなたが選択したポイントの合計は" + sum + "です。");

        //if文で相性結果を分岐＆表示
        if (sum == 5) {
            System.out.println("あなたと私の相性は最高です。ぜひお付き合いしましょう！");
        } else if (sum >= 6 && sum <= 10) {
            System.out.println("あなたと私の相性はなかなかです。今度飲みに行きましょう！");
        } else if (sum >= 11 && sum <= 15) {
            System.out.println("あなたと私の相性は微妙です。友達からよろしくお願いします。");
        } else if (sum >= 16 && sum <= 20) {
            System.out.println("あなたと私の相性はいまひとつです。またどこかで会いましょう！");
        }
    }
}

