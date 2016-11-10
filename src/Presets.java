
public class Presets {
	private static final String[] options = { "None", "Easy", "Medium", "Hard", "Inhuman"  };
	
	private static final int[][][] presets = {
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
		}
	};
	
	public static String getNamedIndex(int index) {
		if (index < 0 || index >= options.length)
			return null;
		
		return options[index];
	}
	
	public static String[] getNames() {
		return options;
	}
	
	public static int[][] getPreset(int index) {
		if (index < 0 || index >= presets.length)
			return null;
		
		return presets[index];
	}
	
	public static int getPresetLength() {
		return presets.length;
	}
}
