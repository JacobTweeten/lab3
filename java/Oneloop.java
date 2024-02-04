import java.util.LinkedList;

public class Oneloop {

    public static boolean containsPair(LinkedList<Integer> list) {
        int len = list.size();
        for(int i = 0; i < len; i++){
            int x = list.get(i);
            for(int j = i+1; j<len; j++){
                int y = list.get(j);
                if(x == y){
                    return true;
                }
            }


        }
        return false;


    }


    public static void main(String[] args){

        System.out.println("WOOOOO");
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
        System.out.println(test);
      //  int len = test.size();
      //  System.out.println(len);
      System.out.println("List Contains pair: " + containsPair(test));

       

       



    }
}

