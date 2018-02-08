import java.util.ArrayList;
import java.util.Random;

public class BandNameGenerator {
 public static void main(String[] args) {
	ArrayList<String> adjectives = new ArrayList<String>();
	ArrayList<String> nouns = new ArrayList<String>();
	adjectives.add("Fryed");
	adjectives.add("Wet");
	adjectives.add("Dry");
	adjectives.add("Green");
	nouns.add("Pants");
	nouns.add("Crackers");
	nouns.add("Sand grains");
	nouns.add("Greens");
	
	Random rand = new Random();
	int num = rand.nextInt(4);
	int num2 = rand.nextInt(4);
	
	System.out.println(adjectives.get(num ) + " " + nouns.get(num2));
}
}
