# 📝 Gerenciador de Tarefas e Hábitos (CLI)

Aplicação em Java via linha de comando (CLI) desenvolvida para gerenciamento de tarefas diárias. O projeto explora conceitos fundamentais de estrutura de dados, manipulação de arrays unidimensionais e controle de fluxo em memória.

---

## 📌 Funcionalidades

- **Cadastrar Tarefa:** Adiciona uma nova descrição ao vetor respeitando o limite máximo.
- **Listar Tarefas:** Exibe todas as tarefas cadastradas indexadas sequencialmente.
- **Concluir Tarefa:** Atualiza o estado visual da tarefa adicionando o marcador `[X]`.
- **Remover Tarefa:** Realiza a exclusão da tarefa selecionada e aplica o algoritmo de reorganização (*shift*) no vetor para manter a integridade dos dados.

---

## 🛠️ Conceitos Aplicados

- **Estrutura de Dados:** Array fixo (`String[]`) de tamanho pré-definido.
- **Gerenciamento de Memória:** Reorganização manual de índices via laço `for` (*shift* para a esquerda) e limpeza de resíduos com `null`.
- **Entrada e Saída:** Limpeza de buffer do `Scanner` e tratamento de entradas inválidas.
- **Laço de Repetição:** Controle de ciclo do sistema via `do-while`.

---

## 🚀 Como Executar

### Pré-requisitos
- **Java JDK** 11 ou superior instalado.
- Terminal / Prompt de Comando ou IDE de sua preferência (VS Code, IntelliJ, Eclipse, NetBeans).

### Passo a Passo

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/IsaSilvB007/GerenciadorDeTarefas.git

2. **Navegue até o diretório do projeto:**
  ```bash
   cd GerenciadorDeTarefas
  ```

3. **Compile o código:**
```bash
   javac Main.java
```

4. **Execute a aplicação:**
```bash
   java Main
```

---

## 👩‍💻 Autora

Desenvolvido por **Isadora Bispo**.
Desenvolvido por Isadora Bispo.
