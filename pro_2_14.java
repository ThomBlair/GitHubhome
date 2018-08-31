

/**
 * Write a description of class pro_2_14 here.
 * 
 * Thom Blair 
 * 8/30/18
 */
import java.util.Random; 
public class pro_2_14

{
   public static void main (String [] args){
      Random gen = new Random ();
      int num1,num2,num3;
      num1 = gen.nextInt(700)+100;
      
      num2 = gen.nextInt(643)+100;
      num3 = gen.nextInt(10000)+900;
      System.out.println("Your phone number is: "+ num1 + "-"+ num2 +"-" +num3);
    }

}
