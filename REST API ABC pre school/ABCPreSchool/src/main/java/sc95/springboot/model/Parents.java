package sc95.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Parents")
@NoArgsConstructor
@AllArgsConstructor
public class Parents {
	
	@Id
	private int id;
	private String name;
	private int age;
	private String address;
	private double netIncome;
	private double fee;
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public double getNetIncome() {
		return netIncome;
	}
	public void setNetIncome(double netIncome) {
		this.netIncome = netIncome;
	}
	
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
	

}
