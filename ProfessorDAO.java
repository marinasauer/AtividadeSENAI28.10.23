package DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class ProfessorDAO {

    private Connection conexao;

    public ProfessorDAO{
        conexao = (Connection) new Conexao.Fabrica().solicitaConexao("localhost:3306", "senai", "root", "");
    }

    public void insert(Professor professor){
        String sql = "INSERT INTO professor" +
                "(nome, idade , salario)" +
                " VALUES(?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getIdade());
            stmt.setString(3, c.getSalario());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}