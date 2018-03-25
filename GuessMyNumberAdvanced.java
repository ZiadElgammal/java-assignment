
package guess.my.number.advanced;
 import java.util.Scanner;
import java.util.Random; 

public class GuessMyNumberAdvanced {
    
    public static void main(String[] args) {
        // pick a random number
Random random = new Random();
int guess,i;
int number = random.nextInt(100) + 1;
    System.out.println("I ' m thinking of a number between 1 and 100 (including both). Can you guess what it is?");    
for(i=0;i<100;i++){
    System.out.printf("Type a number: ");
Scanner s = new Scanner(System.in);
guess = s.nextInt();
System.out.printf("your guess is:%d \n",guess);
if (guess>number){System.out.println("your guess is higher than the number;please try again ");continue;
                 }                   else if(guess<number)           { 
System.out.println("your guess is lower than the number;please try again" );continue;  } 
                  else { System.out.println("your geuss is right");break;
                        }
            }//for(i)loop
System.out.printf("the number i was thinking of is :%d \n",number);
                                            }//public static
                                       }//public class

        // TODO code application logic here
    
    

