package cn.itcast.tetris.game;

import cn.itcast.tetris.entities.Ground;
import cn.itcast.tetris.listener.GroundAdapter;
import cn.itcast.tetris.util.Global;




public class MyGroundListener extends GroundAdapter {

	int deletedLineCount = 0;

	@Override
	public void fullLineDeleted(Ground ground, int deletedLineCount) {

		this.deletedLineCount += deletedLineCount;
		// TODO Auto-generated method stub
		if ((deletedLineCount %= 10) == 9 || deletedLineCount > 2)
			for (int y = 0; y < Global.HEIGHT; y++)
				for (int x = 0; x < Global.WIDTH; x++)
					if (ground.isStubbornObstacle(x, y))
						ground.addObstacle(x, y);
	}

}
