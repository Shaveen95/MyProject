package sc95.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Teachers")
@NoArgsConstructor
@AllArgsConstructor
public class Teachers {
	
	//These are the fields of Teachers table Id is idt
	@Id
	private int idt;
	private String name;
	private int age;
	private String address;
	private double salary;
	
	//Getters and Setters
	public int getIdt() {
		return idt;
	}
	public void setIdt(int idt) {
		this.idt = idt;
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
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
		
	

}
