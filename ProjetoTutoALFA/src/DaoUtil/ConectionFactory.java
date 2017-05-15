package DaoUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//fabrica de conecx�o com pando de dados

public class ConectionFactory {
	
	private Connection conexao =null; // seguran�a para conex�o
	
	// metodo para abrir conex�o com banco
	public Connection criarConexao() throws SQLException{ // metodo para chamar o driver para conectar ao Banco
		try{
			Class.forName("com.mysql.jdbc.Driver");// pegando o driver de conex�o
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/tutoria","root","root");
			
		}catch(ClassNotFoundException e){
		  e.printStackTrace();
		}
		return conexao;
	}
	
	// metodo para fechar a conecx�o com banco
	public void fecharConexao() throws SQLException{ 
		try{
			conexao.close();
		}catch (Exception e){
			
			System.out.println("Erro na conex�o" + e.getMessage());
			
		}
	}
	
 
}
