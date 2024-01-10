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

public static String 

public static void main(String[] args){
    System.out.println(scroll("Hello World"));
    System.out.println(scroll("happy"));
    System.out.println(scroll("h"));
    


    System.out.println(convertName(" Reubenstein, Lori Renee "));
    System.out.println(convertName("Biden,Joe"));
    System.out.println(convertName("the Clown, Bozo"));










}
}



    
