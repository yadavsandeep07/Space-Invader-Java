import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

/**
 * 
 * @author
 */
public class Player extends Sprite implements Commons {

	private final int START_Y = 400;
	private final int START_X = 300;

	private final String player = "/img/craft.png";
	private int width;

	/*
	 * Constructor
	 */
	public Player() {
		ImageIcon ii = new ImageIcon(this.getClass().getResource(player));

		width = ii.getImage().getWidth(null);

		setImage(ii.getImage());
		setX(START_X);
		setY(START_Y);
	}

	public void act() {
		x += dx;
		if (x <= 2)
			x = 2;
		if (x >= BOARD_WIDTH - width)
			x = BOARD_WIDTH - width;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = -2;
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 2;
		}

	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = 0;
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 0;
		}
	}
}