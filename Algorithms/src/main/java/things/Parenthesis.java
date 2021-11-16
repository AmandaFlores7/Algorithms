package main.java.things;

public class Parenthesis {
    public boolean validate(String string){
        CustomStack<Character> stack = new CustomStack<>();
        //char array[] = new char[20];
        
        if ((string.length()%2) == 1){
            return false;
        }
        
        for (int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            
            if (c == '[' || c == '{' || c == '('){
                stack.push(c);
            }
            else if (c == ']' || c == '}' || c == ')') {
                Character r = stack.pop();
                
                if (c == ']' && r != '[') return false;
                else if (c == '}' && r != '{') return false;
                else if (c == ')' && r != '(') return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Parenthesis parenthesis = new Parenthesis();
        
        boolean isValid = parenthesis.validate("([]{}{})");
        
        System.out.println("Is Valid = " + isValid);
    }
}
