package Model;

import DAO.ProfessorDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class Professor extends Pessoa {

    private String formacao;
    private String capacitacao;
    private double salario;
    private int numero_turmas;
    private String turno;
    //private boolean ativo;
    private int meses_servico;
    private String email;
    private String telefone;
    private int aulas_lecionadas;
    private final ProfessorDAO dao;

    public Professor() {
        this.dao = new ProfessorDAO();
    }

    public Professor(String formacao, String capacitacao, double salario, int numero_turmas, String turno, boolean ativo, int meses_servico, String email, String telefone, int aulas_lecionadas, ProfessorDAO dao) {
        this.formacao = formacao;
        this.capacitacao = capacitacao;
        this.salario = salario;
        this.numero_turmas = numero_turmas;
        this.turno = turno;
//        this.ativo = ativo;
        this.meses_servico = meses_servico;
        this.email = email;
        this.telefone = telefone;
        this.aulas_lecionadas = aulas_lecionadas;
        this.dao = new ProfessorDAO();
    }
    

    public Professor(String formacao, String capacitacao, double salario, int numero_turmas, String turno, int meses_servico, String email, String telefone, int aulas_lecionadas, int id, String nome, int idade) {
        super(id, nome, idade);
        this.formacao = formacao;
        this.capacitacao = capacitacao;
        this.salario = salario;
        this.numero_turmas = numero_turmas;
        this.turno = turno;
//        this.ativo = ativo;
        this.meses_servico = meses_servico;
        this.email = email;
        this.telefone = telefone;
        this.aulas_lecionadas = aulas_lecionadas;
        this.dao = new ProfessorDAO();
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getCapacitacao() {
        return capacitacao;
    }

    public void setCapacitacao(String capacitacao) {
        this.capacitacao = capacitacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumero_turmas() {
        return numero_turmas;
    }

    public void setNumero_turmas(int numero_turmas) {
        this.numero_turmas = numero_turmas;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

//    public boolean isAtivo() {
//        return ativo;
//    }
//
//    public void setAtivo(boolean ativo) {
//        this.ativo = ativo;
//    }

    public int getMeses_servico() {
        return meses_servico;
    }

    public void setMeses_servico(int meses_servico) {
        this.meses_servico = meses_servico;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAulas_lecionadas() {
        return aulas_lecionadas;
    }

    public void setAulas_lecionadas(int aulas_lecionadas) {
        this.aulas_lecionadas = aulas_lecionadas;
    }
    
    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Idade: " + this.getIdade()
                + "\n Formação: " + this.getFormacao()
                + "\n Capacitação:" + this.getCapacitacao()
                + "\n Salário: " + this.getSalario()
                + "\n Número de Turmas:" + this.getNumero_turmas()
                + "\n Turno: " + this.getTurno()
//                + "\n Ativo: " + this.isAtivo()
                + "\n Meses de Serviço: " + this.getMeses_servico()
                + "\n E-mail: " + this.getEmail()
                + "\n Telefone: " + this.getTelefone()
                + "\n Aulas Lecionadas: " + this.getAulas_lecionadas()
                + "\n -----------";
    }

    public ArrayList getMinhaLista1() {
        return dao.getMinhaLista1();
    }

    public boolean InsertProfessorBD(String formacao, String capacitacao, double salario, int numero_turmas, String turno, int meses_servico, String email, String telefone, int aulas_lecionadas, String nome, int idade) throws SQLException {
        int id = this.maiorID() + 1;
        Professor objeto = new Professor(formacao, capacitacao, salario, numero_turmas, turno, meses_servico, email, telefone, aulas_lecionadas, id, nome, idade);
        dao.InsertProfessorBD(objeto);
        return true;

    }

    public boolean DeleteProfessorBD(int id) {
        dao.DeleteProfessorBD(id);
        return true;
    }

    public boolean UpdateProfessorBD(String formacao, String capacitacao, double salario, int numero_turmas, String turno, int meses_servico, String email, String telefone, int aulas_lecionadas, int id, String nome, int idade) {
        Professor objeto = new Professor(formacao, capacitacao, salario, numero_turmas, turno, meses_servico, email, telefone, aulas_lecionadas, id, nome, idade);
        dao.UpdateProfessorBD(objeto);
        return true;
    }

    public Professor carregaProfessor(int id) {
        dao.carregaProfessor(id);
        return null;
    }
    public int maiorID() throws SQLException {
        return dao.maiorID();
    }
}

