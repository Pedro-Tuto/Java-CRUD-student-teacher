package DAO;

import Model.Professor;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProfessorDAO {
    
    public static ArrayList<Professor> MinhaLista1 = new ArrayList<Professor>();
    
    public ProfessorDAO(){
    }
    
    public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_professores");
            res.next();
            maiorID = res.getInt("id");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorID;
    }

    public Connection getConexao() {
        
        Connection connection = null;  

        try {

            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost"; 
            String database = "db_alunos";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "mysqlroot";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: N�O CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {  
            System.out.println("O driver nao foi encontrado. " + e.getMessage());
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }
    
    // Retorna a Lista de Professores(objetos)
    public ArrayList getMinhaLista1() {

        MinhaLista1.clear();

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_professores");
            while (res.next()) {

                String formacao = res.getString("formacao");
                String capacitacao = res.getString("capacitacao");
                double salario = res.getDouble("salario");
                int numero_turmas = res.getInt("numero_turmas");
                String turno = res.getString("turno");
//                boolean ativo = res.getBoolean("ativo");
                int meses_servico = res.getInt("meses_servico");
                String email = res.getString("email");
                String telefone = res.getString("telefone");
                int aulas_lecionadas = res.getInt("aulas_lecionadas");                
                int id = res.getInt("id");
                String nome = res.getString("nome");
                int idade = res.getInt("idade");

                Professor objeto = new Professor(formacao, capacitacao, salario, numero_turmas, turno, meses_servico, email, telefone, aulas_lecionadas, id, nome, idade);

                MinhaLista1.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaLista1;
    }
    // Cadastra novo professor

    public boolean InsertProfessorBD(Professor objeto) {
        String sql = "INSERT INTO tb_professores(id,nome,idade,formacao, capacitacao, salario, numero_turmas, turno, meses_servico, email, telefone, aulas_lecionadas) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setInt(3, objeto.getIdade());
            stmt.setString(4, objeto.getFormacao());
            stmt.setString(5, objeto.getCapacitacao());
            stmt.setDouble(6, objeto.getSalario());
            stmt.setInt(7, objeto.getNumero_turmas());
            stmt.setString(8, objeto.getTurno());
//            stmt.setBoolean(9, objeto.isAtivo());
            stmt.setInt(9, objeto.getMeses_servico());
            stmt.setString(10, objeto.getEmail());
            stmt.setString(11, objeto.getTelefone());
            stmt.setInt(12, objeto.getAulas_lecionadas());
            
            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }    
    
    public boolean DeleteProfessorBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_professores WHERE id = " + id);
            stmt.close();

        } catch (SQLException erro) {
        }

        return true;
    }

    public boolean UpdateProfessorBD(Professor objeto) {

        String sql = "UPDATE tb_professores set nome = ? ,idade = ? ,formacao = ? ,capacitacao = ? ,salario = ?, numero_turmas = ?, turno = ?, meses_servico = ?, email = ?, telefone = ?, aulas_lecionadas = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setInt(2, objeto.getIdade());
            stmt.setString(3, objeto.getFormacao());
            stmt.setString(4, objeto.getCapacitacao());
            stmt.setDouble(5, objeto.getSalario());
            stmt.setInt(6, objeto.getNumero_turmas());
            stmt.setString(7, objeto.getTurno());
//            stmt.setBoolean(8, objeto.isAtivo());
            stmt.setInt(8, objeto.getMeses_servico());
            stmt.setString(9, objeto.getEmail());
            stmt.setString(10, objeto.getTelefone());
            stmt.setInt(11, objeto.getAulas_lecionadas());
            stmt.setInt(12, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }
    
    public Professor carregaProfessor(int id) {

        Professor objeto = new Professor();
        objeto.setId(id);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_professores WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setIdade(res.getInt("idade"));
            objeto.setFormacao(res.getString("formacao"));
            objeto.setCapacitacao(res.getString("capacitacao"));
            objeto.setSalario(res.getDouble("salario"));
            objeto.setNumero_turmas(res.getInt("numero_turmas"));
            objeto.setTurno(res.getString("turno"));
//            objeto.setAtivo(res.getBoolean("ativo"));
            objeto.setMeses_servico(res.getInt("meses_servico"));
            objeto.setEmail(res.getString("email"));
            objeto.setTelefone(res.getString("telefone"));
            objeto.setAulas_lecionadas(res.getInt("aulas_lecionadas"));
          
            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;
    }
}

