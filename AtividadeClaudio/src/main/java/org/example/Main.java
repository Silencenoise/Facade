package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();
        int Loop;

        do {
            System.out.println("1.Menu\n2.Sair\nO que vai ser:");
            Loop = scanner.nextInt();

            System.out.println("1.Combo Saciado\n2.Combo PassarMal\n3.Combo Tigrinho\n4.Combo Davi e amigos");
            int EscolhaUsuario = scanner.nextInt();
            produto.MostrarProduto(EscolhaUsuario, produto);
            produto.ComprarProduto(EscolhaUsuario);





        }while(Loop == 1);
    }
}