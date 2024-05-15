package mapa_dispercao_exercicio;

import java.time.LocalDate;

public class Aluno {

	private int matricula;
	private String nome;
	private LocalDate dtNascimento;

	public Aluno(int matricula, String nome, LocalDate dtNascimento) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

}
