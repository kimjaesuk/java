package main.java.com.ohgiraffers.secttion02.packge_and_import;

 import static main.java.com.ohgiraffers.secttion01.method.Calculator.maxNumverOf;
 import static main.java.com.ohgiraffers.secttion01.method.Calculator.minNumberOf;
 public class Application01 {
    public static void main(String[] args) {
        int frist = 200;
        int second = 300;

        int max =maxNumverOf(frist,second);
        System.out.println(max);
        int min = minNumberOf(frist,second);
        System.out.println(min);
        
    }

}
