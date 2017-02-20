package br.com.escolar.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

/**
 * @author Administrador
 *
 */
@Entity
@Table(name = "aluno")
public class Aluno implements Serializable {

	private static final long serialVersionUID = -8811879410848389035L;

	private Integer id;
	private String nomeAluno;
	private String cursoAluno;
	private String turnoAluno;
	private String cpfAluno;
	private String rgAluno;
	private String enderecoAluno;
	private String bairroAluno;
	private String cidadeAluno;
	private String ufAluno;
	private Date dataNascimentoAluno;
	private Date dataCadastroAluno = new Date();
	private String telefoneAluno;
	private String celularAluno;
	private String emailAluno;

	public Aluno() {
	}

	public Aluno(Integer id, String nomeAluno, String cursoAluno, String turnoAluno, String cpfAluno, String rgAluno,
			String enderecoAluno, String bairroAluno, String cidadeAluno, String ufAluno, Date dataNascimentoAluno,
			Date dataCadastroAluno, String telefoneAluno, String celularAluno, String emailAluno) {
		super();
		this.id = id;
		this.nomeAluno = nomeAluno;
		this.cursoAluno = cursoAluno;
		this.turnoAluno = turnoAluno;
		this.cpfAluno = cpfAluno;
		this.rgAluno = rgAluno;
		this.enderecoAluno = enderecoAluno;
		this.bairroAluno = bairroAluno;
		this.cidadeAluno = cidadeAluno;
		this.ufAluno = ufAluno;
		this.dataNascimentoAluno = dataNascimentoAluno;
		this.dataCadastroAluno = dataCadastroAluno;
		this.telefoneAluno = telefoneAluno;
		this.celularAluno = celularAluno;
		this.emailAluno = emailAluno;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(length = 120, nullable = false)
	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	@Column(length = 80, nullable = false)
	public String getCursoAluno() {
		return cursoAluno;
	}

	public void setCursoAluno(String cursoAluno) {
		this.cursoAluno = cursoAluno;
	}

	@Column(length = 20, nullable = false)
	public String getTurnoAluno() {
		return turnoAluno;
	}

	public void setTurnoAluno(String turnoAluno) {
		this.turnoAluno = turnoAluno;
	}
	
	@CPF
	@Column(length = 18, nullable = false)
	public String getCpfAluno() {
		return cpfAluno;
	}

	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	@Column(length = 18, nullable = false)
	public String getRgAluno() {
		return rgAluno;
	}

	public void setRgAluno(String rgAluno) {
		this.rgAluno = rgAluno;
	}

	@Column(length = 255, nullable = false)
	public String getEnderecoAluno() {
		return enderecoAluno;
	}

	public void setEnderecoAluno(String enderecoAluno) {
		this.enderecoAluno = enderecoAluno;
	}

	@Column(length = 120, nullable = false)
	public String getBairroAluno() {
		return bairroAluno;
	}

	public void setBairroAluno(String bairroAluno) {
		this.bairroAluno = bairroAluno;
	}

	@Column(length = 120, nullable = false)
	public String getCidadeAluno() {
		return cidadeAluno;
	}

	public void setCidadeAluno(String cidadeAluno) {
		this.cidadeAluno = cidadeAluno;
	}

	@Column(length = 2, nullable = false)
	public String getUfAluno() {
		return ufAluno;
	}

	public void setUfAluno(String ufAluno) {
		this.ufAluno = ufAluno;
	}
	
	@Temporal (TemporalType.DATE)
	@Column(nullable = false)
	public Date getDataNascimentoAluno() {
		return dataNascimentoAluno;
	}

	public void setDataNascimentoAluno(Date dataNascimentoAluno) {
		this.dataNascimentoAluno = dataNascimentoAluno;
	}

	@Temporal (TemporalType.DATE)
	@Column(nullable = false)
	public Date getDataCadastroAluno() {
		return dataCadastroAluno;
	}

	public void setDataCadastroAluno(Date dataCadastroAluno) {
		this.dataCadastroAluno = dataCadastroAluno;
	}

	@Column(length = 20)
	public String getTelefoneAluno() {
		return telefoneAluno;
	}

	public void setTelefoneAluno(String telefoneAluno) {
		this.telefoneAluno = telefoneAluno;
	}

	@Column(length = 20, nullable = false)
	public String getCelularAluno() {
		return celularAluno;
	}

	public void setCelularAluno(String celularAluno) {
		this.celularAluno = celularAluno;
	}

	@Email
	@Column(length = 120)
	public String getEmailAluno() {
		return emailAluno;
	}

	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nomeAluno=" + nomeAluno + ", cursoAluno=" + cursoAluno + ", turnoAluno="
				+ turnoAluno + ", cpfAluno=" + cpfAluno + ", rgAluno=" + rgAluno + ", enderecoAluno=" + enderecoAluno
				+ ", bairroAluno=" + bairroAluno + ", cidadeAluno=" + cidadeAluno + ", ufAluno=" + ufAluno
				+ ", dataNascimentoAluno=" + dataNascimentoAluno + ", dataCadastroAluno=" + dataCadastroAluno
				+ ", telefoneAluno=" + telefoneAluno + ", celularAluno=" + celularAluno + ", emailAluno=" + emailAluno
				+ "]";
	}
}
