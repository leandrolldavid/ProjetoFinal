package persistencia;
/**
 *
 * @author leandro David
 */
import entidade.Entrega;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import java.util.List;

public class EntregaDAO {
    
      public List<Entrega> listEntrega(){
          List<Entrega> entrega = new ArrayList<Entrega>();
          Session session = HibernateUtil.getSessionFactory().openSession();
          try {
              entrega = session.createQuery("from Entrega").list();
              
          } catch (RuntimeException e) {
              e.printStackTrace();
          } finally {
              session.flush();
              session.close();
          }return entrega;
        }
      //                   
      //////////////////////ate aqui ok leandro||/////////////////////////////////////
                       
      
       public Entrega buscarPeloID(int id){
        return (Entrega) HibernateUtil.getSessionFactory().openSession().get(Entrega.class, id);
    }

    public Entrega salvar(Entrega c){
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
   
         public Entrega atualizar(int id, Entrega novo)throws Exception{
            try{
                Session sessao = HibernateUtil.getSessionFactory().openSession();
                Entrega antiga = (Entrega) sessao.get(Entrega.class, id);

                antiga.setFuncionario(novo.getFuncionario());
                antiga.setNumMax(novo.getNumMax());

                sessao.save(antiga);
                sessao.flush();

            return antiga ;
             } catch (Exception e) {
                 throw new Exception(e.getMessage());
             }
          }
         
     public List<Entrega> buscar(){

        Session sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria criteria = sessao.createCriteria(Entrega.class);
       // criteria.add(Restrictions.like("texto", "%" + palavra + "%"));

        return criteria.list();
    }
      

    public Entrega consultar(Integer id){
        return (Entrega) HibernateUtil.getSessionFactory().openSession().get(Entrega.class, id);
    }
    public void deletar(Integer id){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        sessao.delete(sessao.get(Entrega.class, id));
    }
}

    

