package entidade;
/**
  @author Leandro David
*/   
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//@Entity 
//@Table(name = "tbPedido")
public class Pedido {
 // @Id
 // @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IdPedido;
    
    private Integer NumeroPedido;
    private String Descricao;
    private String EnderecoCliente;
    private String nomeCliente;
    private String TelefoneCliente;
   // private Date DataHora;
    private String DataHora;
    
    private Status Status; 
    private Funcionario Funcionairo;

    public int getIdPedido() {
        return IdPedido;
    }
    public void setIdPedido(Integer IdPedido) {
        this.IdPedido = IdPedido;
    }

    public Integer getNumeroPedido() {
        return NumeroPedido;
    }
    public void setNumeroPedido(Integer NumeroPedido) {
        this.NumeroPedido = NumeroPedido;
    }

    public String getDescricao() {
        return Descricao;
    }
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getEnderecoCliente() {
        return EnderecoCliente;
    }
    public void setEnderecoCliente(String EnderecoCliente) {
        this.EnderecoCliente = EnderecoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefoneCliente() {
        return TelefoneCliente;
    }
    public void setTelefoneCliente(String TelefoneCliente) {
        this.TelefoneCliente = TelefoneCliente;
    }

    public String getDateTime() {
        return DataHora;
    }
    public void setDateTime(String dateTime) {
        this.DataHora = dateTime;
    }

    public Funcionario getFuncionairo() {
        return Funcionairo;
    }
    public void setFuncionairo(Funcionario Funcionairo) {
        this.Funcionairo = Funcionairo;
    }

    public Status getStatus() {
        return Status;
    }

    public void setStatus(Status Status) {
        this.Status = Status;
    }
    
}
