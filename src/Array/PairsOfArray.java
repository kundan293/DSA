package Array;

public class PairsOfArray {
    public static void printPairs(int array[]){
        int Tp=0;
        for(int i=0; i<array.length; i++){
            int current= array[i];
            for(int j=i+1; j<array.length; j++){
                Tp++;
                System.out.print("("+current+","+array[j]+")");
            }
            System.out.println();
        }
        System.out.println(" Total Pairs "+ Tp);
    }
    public static void main(String [] args){
        int array[]={2,4,6,8,10,12};
        printPairs( array);

    }
}
