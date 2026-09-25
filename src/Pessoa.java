// Classe responsável por representar uma pessoa.
// Ela contém informações que podem ser utilizadas
// por outras classes, como a classe Aluno.
public class Pessoa {
    private String nome;
    private int idade;


    // Construtor da classe Pessoa.
    // É utilizado para inicializar os atributos nome e idade
    // quando um objeto Pessoa é criado.
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    // Getter responsável por retornar o nome da pessoa.
    // Como o atributo nome é private, outras classes utilizam
    // esse método para conseguir acessar seu valor.
    public String getNome() {

        return nome;
    }

    // Getter responsável por retornar a idade da pessoa.
    public int getIdade() {

        return idade;
    }

    // Setter responsável por alterar o nome da pessoa.
    // Recebe um novo nome como parâmetro.
    public void setNome(String nome) {

        this.nome = nome;
    }

    // Setter responsável por alterar a idade da pessoa.
    // Recebe uma nova idade como parâmetro.
    public void setIdade(int idade) {

        this.idade = idade;
    }


    // Método responsável por exibir na tela
    // os dados básicos da pessoa.
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
