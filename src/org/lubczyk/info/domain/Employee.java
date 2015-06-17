package org.lubczyk.info.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pracownicy")
public class Employee {
	@Id
	@GeneratedValue
	private long id;
	@Column(name = "imie", nullable = false, length = 10)
	private String firstName;
	@Column(name = "nazwisko", columnDefinition = "VARCHAR(10) NOT NULL")
	private String lastName;
	@Column(name = "pensja")
	private double solary;
	@Column(precision = 10, scale = 2)
	private BigDecimal solary2;

	public void setSolary2(BigDecimal solary2) {
		this.solary2 = solary2;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSolary() {
		return solary;
	}

	public void setSolary(double solary) {
		this.solary = solary;
	}

	public BigDecimal getSolary2() {
		return solary2;
	}
}
