package br.com.fiap.apictask.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_ET_USER")
//@SequenceGenerator(name = "user", sequenceName = "SQ_TB_ET_USER", allocationSize = 1) FOR ORACLE
public class User {
	
	@Id 
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user") FOR ORACLE
	@GeneratedValue(strategy = GenerationType.IDENTITY) // FOR H2
	private Long id;
	
	@NotBlank(message = "O nome é obrigatório. Digite o nome")
	private String name;
	
	@NotBlank(message = "O e-mail é obrigatório. Digite o e-mail")
	@Email(regexp = "[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+")
	private String email;
	
	@Size(min = 8, max = 12, message = "A senha deve ter entre 8 a 12 caracteres")
	private String password;
}
