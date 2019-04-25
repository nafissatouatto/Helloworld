package com.prj.projet;

public class Order {

    /**
     *Affichage des menus
     */
   public void displayAvailableMenu () {

  System.out.println("Choix de votre menu");
  System.out.println("1 - Poulet");
  System.out.println("2 - Boeuf");
  System.out.println("3 - Végetarien");
  System.out.println("Avez vous choisi votre menu ?");


    }


            /**
             * Display a selected menu.
             * @param nbMenu The selected menu.
             */
             public void displaySelectedMenu(int nbMenu) {
           System.out.println("Vous avez choisi le menu " +nbMenu);
            }

}

