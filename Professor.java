public class Professor {

   private String nome;
   private int idade;

   public Professor (String nome, int idade) {
      setNome(nome);
      setIdade(idade);
   }
    public String getNome() {
      return nome;
   }
   public int getIdade() {
      return idade;
   }
   public void  setNome(String nome) {
      this.nome = nome;
   }
    public void  setIdade(int idade) {
      this.idade = idade;
   }
   public String dadosProfessor() {
      return "Professor\nNome: "+ nome +"\nIdade: " + idade;
   }
} 