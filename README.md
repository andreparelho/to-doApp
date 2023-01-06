<h1>todoApp</h1>
    <p>Este é um aplicativo de tarefas simples feito em Java, Java Swing, MySQL e Gradle. Ele permite que você crie uma lista de tarefas a serem realizadas e as marque como concluídas quando estiverem prontas. Ele também fornece uma interface gráfica de usuário (GUI) para facilitar o uso.</p>
   <img src="https://i.imgur.com/W2L0rA2.png" alt="">
    <h3>Objetivos</h3>
    <ul><li>Desenvolvimento de aplicações Java básico, incluindo a criação de classes e métodos, a manipulação de tipos de dados primitivos e objetos e o uso de estruturas de controle de fluxo.</ul></li>
    <ul><li>Conexão e interação com um banco de dados MySQL, incluindo a execução de consultas SQL e a manipulação de dados utilizando a API JDBC</ul></li>
    <ul><li>Criação de interfaces de usuário simples utilizando JavaSwing</ul></li>
    <ul><li>Implementação de funcionalidades de CRUD (criação, leitura, atualização e exclusão) em uma aplicação Java</ul></li>
    <ul><li>Gerenciamento de projetos de software utilizando técnicas de gerenciamento de versão, como o Git.</ul></li>
  <h2>Recursos</h2>
  <ul><li>Criar projeto</ul></li>
  <ul><li>Atualizar projeto</ul></li>
  <ul><li>Excluir projeto</ul></li>
    <ul><li>Adicionar novas tarefas</ul></li>
    <ul><li>Marcar tarefas como concluídas</ul></li>
    <ul><li>Editar tarefas existentes</ul></li>
    <ul><li>Atualizar tarefas</ul></li>
    <ul><li>Excluir tarefas</ul></li>
    <h2>Requisitos</h2>
    <ul><li>Java 8 ou superior</ul></li>
    <ul><li>MySQL 5.7 ou superior</ul></li>
    <ul><li>Gradle 6.0 ou superior</ul></li>
    <h2>Configuração</h2>
    <ol>
        <li>Clone o repositório e importe o projeto para o seu ambiente de desenvolvimento de sua escolha</li>
        <li>Na pasta raiz do projeto, execute o comando <strong>`gradle build`</strong> para compilar o projeto. Isso criará um arquivo JAR executável chamado todoapp.jar na pasta build/libs.<li>
        <li>Crie um banco de dados MySQL chamado <strong>`db_todoApp`</strong></li>
        <li>Execute o script <strong>`db_todoapp.sql`</strong> para criar as tabela <strong>`tasks/tarefa`</strong> e <strong>projetos/projects</strong> no banco de dados <strong>`todoapp`</strong></li>
        <li>Modifique as configurações de conexão com o banco de dados no arquivo <strong>`ConnectionDatabase.java`</strong> no <strong>`package util`</strong> de acordo com as configurações do seu banco de dados MySQL</li>
        <li>Execute o aplicativo usando o comando java -jar build/libs/MainScreen.jar. Isso abrirá a GUI do TodoApp.</li>
    </ol>
    <h2>Como usar</h2>
    <p>Para adicionar uma nova tarefa, basta digitar o nome da tarefa na caixa de texto e clicar no Icon. A tarefa será adicionada à lista de tarefas pendentes.</p>
    <p> </p>
    <p>Para marcar uma tarefa como concluída, basta clicar na caixa de seleção da tarefa e ela será marcada como concluída.</p>
    <p> </p>
    <p>Você também pode editar ou excluir uma tarefa existente clicando nos iconns "Editar" ou "Excluir" à direita da tarefa.</p>
    <h2>Arquitetura/h2<>
    <p>A arquitetura do TodoApp segue o padrão de projeto <strong>MVC (Model-View-Controller)</strong>. Isso significa que o aplicativo é dividido em três camadas principais:</p>
    <ol>
        <li>Model: representa os dados e a lógica de negócios do aplicativo. Nesta camada, encontram-se as entidades do sistema, os DAOs (Data Access Objects) que fazem a persistência dos dados no banco de dados MySQL e os serviços que implementam as regras de negócio.</li>
        <li>View: representa a interface gráfica de usuário (GUI) do aplicativo. Nesta camada, encontram-se os componentes Swing que formam a interface do usuário, como botões, caixas de texto e tabelas.</li>
        <li>Controller: faz a ligação entre a model e a view. Ele recebe os eventos gerados pela interface do usuário, como cliques em botões, e os encaminha para a model para processamento. Em seguida, ele atualiza a view com os novos dados.</li>
    </ol>
    <h3>A seguir, um diagrama mostrando a arquitetura do TodoApp:</h3>
    (```)+------------+       +---------------+       +------------+
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
(```)
    <h2>Implementações Futuras</h2>
<ul>
    <li>Adição de um sistema de login para que os usuários possam gerenciar suas tarefas de forma privada</li>
</ul> 
<ul>
    <li>Integração com outras ferramentas de produtividade, como o Google Calendar ou o Trello</li>
</ul>
<ul>
    <li>Adição de categorias de tarefas para ajudar os usuários a organizarem suas tarefas de forma mais eficiente</li>
</ul>
<ul>
    <li>Notificações por e-mail ou push quando uma tarefa se aproxima da data de vencimento </li>
</ul>
    <ul><li>Gráficos e relatórios para ajudar os usuários a monitorarem o progresso em suas tarefas</li>
</ul>
<ul>
    <li>Integração com a funcionalidade de voz para que os usuários possam adicionar tarefas usando apenas sua voz.</li>
</ul>
