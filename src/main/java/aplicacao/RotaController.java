package aplicacao;
/*
* @author leandroDavid
*/
import entidade.Funcionario;
import entidade.Cargo;
import entidade.Rota;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RotaController {
    
    //    @CrossOrigin
//    @RequestMapping(method=RequestMethod.GET, value="/cargo")
//    public List<Cargo> listarPiadas(@RequestParam(value = "palavra", defaultValue="") String filtro){
//        CargoDAO dao = new CargoDAO();
//        return dao.consultar(filtro);
//    }
 
 
     public List<Rota> listarRota(){
        List resultado = new ArrayList<Rota>();
        
        Date date = new Date();
        DateFormat formato = new SimpleDateFormat("hh,mm");
        String formattedDate = formato.format(date);

        Rota r1 = new Rota();
        r1.setIdRota(1);
        r1.setEnderecoEntrega("rua destino");
        r1.setLocalizacaoEntregador("rua oreigem");
        r1.setTempo(30);

        resultado.add(r1);
               
        return resultado;
    }
}
  
