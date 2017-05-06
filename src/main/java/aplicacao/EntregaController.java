package aplicacao;
//Obs:-->>
//leambrar do tabela de relacionamento entre entrega e pedido 
/**
 *
 * @author leandroDavid
 */
import entidade.Entrega;
import entidade.Funcionario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntregaController {
     
//    @CrossOrigin
//    @RequestMapping(method=RequestMethod.GET, value="/cargo")
//    public List<Cargo> listarPiadas(@RequestParam(value = "palavra", defaultValue="") String filtro){
//        CargoDAO dao = new CargoDAO();
//        return dao.consultar(filtro);
//    }
    
    @RequestMapping("/entrega")
     public List<Entrega> listarEntrega(){
        List resultado = new ArrayList<Entrega>();
  
   //leambrar do tabela de relacionamento entre entrega e pedido 
   
        Funcionario f1 = new Funcionario();
        f1.setIdFuncionario(1);
        
        Entrega e1 = new Entrega();
        e1.setFuncionario(f1);
        e1.setIdEntrega(1);
        e1.setNumMax(3);
        
        resultado.add(e1);
       
        Funcionario f2 = new Funcionario();
        f2.setIdFuncionario(2);
        
        Entrega e2 = new Entrega();
        e2.setFuncionario(f2);
        e2.setIdEntrega(2);
        e2.setNumMax(3);
        
        resultado.add(e2);
        
        return resultado;
        
    }
}