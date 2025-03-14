import javax.swing.JOptionPane;

public class Entrada_Jopiotn {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String idade = JOptionPane.showInputDialog("Digite sua idade: ");
        int idadeStr = Integer.parseInt(idade);
        
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        JOptionPane.showMessageDialog(null, nome + ", " + idadeStr +" anos de idade, "+ altura +"m de altura, OK!");
    }
}
