package dxc_Next;

import java.util.HashSet;
import java.util.Set;

public class Set_one {
  public static void main(String[] args) {
    Set<String> stack1 = new HashSet<>();
    stack1.add("Chemistry");
    stack1.add("Mathematics");
    stack1.add("Biology");
    stack1.add("English");

    Set<String> stack2 = new HashSet<>();
    stack2.add("Biology");
    stack2.add("English");
    stack2.add("Geography");
    stack2.add("Physics");

    Set<String> onlyInStack1 = new HashSet<>(stack1);
    onlyInStack1.removeAll(stack2);

    Set<String> onlyInStack2 = new HashSet<>(stack2);
    onlyInStack2.removeAll(stack1);

    Set<String> inBothStacks = new HashSet<>(stack1);
    inBothStacks.retainAll(stack2);

    System.out.println("Subjects only in Stack 1: " + onlyInStack1);
    System.out.println("Subjects only in Stack 2: " + onlyInStack2);
    System.out.println("Subjects in both Stacks: " + inBothStacks);
  }
}

