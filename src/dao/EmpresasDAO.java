/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Empresas;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u1845853
 */
public class EmpresasDAO extends AbstractDAO {

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
        Criteria criteria = session.createCriteria(Empresas.class);
        criteria.add(Restrictions.eq("gme_id_empresas", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Empresas.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listNomeEmpre(String empresas) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Empresas.class);
        criteria.add(Restrictions.like("gmeNomeEmpresa", "%" + empresas + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listNomeRep(String representante) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Empresas.class);
        criteria.add(Restrictions.like("gmeNomeRepresentante", "%" + representante + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listNomeEmpreNomeRep(String empresas, String representante) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Empresas.class);
        criteria.add(Restrictions.like("gmeNomeEmpresa", "%" + empresas + "%"));
        criteria.add(Restrictions.like("gmeNomeRepresentante", "%" + representante + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public static void main(String[] args) {
        EmpresasDAO usuariosDAO = new EmpresasDAO();
        usuariosDAO.listAll();
        System.out.println("teste ok");
    }
}
