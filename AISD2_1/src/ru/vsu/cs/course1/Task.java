package ru.vsu.cs.course1;
import java.util.List;
import java.util.ArrayList;

public class Task {
    public static Integer findMaximum(SimpleLinkedList<Integer> list) {
        int maximum = Integer.MIN_VALUE;
        for (Integer temp : list) {
            if (maximum < temp ) {
                maximum = temp;
            }
        }
        return maximum;
    }
    public static Integer counter(SimpleLinkedList<Integer> list) {
        int count = 0;
        for (Integer temp : list) {
            if (temp.equals(findMaximum(list))) {
                count++;
            }
        }
        return count;
    }

    public static SimpleLinkedList convertArrayToList(int[] array) {
        SimpleLinkedList list = new SimpleLinkedList();
        for (int i = 0; i < array.length; i++) {
            list.addFirst(array[i]);
        }
        return list;
    }

    public static int[] convertListToArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}

