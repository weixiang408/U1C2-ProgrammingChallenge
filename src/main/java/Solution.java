public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return (t1+t2+t3+t4)/4;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int) Math.round(average);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        return roundedAverage >= 65;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return shares * price;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        return (int) Math.round(totalStock);
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) 
    {
        userDouble = userDouble *100;
        double hundredth = userDouble%10;
        hundredth = (hundredth + 1)%10;
        double tenth = (userDouble%100)-userDouble%10;
        tenth = (tenth + 10)%100;
        double Ones = ( userDouble%1000)-userDouble%100;
        Ones = (Ones + 100)%1000;
        double tens= ( userDouble % 10000)-userDouble%1000;
        tens=(tens+1000)%10000;
        double hundreds= ( userDouble % 100000)-userDouble%10000;
        hundreds=(hundreds+10000)%100000;
        double Final = (hundreds+tens+Ones+tenth+hundredth)/100;
        return Final;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }

}
