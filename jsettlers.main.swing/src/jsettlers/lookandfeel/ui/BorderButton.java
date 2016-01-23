package jsettlers.lookandfeel.ui;

import javax.swing.border.Border;
import java.awt.*;

/**
 * Border for Button 3D effects
 * 
 * @author Andreas Butti
 *
 */
public class BorderButton implements Border {

	/**
	 * UP Border, 4px border
	 */
	public static final BorderButton BUTTON_UP_4PX = new BorderButton(new ColorTypes(
			new Color[] { new Color(0, 0, 0, 40), new Color(0xff, 0xff, 0xff, 180), new Color(0xff, 0xff, 0xff, 160),
					new Color(0xff, 0xff, 0xff, 60) },
			new Color[] { new Color(0, 0, 0, 40), new Color(0xff, 0xff, 0xff, 180), new Color(0xff, 0xff, 0xff, 160),
					new Color(0xff, 0xff, 0xff, 60) },
			new Color[] { Color.BLACK, new Color(0, 0, 0, 120), new Color(0, 0, 0, 40) },
			new Color[] { Color.BLACK, new Color(0, 0, 0, 120), new Color(0, 0, 0, 40) }));

	/**
	 * for BUTTON_UP_BIG
	 */
	private static final Color[] COLOR_BIG_TOP_LEFT_UP = new Color[] {
			new Color(0, 0, 0, 40),
			new Color(0xff, 0xff, 0xff, 20),
			new Color(0xff, 0xff, 0xff, 20),
			new Color(0xff, 0xff, 0xff, 60),
			new Color(0xff, 0xff, 0xff, 60),
			new Color(0xff, 0xff, 0xff, 120),
			new Color(0xff, 0xff, 0xff, 120),
			new Color(0xff, 0xff, 0xff, 180),
			new Color(0xff, 0xff, 0xff, 180),
			new Color(0xff, 0xff, 0xff, 120),
			new Color(0xff, 0xff, 0xff, 80),
			new Color(0xff, 0xff, 0xff, 80),
			new Color(0xff, 0xff, 0xff, 20),
	};

	/**
	 * for BUTTON_UP_BIG
	 */
	private static final Color[] COLOR_BIG_BOTTOM_RIGHT_UP = new Color[] {
			new Color(0, 0, 0, 255),
			new Color(0, 0, 0, 255),
			new Color(0, 0, 0, 255),
			new Color(0, 0, 0, 200),
			new Color(0, 0, 0, 200),
			new Color(0, 0, 0, 180),
			new Color(0, 0, 0, 180),
			new Color(0, 0, 0, 120),
			new Color(0, 0, 0, 120),
			new Color(0, 0, 0, 100),
			new Color(0, 0, 0, 80),
			new Color(0, 0, 0, 80),
			new Color(0, 0, 0, 20),
	};

	/**
	 * UP Border, 10px border
	 */
	public static final BorderButton BUTTON_UP_BIG = new BorderButton(new ColorTypes(
			COLOR_BIG_TOP_LEFT_UP, COLOR_BIG_TOP_LEFT_UP, COLOR_BIG_BOTTOM_RIGHT_UP, COLOR_BIG_BOTTOM_RIGHT_UP));

	/**
	 * for BUTTON_UP_BIG
	 */
	private static final Color[] COLOR_BIG_TOP_LEFT_DOWN = new Color[] {
			new Color(0, 0, 0, 40),
			new Color(0xff, 0xff, 0xff, 20),
			new Color(0xff, 0xff, 0xff, 60),
			new Color(0xff, 0xff, 0xff, 120),
			new Color(0xff, 0xff, 0xff, 180),
			new Color(0xff, 0xff, 0xff, 120),
			new Color(0xff, 0xff, 0xff, 80),
			new Color(0xff, 0xff, 0xff, 20),
	};

