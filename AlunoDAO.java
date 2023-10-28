package DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class AlunoDAO {

    private Connection conexao;

    public AlunoDAO{
        conexao = (Connection) new Conexao.Fabrica().solicitaConexao("localhost:3306", "senai", "root", "");
    }


}