
package aplicacao;

import entidade.Cargo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CargoController {
    
//    @CrossOrigin
//    @RequestMapping(method=RequestMethod.GET, value="/cargo")
//    public List<Cargo> listarPiadas(@RequestParam(value = "palavra", defaultValue="") String filtro){
//        CargoDAO dao = new CargoDAO();
//        return dao.consultar(filtro);
//    }
    
    @RequestMapping("/cargo")
     public List<Cargo> listarCargo(){
        List resultado = new ArrayList<Cargo>();
        
        Cargo c1 = new Cargo();
        c1.setPerfil("Teste 1");
        
        resultado.add(c1);
        
        Cargo c2 = new Cargo();
        c1.setPerfil("Teste 2");
        
        resultado.add(c2);
        
        return resultado;
        
    }
    
}
