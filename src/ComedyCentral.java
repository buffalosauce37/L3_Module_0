import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;
import java.io.*;
import javax.sound.sampled.*;
public class ComedyCentral {
public static void main(String[] args) {
	ArrayList<String> joke = new ArrayList<String>();
	ArrayList<String> punchline = new ArrayList<String>();
	joke.add("What do you call a mexican witha rubber toe?");
	punchline.add("Roberto");
	joke.add("Why did the chicken cross the road?");
	punchline.add("To get to the other side?");
	joke.add("What is blue and smells like red paint?");
	punchline.add("Blue paint!");
	joke.add("Why don't Germans play scrabble?");
	punchline.add("Fremdschämen");
	
	Random rand = new Random();
	int num = rand.nextInt(4);
	
	JOptionPane.showMessageDialog(null, joke.get(num));
	playSound( "Laugh.wav" );
	
	JOptionPane.showMessageDialog(null, punchline.get(num));


	
}

	public static void playSound(String soundName)
	{
		try {
		    InputStream stream;
		    AudioFormat format;
		    DataLine.Info info;
		    Clip clip;
		    
		    	stream = ComedyCentral.class.getResourceAsStream(soundName);
		    	AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(stream);
		    format = audioInputStream.getFormat();
		    info = new DataLine.Info(Clip.class, format);
		    clip = (Clip) AudioSystem.getLine(info);
		    clip.open(audioInputStream);
		    clip.start();
		}
		catch (Exception e) {
		    //whatevers
		}
	}
}
