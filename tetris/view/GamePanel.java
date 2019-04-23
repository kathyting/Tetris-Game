package cn.itcast.tetris.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import cn.itcast.tetris.entities.Ground;
import cn.itcast.tetris.entities.Shape;
import cn.itcast.tetris.util.Global;



public class GamePanel extends JPanel {

	
	private static final long serialVersionUID = 1L;

	private Image oimg;

	private Graphics og;

	public static final Color DEFAULT_BACKGROUND_COLOR = new Color(0xcfcfcf);
	
	protected Color backgroundColor = DEFAULT_BACKGROUND_COLOR;

	public GamePanel() {
		
		this.setSize(Global.WIDTH * Global.CELL_WIDTH, Global.HEIGHT
				* Global.CELL_HEIGHT);
		this.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		this.setFocusable(true);
	}

	
	public synchronized void redisplay(Ground ground, Shape shape) {

	
		if (og == null) {
			oimg = createImage(getSize().width, getSize().height);
			if (oimg != null)
				og = oimg.getGraphics();
		}
		if (og != null) {
			og.setColor(backgroundColor);
			og.fillRect(0, 0, Global.WIDTH * Global.CELL_WIDTH, Global.HEIGHT
					* Global.CELL_HEIGHT);
			ground.drawMe(og);
			if (shape != null)
				shape.drawMe(og);
			this.paint(this.getGraphics());
		}
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(oimg, 0, 0, this);
	}

	
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

}
