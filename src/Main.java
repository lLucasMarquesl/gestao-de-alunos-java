// Importa a classe ArrayList, utilizada para criar uma lista
// onde serão armazenados os objetos do tipo Aluno.
import java.util.ArrayList;

// Importa a classe Scanner, utilizada para receber
// informações digitadas pelo usuário.
import java.util.Scanner;


public class Main {

    // Método principal do programa.
    // É a partir do método main() que a aplicação começa a ser executada.
    public static void main(String[] args) {

        // Cria um objeto Scanner para permitir a entrada
        // de dados através do teclado.
        Scanner scanner = new Scanner(System.in);

        // Cria uma lista dinâmica para armazenar os alunos cadastrados.
        // O ArrayList permite adicionar e remover alunos durante a execução.
        ArrayList<Aluno> alunos = new ArrayList<>();

        // Variável responsável por armazenar a opção escolhida
        // pelo usuário no menu.
        int opcao;

        // O bloco do-while executa o menu pelo menos uma vez
        // e continua executando enquanto a opção escolhida for diferente de 0.
        do {

            // Exibe o menu principal do sistema.
            System.out.println("\n======= SISTEMA DE GESTÃO DE ALUNOS =======");
            System.out.println("1 - Cadastrar alunos");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Consultar alunos");
            System.out.println("4 - Editar aluno");
            System.out.println("5 - Excluir aluno");
            System.out.println("0 - Sair");
            System.out.println("============================================= ");

            // Solicita ao usuário que escolha uma opção
            // e armazena o número digitado na variável opcao.
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();


            // O switch verifica qual opção foi escolhida
            // e executa o bloco de código correspondente.
            switch (opcao) {

                //=====================================================
                // OPÇÃO 1 - CADASTRAR ALUNO
                // =====================================================
                case 1:

                    scanner.nextLine();

                    System.out.println("Nome do aluno: ");
                    String nome = scanner.nextLine();

                    System.out.println("Idade do aluno: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Matricula do aluno: ");
                    String matricula = scanner.nextLine();

                    System.out.println("Mostrar Nota 1: ");
                    String nota1Texto = scanner.next();

                    // Converte o texto para double.
                    // O replace() permite que o usuário utilize vírgula
                    // como separador decimal, por exemplo: 8,5.
                    Double nota1 = Double.parseDouble(nota1Texto.replace(",", "."));

                    System.out.println("Mostrar Nota 2: ");
                    String nota2Texto = scanner.next();
                    Double nota2 = Double.parseDouble(nota2Texto.replace(",", "."));

                    System.out.println("Mostrar Nota 3: ");
                    String nota3Texto = scanner.next();
                    Double nota3 = Double.parseDouble(nota3Texto.replace(",", "."));

                    // Cria um novo objeto Aluno utilizando os dados
                    // informados pelo usuário.
                    Aluno aluno = new Aluno(nome, idade, matricula, nota1, nota2, nota3);
                    alunos.add(aluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    scanner.nextLine();

                    // Encerra o case 1 e retorna ao menu
                    break;

                // =====================================================
                // OPÇÃO 2 - LISTAR ALUNOS
                // =====================================================
                case 2:

                    // Percorre todos os alunos armazenados na lista.
                    for (Aluno aluno1 : alunos) {

                        // Chama o método exibirDados() do objeto Aluno
                        // para mostrar suas informações na tela.
                        aluno1.exibirDados();

                    }
                    ;
                    // Encerra o case 2!
                    break;


                // =====================================================
                // OPÇÃO 3 - CONSULTAR ALUNO
                // =====================================================
                case 3:
                    System.out.println("Digite a Matricula Do Aluno: ");
                    String matriculaDoAluno = scanner.next();

                    // Variável utilizada para verificar se algum aluno
                    // com a matrícula informada foi encontrado.
                    boolean encontrado = false;

                    // Percorre todos os alunos cadastrados.
                    for (Aluno aluno2 : alunos) {

                        // Compara a matrícula digitada com a matrícula
                        // de cada aluno da lista.
                        if (aluno2.getMatricula().equals(matriculaDoAluno)) {

                            // Se as matrículas forem iguais,
                            // exibe os dados do aluno.
                            aluno2.exibirDados();

                            // Indica que o aluno foi encontrado.
                            encontrado = true;
                        }


                    }   // Verifica se nenhum aluno foi encontrado
                    if (!encontrado) {
                        System.out.println("Aluno Não encontrado!");
                    }
                    // Encerra o case 3.
                    break;

                // =====================================================
                // OPÇÃO 4 - EDITAR ALUNO
                // =====================================================
                case 4:
                    System.out.println("Digite A Matricula Do Aluno: ");
                    String matriculaDoAluno2 = scanner.next();

                    // Variável utilizada para verificar se o aluno
                    // foi encontrado.
                    boolean encontrado2 = false;

                    // Percorre todos os alunos cadastrados.
                    for (Aluno aluno2 : alunos) {

                        // Verifica se a matrícula do aluno atual
                        // é igual à matrícula informada pelo usuário
                        if (aluno2.getMatricula().equals(matriculaDoAluno2)) {

                            // Indica que o aluno foi encontrado.
                            encontrado2 = true;

                            scanner.nextLine();

                            System.out.println("Digite O Novo Nome: ");
                            String novoNome = scanner.nextLine();

                            System.out.println("Digite A Nova Idade: ");
                            int novaIdade = scanner.nextInt();

                            // Atualiza o nome do aluno utilizando o setter.
                            aluno2.setNome(novoNome);

                            //Atualiza a idade do aluno utilizando o setter.
                            aluno2.setIdade(novaIdade);

                            System.out.println("Digite a nova Nota 1: ");
                            String novaNota1Texto = scanner.next();
                            double novaNota1 = Double.parseDouble(novaNota1Texto.replace(",", "."));
                            aluno2.setNota1(novaNota1);

                            System.out.println("Digite a nova Nota 2: ");
                            String novaNota2Texto = scanner.next();
                            double novaNota2 = Double.parseDouble(novaNota2Texto.replace(",", "."));
                            aluno2.setNota2(novaNota2);

                            System.out.println("Digite a nova Nota 3: ");
                            String novaNota3Texto = scanner.next();
                            double novaNota3 = Double.parseDouble(novaNota3Texto.replace(",", "."));
                            aluno2.setNota3(novaNota3);

                            System.out.println("Mudança Feita Com Sucesso!! ");
                            scanner.nextLine();
                        }
                    }
                    // Verifica se o aluno não foi encontrado.
                    if (!encontrado2) {

                        // Exibe uma mensagem informando
                        // que a matrícula não foi localizada
                        System.out.println("Aluno Nao Encontrado!");
                    }

                    // Encerra o Case 4
                    break;


                // =====================================================
                // OPÇÃO 5 - EXCLUIR ALUNO
                // =====================================================
                case 5:
                    System.out.println("Digite a Matricula Do Aluno Que Deseja Excluir: ");
                    String matriculaRemover = scanner.next();


                    // Cria uma variável para armazenar temporariamente
                    // o aluno que será removido.
                    // Inicialmente ela recebe null porque nenhum aluno
                    // foi encontrado ainda.
                    Aluno alunoRemover = null;


                    // Percorre todos os alunos cadastrados.
                    for (Aluno aluno1 : alunos) {

                        // Compara a matrícula informada com a matrícula
                        // de cada aluno.
                        if (aluno1.getMatricula().equals(matriculaRemover)) {

                            // Guarda na variável o aluno encontrado.
                            alunoRemover = aluno1;
                        }
                    }

                    // Verifica se algum aluno foi encontrado.
                    if (alunoRemover != null) {

                        // Remove o aluno encontrado da lista.
                        alunos.remove(alunoRemover);
                        System.out.println("Aluno removido com sucesso!");

                    } else {

                        // Caso nenhum aluno tenha sido encontrado,
                        // informa o usuário.
                        System.out.println("Aluno Não encontrado!");

                    }
                    // Encerra o Case 5
                    break;


                // =====================================================
                // OPÇÃO 0 - SAIR
                // =====================================================
                case 0:

                    // Informa que o sistema será encerrado.
                    System.out.println("Encerramento De Sistema");

                    //Encerra o case 0.
                    break;

                // =====================================================
                // OPÇÃO INVÁLIDA
                // =====================================================
                default:

                    // Executado quando o usuário digita uma opção
                    // que não existe no menu.
                    System.out.println("Opção Invalida! ");
                    break;
            }


            // O menu continua sendo executado enquanto a opção
            // escolhida for diferente de 0.
        } while (opcao != 0);

        // Fecha o Scanner e libera o recurso utilizado
        // para entrada de dados.
        scanner.close();




        }
}
