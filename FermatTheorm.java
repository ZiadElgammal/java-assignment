
package fermat.theorm;
import java.util.Scanner;

public class FermatTheorm {
 
    public static void main(String[] args) {
        int a,b,c,n;
        double x,y;
       System.out.println("please enter a,b,c and n respectively");
        Scanner s =new Scanner(System.in);
        a  =s.nextInt(); 
        b  =s.nextInt();
        c  =s.nextInt();
        n  =s.nextInt();
       x= Math.pow(b,n) + Math.pow(a,n);
       y = Math.pow(c, n);
       System.out.printf("x=%f; y=%f",x ,y);
        //double x = Math.pow(2.0, 10.0);
        if((x==y) && n>2 ){System.out.println("Holy smokes, Fermat was wrong ! ");                                 
                                     }//first if 
        else {System.out.println("No,that doesn't work.");}
        // TODO code application logic here
    }
    
}
