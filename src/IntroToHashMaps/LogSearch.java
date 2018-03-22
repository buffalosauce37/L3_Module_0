package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	HashMap<Integer, String> studentRoster = new HashMap<>();
	JButton button1 = new JButton("Add Entry");
	JButton button2 = new JButton("Search by ID");
	JButton button3 = new JButton("View List");
	JButton button4 = new JButton("Remove Entry");

	void setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		LogSearch log = new LogSearch();
		log.setup();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated methostudentRosterd stub

		if (e.getSource() == button1) {
			String x = JOptionPane.showInputDialog("What is your ID number?");
			int z = Integer.parseInt(x);
			String y = JOptionPane.showInputDialog("What is your name?");
			studentRoster.put(z, y);
		}
		if (e.getSource() == button2) {
			String j = JOptionPane.showInputDialog("Which ID?");
			int m = Integer.parseInt(j);
			if (studentRoster.containsKey(m)) {
				JOptionPane.showMessageDialog(null, "This ID belongs to " + studentRoster.get(m));
			} else {
				JOptionPane.showMessageDialog(null, "User does not exist.");
			}
		}
		if (e.getSource() == button3) {
			StringBuffer buff = new StringBuffer();
			for (int ID : studentRoster.keySet()) {
				String mystring = String.format("ID: %5d\tname: %s \n", ID, studentRoster.get(ID));
				buff.append(mystring);
			}
			JOptionPane.showMessageDialog(null, buff.toString());
		}
		if (e.getSource() == button4) {
			String v = JOptionPane.showInputDialog("Which ID?");
			int a = Integer.parseInt(v);
			if (studentRoster.containsKey(a)) {
				studentRoster.remove(a);
			} else {
				JOptionPane.showMessageDialog(null, "User does not exist.");
			}
		}
	}
}
