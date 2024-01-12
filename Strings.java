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
    
    String n = negative.replace("0" , "2");
    String n1 = negative.replace("2" , "0");

    r



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









}
}



    
