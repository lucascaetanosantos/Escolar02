package br.com.escolar.control;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.escolar.dao.ProfessorDao;
import br.com.escolar.entity.Professor;

@ManagedBean
@SessionScoped
public class ProfessorMBean implements Serializable{

    private static final long serialVersionUID = 1346606245955193693L;
    
    private Professor professor;
    private ProfessorDao ad;
    private List<Professor> ProfessorList;

    @PostConstruct
    public void init() {
	this.professor = new Professor();
	this.ad = new ProfessorDao();
	this.ProfessorList = ad.list();
    }

    public String newProfessor() {
	return "manageProfessor";
    }

    public String delete(Professor professor) {
	ad.delete(professor);
	return "professor";
    }

    public String edit(Professor professor) {
	this.professor = professor;
	return "manageProfessor";
    }

    public String save() {
	ad.saveOrUpdate(professor);
	this.professor = new Professor();
	return "professor";
    }

    public Professor getProfessor() {
	return professor;
    }

    public void setProfessor(Professor professor) {
	this.professor = professor;
    }

    public ProfessorDao getAd() {
	return ad;
    }

    public void setAd(ProfessorDao ad) {
	this.ad = ad;
    }

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
