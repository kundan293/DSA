package String;

 class WordsCount {
    public static void main(String[] args) {
         String  str  = " java is  A High Paying Job";
          String [] words = str.trim().split("\\s+"); // ignore the  space

        int  CountWord = words.length;

        System.out.print(CountWord);


    }
}
