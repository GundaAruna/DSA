import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            Stack<String> paren = new Stack<String>();
    for (String p : input.split("")) {
        if (paren.isEmpty()) {
            paren.push(p);
        } else {
            String top = paren.peek();
            if(p.equals("}") && top.equals("{")
            ||(p.equals("]") && top.equals("[")
            ||(p.equals(")") && top.equals("(")))) {
                paren.pop();
            } else {
                paren.push(p);
            }
        }
    }
    if(paren.size()<=1){
        System.out.println("true");
    } else {
        System.out.println("false");
    }
		}
		
	}
}



