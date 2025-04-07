package Principal;
import javax.swing.JOptionPane;
import entities.Aluno;
public class ExMedia {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setName(JOptionPane.showInputDialog("Qual o nome do aluno?"));
        aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Qual a primeira nota?")));
        aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Qual a segunda nota?")));
        aluno.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Qual a terceira nota?")));
        
        JOptionPane.showMessageDialog(null,"O nome do aluno é " + aluno.getName() + " e a média final do aluno é " + aluno.getMedia());
    }
}
