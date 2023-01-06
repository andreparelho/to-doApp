# todoApp
Este é um aplicativo de tarefas simples feito em Java, Java Swing, MySQL e Gradle. Ele permite que você crie uma lista de tarefas a serem realizadas e as marque como concluídas quando estiverem prontas. Ele também fornece uma interface gráfica de usuário (GUI) para facilitar o uso.
![app](https://i.imgur.com/W2L0rA2.png)

## Objetivos
- Desenvolvimento de aplicações Java básico, incluindo a criação de classes e métodos, a manipulação de tipos de dados primitivos e objetos e o uso de estruturas de controle de fluxo.
- Conexão e interação com um banco de dados MySQL, incluindo a execução de consultas SQL e a manipulação de dados utilizando a API JDBC
- Criação de interfaces de usuário simples utilizando JavaSwing
- Implementação de funcionalidades de CRUD (criação, leitura, atualização e exclusão) em uma aplicação Java
- Gerenciamento de projetos de software utilizando técnicas de gerenciamento de versão, como o Git.

## Recursos
- Criar projeto
- Atualizar projeto
- Excluir projeto
- Adicionar novas tarefas
- Marcar tarefas como concluídas
- Editar tarefas existentes
- Atualizar tarefas
- Excluir tarefas

## Requisitos
- Java 8 ou superior
- MySQL 5.7 ou superior
- Gradle 6.0 ou superior

## Configuração
1. Clone o repositório e importe o projeto para o seu ambiente de desenvolvimento de sua escolha
2. Na pasta raiz do projeto, execute o comando `gradle build` para compilar o projeto. Isso criará um arquivo JAR executável chamado todoapp.jar na pasta build/libs.
3. Crie um banco de dados MySQL chamado `db_todoApp`
4. Execute o script `db_todoapp.sql` para criar as tabela `tasks/tarefa` e projetos/projects no banco de dados `todoapp`
5. Modifique as configurações de conexão com o banco de dados no arquivo `ConnectionDatabase.java` no `package util` de acordo com as configurações do seu banco de dados MySQL
6. Execute o aplicativo usando o comando java -jar build/libs/MainScreen.jar. Isso abrirá a GUI do TodoApp.

## Como usar
- Para adicionar uma nova tarefa, basta digitar o nome da tarefa na caixa de texto e clicar no Icon. A tarefa será adicionada à lista de tarefas pendentes.
- Para marcar uma tarefa como concluída, basta clicar na caixa de seleção da tarefa e ela será marcada como concluída.
- Você também pode editar ou excluir uma tarefa existente clicando nos iconns "Editar" ou "Excluir" à direita da tarefa.

## Arquitetura
A arquitetura do TodoApp segue o padrão de projeto MVC (Model-View-Controller). Isso significa que o aplicativo é dividido em três camadas principais:

**Model:** representa os dados e a lógica de negócios do aplicativo. Nesta camada, encontram-se as entidades do sistema, os DAOs (Data Access Objects) que fazem a persistência dos dados no banco de dados MySQL e os serviços que implementam as regras de negócio.
**View:** representa a interface gráfica de usuário (GUI) do aplicativo. Nesta camada, encontram-se os componentes Swing que formam a interface do usuário, como botões, caixas de texto e tabelas.
**Controller:** faz a ligação entre a model e a view. Ele recebe os eventos gerados pela interface do usuário, como cliques em botões, e os encaminha para a model para processamento. Em seguida, ele atualiza a view com os novos dados.

### A seguir, um diagrama mostrando a arquitetura do TodoApp:
```
+------------+       +---------------+       +------------+
|  Database  |<----->|  DAO Classes  |<----->| Entity  |
+------------+       +---------------+       +------------+
                              |
                              |
+------------+                |                +------------+
|  GUI       |                |                | Controller |
+------------+                |                +------------+
  |  Events  |                |                  |  Business
  |----------|                |                  |  Logic
+------------+                |                +------------+
|  View      |                |                |  Services  |
+------------+                |                +------------+

```

## Implementações Futuras
- Adição de um sistema de login para que os usuários possam gerenciar suas tarefas de forma privada
- Integração com outras ferramentas de produtividade, como o Google Calendar ou o Trello
- Adição de categorias de tarefas para ajudar os usuários a organizarem suas tarefas de forma mais eficiente
- Notificações por e-mail ou push quando uma tarefa se aproxima da data de vencimento
- Gráficos e relatórios para ajudar os usuários a monitorarem o progresso em suas tarefas
- Integração com a funcionalidade de voz para que os usuários possam adicionar tarefas usando apenas sua voz.
