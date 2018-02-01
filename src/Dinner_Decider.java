import java.util.ArrayList;
import java.util.Random;

public class Dinner_Decider {
public static void main(String[] args) {
	
	ArrayList <String> Food = new ArrayList<String>();
	
	Food.add("Italien");
	Food.add("German");
	Food.add("Greek");
	Food.add("Mexican");
	Food.add("American(Best)");
	Food.add("Polish");
	Random random = new Random();
int	x = random.nextInt(Food.size());
System.out.println("You should get "+Food.get(x)+" tonight" );
}
}
