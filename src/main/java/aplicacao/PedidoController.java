package aplicacao;
/**
 *
 * @author leandro David
 */
import entidade.Pedido;
import entidade.Funcionario;
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
public class PedidoController {
    
     //    @CrossOrigin
//    @RequestMapping(method=RequestMethod.GET, value="/cargo")
//    public List<Cargo> listarPiadas(@RequestParam(value = "palavra", defaultValue="") String filtro){
//        CargoDAO dao = new CargoDAO();
//        return dao.consultar(filtro);
//    }
 
      @RequestMapping("/pedido")
     public List<Pedido> listarRota(){
        List resultado = new ArrayList<Pedido>();
        
        Date date = new Date();
        DateFormat formato = new SimpleDateFormat("DD,MM,YYYY - hh,mm");
        String formattedDate = formato.format(date);

        Status status = new Status();
        status.setStatus("Preparando");
        
        Funcionario func = new Funcionario();
        func.setNome("funcionario teste");
        
        Pedido p1 = new Pedido();
        p1.setIdPedido(1);
        p1.setNumeroPedido(1);
        p1.setDescricao("Calabresa, cocacola 2 litros");
        p1.setEnderecoCliente("Rua destino");
        p1.setNomeCliente("clienteTeste");
        p1.setTelefoneCliente("9999-9999");
        p1.setDateTime("05/05/2017 15:26");
        p1.setStatus(status);
        p1.setFuncionairo(func);

        resultado.add(p1);
               
        return resultado;
    
}}
