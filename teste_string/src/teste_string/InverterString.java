package teste_string;

public class InverterString {
    public static void main(String[] args) {
        
        String entrada = "Hello, world!";
         
        String resultado = inverterString(entrada);
        
        System.out.println("String original: " + entrada);
        System.out.println("String invertida: " + resultado);
    }
    
    public static String inverterString(String str) {
       
        char[] caracteres = str.toCharArray();
        
       
        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - 1 - i];
            caracteres[caracteres.length - 1 - i] = temp;
        }
        
        
        return new String(caracteres);
    }
}