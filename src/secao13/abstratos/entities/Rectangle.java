package secao13.abstratos.entities;

import secao13.abstratos.enums.Color;

public class Rectangle extends Shape{

	private Double width;
	private Double height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return getHeight() * getWidth();
	}
	
	@Override
	public String toString() {

	StringBuilder sb = new StringBuilder();
	sb.append("Rectangle área: " + String.format("%.2f", area()) + "\nColor: " + getColor());
	return sb.toString();
	}

}
