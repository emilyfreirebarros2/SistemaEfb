/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.UsuarioEfb;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ""
 */
public class UsuarioDao_efb extends Dao_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioEfb.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public UsuarioEfb Logar(String usuario, String senha) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioEfb.class);
        criteria.add(Restrictions.eq("apelidoEfb", usuario));
        criteria.add(Restrictions.eq("senhaEfb", senha));//sql
        List lista = criteria.list();
        session.getTransaction().commit();
        if (!lista.isEmpty()) {
            return (UsuarioEfb) lista.get(0); // Retorna a lista
        } else {
            return null; // retorna vazio pois não achou nada
        }
    }
    
    public List listPorNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioEfb.class);
        criteria.add(Restrictions.like("nomeEfb", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorAtivo(String ativo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioEfb.class);
        criteria.add(Restrictions.eq("ativoEfb", ativo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorNivel(String nivel) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioEfb.class);
        criteria.add(Restrictions.eq("nivelEfb", nivel));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
        public List listPorNomeEAtivo(String nome, String ativo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioEfb.class);
        criteria.add(Restrictions.like("nomeEfb", "%" + nome + "%"));
        criteria.add(Restrictions.eq("ativoEfb", ativo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorNomeENivel(String nome, String nivel) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioEfb.class);
        criteria.add(Restrictions.like("nomeEfb", "%" + nome + "%"));
        criteria.add(Restrictions.eq("nivelEfb", nivel));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorAtivoENivel(String ativo, String nivel) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioEfb.class);
        criteria.add(Restrictions.eq("ativoEfb", ativo));
        criteria.add(Restrictions.eq("nivelEfb", nivel));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorNomeAtivoENivel(String nome, String ativo, String nivel) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioEfb.class);
        criteria.add(Restrictions.like("nomeEfb", "%" + nome + "%"));
        criteria.add(Restrictions.eq("ativoEfb", ativo));
        criteria.add(Restrictions.eq("nivelEfb", nivel));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }   
}
