/* Console version of the Arizona Lottery Number
   Generator app.  This application will generate 
   a set of numbers for different lottery games.
   
   Written by Sean Moriarty
*/

import java.util.*;

public class AZLotteryNumberGenerator{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      final int POWERBALL = 1;
      final int MEGA_MILLIONS = 2;
      final int THE_PICK = 3;
      final int QUIT = 0;
      int[] powerballArray = new int[5];
      int[] megaMillionsArray = new int[5];
      int[] thePickArray = new int[6];
      int powerball;
      int megaBall;
      int selection = 4;
      
      System.out.println("ARIZONA LOTTERY NUMBER GENERATOR");
      System.out.println("This application generates numbers for specific");
      System.out.println("AZ Lottery games.");
      System.out.println("Created by Sean Moriarty");
      
      do {
         System.out.println("Select a game:");
         System.out.println("1 = Powerball, 2 = Mega Millions, " +
            "3 = The Pick, 0 = Quit");
         System.out.print(" >>> ");
         selection = input.nextInt();
         if (selection == POWERBALL) {
            for (int i = 0; i < powerballArray.length; ++i) {
               powerballArray[i] = rand.nextInt(69) + 1;
            }
            powerball = rand.nextInt(26) + 1;
            System.out.println(arrayToString(powerballArray) + "Powerball: " +
               powerball);
            System.out.println();
         }
         if (selection == MEGA_MILLIONS) {
            for (int j = 0; j < megaMillionsArray.length; ++j) {
               megaMillionsArray[j] = rand.nextInt(70) + 1;
            }
            megaBall = rand.nextInt(25) + 1;
            System.out.println(arrayToString(megaMillionsArray) + "Mega Ball: " +
               megaBall);
            System.out.println();
         }
         if (selection == THE_PICK) {
            for (int k = 0; k < thePickArray.length; ++k) {
               thePickArray[k] = rand.nextInt(44) + 1;
            }
            System.out.println(arrayToString(thePickArray));
            System.out.println();
         }
      } while (selection != QUIT);     
   }
   
   public static String arrayToString(int[] array) {
      StringBuilder arrayString = new StringBuilder();
      for (int x = 0; x < array.length; ++x) {
         arrayString.append(array[x] + " ");
      }
      return arrayString.toString();
   }
}