 class Inverted_roteted_pyramid {

    public static void Pyramid(int n){
        //outer
        for(int i =1; i<=n; i++){
            // space
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1; j<=i;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
Pyramid(20);
     }
}
