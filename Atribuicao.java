public class Atribuicao {

   private Professor professor;
   private Disciplina disciplina;

   public Atribuicao (Professor professor, Disciplina disciplina) {
      setProfessor(professor);
      setDisciplina(disciplina);
   }
    public Professor getProfessor() {
      return professor;
   }
   public Disciplina getDisciplina() {
      return disciplina;
   }

   public void  setProfessor(Professor professor) {
      this.professor = professor;
   }
    public void  setDisciplina(Disciplina disciplina) {
      this.disciplina = disciplina;
   }
   public String dadosAtribuicao() {
      return "Ficha de Atribuicao:\n \n" + professor.dadosProfessor() + "\n \n" + disciplina.dadosDisciplina();
   }
}