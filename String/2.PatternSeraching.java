package String;

 class PatternSeraching {
    public static void main(String[] args){
   String str = " 545.4588945";
        System.out.println(Search(str));

    }
    public static String  Search(String str ){  //  this  Method to find the  value os  number after the ecimal point
    int pas = str.indexOf('.');
    if(pas < 0) return "";
    else
        return str.substring(pas+1);
    }
}
