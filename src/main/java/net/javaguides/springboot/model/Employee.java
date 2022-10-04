package net.javaguides.springboot.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name", columnDefinition="VARCHAR(128)")
	private String name;
	
	@Column(name = "address", columnDefinition="VARCHAR(128)")
	private String address;
	
	@Column(name = "phone_no")
	private String phone_no;

	@Column(name = "photo")
	private byte[] photo;
	
	
	public Employee() {
		super();
	}


	public Employee(String name, String address, String phone_no, byte[] photo) {
		super();
		this.name = name;
		this.address = address;
		this.phone_no = phone_no;
		this.photo = photo;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}


	public byte[] getPhoto() {
		return photo;
	}


	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
}