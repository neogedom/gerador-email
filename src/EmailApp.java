import model.Email;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Eu serei a aplicação responsável pela criação do seu e-mail");
        System.out.println("Mas para isso precisarei de uns dados seus. Por favor, insira abaixo seu primeiro nome");
        String primeiroNome = scanner.next();
        System.out.println("Agora, insira um de seus sobrenomes");
        String sobrenome = scanner.next();
        System.out.println("E por fim, o departamento onde trabalha");
        String departamento = scanner.next();


        Email email = new Email(primeiroNome, sobrenome, departamento);
        System.out.println(email.getEmail());
    }
}
