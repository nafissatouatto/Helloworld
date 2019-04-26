package com.prj.proj;

import com.prj.projet.Order;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    static   ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    /**
     * @throws Exception
     *
     * **/

    @BeforeAll
    static void setUpStreams ()
    {

        System.setOut(new PrintStream(outContent));

     }

    @AfterAll
    static void restoreStreams ()  { System.setOut(System.out);}
    Order order=new Order();

    @Test
      void Given_Chicken_When_DisplayMenuSelected_Then_DisplayChickenSentence() {
        order.displaySelectedMenu(1);
        assertEquals("Vous avez choisi comme menu : poulet\n", outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    private void Given_Beef_When_DisplayMenuSelected_Then_DisplayBeefSentence() {
        order.displaySelectedMenu(3);
         assertEquals("Vous avez choisi comme menu : boeuf\n", outContent.toString().replace("\r\n", "\n"));

    }
    @Test
    private  void Given_Vegetarian_When_DisplayMenuSelected_Then_DisplayVegetarianSentence() {

        order.displaySelectedMenu(3);
        assertEquals("Vous avez choisi comme menu : vegetarien\n", outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    private  void Given_TooBigValue_When_DisplayMenuSelected_Then_DisplayErrorSentence() {

        order.displaySelectedMenu(15);
        assertEquals("Vous n'avez pas choisi de menu parmi les choix proposes\n", outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    private void Given_NegativeValue_When_DisplayMenuSelected_Then_DisplayErrorSentence() {

        order.displaySelectedMenu(-6);
        assertEquals("Vous n'avez pas choisi de menu parmi les choix proposes\n", outContent.toString().replace("\r\n", "\n"));
    }

}
