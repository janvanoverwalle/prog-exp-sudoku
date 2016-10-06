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
	private String[] options = { "None", "Easy", "Medium", "Hard", "Inhuman"  };
	private int[][][] presets = {
		{
			{ 0, 0, 0, 2, 6, 0, 7, 0, 1 },
			{ 6, 8, 0, 0, 7, 0, 0, 9, 0 },
			{ 1, 9, 0, 0, 0, 4, 5, 0, 0 },
			{ 8, 2, 0, 1, 0, 0, 0, 4, 0 },
			{ 0, 0, 4, 6, 0, 2, 9, 0, 0 },
			{ 0, 5, 0, 0, 0, 3, 0, 2, 8 },
			{ 0, 0, 9, 3, 0, 0, 0, 7, 4 },
			{ 0, 4, 0, 0, 5, 0, 0, 3, 6 },
			{ 7, 0, 3, 0, 1, 8, 0, 0, 0 }
		}, {
			{ 0, 2, 0, 6, 0, 8, 0, 0, 0 },
			{ 5, 8, 0, 0, 0, 9, 7, 0, 0 },
			{ 0, 0, 0, 0, 4, 0, 0, 0, 0 },
			{ 3, 7, 0, 0, 0, 0, 5, 0, 0 },
			{ 6, 0, 0, 0, 0, 0, 0, 0, 4 },
			{ 0, 0, 8, 0, 0, 0, 0, 1, 3 },
			{ 0, 0, 0, 0, 2, 0, 0, 0, 0 },
			{ 0, 0, 9, 8, 0, 0, 0, 3, 6 },
			{ 0, 0, 0, 3, 0, 6, 0, 9, 0 }
		}, {
			{ 2, 0, 0, 3, 0, 0, 0, 0, 0 },
			{ 8, 0, 4, 0, 6, 2, 0, 0, 3 },
			{ 0, 1, 3, 8, 0, 0, 2, 0, 0 },
			{ 0, 0, 0, 0, 2, 0, 3, 9, 0 },
			{ 5, 0, 7, 0, 0, 0, 6, 2, 1 },
			{ 0, 3, 2, 0, 0, 6, 0, 0, 0 },
			{ 0, 2, 0, 0, 0, 9, 1, 4, 0 },
			{ 6, 0, 1, 2, 5, 0, 8, 0, 9 },
			{ 0, 0, 0, 0, 0, 1, 0, 0, 2 },
		}, {
			{ 8, 5, 0, 0, 0, 2, 4, 0, 0 },
			{ 7, 2, 0, 0, 0, 0, 0, 0, 9 },
			{ 0, 0, 4, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 1, 0, 7, 0, 0, 2 },
			{ 3, 0, 5, 0, 0, 0, 9, 0, 0 },
			{ 0, 4, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 8, 0, 0, 7, 0 },
			{ 0, 1, 7, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 3, 6, 0, 4, 0 },
		}};
	
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
		
		for (int i = 0; i < options.length; i++) {
			this.addItem(options[i]);
		}
	}
	
	/**
	 * Called when selection changes.
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		int idx = this.getSelectedIndex();
		Sudoku s = new Sudoku();
		
		System.out.println(options[idx]);
		
		if (idx > 0) {
			for (int r = 0; r < Sudoku.GRID_SIZE; r++) {
				for (int c = 0; c < Sudoku.GRID_SIZE; c++) {
					s.setSquare(r, c, presets[idx-1][r][c]);
				}
			}
		}
		
		sp.setSudoku(s);
	}
}
