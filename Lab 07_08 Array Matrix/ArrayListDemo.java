import java.util.ArrayList;

public class ArrayListDemo {

    public static int removeNegative(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(i);
                i--; // adjust index after removal
            }
        }

        // Optional: trim capacity
       // list.trimToSize();

        return list.size();
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(-2);
        list.add(5);
        list.add(-1);
        list.add(8);

        // Before update
        System.out.println("Old ArrayList elements: " + list);
        System.out.println("Old size: " + list.size());

        // Process
        int newSize = removeNegative(list);

        // After update
        System.out.println("Updated ArrayList elements: " + list);
        System.out.println("Updated size: " + newSize);
    }
}