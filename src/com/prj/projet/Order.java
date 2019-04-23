package com.prj.projet;

public class Order {

    /**
     *Affichage des menus
     */
    public void displaylabelMenu () {
        System.out.println("Choix menu");
        System.out.println("1 - poulet");
        System.out.println("2 - boeuf");
        System.out.println("3 - végétarien");
        System.out.println("Que souhaitez-vous comme menu ?");
    }

    /**
     * Affichage des menus selectionnée
     */
    public void displaySelectedMenu () {


        /**
         * Display all available menus in the restaurant.
         */

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
                System.out.println("Vous avez choisi le menu " + nbMenu);
            }

    }

