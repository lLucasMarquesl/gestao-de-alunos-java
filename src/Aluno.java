// A classe Aluno herda da classe Pessoa.
// Com "extends", Aluno passa a ter acesso aos métodos
// públicos e protegidos definidos em Pessoa.
public class Aluno extends Pessoa {
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;


    // Construtor da classe Aluno.
    // Recebe todas as informações necessárias para criar
    // e inicializar um objeto Aluno.
    public Aluno(String nome, int idade, String matricula, double nota1, double nota2, double nota3) {


        // Chama o construtor da classe Pessoa.
        // Dessa forma, nome e idade são inicializados
        // pela classe que possui esses atributos.
        super(nome,idade);

        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Getter responsável por consultar e retornar
    // a matrícula do aluno.
    public String getMatricula() {

        return matricula;
    }

    // Setter responsável por alterar a primeira nota.
    // Recebe a nova nota como parâmetro.
    public void setNota1(Double nota1) {

        this.nota1 = nota1;
    }

    // Setter responsável por alterar a segunda nota.
    public void setNota2(Double nota2) {

        this.nota2 = nota2;
    }

    // Setter responsável por alterar a terceira nota.
    public void setNota3(Double nota3) {

        this.nota3 = nota3;
    }



    // Método responsável por calcular a média das três notas.
    public double calcularMedia() {

        return (nota1 + nota2 + nota3) / 3;
    }


    // Método responsável por verificar a situação acadêmica do aluno.
    // Retorna uma String informando se o aluno foi aprovado,
    // está em recuperação ou foi reprovado.
    public String verificarSituacao() {
        double media = calcularMedia();

        // Chama o método calcularMedia() e armazena
        // o resultado na variável media.
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }


    // Método responsável por exibir todas as informações
    // do aluno na tela.
    // Esse método também sobrescreve o método exibirDados()
    // que existe na classe Pessoa.
    public void exibirDados() {
        System.out.println("\nNome: " + getNome());
        System.out.println("Idade: " + getIdade() + " Anos");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.printf("Média: %.2f%n", calcularMedia());
        System.out.println("Situação: " + verificarSituacao());
        System.out.println("\n----------------------------");
    }
}
