package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		// Don't forget to import the Stack class
		Stack<Double> numbers = new Stack<>();
		// 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 101; i++) {
			Random rand = new Random();
			double r = rand.nextDouble() * 100;
			numbers.push(r);
		}
		System.out.println(numbers);
		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String x = JOptionPane.showInputDialog("choose a number between 0-100");
		int y = Integer.parseInt(x);
		String jj = JOptionPane.showInputDialog("choose a number between 0-100");
		int k = Integer.parseInt(jj);
		// 4. Pop all the elements off of the Stack. Every time a double is popped that
		// is
		// between the two numbers entered by the user, print it to the screen.

		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75Double num =

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224

		System.out.println("Popping elements off stack");
		int z = numbers.size();
		for (int i = 0; i < z; i++) {
			double num = numbers.pop();
			if (num > y && num < k) {
				System.out.println(num);
			}
		}
	}
}
