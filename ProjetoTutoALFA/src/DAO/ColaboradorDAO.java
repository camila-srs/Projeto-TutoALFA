package DAO;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import DaoUtil.ConectionFactory;
import Model.ColaboradorModel;

public class ColaboradorDAO {

	    //são obrigatorios este tres metodos
		private Connection conexao; // pegando a conexão criada em daoUtil
		private Statement stmt; //
		private PreparedStatement stm; // executador de SQL
		
		/*String retirada do banco Mysql de criação dos atributos prepara para receber os dados gerados
		   pelo metodo salvar abaixo*/
		String sqlSalvar = "INSERT INTO colaboradores (cpf, nome, rg, endereco, foneFixo, foneCelular, email)" +
				"VALUES " + "(?,?,?,?,?,?,?)";
		
		// METODO CONSTRUTOR
		public ColaboradorDAO() throws SQLException{
			
			ConectionFactory factory = new ConectionFactory();
			conexao = factory.criarConexao();
			
		}
		
		// metodo pegando dados do pacote de modelo para salvar em banco String sql salvar do banco
		public String salvar(ColaboradorModel colaborador)throws SQLException{
		    String salvo = "Falso"	;
		
			try{
				
			 conexao.setAutoCommit(false);	
			 stm = (PreparedStatement) conexao.prepareStatement(sqlSalvar);
		
			 stm.setString(1, colaborador.getCpf());
			 stm.setString(2, colaborador.getNome());
			 stm.setString(3, colaborador.getRg());
			 stm.setString(4, colaborador.getEndereco());
			 stm.setString(5, colaborador.getFoneFixo());
			 stm.setString(6, colaborador.getFoneCelular());
			 stm.setString(7, colaborador.getEmail());
			 
			 
			 stm.executeUpdate();
			 conexao.commit();
			 salvo = "salvo";
			 
		}catch (Exception e){//testando a conexão se é nula ou não
			
			if (conexao != null){
				try{
					System.out.println(" Efetuando Rollback");
					conexao.rollback();
					salvo = "erro ao gravar " + e.getMessage();
				}catch (SQLException e1){
					System.out.println(" Erro na Conexão" + e1.getMessage());
					salvo = "e1";
					
				}
			}
				
			}
			return salvo;
		} 
}
