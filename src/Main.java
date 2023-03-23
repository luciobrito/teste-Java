import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite alguma cor \n 1 - Azul \n 2 - Amarelo \n 3 - Verde");
        String entradaUser = entrada.next();

        if(entradaUser.equals("1")){
            System.out.println("Você tem bom gosto!");
        }
        if(!entradaUser.equals("1")){
            System.out.println("Não tem bom gosto!");
        }
    }
}
