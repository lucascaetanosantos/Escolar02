package br.com.escolar.control;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.PostPersist;

import br.com.escolar.dao.AlunoDao;
import br.com.escolar.entity.Aluno;
import br.com.escolar.entity.Professor;

@ManagedBean
@SessionScoped

public class ProfessorMBean {

	@SuppressWarnings("unused")
	private static final long serialVersionUID = 456123;
	
	private Professor professor;
	//private ProfessorDao ad;
	private List<Professor> ProfessorList;
	
	@PostPersist
	public void init(){
		this.professor = new Professor();
		//this.ad = new ProfessorDao();
		//this.ProfessorList = ad.list();
	}
	
	public String newProfessor() {
		return "manageProfessor";
	}
	
	public String delete(Professor professor){
		//ad.delete(professor);
		return "professor";
	}
	
	public String edit(Professor preofessor) {
		this.professor = professor;
		return "manageProfessor";
	}
	
	public String save() {
		//ad.saveOrUpdate(professor);
		this.professor = new Professor();
		return "professor";
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	/*public ProfessorDao getAd() {
		return ad;
	}

	public void setAd(ProfessorDao ad) {
		this.ad = ad;
	}*/

	public List<Professor> getProfessorList() {
		return ProfessorList;
	}

	public void setProfessorList(List<Professor> professorList) {
		ProfessorList = professorList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
