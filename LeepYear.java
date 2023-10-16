import java.util.Scanner;
public class LeepYear 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number to see if its a leap year.");
      try
      {  
         int year = Integer.parseInt(input.nextLine());
         if (year <= 1900 && year >= 9999)
         {
            System.out.println("Not a vaild year");
            return;
         }
         if (year % 4 == 0)
         {
            System.out.println(year + " is a leap year.");
         }
         else
         {
            int closest = year;
            for (int i = year; i < 10000; i++) 
            {
               if (i % 4 == 0) 
               {
                  closest = i;
                  break;
               }
            }
            for (int i = year; i > -10000; i--) 
            {
               if (i % 4 == 0) 
               {
                  if (closest - year > year - i)
                  {
                     closest = i;
                     break;
                  }
               }
            }
            System.out.println(year + " is not a leap year. The closest leap year is " + closest);
         }
      }
      catch (NumberFormatException e)
      {
         System.out.println("That is not a number");
      }
 
   }
}
