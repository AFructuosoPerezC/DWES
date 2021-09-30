package forms;

public abstract class Figura {
	private String color;

	public Figura(String color) {
		super();
		this.setColor(color);
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	public void dibujarFigura() {
		// TODO Auto-generated method stub
		
	} 
}