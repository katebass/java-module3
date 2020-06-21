package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Kateryna Basova KNHUE
 * @version 21 of June 2020
 *
 * Classname Main
 * The main class where all actions will be executed
 *
 * Module 3. JavaCollectionsFramework. List.
 * 1.  Create ArrayList and LinkedList containing  100 000 Integer elements.
 *     Compare time intervals.
 * 2. Insert  new 1000 elements  on the  beginning, on  the middle  and on the end of ones.
 *    Compare time intervals.
 * 3. Update 1000 elements  from the  beginning, from  the middle  and from the end of ones.
 *    Compare time intervals.
 * 4. Delete 1000 elements  from the  beginning, from  the middle  and from the end of ones.
 *    Compare time intervals.
 **/
public class Main {

    public static void main(String[] args) {
        // 1.  Create ArrayList and LinkedList containing  100 000 Integer elements.
        // Compare time intervals.
        LocalDateTime start = LocalDateTime.now(); // create a timestamp for start point

        List<Integer> elementsArray = new ArrayList<>(); // create an ArrayList

        for (int i = 0; i< 100000; i++) {
            elementsArray.add(i); // fill up the array list
        }

        LocalDateTime finishArray = LocalDateTime.now(); // create a timestamp for finish point

        List<Integer> elementsLinked = new LinkedList<>(); // create a LinkedList

        for (int i = 0; i< 100000; i++) {
            elementsLinked.add(i); // fill up the linked list
        }

        LocalDateTime finishLinked = LocalDateTime.now(); // create a timestamp for finish point

        // variables of executions time in milliseconds
        long arrayListExecution = ChronoUnit.MILLIS.between(start, finishArray);
        long linkedListExecution = ChronoUnit.MILLIS.between(finishArray, finishLinked);

        // print results of experiment
        System.out.println("It took " + arrayListExecution
                           + " milliseconds to initialize ArrayList and "
                           + linkedListExecution
                           + " milliseconds to initialize LinkedList");

        System.out.println("The fastest result was for "
                           + (arrayListExecution < linkedListExecution ? "ArayList" : "Linkedlist"));

        System.out.println("In my 10 experiments LinkedList was faster 9 times and ArrayList was faster only 1 time");

        // 2. Insert  new 1000 elements  on the  beginning, on  the middle  and on the end of ones.
        // Compare time intervals.

        System.out.println("-------------------------------------------------------------------");
        LocalDateTime timestamp0 = LocalDateTime.now(); // start adding elements to ArrayList
        // insert 1000 elemens on the beginning of ArrayList
        for (int i = 0; i< 1000; i++) {
            elementsArray.add(0, 1);
        }

        // timestamp for finish point after adding elements on the beginning
        LocalDateTime timestamp1 = LocalDateTime.now();

        // insert 1000 elemens on the middle of ArrayList
        for (int i = 0; i< 1000; i++) {
            elementsArray.add(elementsArray.size() / 2, 2);
        }

        // timestamp for finish point after adding elements on the middle
        LocalDateTime timestamp2 = LocalDateTime.now();

        // insert 1000 elemens on the end of ArrayList
        for (int i = 0; i< 1000; i++) {
            elementsArray.add(3);
        }

        // timestamp for finish point after adding elements on the end
        LocalDateTime timestamp3 = LocalDateTime.now();

        long addingToArrayBeginning = ChronoUnit.MILLIS.between(timestamp0, timestamp1);
        long addingToArrayMiddle = ChronoUnit.MILLIS.between(timestamp1, timestamp2);
        long addingToArrayEnd = ChronoUnit.MILLIS.between(timestamp2, timestamp3);

        System.out.println("For ArrayList it takes: \n"
                           + addingToArrayBeginning + " ms. to add elements on the beginning;\n"
                           + addingToArrayMiddle + " ms. to add elements on the middle;\n"
                           + addingToArrayEnd + " ms. to add elements on the end\n");

        System.out.println("The fastest way to add elements to ArrayList: beginning");
        System.out.println("-------------------------------------------------------------------");

        LocalDateTime timestamp4 = LocalDateTime.now(); // start adding elements to LinkedList
        // insert 1000 elemens on the beginning of LinkedList
        for (int i = 0; i< 1000; i++) {
            elementsLinked.add(0, 1);
        }

        // timestamp for finish point after adding elements on the beginning
        LocalDateTime timestamp5 = LocalDateTime.now();

        // insert 1000 elemens on the middle of LinkedList
        for (int i = 0; i< 1000; i++) {
            elementsLinked.add(elementsLinked.size() / 2, 2);
        }

        // timestamp for finish point after adding elements on the middle
        LocalDateTime timestamp6 = LocalDateTime.now();

        // insert 1000 elemens on the end of LinkedList
        for (int i = 0; i< 1000; i++) {
            elementsLinked.add(3);
        }

        // timestamp for finish point after adding elements on the end
        LocalDateTime timestamp7 = LocalDateTime.now();

        long addingToLinkedBeginning = ChronoUnit.MILLIS.between(timestamp4, timestamp5);
        long addingToLinkedMiddle = ChronoUnit.MILLIS.between(timestamp5, timestamp6);
        long addingToLinkedEnd = ChronoUnit.MILLIS.between(timestamp6, timestamp7);

        System.out.println("For LinkedList it takes: \n"
                + addingToLinkedBeginning + " ms. to add elements on the beginning;\n"
                + addingToLinkedMiddle + " ms. to add elements on the middle;\n"
                + addingToLinkedEnd + " ms. to add elements on the end\n");

        System.out.println("The fastest way to add elements to LinkedList: beginning and end of list");
        // 3. Update 1000 elements  from the  beginning, from  the middle  and from the end of ones.
        // Compare time intervals.

        System.out.println("-------------------------------------------------------------------");
        LocalDateTime timestamp8 = LocalDateTime.now(); // start updating elements to ArrayList
        // update 1000 elemens on the beginning of ArrayList
        for (int i = 0; i< 1000; i++) {
            elementsArray.set(0, 4);
        }

        // timestamp for finish point after updating elements on the beginning
        LocalDateTime timestamp9 = LocalDateTime.now();

        // update 1000 elemens on the middle of ArrayList
        for (int i = 0; i< 1000; i++) {
            elementsArray.set(elementsArray.size() / 2, 5);
        }

        // timestamp for finish point after updating elements on the middle
        LocalDateTime timestamp10 = LocalDateTime.now();

        // update 1000 elemens on the end of ArrayList
        for (int i = 0; i< 1000; i++) {
            elementsArray.set(elementsArray.size() - 1, 6);
        }

        // timestamp for finish point after updating elements on the end
        LocalDateTime timestamp11 = LocalDateTime.now();

        long updatingArrayBeginning = ChronoUnit.MILLIS.between(timestamp8, timestamp9);
        long updatingArrayMiddle = ChronoUnit.MILLIS.between(timestamp9, timestamp10);
        long updatingArrayEnd = ChronoUnit.MILLIS.between(timestamp10, timestamp11);

        System.out.println("For ArrayList it takes: \n"
                + updatingArrayBeginning + " ms. to update elements on the beginning;\n"
                + updatingArrayMiddle + " ms. to update elements on the middle;\n"
                + updatingArrayEnd + " ms. to update elements on the end\n");

        System.out.println("The fastest point to update elements to ArrayList: anywhere");
        System.out.println("-------------------------------------------------------------------");

        LocalDateTime timestamp12 = LocalDateTime.now(); // start updating elements to LinkedList
        // updating 1000 elemens on the beginning of LinkedList
        for (int i = 0; i< 1000; i++) {
            elementsLinked.add(0, 4);
        }

        // timestamp for finish point after updating elements on the beginning
        LocalDateTime timestamp13 = LocalDateTime.now();

        // updating 1000 elemens on the middle of LinkedList
        for (int i = 0; i< 1000; i++) {
            elementsLinked.add(elementsLinked.size() / 2, 5);
        }

        // timestamp for finish point after updating elements on the middle
        LocalDateTime timestamp14 = LocalDateTime.now();

        // updating 1000 elemens on the end of LinkedList
        for (int i = 0; i< 1000; i++) {
            elementsLinked.add(elementsArray.size() - 1, 6);
        }

        // timestamp for finish point after updating elements on the end
        LocalDateTime timestamp15 = LocalDateTime.now();

        long updatingLinkedBeginning = ChronoUnit.MILLIS.between(timestamp4, timestamp5);
        long updatingLinkedMiddle = ChronoUnit.MILLIS.between(timestamp5, timestamp6);
        long updatingLinkedEnd = ChronoUnit.MILLIS.between(timestamp6, timestamp7);

        System.out.println("For LinkedList it takes: \n"
                + updatingLinkedBeginning + " ms. to update elements on the beginning;\n"
                + updatingLinkedMiddle + " ms. to update elements on the middle;\n"
                + updatingLinkedEnd + " ms. to update elements on the end\n");

        System.out.println("The fastest point to update elements to LinkedList: begining and end of list");

        // 4. Delete 1000 elements  from the  beginning, from  the middle  and from the end of ones.
        // Compare time intervals.
        System.out.println("-------------------------------------------------------------------");
        LocalDateTime timestamp16 = LocalDateTime.now(); // start deleting elements in ArrayList
        // delete 1000 elemens on the beginning of ArrayList
        for (int i = 0; i< 1000; i++) {
            elementsArray.remove(0);
        }

        // timestamp for finish point after deleting elements on the beginning
        LocalDateTime timestamp17 = LocalDateTime.now();

        // delete 1000 elemens on the middle of ArrayList
        for (int i = 0; i< 1000; i++) {
            elementsArray.remove(elementsArray.size() / 2);
        }

        // timestamp for finish point after deleting elements on the middle
        LocalDateTime timestamp18 = LocalDateTime.now();

        // delete 1000 elemens on the end of ArrayList
        for (int i = 0; i< 1000; i++) {
            elementsArray.remove(elementsArray.size() - 1);
        }

        // timestamp for finish point after deleting elements on the end
        LocalDateTime timestamp19 = LocalDateTime.now();

        long deletingArrayBeginning = ChronoUnit.MILLIS.between(timestamp8, timestamp9);
        long deletingArrayMiddle = ChronoUnit.MILLIS.between(timestamp9, timestamp10);
        long deletingArrayEnd = ChronoUnit.MILLIS.between(timestamp10, timestamp11);

        System.out.println("For ArrayList it takes: \n"
                + deletingArrayBeginning + " ms. to delete elements on the beginning;\n"
                + deletingArrayMiddle + " ms. to delete elements on the middle;\n"
                + deletingArrayEnd + " ms. to delete elements on the end\n");

        System.out.println("The fastest point to delete elements to ArrayList: anywhere");
        System.out.println("-------------------------------------------------------------------");

        LocalDateTime timestamp20 = LocalDateTime.now(); // start deleting elements in LinkedList
        // delete 1000 elemens on the beginning of LinkedList
        for (int i = 0; i< 1000; i++) {
            elementsLinked.remove(0);
        }

        // timestamp for finish point after deleting elements on the beginning
        LocalDateTime timestamp21 = LocalDateTime.now();

        // delete 1000 elemens on the middle of LinkedList
        for (int i = 0; i< 1000; i++) {
            elementsLinked.remove(elementsLinked.size() / 2);
        }

        // timestamp for finish point after deleting elements on the middle
        LocalDateTime timestamp22 = LocalDateTime.now();

        // delete 1000 elemens on the end of LinkedList
        for (int i = 0; i< 1000; i++) {
            elementsLinked.remove(elementsArray.size() - 1);
        }

        // timestamp for finish point after deleting elements on the end
        LocalDateTime timestamp23 = LocalDateTime.now();

        long deletingLinkedBeginning = ChronoUnit.MILLIS.between(timestamp4, timestamp5);
        long deletingLinkedMiddle = ChronoUnit.MILLIS.between(timestamp5, timestamp6);
        long deletingLinkedEnd = ChronoUnit.MILLIS.between(timestamp6, timestamp7);

        System.out.println("For LinkedList it takes: \n"
                + deletingLinkedBeginning + " ms. to delete elements on the beginning;\n"
                + deletingLinkedMiddle + " ms. to delete elements on the middle;\n"
                + deletingLinkedEnd + " ms. to delete elements on the end\n");

        System.out.println("The fastest point to delete elements to LinkedList: begining and end of list");

    }
}
