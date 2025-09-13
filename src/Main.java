import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Int2 x = new Int2(10);
        Int2 x2 = (Int2) x.clone();
        System.out.println("x: "+x+" , x2: "+x2);
        x2.increment();
        System.out.println(x2+" "+x); // Deep copy
        Int3 x3 = new Int3(7);
        x3 = (Int3)x3.clone();
        System.out.println(x3); // Deep copy

        // array of elements
        ArrayList v = new ArrayList();
        for(int i = 0;i<10;i++)
            //Arrayist function .add is used here
            v.add(new Int2(i));
        System.out.println("v: "+v);

        // Now Clone each element:
        ArrayList v2 = (ArrayList)v.clone();
        System.out.println(v2);  // shallow copy
        for(int i =0;i<v.size();i++)
            //Arraylist .set method is used here
            v2.set(i,((Int2)v.get(i)).clone());  // Deep copy
        // increment each element:
        for(Iterator e = v2.iterator(); e.hasNext();)
            ((Int2)e.next()).increment();
        System.out.println("v: "+v);
        System.out.println("v2: "+v2);

    }
}