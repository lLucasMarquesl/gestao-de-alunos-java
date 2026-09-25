# 🎓 Sistema de Gestão de Alunos

Um sistema desenvolvido em **Java** para gerenciamento de alunos, permitindo cadastrar, consultar, editar, listar e excluir alunos, além de calcular automaticamente suas médias e situações acadêmicas.

O projeto foi desenvolvido com foco na prática de **Programação Orientada a Objetos (POO)** e na aplicação de conceitos fundamentais da linguagem Java.

---

## 📌 Sobre o projeto

O **Sistema de Gestão de Alunos** funciona através de um menu interativo no terminal, onde o usuário pode realizar diferentes operações relacionadas aos alunos cadastrados.

Cada aluno possui informações como:

* 👤 Nome
* 🎂 Idade
* 🪪 Matrícula
* 📚 Três notas
* 📊 Média final
* 📝 Situação acadêmica

A situação do aluno é calculada automaticamente de acordo com sua média:

| Média             | Situação       |
| ----------------- | -------------- |
| **7,0 ou mais**   | ✅ Aprovado     |
| **5,0 até 6,9**   | ⚠️ Recuperação |
| **Abaixo de 5,0** | ❌ Reprovado    |

---

## ⚙️ Funcionalidades

### 👤 Cadastro de alunos

Permite cadastrar um novo aluno informando nome, idade, matrícula e três notas.

### 📋 Listagem

Exibe todos os alunos cadastrados e suas respectivas informações.

### 🔎 Consulta

Permite encontrar um aluno através do número da matrícula.

### ✏️ Edição

Possibilita alterar o nome, idade e notas de um aluno já cadastrado.

### 🗑️ Exclusão

Permite remover um aluno da lista utilizando sua matrícula.

### 📊 Cálculo de média

O sistema calcula automaticamente a média das três notas cadastradas.

### 📝 Situação acadêmica

Após calcular a média, o sistema informa automaticamente se o aluno está aprovado, em recuperação ou reprovado.

---

## 🧠 Conceitos utilizados

Durante o desenvolvimento foram utilizados conceitos importantes da Programação Orientada a Objetos:

* **Classes e objetos**
* **Herança**
* **Encapsulamento**
* **Construtores**
* **Getters e Setters**
* **Sobrescrita de métodos**
* **ArrayList**
* **Scanner**
* **Estruturas condicionais**
* **Estrutura `switch`**
* **Laços de repetição**
* **Métodos**
* **Manipulação de dados**

### 🔗 Herança

A classe `Aluno` herda da classe `Pessoa`:

```java
public class Aluno extends Pessoa
```

Dessa forma, informações comuns como `nome` e `idade` ficam na classe `Pessoa`, enquanto a classe `Aluno` possui informações específicas, como matrícula e notas.

### 🔒 Encapsulamento

Os atributos das classes são definidos como `private`, sendo acessados e modificados através de métodos `get` e `set`.

Exemplo:

```java
private String nome;

public String getNome() {
    return nome;
}
```

---

## 🗂️ Estrutura do projeto

```text
gestao-de-alunos-java/
│
├── Main.java
├── Pessoa.java
├── Aluno.java
└── README.md
```

### `Main.java`

Responsável pelo menu e pela interação com o usuário.

### `Pessoa.java`

Classe base que contém informações comuns, como nome e idade.

### `Aluno.java`

Herda de `Pessoa` e adiciona informações específicas do aluno, como matrícula e notas.

---

## 💻 Tecnologias utilizadas

* ☕ **Java**
* 📦 **ArrayList**
* ⌨️ **Scanner**
* 🧩 **Programação Orientada a Objetos**

---

## ▶️ Como executar

### 1. Clone o repositório

```bash
git clone URL_DO_REPOSITORIO
```

### 2. Abra o projeto em uma IDE

Você pode utilizar uma IDE compatível com Java, como:

* IntelliJ IDEA
* Eclipse
* NetBeans
* VS Code

### 3. Execute o arquivo

```text
Main.java
```

O sistema será iniciado diretamente pelo terminal.

---

## 🖥️ Exemplo do menu

```text
======= SISTEMA DE GESTÃO DE ALUNOS =======
1 - Cadastrar alunos
2 - Listar alunos
3 - Consultar alunos
4 - Editar aluno
5 - Excluir aluno
0 - Sair
=============================================
Escolha uma opção:
```

---

## 🎯 Objetivo

O principal objetivo deste projeto foi colocar em prática os conhecimentos de **Java e Programação Orientada a Objetos**, criando um sistema funcional para gerenciamento de informações de alunos.

O projeto também serviu para praticar a organização de classes, utilização de métodos, herança, encapsulamento e manipulação de listas.

---

## 🚀 Possíveis melhorias futuras

Algumas funcionalidades podem ser adicionadas futuramente, como:

* 💾 Salvar os alunos em arquivo ou banco de dados
* 🔐 Sistema de login
* 📈 Relatórios de desempenho
* 🔎 Filtros de alunos por situação
* 📊 Ranking de médias
* 🏫 Cadastro de turmas
* 👨‍🏫 Cadastro de professores
* 🖥️ Interface gráfica
* 🗄️ Integração com banco de dados

---

## 👨‍💻 Autores

Nome e RA dos alunos envolvidos:
Marcos Vinicius Scavareli Binatti 26002011
Lucas Miguel Marques Ferreira 26002065
Mateus Nascimento Silva 26001755
Vinicius Cibuin RA: 26001804

Projeto desenvolvido para estudos e prática de **Java e Programação Orientada a Objetos**.

---

⭐ Se este projeto foi útil ou interessante para você, considere deixar uma estrela no repositório!