	/**
	 * for BUTTON_UP_BIG
	 */
	private static final Color[] COLOR_BIG_BOTTOM_RIGHT_DOWN = new Color[] {
			new Color(0, 0, 0, 255),
			new Color(0, 0, 0, 255),
			new Color(0, 0, 0, 200),
			new Color(0, 0, 0, 180),
			new Color(0, 0, 0, 120),
			new Color(0, 0, 0, 100),
			new Color(0, 0, 0, 80),
			new Color(0, 0, 0, 20),
	};

	/**
	 * UP Border, 10px border
	 */
	public static final BorderButton BUTTON_DOWN_BIG = new BorderButton(new ColorTypes(
			COLOR_BIG_TOP_LEFT_DOWN, COLOR_BIG_TOP_LEFT_DOWN, COLOR_BIG_BOTTOM_RIGHT_DOWN, COLOR_BIG_BOTTOM_RIGHT_DOWN));

	/**
	 * Down button to 4px border
	 */
	public static final BorderButton BUTTON_DOWN_4PX = new BorderButton(new ColorTypes(
			new Color[] { new Color(0, 0, 0, 40), new Color(0xff, 0xff, 0xff, 180) },
			new Color[] { new Color(0, 0, 0, 40), new Color(0xff, 0xff, 0xff, 180) },
			new Color[] { Color.BLACK, new Color(0, 0, 0, 120) },
			new Color[] { Color.BLACK, new Color(0, 0, 0, 120) }));

	/**
	 * Definitions for borders
	 */
	private static class ColorTypes {
		/**
		 * Top colors, from top down
		 */
		private final Color[] top;

		/**
		 * Left colors, from left to right
		 */
		private final Color[] left;

		/**
		 * Bottom colors, down to up
		 */
		private final Color[] bottom;

		/**
		 * Right colors, from right to left
		 */
		private final Color[] right;

		/**
		 * Constructor
		 * 
		 * @param top
		 *            Color order
		 * @param left
		 *            Color order
		 * @param bottom
		 *            Color order
		 * @param right
		 *            Color order
		 */
		public ColorTypes(Color[] top, Color[] left, Color[] bottom, Color[] right) {
			this.top = top;
			this.left = left;
			this.bottom = bottom;
			this.right = right;
		}

	}

	/**
	 * Color definitions
	 */
	private final ColorTypes colors;

	/**
	 * Constructor
	 * 
	 * @param colors
	 *            Color definitions
	 */
	public BorderButton(ColorTypes colors) {
		this.colors = colors;
	}

	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
		int w = c.getWidth();
		int h = c.getHeight();

		/**
		 * Button layout
		 * 
		 * <pre>
		 * --012345--------------------------4321
		 * 0 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
		 * 1 BCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCM
		 * 2 BDEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEELM
		 * 3 BDFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGLM
		 * 4 BDFZ------------------------------LM
		 * 4 BDFZ------------------------------LM
		 * 3 BDFZKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKLM
		 * 2 BDFIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIM
		 * 1 BHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
		 * 
		 * </pre>
		 */

		for (int i = 0; i < colors.top.length; i++) {
			g.setColor(colors.top[i]);
			g.drawLine(i, i, w - i, i);
		}

		for (int i = 0; i < colors.bottom.length; i++) {
			g.setColor(colors.bottom[i]);
			g.drawLine(i, h - i - 1, w - i, h - i - 1);
		}

		for (int i = 0; i < colors.left.length; i++) {
			g.setColor(colors.left[i]);
			g.drawLine(i, i, i, h - i - 1);
		}

		for (int i = 0; i < colors.right.length; i++) {
			g.setColor(colors.right[i]);
			g.drawLine(w - i - 1, i + 1, w - i - 1, h - i - 1);
		}

	}

	@Override
	public Insets getBorderInsets(Component c) {
		return new Insets(7, 7, 7, 7);
	}

	@Override
	public boolean isBorderOpaque() {
		return true;
	}

}
