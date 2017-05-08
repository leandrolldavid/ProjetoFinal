
package aplicacao;

import entidade.Cargo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import persistencia.CargoDAO;

@RestController
public class CargoController {
    
     private CargoDAO CgDAO;
    
//    @CrossOrigin
//    @RequestMapping(method=RequestMethod.GET, value="/cargo")
//    public List<Cargo> listarPiadas(@RequestParam(value = "palavra", defaultValue="") String filtro){
//        CargoDAO dao = new CargoDAO();
//        return dao.consultar(filtro);
//    }
      @RequestMapping(value = "/cargo/lista", method = RequestMethod.GET)
    public List<Cargo> listCargo() throws Exception {
        return CgDAO.listCargo();//verificar se esta certo
    }
    
    @RequestMapping("/cargo")
     public List<Cargo> listarCargo(){
        List resultado = new ArrayList<Cargo>();
        
        Cargo c1 = new Cargo();
        c1.setPerfil("Teste 1");
        c1.setIdCargo(1);
        
        resultado.add(c1);
        
        Cargo c2 = new Cargo();
        c2.setPerfil("Teste 2");
        c2.setIdCargo(2);
        resultado.add(c2);
        
        return resultado;
        
    }
}
