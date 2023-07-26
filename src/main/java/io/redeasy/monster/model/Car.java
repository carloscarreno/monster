package io.redeasy.monster.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Car extends PanacheEntity{
	    
	@Column(length=16)
	public String model;
    
	@Column(length=16)
	public String bodyType;

	@Column(length=16)
	public String brand;

	@Column(length=4)
	public String year;

	public Double price;

	public int seats;

	public int doors;
    
	@Column(length=128)
	public String urlImage;
}
