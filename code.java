/**This program reads an integer and prints how many digits it has* @author (Fikri Şan Köktaş) * @version (28 November 2020)*/
//I import these libraries no matter they are necessary or not. 
import java.util.Scanner;
import java.util.Random;
import java.lang.Object;
public class KFS_HowManyDigits_Main
{
    public static void main(String [] args)
        {
           Scanner input = new Scanner(System.in);
           System.out.print("Enter a number: ");
           int number = input.nextInt();
           
         
        if (number < 0) 
            number = number * (-1);
        if (number >= 0)
        {
           if (0 < number && number < 10 ){System.out.print("1");} 
           if (10 < number && number < 100){System.out.print("2");} 
           if (100 < number && number < 1000){System.out.print("3");}
           if (1000 < number && number < 10000){System.out.print("4");}
           if (10000 < number && number < 100000){System.out.print("5");}
           if (100000 < number && number < 1000000){System.out.print("6");}
           if (1000000 < number && number < 10000000){System.out.print("7");}
           if (10000000 < number && number < 100000000){System.out.print("8");}
           if (100000000 < number && number < 1000000000){System.out.print("9");}
           if (1000000000 < number && number < 999999999){System.out.print("9");}
        }
        }
}
