/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package srs.entidades;

import javax.persistence.*;

/**
 *
 * @author Laionel Lellis
 */
@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private int idUsuario;
    
    @Column(nullable = false)
    private String cpf;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String sobrenome;
    
    @Column(nullable = false)
    private String departamento;
    
    @Column(nullable = false)
    private String funcao;
    
    @Column(nullable = false)
    private String senha;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
