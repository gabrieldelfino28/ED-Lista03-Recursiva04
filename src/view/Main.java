package view;

import controller.BinarioController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinarioController bc = new BinarioController();
        int num;

        do {
            System.out.println("Informe um valor que será convertido em binário: ");
            num = in.nextInt();
            if(num < 0 || num > 2000){
                System.out.println("Valor inválido ou excedeu limite\nTende novamente.");
            }
        } while (num < 0 || num > 2000);

        String res = bc.FuncBinario(num);
        System.out.println(res);
    }
}
