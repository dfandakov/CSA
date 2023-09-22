public class MathEx {
    public static void main(String [] args){
       System.out.println(swap(123));
       System.out.println(swap(424));
       System.out.println(swap(726));

   
   
   
   
    }
 
 
 
 
    public static int swap (int y){
        int onesValue = y%10;
        int tensValue = y%100/10;
        int hundredsValue = y/100;
        int newNumber = hundredsValue*100 + onesValue * 10 + tensValue;
        return newNumber;
        
    }









}
