package Array;

public class TemoAttacking {
    public static void main(String[] args) {

    }


        public int findPoisonedDuration(int[] timeSeries, int duration) {

            int n  = timeSeries.length;
            if(n == 0) return 0;
            int  count = duration ;
            for (int i = 1 ; i<n ; i++){
                count  +=  Math.min(duration , timeSeries[i]-timeSeries[i-1]);



            }
            return  count;

        }
    }

