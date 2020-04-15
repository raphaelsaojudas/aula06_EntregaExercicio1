import javax.swing.JOptionPane;
public class TesteAtribuicao {

   public static void main(String[] args) {

      String nomeProfessor = JOptionPane.showInputDialog("Digite o nome?");
      int idadeProfessor = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade?"));
      Professor professor = new Professor(nomeProfessor, idadeProfessor);
      
      String nomeDisciplina = JOptionPane.showInputDialog("Digite a materia?");
      boolean praticaDisciplina = Boolean.parseBoolean(JOptionPane.showInputDialog("Materia avera pratica?"));
      Disciplina disciplina = new Disciplina(nomeDisciplina, praticaDisciplina);
      
      Atribuicao atribuicao = new Atribuicao(professor, disciplina); 
      
      JOptionPane.showMessageDialog(null, atribuicao.dadosAtribuicao()); 
   }
}