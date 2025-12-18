    package com.myntra.ecommerce.Dsa18;

    public class RemoveDuplicateWords {
        public  static void removeDuplicate(String s ){
            String[] ss=s.split(" ");

            for (int i = 0; i < ss.length; i++) {
                if(ss[i].equals(" "))
                    continue;
                for (int j = i+1; j < ss.length ; j++) {
                    if(ss[i].equals(ss[j])){
                        ss[j]=" ";
                    }
                }
                System.out.print(ss[i]+" ");
            }
        }

        public static void main(String[] args) {

            String s= "Java is great and Java is powerful";
            RemoveDuplicateWords.removeDuplicate(s);
        }
    }
