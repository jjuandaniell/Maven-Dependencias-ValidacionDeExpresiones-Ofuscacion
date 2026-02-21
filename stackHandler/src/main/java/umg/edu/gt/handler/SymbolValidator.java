package umg.edu.gt.handler;

//aqui estoy importanto la libreria que se creo para valiadar los simbolos.
import umg.edu.gt.datastructure.MyStack;

public class SymbolValidator {
    public static boolean isValid(String expression) {
        MyStack<Character> stack = new MyStack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false; // si se abre pero no cierra
                }
                char top = stack.pop();
                if (!isMatching(top, c)) {
                    return false; // Los símbolos no coinciden
                }
            }
        }
        return stack.isEmpty(); // Si sobra algo, es inválido
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}