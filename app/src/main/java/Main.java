
import controller.ProjetoController;
import controller.TarefaController;
import java.sql.Connection;
import model.Projeto;
import model.Tarefa;
import util.ConnectionDataBase;



public class Main {
    public static void main(String[] args) {
        /*Connection connection = ConnectionDataBase.getConnection();
        ConnectionDataBase.closeConnection(connection);*/
        
        
        Projeto projeto = new Projeto();
        ProjetoController projetoController = new ProjetoController();
        Tarefa tarefa = new Tarefa();
        TarefaController tarefaController = new TarefaController();

        /* --- TESTE DE CRIAÇÃO DE UM PROJETO
        projeto.setNome("NOVO PROJETO");
        projeto.setDescricao("DESCRIPTION");
        projetoController.save(projeto);*/

       /* --- TESTE DE UPDATE PROJETO
        projeto.setProjetoID(7);
        projeto.setNome("NOVO NOME DO PROJETO");
        projeto.setDescricao("DESCRICPTION NOVA");
        projetoController.update(projeto); */

        //* --- TESTE DE REMOVER PROJETO
        projetoController.removeById(7); //*/


        /* --- TESTE DE CRIAÇÃO DE TAREFA
        tarefa.setNome("NOVA TAREFA");
        tarefa.setObservacoes("TAREFA NOVA");
        tarefa.setDescricao("DESCRIÇÃO NOVA");
        tarefa.setProjetoID(5);
        tarefaController.save(tarefa); */

        /* --- TESTE DE UPDATE TAREFA
        tarefa.setTarefaID(4);
        tarefa.setNome("NOVO NOME");
        tarefa.setDescricao("NOVA DESCR");
        tarefa.setObservacoes("NOVA OBS");
        tarefaController.update(tarefa); */

        /* --- TESTE DE DELETAR TAREFA
        tarefaController.removeById(4);*/
    }
}
