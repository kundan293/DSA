class ReverseOfNnumber {
    public static void main(String[] args) {
        //Scanner in put = new Scanner(System.in);
        int n= 102445;

        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n=n/10;

        }
        System.out.println();
    }
}
