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
	  
	  int current_time = 17;
	  int current_location = 5;
	  int current_scenario = 2;
	  State[] states = new State[20];
	  QLearning ql = new QLearning();
	  State state1 = new State(1,ql,17,5,2);
	  states[0] = state1;
	  for(int i=0; i<states.length; i++) {
		  if (states[i].gettime() == current_time && 
			  states[i].getlocation() == current_location &&
			  states[i].getscenario() == current_scenario) {
			  System.out.printf("We are in state %d \n",states[i].getID());
			  i = states.length;
		  }
	  }
      ql.take_decision();
      ql.printQ();
      state1.getlearner().printQ();
      
		
		ArrayList<State> statesss = new ArrayList<State>();
		ArrayList<QLearning> algos = new ArrayList<QLearning>();
		statesss.add(new State(2,ql,17,5,2));
		for (State s:statesss) {
			if (s.gettime() == current_time && 
					  s.getlocation() == current_location &&
					  s.getscenario() == current_scenario) {
					  System.out.printf("We are in state %d \n",s.getID());
				  }
		}
		
//		ID++
//		IDcell=getcellID()
//		t=gethours()
//		sc=2
//		algos.add(new QLearning())
//		statesss.add(new State(ID,algos[i],time,location,scenario));
		
		
		//food.set(0, "sushi");
		//food.remove(2);
		//food.clear();
		
      
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
