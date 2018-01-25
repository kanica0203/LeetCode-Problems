import java.util.ArrayList;
import java.util.List;

public class factor {

    public static void main(String []args){
        getFactors(12);
    }

    public static List<List<Integer>> getFactors(int n) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        helper(ret, new ArrayList<Integer> (), n, 2);
        System.out.println(ret);
        return ret;
    }

    private static void helper(List<List<Integer>> ret, List<Integer> item, int n, int start) {
        if (n == 1) {
            if (item.size() > 1) {
                ret.add(new ArrayList<Integer> (item));
            }
            return;
        }
        for (int i = start; i <= n; i++) {
            if (n % i == 0) {
                item.add(i);
                helper(ret, item, n/i, i);
                System.out.println(" n : " + n + " i : " + i );
                System.out.println("item size : " + item.size());
                item.remove(item.size()-1);
            }
        }
    }
}
