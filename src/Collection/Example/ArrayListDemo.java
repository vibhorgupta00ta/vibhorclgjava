package Collection.Example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(55,60,90));
        System.out.println(list2);
        list1.add(10);
        list1.add(21);
        list1.add(30);
        list1.add(2,70); //pehla index ,dusra element aage ke shift
        list1.set(0,9);//abb shift nahi hoga uss index pe element aa jyega
        list1.removeIf(x->x%2==0);
        //System.out.println(list1);
//        for(int i=0;i<list1.size();i++){
//            System.out.println(list1.get(i));
//        }
        for(int it:list1){
            System.out.println(it);
        }
    }
}
