package lab6;

import java.util.StringTokenizer;

public class ExStringToken {
    public static void main(String[] args) {

        StringTokenizer tokenizer=new StringTokenizer("i live in Thungsong.");

        System.out.println(tokenizer.countTokens());

        while (tokenizer.hasMoreElements()){
            System.out.println(tokenizer.nextToken());
            //สลับตัวอักษร
            StringBuilder str = new StringBuilder(tokenizer.nextToken());
            System.out.println(str.reverse());
        }

    }
}
