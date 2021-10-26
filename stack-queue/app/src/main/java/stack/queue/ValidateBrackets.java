package stack.queue;


public class ValidateBrackets {
//Queue<Character> queue = new Queue<Character>();
    Stack<Character> stack = new Stack<Character>();
    public boolean validateBrackets(String str){
//"(]("

        if( str.length()==0 || str.charAt(0) == ' ' ||str.charAt(0) == ']' || str.charAt(0) == ')' || str.charAt(0) == '}')  {
            return false;

        }else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(')
                    stack.push(str.charAt(i));
                if (str.charAt(i) == ']' || str.charAt(i) == ')' || str.charAt(i) == '}') {
                    String value = stack.pop();
                    switch (str.charAt(i)) {
                        case '}':
                            if (value == "(" || value == "[") {
                                return false;
                            }
                            break;
                        case ']':
                            if (value == "{" || value == "(") {
                                return false;
                            }

                            break;
                        case ')':

                            if (value == "{" || value == "[") {
                                return false;
                            }
                            break;
                    }
                }
            }

        }
            return stack.isEmpty();
        }
}
