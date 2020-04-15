public class Disciplina {

   private String nome;
   private boolean pratica;

   public Disciplina (String nome, boolean pratica) {
      setNome(nome);
      setPratica(pratica);
   }
    public String getNome() {
      return nome;
   }
   public boolean getPratica() {
      return pratica;
   }
   public void  setNome(String nome) {
      this.nome = nome;
   }
    public void  setPratica(boolean pratica) {
      this.pratica = pratica;
   }
   public String dadosDisciplina() {
      return "Diciplina\nMateria: " + nome + "\nPratica: " + pratica;
   }
}