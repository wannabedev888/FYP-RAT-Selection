import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws IOException {
		//Auto-generated method stub
		
		
	  System.out.println("Helloooo!");
	  Date x = new Date();
	  int y = x.getHours();
	  System.out.println(x);
	  
	  QLearning ql = new QLearning();
	  State state1 = new State(ql,17,5,2);
      ql.init();
      ql.calculateQ();
      ql.printQ();
      state1.getlearner().printQ();
//      ql.printPolicy();
	  
//	  
//	  Human human = new Human("Morty",16,50);
//	  Human human2 = new Human("Mortyy",16,50);
//	  human.eat();
//	  System.out.println(human);
//	  
//	  
//	  int[] states = {1,2,3};
//	  int[] actions = {1,2,3};
//	  System.out.printf("We are in state %d and we chose action %d", states[1],actions[1]);
//	  System.out.println(Human.numberof);
	  
//	  Scanner scanner = new Scanner(System.in);
//		"final" keyword 
//	  
//	  System.out.println("What is your name? ");
//	  String name = scanner.nextLine();
//	  
//	  System.out.println("How old are you? ");
//	  int age = scanner.nextInt();
//	  scanner.nextLine();
//	  
//	  System.out.println("What is your favorite food?");
//	  String food = scanner.nextLine();
//	   
//	  System.out.println("Hello "+name);
//	  System.out.println("You are "+age+" years old");
//	  System.out.println("You like "+food);
//	  
//	  scanner.close();
	
	}
	
//	static int add(int a, int b) {
//	System.out.println("This is overloaded method #1");
//	return a + b;
//}
//static int add(int a, int b, int c) {
//	System.out.println("This is overloaded method #2");
//	return a + b + c;
//}

}
