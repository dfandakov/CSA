public class MathEx {
    public static void main(String [] args){
       System.out.println(swap(123));
       System.out.println(swap(424));
       System.out.println(swap(726));
       
       timeLeft(1,15,4,36);
       timeLeft(1,34,8,20);
       
       
        System.out.println(dayOfWeek(0, 1));
        System.out.println(dayOfWeek(0, 14));
        System.out.println(dayOfWeek(6, 22));
        System.out.println(dayOfWeek(5, 4));
        System.out.println(dayOfWeek(1, 24));
        System.out.println(dayOfWeek(2, 1));
    }

    public static int swap (int y){
        int onesValue = y%10;
        int tensValue = y%100/10;
        int hundredsValue = y/100;
        int newNumber = hundredsValue*100 + onesValue * 10 + tensValue;
        return newNumber;
        
    }

    public static void timeLeft(int curHour, int curMin, int depHour, int depMin ){
        int curTime = curHour* 60 + curMin;
        int depTime = depHour* 60 + depMin;
        int minLeft = depTime - curTime;
        System.out.println (minLeft/60 + " hours and " + minLeft%60 + " minutes ");
    }
    public static int dayOfWeek(int firstDay, int curDay){
      int day = (curDay + firstDay - 1) % 7;
      return day;

    }







}
