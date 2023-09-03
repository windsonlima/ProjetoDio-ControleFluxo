import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número1: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o número2: ");
        int num2 = sc.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(num1, num2);


        } catch (ParametrosInvalidosException e) {
            //imprimir a mensagem: O segundo número deve ser maior que o primeiro
            System.out.println("O segundo número deve ser maior que o primeiro");
        }
    }
    static void contar(int num1, int num2) throws ParametrosInvalidosException {
    // validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (num1 > num2)
        {
            throw new ParametrosInvalidosException();
        }

            int contagem = num2 - num1;
        //realizar o for para imprimir os números com base na variável contagem

        for(int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo número: " + i);
        }




    }
}