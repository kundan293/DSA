package String;

 class SliceString {
    public  static void main(String[] args){
        String  s = "GeeksForGeeks";
        System.out.println(kundan(s));

    }
      public static String kundan (String s ){
           int n = s.length();


            String part1 = s.substring(1 , n-1);
        return part1;
     }
}
