//Chap05-5
public class StringStack implements StackInterface {
	String stack[];
	int top = 0;
	public StringStack() {
		stack = new String[5];
	}
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return top + 1;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return stack[--top];
	}

	@Override
	public boolean push(String ob) {
		// TODO Auto-generated method stub
		if(top==5)
			return false;
		else {
			stack[top++] = ob;
			return true;
		}
	}

}
