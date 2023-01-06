<h1>todoApp</h1>
    <p>O TodoApp é uma aplicação de gerenciamento de tarefas simples, desenvolvida em Java utilizando o framework Java Swing, banco de dados MySQL e o gerenciador de dependências Gradle.</p>
    <img src="https://imgur.com/a/TqxjIzw" alt="app">
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
        <li>Execute o comando <strong>`gradle build`</strong> para baixar as dependências do projeto</li>
        <li>Crie um banco de dados MySQL chamado <strong>`todoApp`</strong></li>
        <li>Execute o script <strong>`db_todoapp.sql`</strong> para criar a tabela <strong>`tasks/tarefa`</strong> no banco de dados <strong>`todoapp`</strong></li>
        <li>Modifique as configurações de conexão com o banco de dados no arquivo <strong>`ConnectionDatabase.java`</strong> no <strong>`package util`</strong> de acordo com as configurações do seu banco de dados MySQL</li>
    </ol>
     <h2>Execução</h2> 
    <ol>
        <li>Execute o comando <strong>`gradle run`</strong> para iniciar a aplicação</li>
        <li>Acesse a aplicação através do navegador em <a href="[url](http://localhost:8080)">localhost8080</a></li>
    </ol>
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
