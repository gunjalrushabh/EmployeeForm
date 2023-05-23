package com.app.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "emp_tbl")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends BaseEntity {

	@Column(name = "empname" , length = 50)
	private String Emp_Name;
	
	@Column(name = "empstate" , length = 50)
	private String Emp_State;
	
	@Column(name = "empcity" , length = 50)
	private String Emp_City;
	
	@Column(name = "empcontact" , length = 14)
	private long Emp_Contact;
	
	@Column(name = "emphobbies" , length = 200)
	private String Emp_Hobbies;
	//private String Emp_Resume;

	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="reff_id")
//	private EmployDetails empdetails;
	
	@Embedded
	private EmployDetails empdetails;

//	@ElementCollection
//    @CollectionTable(name = "empdetails", joinColumns = @JoinColumn(name = "employee_id"))
//    private List<EmployDetails> empDetailsList;


	@Override
	public String toString() {
		return "Employee [Emp_Name=" + Emp_Name + ", Emp_State=" + Emp_State + ", Emp_City=" + Emp_City
				+ ", Emp_Contact=" + Emp_Contact + ", Emp_Hobbies=" + Emp_Hobbies + ", empdetails=" + empdetails + "]";
	}
	
	
	
	
	
}
