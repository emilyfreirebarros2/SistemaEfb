/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ClienteEfb;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ""
 */
public class ClienteDao_efb extends Dao_Abstract {

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
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteEfb.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteEfb.class);
        criteria.add(Restrictions.like("nomeEfb", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorSexo(String sexo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteEfb.class);
        criteria.add(Restrictions.eq("sexoEfb", sexo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorEstado(String estado) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteEfb.class);
        criteria.add(Restrictions.eq("estadoEfb", estado));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorSexoEEstado(String sexo, String estado) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteEfb.class);
        criteria.add(Restrictions.eq("sexoEfb", sexo));
        criteria.add(Restrictions.eq("estadoEfb", estado));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorNomeESexo(String nome, String sexo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteEfb.class);
        criteria.add(Restrictions.like("nomeEfb", "%" + nome + "%"));
        criteria.add(Restrictions.eq("sexoEfb", sexo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorNomeEEstado(String nome, String estado) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteEfb.class);
        criteria.add(Restrictions.like("nomeEfb", "%" + nome + "%"));
        criteria.add(Restrictions.eq("estadoEfb", estado));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorNomeEEstadoESexo(String nome, String estado, String sexo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteEfb.class);
        criteria.add(Restrictions.like("nomeEfb", "%" + nome + "%"));
        criteria.add(Restrictions.eq("estadoEfb", estado));
        criteria.add(Restrictions.eq("sexoEfb", sexo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

}
