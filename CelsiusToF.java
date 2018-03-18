//Exercise 3.2
package celsius.to.f;
import java.util.Scanner;

public class CelsiusToF {
      public static void main(String[] args) {
        double cTemp,fTemp;
        System.out.println("please enter temperature in celsius");
       Scanner x=new Scanner(System.in);
        cTemp = x.nextDouble();
        fTemp = (cTemp * 9/5 +32);
        System.out.printf(" %.1f Celsius = %.1f Fahrenheit",cTemp,fTemp);
//this is the logic code
    }    
}

   
   
    }
    
}
