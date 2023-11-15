public class MoreConditionals {
    


public boolean isLeapYear(int year){
if(year % 400 == 0 || year % 4 == 0)

    return true;

if(year % 4 != 0 || year % 100 != 0);

    return false;

}
public static void main(String[] args){
MoreConditionals ce = new MoreConditionals();

// leap year
System.out.println("2000 " + ce.isLeapYear(2000));
System.out.println("2004 " + ce.isLeapYear(2004));
System.out.println("2003 " + ce.isLeapYear(2003));
System.out.println("2100 " + ce.isLeapYear(2100));
}
}