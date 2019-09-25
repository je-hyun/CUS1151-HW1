package part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CUS1151__lastName_HW1 {
    /**
     * Returns a new list with elements alternating between the two list inputs.
     *
     * For example, for a first list of [1, 2, 3, 4, 5] and a second list of [6, 7, 8, 9, 10, 11, 12], a call of
     * alternate(list1, list2) should return a list containing [1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12]
     *
     * @param list1
     * @param list2
     * @return
     */
    public static List alternate(List list1, List list2) {
        List result = new ArrayList();
        Iterator i1 = list1.iterator();
        Iterator i2 = list2.iterator();
        // to do
        // algorithm:
        // while i1 or i2 has next,
        //     add i1's next to result if it has next
        //     add i2's next to result if it has next
        while (i1.hasNext() || i2.hasNext()) {
            if (i1.hasNext()) {
                result.add(i1.next());
            }
            if (i2.hasNext()) {
                result.add(i2.next());
            }
        }

        return result;
    }

    /**
     * Remove all occurrences of the given element that appear between the starting index (inclusive) and ending index
     * (exclusive).
     *
     * For example, if the list = [0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16],
     * removeInRange(list, 0, 5, 13) -> [0, 0, 2, 0, 4, 6, 8, 10, 12, 0, 14, 0, 16].
     *
     *
     * @param list the list to remove from
     * @param value the value to remove within list
     * @param min the starting index to remove value from (inclusive)
     * @param max the ending index to remove value from (exclusive)
     */
    public static void removeInRange(List<Integer> list, int value, int min, int max) {
        Iterator itr = list.iterator();
        // to do
        int cur_index = 0;
        // algorithm:
        // loop from cur_index 0 to max
        //     if current index is less than min, do nothing
        //     else, remove if the current value equals value
        while (cur_index < max) {
            if (!itr.hasNext()) {
                throw new IndexOutOfBoundsException("The range from min to max is out of bounds for list.");
            }
            int item = (int) itr.next();
            if (cur_index >= min && item == value) {
                itr.remove();
            }
            cur_index += 1;
        }


    }

    public static void main(String[] args) {
        System.out.println("Test of part 3 and 4:\n");
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        list2.add(11);
        list2.add(12);
        List result = alternate(list1,list2);
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("-> alternate(list1, list2): " + result);
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        list4.add(0);
        list4.add(0);
        list4.add(2);
        list4.add(0);
        list4.add(4);
        list4.add(0);
        list4.add(6);
        list4.add(0);
        list4.add(8);
        list4.add(0);
        list4.add(10);
        list4.add(0);
        list4.add(12);
        list4.add(0);
        list4.add(14);
        list4.add(0);
        list4.add(16);
        System.out.println("List 4: " + list4);
        removeInRange(list4, 0, 5, 13);
        System.out.println("-> List 4 after removeInRange(list4, 0, 5, 13): " + list4);
    }
}
