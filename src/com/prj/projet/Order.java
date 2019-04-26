package com.prj.projet;


import java.util.Scanner;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("Choix menu");
        System.out.println("1 - poulet");
        System.out.println("2 - boeuf");
        System.out.println("3 - végétarien");
        System.out.println("Que souhaitez-vous comme menu ?");
    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
        if (nbMenu == 1) {
            System.out.println("Vous avez choisi comme menu : poulet");
        } else if (nbMenu == 2) {
            System.out.println("Vous avez choisi comme menu : boeuf");
        } else if (nbMenu == 3) {
            System.out.println("Vous avez choisi comme menu : vegetarien");
        } else {
            System.out.println("Vous n'avez pas choisi de menu parmi les choix proposes");
        }
    }
    /**
     * execution de la commande.
     **/
    public void runMenu(){
        this.displayAvailableMenu();
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        this.displaySelectedMenu(nb);

    }
}

