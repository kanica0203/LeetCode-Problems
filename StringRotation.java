/*String Rotation: Assume you have a method isSubstring which checks if
one word is a substring of another. Given two strings, 51 and 52, write code
to check if 52 is a rotation of 51 using only one call to isSubstring
(e.g., Uwaterbottleuis a rotation ofuerbottlewatU)
*/
public class StringRotation {

    public static void main(String []args){
        String s1 = new String("waterbottle");
        String s2 = new String("erbottlewat");
        System.out.println(isRotation(s1,s2));
    }

    public static boolean isRotation(String s1, String s2){
        int len = s1.length();
        if(len==s2.length() && len>0){
            String s1s1 = s1 + s1;
            return isSubstring(s1s1,s2);
        }
        return false;
    }

    public static boolean isSubstring(String s1, String s2) {
        String subs1 = s1.substring(3,14);
        System.out.println(subs1);
        if (subs1.equals(s2)) {
            return true;
        }
        return false;
    }
}
