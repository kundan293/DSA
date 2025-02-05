package Array;
 class Reverse {
    public static void Reverse_Arr(int array[]) {
        int first = 0, last = array.length - 1;
         while(first<last){
             int temp = array[last];
             array[first] = temp;
             first++;
             last--;
         }
    }

public static void main(String[] args){
    int array[]= {2,5,8,9,0,1,10};
    Reverse_Arr(array);
 for(int i=0; i<array.length;i++){
     System.out.print(array[i]+" ");
 }
    System.out.println();

}
}
