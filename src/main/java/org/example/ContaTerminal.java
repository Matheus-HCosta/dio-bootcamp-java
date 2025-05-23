package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero = 0;
        double saldo = 0;
        boolean validar = false;
        String agencia;
        String nomeCliente;

        Scanner input = new Scanner(System.in);

        //TODO: Conheçer e importar a classe Scanner
        //Exibir as mensagens para o usuario
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada
        //EXTRA: Se não fugir muito da proposta, fazer validação para int e double

    while (!validar) {
        try {
            System.out.print("Por favor digite o número da sua conta para começarmos: ");
            numero = input.nextInt();
            validar = true;
        } catch (InputMismatchException e) {
            System.out.println("Digite somente números!");
            input.nextLine();
        }
    }
        System.out.print("Digite a agência: ");
        agencia = input.next();

        System.out.print("Digite seu nome: ");
        nomeCliente = input.next();

        validar = false;
        while (!validar) {
        try {
            System.out.print("Digite o saldo a ser depositado: ");
            saldo = input.nextDouble();
            validar = true;
        } catch (InputMismatchException e) {
            System.out.println("Digite somente números!");
            input.nextLine();
            }
        }

        System.out.println("Olá " + nomeCliente + "! obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + "R$ já está disponível para saque!");


    }
}