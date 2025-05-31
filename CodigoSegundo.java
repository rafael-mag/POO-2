import java.util.Scanner;
import java.util.Locale;

public class CodigoSegundo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Olá! Por favor, insira seua altura em metros (Exemplo: 1.88): ");
        float altura = entrada.nextFloat();

        System.out.print("Agora, insira seu peso em kg (Exemplo: 76): ");
        float peso = entrada.nextFloat();

        float imc = peso / (altura*altura);

        System.out.printf("Seu IMC é: %.2f kg/m²\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: ABAIXO DE PESO");
        } else if (imc < 25) {
                System.out.println("Classificação: PESO NORMAL");
        } else if (imc < 30) {
                System.out.println("Classificação: SOBREPESO");
        } else if (imc < 35){
                System.out.println("Classificação: OBESIDADE GRAU 1");
        } else if (imc < 40){
                System.out.println("Classificação: OBESIDADE GRAU 2");
        } else {
                System.out.println("Classificação: OBESIDADE GRAU 3, MORBIDA");
        }
        entrada.close();
    }
}