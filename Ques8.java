import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            int len = input.length();
            if (len == 0) {
                System.out.println("true");
                
            } else if (len % 2 != 0) {
                System.out.println("false");
                
            } else {
                Stack<Character> s = new Stack();
                char c,temp,i;
                for (i = 0; i < len; i++) {
                    c = input.charAt(i);
                    if(c=='[' || c=='{' || c=='('){
                        s.push(c);
                    }
                    else {
                        if(s.isEmpty()) {
                            break;
                        }
                        else {
                            temp=s.peek();
                            if(c==']'&&temp=='['||c=='}'&&temp=='{'||c==')'&&temp=='(' ){
                                s.pop();
                            }
                            else {
                                break;
                            }
                        }
                    }
                }
                if(s.isEmpty() && i==len) 
                    System.out.println("true"); 
                else 
                    System.out.println("false");
                
            }
        }
    }       

}



