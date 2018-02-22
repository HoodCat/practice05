package prob5;

import java.util.Arrays;

public class MyStack {
	private String[] buffer;
	private int top = 0;
	
	public MyStack(int size) {
		buffer = new String[size];
	}
	public void push(String data) {
		if(buffer.length <= top) {
			buffer = Arrays.copyOf(buffer, buffer.length*2);
		}
		
		buffer[top++] = data; 
	}
	public String pop() throws MyStackException{
		if(top <= 0) {
			throw new MyStackException("stack is empty");
		}
		return buffer[--top];
	}
	
	public boolean isEmpty() {
		return top==0;
	}
}