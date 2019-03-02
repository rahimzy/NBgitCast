
package democast;
public class DemoCast {
  public static void main(String[] args) {
        
     int num1 = 10;
     int num2 = 20;
     double total  = num1 + num2;
     System.out.println("total is: " + total);
     
     // need to use type casting, note decimal is gone
     int sum = (int) total;
     System.out.println("sum is: " + sum);
     
     //using integer division
     int iDivide = num1/ num2;
     System.out.println("iDivide is:" + iDivide);
     
     
     int dDivide = num1/num2;
     System.out.println("dDivide is:" + dDivide);
     
     double cDivide = (double)num1 / num2;
     System.out.println("cDivide is:" + cDivide);
        // TODO code application logic here
        
    }
    
}
