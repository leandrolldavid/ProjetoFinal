package entidade;
/**
 *
 * @author leandroDavid
 */
import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//    @Entity
//    @Table(name = "tbRota")
    public class Rota  {
        
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IdRota;
    
    private String EnderecoEntrega;
    private String LocalizacaoEntregador;
    //private Date tempo;
    private int tempo;

    public Integer getIdRota() {
        return IdRota;
    }

    public void setIdRota(Integer IdRota) {
        this.IdRota = IdRota;
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


