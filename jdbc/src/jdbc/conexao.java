package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conexao {
	static final String drive = "com.mysql.cj.jdbc.Driver";
	static final String endereco = "jdbc:mysql://127.0.0.1:3306/aula";
	static final String usuario = "root";
	static final String senha = "";
	static final String select ="select id, nome from alunos";
	
	public Connection getConexao(){
		try {
			Class.forName(drive);
		    Connection conexao = DriverManager.getConnection(endereco, usuario, senha);
		    return conexao;
		}
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
            throw new RuntimeException("Erro de drive");
		}
		catch( SQLException ex) {
			ex.printStackTrace();
            throw new RuntimeException("Erro ao estabelecer uma conexao com o banco");
		}
	}
	
	public void fecharConexao(Connection conexao) {
		try {
            if (conexao != null) {
            	conexao.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar uma conexao com o banco");
        }
	}
	
	public void consulta(){
		Connection conexao = getConexao();
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    
	    try{   
	    	stmt = conexao.prepareStatement(select);
	        rs = stmt.executeQuery();
	           
	       while (rs.next()){
	    	   System.out.println(rs);
	           }
	           
	           
	    }catch (SQLException s){
	        s.printStackTrace();
	           
	    }
	    finally {
	    	fecharConexao(conexao);
	    }
	}
	
	public void insertAlunos() {
		Connection conexao = getConexao();
		
		try {
			String query = " insert into alunos (id, name)" + " values (?, ?)";
			
			PreparedStatement preparedStmt = conexao.prepareStatement(query);
			preparedStmt.setInt (1,1);
			preparedStmt.setString (2,"ANDERSON");
			preparedStmt.execute();
			
		}catch (SQLException s){
	        s.printStackTrace();
		}
		finally {
	    	fecharConexao(conexao);
	    }
	}
}
