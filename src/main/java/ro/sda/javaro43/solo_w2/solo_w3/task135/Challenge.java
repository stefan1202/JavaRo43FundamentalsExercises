package ro.sda.javaro43.solo_w2.solo_w3.task135;

public class Challenge {
    public static int sumEvenNumsInRange(int start, int stop) {
        int sum = 0;
        while(start <= stop){
            if(start % 2 == 0)
                sum += start;
            start++;
        }
        return sum;
    }
}