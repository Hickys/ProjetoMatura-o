
package atividade;
import javax.swing.JOptionPane;


public class Atividade {
    static String cadastroNome = "Jorge";
    static String cadastroSenha = "Jorge";
    
    public static void main(String[] args) {
        Integer x = Integer.parseInt(JOptionPane.showInputDialog("Você gostaria de realizar cadastro ou login? (1=cadastro, 2=login)")) ;
        String nome, senha, cargo, telefone, horario;
        
        switch (x) {
            case 1:{
                JOptionPane.showMessageDialog(null,"Realize o Cadastro");
                cadastroNome = JOptionPane.showInputDialog("Digite um nome de usuário: ");
                if(cadastroNome.equals("Jorge")){
                    JOptionPane.showMessageDialog(null,"Usuário já cadastrado, prosseguindo para o login...");
                }
                else{
                cadastroSenha = JOptionPane.showInputDialog("Digite uma senha");
                cargo = JOptionPane.showInputDialog("Digite o seu cargo");
                telefone = JOptionPane.showInputDialog("Digite o seu telefone");
                horario = JOptionPane.showInputDialog("Digite o seu horário de trabalho");
                JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso!");} 
            }       
            case 2: {
                JOptionPane.showMessageDialog(null,"Realize o Login");
                
                nome = JOptionPane.showInputDialog("Digite um nome de usuario: ");
                senha = JOptionPane.showInputDialog("Digite uma senha");
                }
                if( nome.equals(cadastroNome) && senha.equals(cadastroSenha)){
                    JOptionPane.showMessageDialog(null,"Login com sucesso");
                }else if (nome.isEmpty() == true && senha.isEmpty() == true){
                    JOptionPane.showMessageDialog(null,"Campos vazios");
                }
                else{JOptionPane.showMessageDialog(null,"Usuário não cadastrado ou senha e usuário incorretos");
                }
            
        };
        };
    }   

