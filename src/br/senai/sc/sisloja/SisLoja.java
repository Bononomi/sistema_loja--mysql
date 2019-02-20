
package br.senai.sc.sisloja;

import br.senai.sc.sisloja.dao.ClienteDao;
import br.senai.sc.sisloja.modelo.Cliente;
import java.sql.SQLException;
import java.util.List;


public class SisLoja {


    public static void main(String[] args) throws SQLException {
       ClienteDao c = new ClienteDao();
       List<Cliente> clientes = c.listarClientes();
       
       for (int i=0; i<clientes.size(); i++){
           Cliente cli = clientes.get(i);
           System.out.println(cli.getNomecli());
           
       }
       
       
    }
    
}
