package aplicacao;
/**
 * @author leandroDavid
 */
import entidade.Status;
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
public class StatusController {
     //    @CrossOrigin
//    @RequestMapping(method=RequestMethod.GET, value="/cargo")
//    public List<Cargo> listarPiadas(@RequestParam(value = "palavra", defaultValue="") String filtro){
//        CargoDAO dao = new CargoDAO();
//        return dao.consultar(filtro);
//    }
 
      @RequestMapping("/status")
     public List<Status> listarRota(){
        List resultado = new ArrayList<Status>();
        
        Date date = new Date();
        DateFormat formato = new SimpleDateFormat("DD,MM,YYYY - hh,mm");
        String formattedDate = formato.format(date);

        Status status = new Status();
        status.setIdStatus(1);
        status.setStatus("Preparando");
        
        resultado.add(status);
               
        return resultado;
}}
