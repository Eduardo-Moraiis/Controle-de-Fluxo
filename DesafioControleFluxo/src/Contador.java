import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int primeiroParametro = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = Integer.parseInt(scanner.nextLine());

        if(primeiroParametro<segundoParametro){
            throw new ParametrosInvalidosException();
        }else{
            for(int i=0; i<(primeiroParametro-segundoParametro); i++){
                System.out.printf("Imprimindo o número %d\n", i+1);
            }
        }
    }
}