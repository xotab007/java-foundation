package javafoundation.section_13;

import java.util.ArrayList;
import java.util.List;

public class GenericError {
    private Object[] data;
    private int count;

    public GenericError() {
        this.data = new Object[10];
        this.count = 0;
    }
    // только тип Integer
    public void add(Object o) {
        this.data[count] = o;
        count++;
    }

    public Object[] getData() {
        return data;
    }

    public static void main(String[] args) {
        //DemoGeneric list = new DemoGeneric();
        List list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add("Tractor");
        list.add("Driver");

        //Integer sum1 = (Integer) list.getData()[0] + (Integer) list.getData()[1];
        //System.out.println(sum1);
        System.out.println((Integer) list.get(0) + (Integer) list.get(1));
        //Integer sum2 = (Integer) list.getData()[2] + (Integer) list.getData()[3];
        //System.out.println(sum2);
        System.out.println((Integer) list.get(2) + (Integer) list.get(3));
    }
}
