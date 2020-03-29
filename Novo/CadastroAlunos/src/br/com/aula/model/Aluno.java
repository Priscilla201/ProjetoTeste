package br.com.aula.model;

import java.util.Date;

public class Aluno {

	private static int id;
	private String nome;
	private float nota1;
	private float nota2;
	private float media;
	private Date dataNascimento;
	
	public Aluno(String nome, float nota1, float nota2, float media, Date dataNascimento) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
		this.dataNascimento = dataNascimento;
	}
}
