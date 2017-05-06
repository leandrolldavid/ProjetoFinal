package aplicacao;
/*
* @author leandroDavid
*/
import entidade.RotaRealizada;
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
public class RotaRealizadaController {
    
    //    @CrossOrigin
//    @RequestMapping(method=RequestMethod.GET, value="/cargo")
//    public List<Cargo> listarPiadas(@RequestParam(value = "palavra", defaultValue="") String filtro){
//        CargoDAO dao = new CargoDAO();
//        return dao.consultar(filtro);
//    }
 
      @RequestMapping("/rotaRealizada")
     public List<RotaRealizada> listarRota(){
        List resultado = new ArrayList<RotaRealizada>();
        
        Date date = new Date();
        DateFormat formato = new SimpleDateFormat("hh,mm");
        String formattedDate = formato.format(date);

        RotaRealizada rr1 = new RotaRealizada();
        rr1.setIdRotaReal(1);
        rr1.setEnderecoEntrega("rua destino");
        rr1.setLocalizacaoEntregador("rua oreigem");
        rr1.setTempo(25);

        resultado.add(rr1);
               
        return resultado;
    }
}
  
