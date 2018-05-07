/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srs.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import srs.entidades.Usuario;
import srs.util.HibernateUtil;

/**
 *
 * @author Laionel
 */
public class UsuarioDao {
    Session sessao = null;


    public UsuarioDao( ) {
        this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getUsuarios(String idUsuario){
        Transaction t = this.sessao.beginTransaction();
        List<Usuario> listaUsuarios = null;
        
        try {
            Query query = sessao.createQuery("from Usuario as usuario where usuario.idUsuario =" +idUsuario);
            listaUsuarios= (List<Usuario>) query.list();
            
            t.commit();
        } catch (HibernateException he) {
            he.printStackTrace();
            t.rollback();
        }
        return listaUsuarios;
    }
}
