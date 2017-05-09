package persistencia;
/**
 *
 * @author leandroDavid
 */
import entidade.Cargo;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class CargoDAO {
     
    
      public List<Cargo> listCargo(){
          List<Cargo> Cargo = new ArrayList<Cargo>();
          Session session = HibernateUtil.getSessionFactory().openSession();
          try {
              Cargo = session.createQuery("from Cargo").list();
              
          } catch (RuntimeException e) {
              e.printStackTrace();
          } finally {
              session.flush();
              session.close();
          }return Cargo;
        }
      
       public Cargo buscarPeloID(int id){
        return (Cargo) HibernateUtil.getSessionFactory().openSession().get(Cargo.class, id);
    }

    public Cargo salvar(Cargo c){
        Transaction tx = null;
        try{
            Session sessao = HibernateUtil.getSessionFactory().openSession();

            tx = sessao.beginTransaction();

            sessao.save(c);
            sessao.flush();
            tx.commit();

            sessao.close();
        } catch (Exception e) {
            e.printStackTrace();
            if(tx != null) {
                tx.rollback();
            }
        }

        return c;
    }
   
         public String atualizar(Cargo novo)throws Exception{
            try{
                Session sessao = HibernateUtil.getSessionFactory().openSession();
                Cargo antiga = (Cargo) sessao.get(Cargo.class, novo.getIdCargo());

                antiga.setPerfil(novo.getPerfil());

                sessao.save(antiga);
                sessao.flush();

            return "true";
             } catch (Exception e) {
                 throw new Exception(e.getMessage());
             }
          }
         
      //Aqui para baixo nao foi implementeado   
     public List<Cargo> buscar(){

        Session sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria criteria = sessao.createCriteria(Cargo.class);
       // criteria.add(Restrictions.like("texto", "%" + palavra + "%"));

        return criteria.list();
    }
      

    public Cargo consultar(Integer id){
        return (Cargo) HibernateUtil.getSessionFactory().openSession().get(Cargo.class, id);
    }
    public void deletar(Integer id){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        sessao.delete(sessao.get(Cargo.class, id));
    }
}

    
