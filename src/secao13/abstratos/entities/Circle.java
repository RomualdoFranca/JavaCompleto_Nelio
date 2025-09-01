package secao13.abstratos.entities;

import secao13.abstratos.enums.Color;

public class Circle extends Shape{
	private Double radius;
	
	public Circle() {
		super();
	}
	

	public Circle(Double radius, Color color) {
		super(color);
		this.radius = radius;
	}
	
	public Double getRadius() {
		return radius;
	}


	public void setRadius(Double radius) {
		this.radius = radius;
	}


	@Override
	public double area() {
		return Math.PI * Math.pow(getRadius(), 2);
	}
	
	@Override
	public String toString() {

	StringBuilder sb = new StringBuilder();
	sb.append("Circle área: " + String.format("%.2f", area()) + "\nColor: " + getColor());
	return sb.toString();
	}

}
