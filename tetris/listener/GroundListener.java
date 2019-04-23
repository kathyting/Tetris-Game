package cn.itcast.tetris.listener;

import cn.itcast.tetris.entities.Ground;



public interface GroundListener {
	
	void beforeDeleteFullLine(Ground ground, int lineNum);

	
	void fullLineDeleted(Ground ground, int deletedLineCount);

	void groundIsFull(Ground ground);
}
