public class Strings {


public static String scroll(String a){
    char b = a.charAt(0);
    String c = a.substring(1);
    
    return c + b;
}





public static String convertName(String fullname){
int c = fullname.indexOf(",");
String f = fullname.substring(c+1);
String l = fullname.substring(0, c);


String f1 = f.trim();
return f1+" "+l;

}




public static String negativeString(String negative){//0010111001
    
     String n = negative.replace("0","2");
     String n2 = n.replace("1","3");
     String n3 = n2.replace("2","1");
     String n4= n3.replace("3", "0");
    
    return n4;
}


public static String convertDate(String date){
    int d = date.indexOf("/");
    int c = date.lastIndexOf("/");
    String b = date.substring(0,d);
    String l = date.substring(d,c);
    String f = date.substring(c);

   String l1 = l.trim();
   String b1 = b.trim();
   String f1 = f.trim();

   String b2 = b1.replace("/" , "-");
 


   String finalDate = l1 + "-" + b2 + "-" + f1;

   return finalDate.replace("/", "");

   }
   public static String addZeros(String date){
  
    if(date.length() ==1 )
    {
      String newDate = "0" + date;
     return newDate;
    }
    else return date;
 }

public static String convertDate2(String date){
    int d = date.indexOf("/");
    int y = date.lastIndexOf("/");
    String year = date.substring(y);
    String month = date.substring(0,d); 
    String day = addZeros(date.substring(d+1,y));
   
    String a = addZeros(day) + "-" + addZeros(month) + "-" + year;
    String a1 = a.replace("/", "");
    return a1;
}








public static void main(String[] args){
    System.out.println(scroll("Hello World"));
    System.out.println(scroll("happy"));
    System.out.println(scroll("h"));
    


    System.out.println(negativeString("0010111001"));
    System.out.println(negativeString("11111111"));


    System.out.println(convertName(" Reubenstein, Lori Renee "));
    System.out.println(convertName("Biden,Joe"));
    System.out.println(convertName("the Clown, Bozo"));


    System.out.println("04/20/2014 becomes " + convertDate("04/20/2014"));
   
   
    System.out.println("04/20/2014 becomes " + convertDate2("04/20/2014"));
    System.out.println("4/20/2014 becomes " + convertDate2("4/20/2014"));
    System.out.println("04/2/2014 becomes " + convertDate2("04/2/2014"));
    System.out.println("4/2/2014 becomes " + convertDate2("4/2/2014"));







}
}



    
