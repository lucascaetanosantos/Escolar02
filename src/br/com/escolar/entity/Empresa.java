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
import org.hibernate.validator.constraints.br.CNPJ;

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5327280166878210663L;
	
	private Integer id;
	private String nomeEmpresa;
	private String cnpjEmpresa;
	private String ieEmpresa;
	private String enderecoEmpresa;
	private String bairroEmpresa;
	private String cidadeEmpresa;
	private String ufEmpresa;
	private Date dataFundacaoEmpresa;
	private Date dataCadastroEmpresa;
	private String telefoneEmpresa;
	private String celularEmpresa;
	private String emailEmpresa;
	
	public Empresa(){
		
	}

	public Empresa(Integer id, String nomeEmpresa, String cnpjEmpresa, String ieEmpresa, String enderecoEmpresa,
			String bairroEmpresa, String cidadeEmpresa, String ufEmpresa, Date dataFundacaoEmpresa,
			Date dataCadastroEmpresa, String telefoneEmpresa, String celularEmpresa, String emailEmpresa) {
		super();
		this.id = id;
		this.nomeEmpresa = nomeEmpresa;
		this.cnpjEmpresa = cnpjEmpresa;
		this.ieEmpresa = ieEmpresa;
		this.enderecoEmpresa = enderecoEmpresa;
		this.bairroEmpresa = bairroEmpresa;
		this.cidadeEmpresa = cidadeEmpresa;
		this.ufEmpresa = ufEmpresa;
		this.dataFundacaoEmpresa = dataFundacaoEmpresa;
		this.dataCadastroEmpresa = dataCadastroEmpresa;
		this.telefoneEmpresa = telefoneEmpresa;
		this.celularEmpresa = celularEmpresa;
		this.emailEmpresa = emailEmpresa;
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
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	@CNPJ
	@Column(length = 20, nullable = false)
	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}

	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}

	@Column(length = 20, nullable = false)
	public String getIeEmpresa() {
		return ieEmpresa;
	}

	public void setIeEmpresa(String ieEmpresa) {
		this.ieEmpresa = ieEmpresa;
	}

	@Column(length = 255, nullable = false)
	public String getEnderecoEmpresa() {
		return enderecoEmpresa;
	}

	public void setEnderecoEmpresa(String enderecoEmpresa) {
		this.enderecoEmpresa = enderecoEmpresa;
	}

	@Column(length = 255, nullable = false)
	public String getBairroEmpresa() {
		return bairroEmpresa;
	}

	public void setBairroEmpresa(String bairroEmpresa) {
		this.bairroEmpresa = bairroEmpresa;
	}

	@Column(length = 255, nullable = false)
	public String getCidadeEmpresa() {
		return cidadeEmpresa;
	}

	public void setCidadeEmpresa(String cidadeEmpresa) {
		this.cidadeEmpresa = cidadeEmpresa;
	}

	@Column(length = 2, nullable = false)
	public String getUfEmpresa() {
		return ufEmpresa;
	}

	public void setUfEmpresa(String ufEmpresa) {
		this.ufEmpresa = ufEmpresa;
	}

	@Temporal (TemporalType.DATE)
	public Date getDataFundacaoEmpresa() {
		return dataFundacaoEmpresa;
	}

	public void setDataFundacaoEmpresa(Date dataFundacaoEmpresa) {
		this.dataFundacaoEmpresa = dataFundacaoEmpresa;
	}

	@Temporal (TemporalType.DATE)
	public Date getDataCadastroEmpresa() {
		return dataCadastroEmpresa;
	}

	public void setDataCadastroEmpresa(Date dataCadastroEmpresa) {
		this.dataCadastroEmpresa = dataCadastroEmpresa;
	}

	@Column(length = 20)
	public String getTelefoneEmpresa() {
		return telefoneEmpresa;
	}

	public void setTelefoneEmpresa(String telefoneEmpresa) {
		this.telefoneEmpresa = telefoneEmpresa;
	}

	@Column(length = 20, nullable = false)
	public String getCelularEmpresa() {
		return celularEmpresa;
	}

	public void setCelularEmpresa(String celularEmpresa) {
		this.celularEmpresa = celularEmpresa;
	}

	@Email
	public String getEmailEmpresa() {
		return emailEmpresa;
	}

	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
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
		Empresa other = (Empresa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
