package models;

import repositories.UsuarioRepository;

import javax.swing.*;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Usuario {
    private int id;
    private String nome;
    private String cpf;
    private String tipo;
    private Date dataDeNascimento;
    private String senha;

    private static final UsuarioRepository usuarioRepository = new UsuarioRepository();

    public void save(){
        try{
            usuarioRepository.save(this);
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
        }
        catch (SQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(null, "Usuário já existe");
        } catch (Exception _ex) {
           
        }
    }

    public Usuario logar(){
        Usuario usuarioLogado = null;
        try{
            usuarioLogado = usuarioRepository.get(this.cpf);
            if(usuarioLogado.cpf.equals(this.cpf)){
                if(usuarioLogado.getSenha().equals(this.senha)){
                    return usuarioLogado;
                }else{
                    JOptionPane.showMessageDialog(null, "Senha incorreta!");
                }
            }
        }catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "Usuário inválido");
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
