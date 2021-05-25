package CRUD;

import java.awt.List;
import java.sql.*;

import conexao.ConexaoMySql;
import model.PontodeColeta;

public class CRUD {
	
	static public ResultSet PesquisarColeta(){
		ConexaoMySql conexao = new ConexaoMySql();
		
		conexao.conectar();
		
		String sql = "Select * from CadColeta";
		
		conexao.executarSQL(sql);
		
		return conexao.getResultSet();

	}
	
	static public boolean CadastrarColeta(String nome,String End,String Cidade,String Bairro,String Estado,String Tipo) {
		
		ConexaoMySql conexao = new ConexaoMySql();
		
		conexao.conectar();
		
		conexao.executarSQL("Select max(id_Col) as maximo from CadColeta");
		
		int id_Col = 0;

		try {
			while (conexao.getResultSet().next()) {
				id_Col = conexao.getResultSet().getInt("maximo") + 1;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	
		String sql = "INSERT INTO CadColeta Values("+Integer.toString(id_Col)+","+"'"+nome+"','"+End+"','"+Cidade+"','"+Bairro+"','"+Estado+"','"+Tipo+"')";
		
		if (conexao.insertSQL(sql) == 0) {
			return true;
		}else
			return false;
		
	}
}
