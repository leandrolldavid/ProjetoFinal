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
            List<Cargo> cargo = new ArrayList<Cargo>();
            Session session = HibernateUtil.getSessionFactory().openSession();
            try {
                cargo = session.createQuery("from Cargo").list();

            } catch (RuntimeException e) {
                e.printStackTrace();
            } finally {
                session.flush();
                session.close();
            }return cargo;
          }
        //                   
        //ate aqui ok leandro||


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

           public Cargo atualizar(int id, Cargo novo)throws Exception{
              try{
                  Session sessao = HibernateUtil.getSessionFactory().openSession();
                  Cargo antiga = (Cargo) sessao.get(Cargo.class, id);

                  antiga.setPerfil(novo.getPerfil());

                  sessao.save(antiga);
                  sessao.flush();

              return antiga ;
               } catch (Exception e) {
                   throw new Exception(e.getMessage());
               }
            }

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


