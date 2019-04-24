package com.prj.proj;

import com.prj.projet.Order;
import com.sun.deploy.association.Association;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

	private static  ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	/**
	 * @throws Exception
	 *
	 * **/

	@BeforeAll
	static void setUpStreams ()   {System.setOut(new PrintStream(outContent));	}


	@AfterAll
	static void restoreStreams ()  {
		System.setOut(System.out);

	}
	Order order=new Order();
	@Test
	public void Given_nothing_when_DisplayMenuSelection_Then_ShouldDisplayText() {

		order.displayAvailableMenu();
		assertEquals(false, outContent.toString().isEmpty());
	}


	@Test
	public  void Given_Vegetarian_When_AskForMenuSelected_Then_ShouldDisplayCorrectSentence(){
		order.displaySelectedMenu(3);
		//Assertions.assertEquals("Vous avez choisi le menu 3 \n",outContent.toString());
		assertEquals("Vous avez choisi le menu 3\n", outContent.toString());
	}

}
