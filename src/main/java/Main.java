import java.util.Scanner; 

    public class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu primeiro nome:");
String nome =sc.next();

        System.out.println("Digite seu segundo nome:");
String sobrenome = sc.next();

        System.out.println("Digite sua idade:");
int idade = sc.nextInt();
        System.out.println("Digite sua altura em metros (Ex: 1.69):");
double altura = sc.nextDouble();

        System.out.println("Digite sua massa em quilogramas (Ex: 73.8):");
double massa = sc.nextDouble();  
double imc = massa / (altura * altura);

        System.out.println("Seu nome completo é: " + nome + " " + sobrenome);
        System.out.println("Sua idade é: " + idade + " anos");
        System.out.println("Sua altura é: " + altura + " metros");
        System.out.println("Sua massa é: " + massa + " kg");
        System.out.println("Seu IMC é:"+ imc  );
      
           
}
}  