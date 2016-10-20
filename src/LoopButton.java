import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

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
	PresetsComboBox pcb;
	TextField tf;

	/**
	 * Creates a new clear button.
	 * 
	 * @param sp
	 *            the sudoku panel the button is going to interact with
	 */
	public LoopButton(SudokuPanel sp, PresetsComboBox pcb, TextField tf) {
		super("Loop");
		this.sp = sp;
		this.pcb = pcb;
		this.tf = tf;
		addActionListener(this);
	}

	/**
	 * Called when the button is clicked.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		int count = Integer.parseInt(tf.getText());
		
		for (int i = 0; i < count; ++i) {
			try {
				int idx = ThreadLocalRandom.current().nextInt(1, pcb.presets.length);
				pcb.selectPreset(idx);
				sp.solve();
				Thread.sleep(1000);
				sp.clear();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
}