package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueIntertwo {
	
	public static Deque<Character> updateStack(Deque<Character> inputStack) {
	    Deque<Character> tempStack = new ArrayDeque<>();
	    Deque<Character> outputStack = new ArrayDeque<>();
	    
	   
	    for (int i = 0; i < 3; i++) {
	        tempStack.push(inputStack.removeLast());
	    }
	    
	    
	    while (!inputStack.isEmpty()) {
	        outputStack.push(inputStack.pop());
	    }
	    
	 
	    while (!tempStack.isEmpty()) {
	        outputStack.push(tempStack.pop());
	    }
	    
	    return outputStack;
	}

	
	
	public static void main(String[] args) {
		
		Deque<Character> inputStack = new ArrayDeque<Character>();
		inputStack.push('E');
		inputStack.push('D');
		inputStack.push('C');
		inputStack.push('B');
		inputStack.push('A');
		
		Deque<Character> resultStack = updateStack(inputStack);
		
		System.out.println("The alphabets in updated stack are:");
		for(Character alphabet: resultStack)
		    System.out.println(alphabet);
	}
	
}