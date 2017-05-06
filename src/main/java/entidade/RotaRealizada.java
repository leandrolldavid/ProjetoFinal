package entidade;
/**
 * @author leandroDavid
 */
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Leandro David
 * @author Thayllan Siqueira
 */
//@Entity 
//@Table(name = "tbRotaRealizada")
public class RotaRealizada {
  //  @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IdRotaReal;
    
    private String EnderecoEntrega;
    private String LocalizacaoEntregador;
   // private Time tempo;     //<<<<<<< classifiquei como time? verificar!!!
    private int tempo;     
    
    public Integer getIdRotaReal() {
        return IdRotaReal;
    }
    public void setIdRotaReal(Integer IdRotaReal) {
        this.IdRotaReal = IdRotaReal;
    }
    
    public String getEnderecoEntrega() {
        return EnderecoEntrega;
    }
    public void setEnderecoEntrega(String EnderecoEntrega) {
        this.EnderecoEntrega = EnderecoEntrega;
    }

    public String getLocalizacaoEntregador() {
        return LocalizacaoEntregador;
    }
    public void setLocalizacaoEntregador(String LocalizacaoEntregador) {
        this.LocalizacaoEntregador = LocalizacaoEntregador;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

  
    
}

