public class ForLoops {

    public static int addEvens(int n){
     
        int sum = 0;
        for(int i = 2; i <= n; i += 2)
        {

        
             sum += i;
        }
     
    return sum;
        
    }
    
    public static void printSquaredBack(int n){
      for(int i = n; i >= 1; i--)
      {
            int square = i*i;
        if(i>1)
     {
        System.out.print(square + ", ");

     }
         else 
      {
        System.out.print(square);

      }
    }
}


    public static void sillyNumbers(){
        for(int i = 1; i>= 3; i++)
        {
         
        }

    }

    public static void main(String[] args){

    System.out.println(addEvens(6));
    System.out.println(addEvens(12));
    System.out.println(addEvens(15));

    printSquaredBack(8);
    System.out.println();
    printSquaredBack(5);
    System.out.println();
    printSquaredBack(15);



}


}