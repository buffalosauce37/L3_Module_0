package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame withel); panel. a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

	Stack<Character> Characters = new Stack<>();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String text = label.getText();

	void setup() {

		JFrame frame = new JFrame();
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);
		frame.setVisible(true);
		frame.setSize(200, 200);
	}

	public static void main(String[] args) {
		TextUndoRedo TUR = new TextUndoRedo();
		TUR.setup();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		text = label.getText();
		if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
			if (text.length() >= 1) {
				char removed = text.charAt(text.length() - 1);
				text = text.substring(0, text.length() - 1);
				label.setText(text);
				Characters.push(removed);
			}
		} else if (e.getKeyChar() == KeyEvent.VK_0) {
			if (Characters.size() >= 1) {
				Character C = Characters.pop();
				text += C;
				label.setText(text);
			}
		} else {
			char velociraptor = e.getKeyChar();
			text += velociraptor;
			Characters.clear();
			label.setText(text);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
