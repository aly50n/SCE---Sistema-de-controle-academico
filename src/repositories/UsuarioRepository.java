package repositories;

import factory.ConnectionFactory;
import models.Usuario;

import java.sql.*;

public class UsuarioRepository {
    private Connection connection;

    public void save(Usuario usuario) throws Exception{
        String sql = "INSERT INTO usuario(nome, cpf, tipo, dataDeNascimento, senha) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = null;

        try{
            connection = ConnectionFactory.createConnectionToMySQL();
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getCpf());
            preparedStatement.setString(3, usuario.getTipo());
            preparedStatement.setDate(4, new Date(usuario.getDataDeNascimento().getTime()));
            preparedStatement.setString(5, usuario.getSenha());

            preparedStatement.execute();
        }
        catch (Exception e){
            throw e;
        }finally {
            try {
                if(connection != null){
                    connection.close();
                }
                if(preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Usuario get(String cpf) throws Exception{
        Usuario usuario = null;

        String sql = "SELECT * FROM usuario WHERE cpf=?";

        PreparedStatement preparedStatement = null;

        try{
            connection = ConnectionFactory.createConnectionToMySQL();
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, cpf);

            if (preparedStatement.execute()){
                ResultSet resultSet = preparedStatement.getResultSet();
                while(resultSet.next()){
                    usuario = new Usuario();
                    usuario.setCpf(resultSet.getString(1));
                    usuario.setNome(resultSet.getString(2));
                    usuario.setTipo(resultSet.getString(3));
                    usuario.setDataDeNascimento(resultSet.getDate(4));
                    usuario.setSenha(resultSet.getString(5));
                }
            }
        }
        catch (Exception e){
            throw e;
        }finally {
            try {
                if(connection != null){
                    connection.close();
                }
                if(preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return usuario;
    }
}
