package wpialgs.apis.test;

import org.junit.Test;
import wpialgs.apis.LinkedList;
import wpialgs.apis.Stack;

import static org.junit.Assert.assertEquals;

public class StackTest {

    private LinkedList<Integer> list;

    public StackTest() {
        list = new LinkedList<Integer>();
    }

    /** - - - Constructor - - - - - - - - - - - - - - - - - */
    @Test
    public void testConstructor(){
        Stack<Integer> stack = new Stack<>();
        assertEquals(stack.toString(),list.toString());
    }

    /** - - - Accessor Methods - - - - - - - - - - - - - - */
    @Test
    public void testPeek(){
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        list.insertAtHead(0);
        stack.peek();
        assertEquals(stack.toString(),list.toString());
    }

    @Test
    public void testSize(){
        Stack<Integer> stack = new Stack<>();
        assertEquals(stack.size(),0);
    }

    @Test
    public void testIsEmpty(){
        Stack<Integer> stack = new Stack<>();
        assertEquals(stack.isEmpty(),true);
        stack.push(0);
        assertEquals(stack.isEmpty(),false);
    }

    /** - - - Mutator Methods - - - - - - - - - - - - - - */
    @Test
    public void testPush(){
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        list.insertAtHead(0);
        assertEquals(stack.toString(),list.toString());
        assertEquals(stack.size(),1);
    }

    @Test
    public void testPop(){
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.pop();
        assertEquals(stack.toString(),list.toString());
        assertEquals(stack.size(),0);
    }

    /** - - - Implementations - - - - - - - - - - - - -  */
    @Test
    public void testToString(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        assertEquals(stack.toString(),list.toString());
    }

}
