package cn.itcast.tetris.entities;

import java.awt.Color;



public class UnitType implements Cloneable {

	
	private static final int BLANK_VALUE = 0;

	
	private static final int STUBBORN_OBSTACLE_VALUE = 1;

	
	private static final int OBSTACLE_VALUE = 2;

	
	public static final UnitType BLANK = new UnitType(BLANK_VALUE, Color.WHITE);

	
	public static final UnitType STUBBORN_OBSTACLE = new UnitType(
			STUBBORN_OBSTACLE_VALUE, new Color(0x808000));

	
	public static final UnitType OBSTACLE = new UnitType(OBSTACLE_VALUE,
			Color.DARK_GRAY);

	
	private int value;

	
	private Color color;

	
	public int getValue() {
		return value;
	}

	
	public void setValue(int value) {
		this.value = value;
	}

	
	public Color getColor() {
		return color;
	}

	
	public void setColor(Color color) {
		this.color = color;
	}

	
	private UnitType(int value) {
		super();
		this.value = value;
	}

	
	private UnitType(int value, Color color) {
		super();
		this.value = value;
		this.color = color;
	}

	
	@Override
	public UnitType clone() {
		// TODO Auto-generated method stub
		return new UnitType(this.value, this.color);
	}

	
	public void cloneProperties(UnitType ut) {
		this.color = ut.color;
		this.value = ut.value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final UnitType other = (UnitType) obj;
		if (value != other.value)
			return false;
		return true;
	}

}
