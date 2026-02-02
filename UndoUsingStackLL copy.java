package Ds;

import java.util.Stack;

public class UndoUsingStackLL{
public static void main(String[] args) {
    Stack <String> stack= new Stack<>();

    stack.push("Hello");
    stack.push("there,");
    stack.push("where");
    stack.push("are");
    stack.push("You?");

    System.out.println("Before Undo: " + stack);
    stack.pop();
    System.out.println("After Undo: " + stack);
    stack.pop();
    System.out.println("After Undo: " + stack);
    stack.pop();
    System.out.println("After Undo: " + stack);
    stack.pop();
    System.out.println("After Undo: " + stack);
    stack.pop();
    System.out.println("After Undo: " + stack);

}
}