package jsettlers.common.images;
import java.util.Arrays;

// DO NOT EDIT THIS FILE, IT IS GENERATED

public final class TextureMap {
	private TextureMap() {}

	public static int getIndex(String name) {
		int arrindex = Arrays.binarySearch(names, name);
		return indexes[arrindex];
	}

	private static final String[] names = new String[] {
		"font.0",
		"font.1",
		"font_grid.0",
		"joinphase.0",
		"lagerhaus.0",
		"ready.0",
		"ready.1",
	};
	private static final int[] indexes = new int[] {
		2,
		3,
		0,
		5,
		4,
		1,
		6,
	};
}
