package jdev.mentoria.lojavirtual.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;


public class MarcaProduto implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
}
