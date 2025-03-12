import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ali {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("select activity (kelvin(k)/farenheyt(f))");
        String input = sc.nextLine();
        System.out.println("Enter number");
        float c=sc.nextFloat();
        float f=((c*9)/5)+32;
        float k=c+273.15f;
        switch(input){
            case "f":
                System.out.println(f);
                break;
            case "k":
                System.out.println(k);
                break;
        }
        sc.close();
    }
}