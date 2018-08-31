

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
      //Creates random object
      Random gen = new Random ();
      int num1,num2,num3;
      //Genereates numbers and adds 100 or so to keep it within the numbers we were allowed for the number
      num1 = gen.nextInt(700)+100;
      
      num2 = gen.nextInt(643)+100;
      num3 = gen.nextInt(9000)+900;
      //prints oout the phone number
      System.out.println("Your phone number is: "+ num1 + "-"+ num2 +"-" +num3);
      /*outputs
       * Your phone number is: 517-609-3648
       * Your phone number is: 532-301-7486
       */
      //Math.random would work as well but wasn't sure how to do it
    }

}
