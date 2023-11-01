public class conditionals {
 
 
   public  boolean chimpTrouble(boolean aSmile, boolean bSmile){

     if(aSmile == bSmile)
     return true;
     else return false;
     
 }
public  boolean negPos(int a, int b, boolean negative){
if(negative == true){
  if(a < 0 && b < 0)
  return true;
  else return false;

}
else {
   if(a < 0 && b > 0)
   return true;
   else return false;

}





}
   public static void main(String[] args){
conditionals co = new conditionals();
System.out.println(co.chimpTrouble(true,true));
System.out.println(co.chimpTrouble(false, false));
System.out.println(co.chimpTrouble(true, false));
System.out.println(co.chimpTrouble(false, true));
  

System.out.println(co.negPos(1,-1,false));
System.out.println(co.negPos(-1,1,false));
System.out.println(co.negPos(1,1,false));
System.out.println(co.negPos( -1,-1,false));
System.out.println(co.negPos( -4,-5,true));
System.out.println(co.negPos(-4,5,true));
System.out.println(co.negPos(4,5,true));
System.out.println(co.negPos(4,-5,true));



}


    
}
