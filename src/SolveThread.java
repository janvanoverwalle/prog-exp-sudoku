import java.util.concurrent.ThreadLocalRandom;

class SolveThread implements Runnable {
	private SudokuPanel _sp;
	private int _iterations;

	SolveThread(SudokuPanel sp, int iterations) {
		_sp = sp;
		_iterations = iterations;
	}

	public void run() {
			for(int i = 0; i < _iterations; i++) {
				int idx = ThreadLocalRandom.current().nextInt(1, Presets.getPresetLength()+1);
				System.out.println("Iteration " + (i+1) + "/" + _iterations + " | Difficulty " + Presets.getNamedIndex(idx));
				selectPreset(idx);
				_sp.solve();
				//Thread.sleep(500);
				_sp.clear();
			}
	}

	public void selectPreset(int idx) {
		Sudoku s = new Sudoku();
	
		if (idx > 0) {
			for (int r = 0; r < Sudoku.GRID_SIZE; r++) {
				for (int c = 0; c < Sudoku.GRID_SIZE; c++) {
					s.setSquare(r, c, Presets.getPreset(idx-1)[r][c]);
				}
			}
		}
	
		_sp.setSudoku(s);
	}
}