package com.app.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//
//@Entity
//@Table(name = "empdetails")
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor

@Embeddable

public class EmployDetails {

	@Column(name = "doj" )
	private LocalDate DOJ;
	
	@Column(name = "designation" , length = 50)
	@Enumerated(EnumType.STRING)
	private Designation designation;

	@Override
	public String toString() {
		return "EmployDetails [DOJ=" + DOJ + ", designation=" + designation + "]";
	}

//	@OneToOne(mappedBy = "empdetails",fetch = FetchType.LAZY)
//	private Employee employee;
	
	
	
	
	
}
