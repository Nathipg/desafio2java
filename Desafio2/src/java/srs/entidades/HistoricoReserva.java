/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srs.entidades;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;


/**
 *
 * @author Laionel
 */ 
@Entity
public class HistoricoReserva{
    @Id
    @GeneratedValue
    private int idHistoricoReserva;
    
    private Usuario usuario;
    
    private Sala sala;
    
    @Temporal(TemporalType.DATE)
    private Date dataReserva;
    
    private String estadoConservacao;

    public int getIdHistoricoReserva() {
        return idHistoricoReserva;
    }

    public void setIdHistoricoReserva(int idHistoricoReserva) {
        this.idHistoricoReserva = idHistoricoReserva;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getEstadoConservacao() {
        return estadoConservacao;
    }

    public void setEstadoConservacao(String estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

}
