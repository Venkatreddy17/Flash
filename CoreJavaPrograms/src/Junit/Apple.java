package Junit;

public class Apple {
	private String color;

	public String getColour() {
		return color;

	}

	public void setColour(String colour) {
		this.color = colour;

	}

	boolean checkColour() {
		if (color.equalsIgnoreCase("green") || color.equals("red"))
			return true;
		else
			return false;

	}
}
