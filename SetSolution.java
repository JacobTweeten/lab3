import java.util.*;

public class SetSolution {

    public static boolean containsPair(LinkedList<Integer> list) {
        int len = list.size();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < len; i++){
            int num = list.get(i);
            if(!set.contains(num)){
                set.add(num);
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) { 
 
        //System.out.println("WOOOOO");
       LinkedList<Integer> test = new LinkedList<Integer>();
        test.add(21);
        test.add(43);
        test.add(12);
        test.add(3);
        test.add(1);
        test.add(98);
        test.add(12);
        test.add(78);
        test.add(32);
       // System.out.println(test);
       System.out.println(containsPair(test));

    }
}
