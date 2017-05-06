package aplicacao;
/**
 *
 * @author leandro David
 */
import entidade.Funcionario;
import entidade.Cargo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {
     
//    @CrossOrigin
//    @RequestMapping(method=RequestMethod.GET, value="/cargo")
//    public List<Cargo> listarPiadas(@RequestParam(value = "palavra", defaultValue="") String filtro){
//        CargoDAO dao = new CargoDAO();
//        return dao.consultar(filtro);
//    }
    
    @RequestMapping("/funcionario")
     public List<Funcionario> listarFuncionario(){
        List resultado = new ArrayList<Funcionario>();
        
        Cargo c1 = new Cargo();
        c1.setIdCargo(1);
        
        Funcionario f1 = new Funcionario();
        f1.setCPF("12121212212");
        f1.setCargo(c1);
        f1.setEndereco("qr 312");
        f1.setIdFuncionario(1);
        f1.setLogin("add");
        f1.setNome("Testador2");
        f1.setSenha("123");
        f1.setStatus("ativo");
        f1.setTelefone("3333-3333");
        resultado.add(f1);
        
        Funcionario f2 = new Funcionario();
        f2.setCPF("99999999-99");
        f2.setCargo(c1);
        f2.setEndereco("qr 517");
        f2.setIdFuncionario(2);
        f2.setLogin("adm");
        f2.setNome("Testador2");
        f2.setSenha("321");
        f2.setStatus("ativo");
        f2.setTelefone("4444-4444");
        resultado.add(f2);
        
        return resultado;
        
    }
}