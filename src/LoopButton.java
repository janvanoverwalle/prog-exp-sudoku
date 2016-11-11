import java.awt.Component;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Class for the clear button in the sudoku GUI.
 * 
 * @author Erik Jansson <br />
 *         Fredrik Nord
 */
public class LoopButton extends JButton implements ActionListener {
	private static final long serialVersionUID = 1L;
	SudokuPanel sp;

	/**
	 * Creates a new clear button.
	 * 
	 * @param sp
	 *            the sudoku panel the button is going to interact with
	 */
	public LoopButton(SudokuPanel sp) {
		super("Loop");
		this.sp = sp;
		addActionListener(this);
	}

	/**
	 * Called when the button is clicked.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		int count = 0;
		Component[] c = getParent().getComponents();
		for (int i = 0; i < c.length; ++i) {
			if (c[i] instanceof TextField) {
				count = Integer.parseInt(((TextField) c[i]).getText());
			}
		}
		
		System.out.println("Starting solve loop with " + count + " iterations.");
		Thread st = new Thread(new SolveThread(sp, count));
		st.start();
	}
}