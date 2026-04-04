class GfG
{
    public static void main (String[] args) {
        // String class
        String s1 = "geeks";

        // s2 Points to the same location as s1
        String s2 = s1;

        // Creates a new location to store s1
        s1 = s1 + "forgeeks";

        // s1 and s2 refers to different location
        if(s1 == s2)
            System.out.println("Same");
        else
            System.out.println("Not Same");

        // StringBuilder or StringBuffer class
        StringBuilder sb1 = new StringBuilder("geeks");

        // sb2 refers to the same location as sb1
        StringBuilder sb2 = sb1;

        // Append operation modifies the same object
        // as it is mutable in nature
        sb1 = sb1.append("forgeeks");

        // Both sb1 and sb2 refers to the same location
        if(sb1 == sb2)
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }
}
