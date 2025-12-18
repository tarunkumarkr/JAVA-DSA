package com.myntra.ecommerce.Dsa18;

public class FindCountOfOccurances {

    public  static void count(String s ){
        String[] ss=s.split(" ");

        for (int i = 0; i < ss.length; i++) {
            if(ss[i].equals(" "))
                continue;
            int count=1;
            for (int j = i+1; j < ss.length ; j++) {
                if(ss[i].equals(ss[j])){
                    count++;
                    ss[j]=" ";
                }
            }
            System.out.println(ss[i]+" : "+count);

    }
    }

    public static void main(String[] args) {
        String s = "Java is great and Java is powerful";
        FindCountOfOccurances.count(s);
    }
}
