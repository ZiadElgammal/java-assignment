//exercise 3.3
package exercise3.pkg3;
import java.util.Scanner

public class Exercise33 {

  
    public static void main(String[] args) {
          int timeinSec;
        int hh,mm,ss;
        System.out.println("please enter the total time in seconds");
       Scanner x=new Scanner(System.in);
       timeinSec = x.nextInt();
        hh = timeinSec/(60*60);
        mm = (hh %60) ;
        ss = timeinSec%60;
        System.out.printf(" %d second= %d hour",timeinSec,hh);
        System.out.printf(":  %d minutes ",mm);
        System.out.printf(":  %d second ",ss);
        // TODO code application logic here
    }
    
}
