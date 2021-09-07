import java.util.Random;
import java.util.Scanner;
 
public class ExercicioTres {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
                int valor = new Random().nextInt(10);
                int tentativas = 5;
                int acertos = 0;
                String[] palavras = {
                    "batata",
                    "cenoura",
                    "couve",
                    "rucula",
                    "bergamota",
                    "amendoim",
                    "brocolis",
                    "vagem",
                    "pudim",
                    "vinho"
                };
                String palavra = palavras[valor];
                String segredo = "*".repeat(palavra.length());
                System.out.println("Adivinhe a palavra secreta");
                for (int cont = tentativas; cont > 0; cont--) {
                    System.out.println("Você tem " + cont + " tentativa(s)");
                    String temp = "";
                    String letra = scanner.next();
                    for (int contL = 0; contL < palavra.length(); contL++) {
                        if (letra.equals(Character.toString(palavra.charAt(contL)))) {
                            temp += palavra.charAt(contL);
                            acertos++;
                            cont++;
                    } else {
                        temp += segredo.charAt(contL);
                    }
                }
                    segredo = temp;
                    System.out.println(segredo);
                    if (acertos == palavra.length()) {
                    break;
                    }
                }
                if (acertos == palavra.length()) {
                    System.out.println("Acertou");
                } else {
                    System.out.println("Você foi enforcado");
                }
            scanner.close();
            }catch(Exception e){
                System.out.println("Falha :" +e.getMessage());
        }
    }     
}