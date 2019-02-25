
package br.senai.sc.sisloja;

import br.senai.sc.sisloj.views.CadastroCliente;
import br.senai.sc.sisloja.dao.ClienteDao;
import br.senai.sc.sisloja.modelo.Cliente;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;


public class SisLoja {


    public static void main(String[] args) throws SQLException {
      
          JFrame frame = new JFrame("Cadastro de Cliente");
          CadastroCliente cadCli = new CadastroCliente();
          
          frame.setSize(420,340);
          frame.add(cadCli);
          frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
          frame.setVisible(true);
          
                              
       }
       
       
    }
    

