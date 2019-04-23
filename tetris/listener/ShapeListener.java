package cn.itcast.tetris.listener;

import cn.itcast.tetris.entities.Shape;



public interface ShapeListener {
	
	boolean isShapeMoveDownable(Shape shape);

	
	void shapeMovedDown(Shape shape);
}
