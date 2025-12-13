/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Venda;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u1845853
 */
public class VendaDAO extends AbstractDAO {

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
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Venda.class);
        criteria.add(Restrictions.eq("gme_id_venda", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Venda.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listEmpresa(String nomeEmpresa) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Venda.class, "v");
        criteria.createAlias("v.Empresas", "ve");
        criteria.add(Restrictions.like("ve.gmeNomeEmpresa", "%" + nomeEmpresa + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listCliente(String nomeCliente) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Venda.class, "v");
        criteria.createAlias("v.Clientes", "c");
        criteria.add(Restrictions.like("c.gmeNomePessoal", "%" + nomeCliente + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listEmpresaCliente(String nomeEmpresa, String nomeCliente) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Venda.class, "v");
        criteria.createAlias("v.Clientes", "c");
        criteria.createAlias("v.Empresas", "ve");
        criteria.add(Restrictions.like("c.gmeNomePessoal", "%" + nomeCliente + "%"));
        criteria.add(Restrictions.like("ve.gmeNomeEmpresa", "%" + nomeEmpresa + "%"));
         List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public static void main(String[] args) {
        VendaDAO usuariosDAO = new VendaDAO();
        usuariosDAO.listAll();
        System.out.println("teste ok");
    }
}
