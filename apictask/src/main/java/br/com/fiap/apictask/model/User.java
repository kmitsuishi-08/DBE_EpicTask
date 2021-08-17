package br.com.fiap.apictask.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_ET_USER")
@SequenceGenerator(name = "user", sequenceName = "SQ_TB_ET_USER", allocationSize = 1)
public class User {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user")
	private Long id;
	
	//@Email
	private String email;
	//@Pattern
	private String password;
}
