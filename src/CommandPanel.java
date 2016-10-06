import java.awt.*;
import javax.swing.*;

/**
 * The command panel at the bottom of the sudoku GUI, contains the buttons.
 * 
 * @author Erik Jansson <br />
 *         Fredrik Nord
 * 
 */
public class CommandPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private SolveButton sButton;
	private ClearButton cButton;
	private PresetsComboBox pComboBox;

	/**
	 * Creates a new command panel with default layout (FlowLayout.LEFT). Also
	 * creates a SolveButton and a ClearButton and adds them to the panel.
	 * Also adds a PresetsComboBox to the panel.
	 * 
	 * @see SolveButton
	 * @see ClearButton
	 * @see PresetsComboBox (Added by Jan Van Overwalle)
	 */
	public CommandPanel(SudokuPanel sp) {
		sButton = new SolveButton(sp);
		cButton = new ClearButton(sp);
		pComboBox = new PresetsComboBox(sp);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(sButton);
		add(cButton);
		add(pComboBox);
	}
}
