package persistencia;
/**
 *
 * @author leandro David
 */
import entidade.Funcionario;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import java.util.List;

public class FuncionarioDAO {
    public List<Funcionario> listFuncionario(){
          List<Funcionario> cargo = new ArrayList<Funcionario>();
          Session session = HibernateUtil.getSessionFactory().openSession();
          try {
              cargo = session.createQuery("from Funcionario").list();
              
          } catch (RuntimeException e) {
              e.printStackTrace();
          } finally {
              session.flush();
              session.close();
          }return cargo;
        }
      //                   
      //ate aqui ok leandro||
                       
      
       public Funcionario buscarPeloID(int id){
        return (Funcionario) HibernateUtil.getSessionFactory().openSession().get(Funcionario.class, id);
    }

    public Funcionario salvar(Funcionario c){
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
   
         public Funcionario atualizar(int id, Funcionario novo)throws Exception{
            try{
                Session sessao = HibernateUtil.getSessionFactory().openSession();
                Funcionario antiga = (Funcionario) sessao.get(Funcionario.class, id);

                antiga.setIdFuncionario(novo.getIdFuncionario());
                antiga.setNome(novo.getNome());
                antiga.setCPF(novo.getCPF());
                antiga.setEndereco(novo.getEndereco());
                antiga.setTelefone(novo.getTelefone());
                antiga.setStatus(novo.getStatus());
                antiga.setLogin(novo.getLogin());
                antiga.setSenha(novo.getSenha());
                antiga.setCargo(novo.getCargo());

                sessao.save(antiga);
                sessao.flush();

            return antiga ;
             } catch (Exception e) {
                 throw new Exception(e.getMessage());
             }
          }
         
     public List<Funcionario> buscar(){

        Session sessao = HibernateUtil.getSessionFactory().openSession();

        Criteria criteria = sessao.createCriteria(Funcionario.class);
       // criteria.add(Restrictions.like("texto", "%" + palavra + "%"));

        return criteria.list();
    }
      

    public Funcionario consultar(Integer id){
        return (Funcionario) HibernateUtil.getSessionFactory().openSession().get(Funcionario.class, id);
    }
    public void deletar(Integer id){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        sessao.delete(sessao.get(Funcionario.class, id));
    }
}

