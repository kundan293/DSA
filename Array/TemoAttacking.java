package Array;

public class TemoAttacking {
    public static void main(String[] args) {

    }

    public int findPoisonedDuration(int[] timeSeries, int duration) {
         int  count = 0;

         int n = timeSeries.length;
         for(int i=1; i<n ; i++){
            count += Math.min(duration, timeSeries[i]-timeSeries[i-1]);
            count +=duration;

         }
        return count;

    }
}
