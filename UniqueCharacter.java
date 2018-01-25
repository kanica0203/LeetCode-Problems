import java.util.HashMap;

public class UniqueCharacter {

    public static void main(String []args){
        firstCharacter(new String("java"));
    }

    public static void firstCharacter(String s){

        HashMap<Character,Integer> hashMap=new HashMap<Character,Integer>();
        char[] arrays= s.toCharArray();

        for(char c: arrays ){
            if(hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c)+1);
            }
            else
                hashMap.put(c,1);
        }

        for(char c : arrays){
            if(hashMap.get(c)==1){
                System.out.println("first non repeating character : " + c);
                break;
            }
        }

        for(char c : arrays){
            if(hashMap.get(c)>1){
                System.out.println("first repeating character : " + c);
                break;
            }
        }

    }
}
