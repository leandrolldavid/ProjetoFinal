package entidade;
/** 
 * @author Leandro David
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name = "entrega")
public class Entrega {
     
   @Id
   //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IdEntrega;
    private Integer NumMax;
    //@OneToMany
    //private Funcionario Funcionario;

    public Integer getIdEntrega() {
        return IdEntrega;
    }
    public void setIdEntrega(Integer IdEntrega) {
        this.IdEntrega = IdEntrega;
    }

    public int getNumMax() {
        return NumMax;
    }
    public void setNumMax(int NumMax) {
        this.NumMax = NumMax;
    }

   /* public Funcionario getFuncionario() {
        return Funcionario;
    }
    public void setFuncionario(Funcionario Funcionario) {
        this.Funcionario = Funcionario;
    }
    */
    
    
}