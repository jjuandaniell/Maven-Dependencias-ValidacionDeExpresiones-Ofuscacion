package umg.edu.gt.handler;

public class Main {
    public static void main(String[] args) {
        // Validación para consola (Parte E de tu rúbrica)
        if (args.length > 0) {
            String expression = args[0];
            System.out.println("Analizando expresión: " + expression);
            boolean result = SymbolValidator.isValid(expression);
            System.out.println("Es valida? -> " + result);
        } else {
            // Casos por defecto requeridos en la rúbrica (Parte B)
            System.out.println("Caso valido requerido: (a+b) * [c-d]");
            System.out.println("Resultado: " + SymbolValidator.isValid("(a+b) * [c-d]"));

            System.out.println("\nCaso invalido requerido: ([)]");
            System.out.println("Resultado: " + SymbolValidator.isValid("([)]"));
        }
    }
}