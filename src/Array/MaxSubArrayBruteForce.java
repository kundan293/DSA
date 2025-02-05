package Array;

public class MaxSubArrayBruteForce {
    public static void PrintSubArray(int numbers[] ){
        int currentSum= 0;
        int maxSum= Integer.MIN_VALUE;

        for(int i=0; i<numbers.length ; i++){
            int start =i;
            for(int j=i; j<numbers.length; j++){
                int end=j;
                currentSum= 0;

                for(int k= start; k<=end; k++){
                    currentSum += numbers[k];
                }
                System.out.println(  currentSum);
                if(maxSum <   currentSum){
                  maxSum  =   currentSum;
                }
            }
        }
        System.out.println("max Sum= "+ maxSum);
    }
    public static void main(String[] args){
        int numbers[] ={ 5,7,8,9,40};
        PrintSubArray(numbers);
    }
}
