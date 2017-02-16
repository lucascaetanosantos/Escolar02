package br.com.escolar.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "professor")
public class Professor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4653909158487970825L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomeProfessor;
	@CPF
	private String cpfProfessor;
	private String rgProfessor;
	private String enderecoProfessor;
	private String bairroProfessor;
	private String cidadeProfessor;
	private String ufProfessor;
	@Temporal (TemporalType.DATE)
	private Date dataNascimentoProfessor;
	@Temporal (TemporalType.DATE)
	private Date dataCadastroProfessor;
	private String telefoneProfessor;
	private String celularProfessor;
	@Email
	private String emailProfessor;
	
	public Professor(){
		
	}
	
	public Professor(Integer id, String nomeProfessor, String cpfProfessor, String rgProfessor,
			String enderecoProfessor, String bairroProfessor, String cidadeProfessor, String ufProfessor,
			Date dataNascimentoProfessor, Date dataCadastroProfessor, String telefoneProfessor, String celularProfessor,
			String emailProfessor) {
		super();
		this.id = id;
		this.nomeProfessor = nomeProfessor;
		this.cpfProfessor = cpfProfessor;
		this.rgProfessor = rgProfessor;
		this.enderecoProfessor = enderecoProfessor;
		this.bairroProfessor = bairroProfessor;
		this.cidadeProfessor = cidadeProfessor;
		this.ufProfessor = ufProfessor;
		this.dataNascimentoProfessor = dataNascimentoProfessor;
		this.dataCadastroProfessor = dataCadastroProfessor;
		this.telefoneProfessor = telefoneProfessor;
		this.celularProfessor = celularProfessor;
		this.emailProfessor = emailProfessor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getCpfProfessor() {
		return cpfProfessor;
	}

	public void setCpfProfessor(String cpfProfessor) {
		this.cpfProfessor = cpfProfessor;
	}

	public String getRgProfessor() {
		return rgProfessor;
	}

	public void setRgProfessor(String rgProfessor) {
		this.rgProfessor = rgProfessor;
	}

	public String getEnderecoProfessor() {
		return enderecoProfessor;
	}

	public void setEnderecoProfessor(String enderecoProfessor) {
		this.enderecoProfessor = enderecoProfessor;
	}

	public String getBairroProfessor() {
		return bairroProfessor;
	}

	public void setBairroProfessor(String bairroProfessor) {
		this.bairroProfessor = bairroProfessor;
	}

	public String getCidadeProfessor() {
		return cidadeProfessor;
	}

	public void setCidadeProfessor(String cidadeProfessor) {
		this.cidadeProfessor = cidadeProfessor;
	}

	public String getUfProfessor() {
		return ufProfessor;
	}

	public void setUfProfessor(String ufProfessor) {
		this.ufProfessor = ufProfessor;
	}

	public Date getDataNascimentoProfessor() {
		return dataNascimentoProfessor;
	}

	public void setDataNascimentoProfessor(Date dataNascimentoProfessor) {
		this.dataNascimentoProfessor = dataNascimentoProfessor;
	}

	public Date getDataCadastroProfessor() {
		return dataCadastroProfessor;
	}

	public void setDataCadastroProfessor(Date dataCadastroProfessor) {
		this.dataCadastroProfessor = dataCadastroProfessor;
	}

	public String getTelefoneProfessor() {
		return telefoneProfessor;
	}

	public void setTelefoneProfessor(String telefoneProfessor) {
		this.telefoneProfessor = telefoneProfessor;
	}

	public String getCelularProfessor() {
		return celularProfessor;
	}

	public void setCelularProfessor(String celularProfessor) {
		this.celularProfessor = celularProfessor;
	}

	public String getEmailProfessor() {
		return emailProfessor;
	}

	public void setEmailProfessor(String emailProfessor) {
		this.emailProfessor = emailProfessor;
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
		Professor other = (Professor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
