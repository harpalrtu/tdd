package com.hpst.tdd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author harpal singh
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
	
	@Id
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "type")
	private String type;
}
