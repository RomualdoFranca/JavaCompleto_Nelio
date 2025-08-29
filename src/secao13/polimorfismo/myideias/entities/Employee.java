package secao13.polimorfismo.myideias.entities;

public class Employee {

	private final String name;
	private Integer hours;
	private Double  valuePerHour;
	
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}
	
	public double payment() {
		return valuePerHour * hours;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Employee name: " + getName());
		sb.append("\nHours: " + getHours());
		sb.append("\nValue per hours: $" + String.format("%.2f", getValuePerHour()));
		sb.append("\nPayment: $" + String.format("%.2f", payment()));
		return sb.toString();
	}
	
	
}
