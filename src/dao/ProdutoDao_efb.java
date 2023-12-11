/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ProdutoEfb;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ""
 */
public class ProdutoDao_efb extends Dao_Abstract {

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
        Criteria criteria = session.createCriteria(ProdutoEfb.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorPrecoMaiorQue(double preco) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoEfb.class);
        criteria.add(Restrictions.gt("valorUnitarioEfb", preco));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorPrecoMenorQue(double preco) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoEfb.class);
        criteria.add(Restrictions.lt("valorUnitarioEfb", preco));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorQuantidadeMaiorQue(int quantidade) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoEfb.class);
        criteria.add(Restrictions.gt("quantidadeEstoqueEfb", quantidade));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorQuantidadeMenorQue(int quantidade) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoEfb.class);
        criteria.add(Restrictions.lt("quantidadeEstoqueEfb", quantidade));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorPrecoEQuantidade(double preco, int quantidade) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoEfb.class);
        criteria.add(Restrictions.gt("valorUnitarioEfb", preco));
        criteria.add(Restrictions.gt("quantidadeEstoqueEfb", quantidade));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorPrecoMaiorQueEMenorQue(double precoMaior, double precoMenor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoEfb.class);
        criteria.add(Restrictions.gt("valorUnitarioEfb", precoMaior));
        criteria.add(Restrictions.lt("valorUnitarioEfb", precoMenor));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorQuantidadeMaiorQueEPrecoMenorQue(int quantidade, double precoMenor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoEfb.class);
        criteria.add(Restrictions.gt("quantidadeEstoqueEfb", quantidade));
        criteria.add(Restrictions.lt("valorUnitarioEfb", precoMenor));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listPorPrecoMaiorQueEQuantidadeMaiorQueEPrecoMenorQue(double precoMaior, int quantidade, double precoMenor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoEfb.class);
        criteria.add(Restrictions.gt("valorUnitarioEfb", precoMaior));
        criteria.add(Restrictions.gt("quantidadeEstoqueEfb", quantidade));
        criteria.add(Restrictions.lt("valorUnitarioEfb", precoMenor));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

}
