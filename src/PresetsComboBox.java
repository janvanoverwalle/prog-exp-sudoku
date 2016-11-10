import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

/**
 * The ComboBox to select presets.
 * 
 * @author  Jan Van Overwalle
 * 
 */
public class PresetsComboBox extends JComboBox<String>  implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	private SudokuPanel sp;
	
	/**
	 * Creates a new solve button.
	 * 
	 * @param sp
	 *            the sudoku panel the button is going to interact with
	 */
	public PresetsComboBox(SudokuPanel sp) {
		super();
		this.sp = sp;
		addActionListener(this);
		
		for (int i = 0; i < Presets.getNames().length; i++) {
			this.addItem(Presets.getNamedIndex(i));
		}
	}
	
	/**
	 * Called when selection changes.
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		int idx = this.getSelectedIndex();
		
		selectPreset(idx);
		
	}
	
	public void selectPreset(int idx) {
		Sudoku s = new Sudoku();
		
		System.out.println(Presets.getNamedIndex(idx));
		
		if (idx > 0) {
			for (int r = 0; r < Sudoku.GRID_SIZE; r++) {
				for (int c = 0; c < Sudoku.GRID_SIZE; c++) {
					s.setSquare(r, c, Presets.getPreset(idx-1)[r][c]);
				}
			}
		}
		
		sp.setSudoku(s);
	}
}
