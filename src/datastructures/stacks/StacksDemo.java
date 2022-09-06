package datastructures.stacks;

import java.sql.SQLOutput;
import java.util.Stack;

/*
* LIFO Data Structure
* push() - insert at the top
* pop() - remove from top
* peek() - view top
* empty() / isEmpty() - checks if queue is empty
* size() - returns size of queue
* search(E) - returns 1-based index for search object E if present, else -1 if not present
* */
public class StacksDemo {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        System.out.println(st.empty());     // true
        System.out.println("abc" +  st.isEmpty());

        st.push("Apple");
        st.push("Orange");
        st.push("Banana");
        st.push("Pomegranate");
        st.push("Kiwi");
        st.push("Lime");

        System.out.println(st);     // [Apple, Orange, Banana, Pomegranate, Kiwi, Lime]
        System.out.println(st.empty());         // false

        String removed = st.pop();      // removes object from top of stack and returns it
        System.out.println(removed);    // Lime

        String top = st.peek();         // returns object at top of stack without removal
        System.out.println(top);        // Kiwi

        Integer index = st.search("Lime"); // returns 1 based index for search object, -1 if not present
        System.out.println(index);
    }
}

/*
* Uses of Stacks:
* 1. undo/redo features in text editors
* 2. forward/backward in browsers
* 3. used in backtracking (mazes, file directories)
* 4. function call stacks
* */