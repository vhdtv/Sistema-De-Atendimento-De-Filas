import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class SistemaAtendimentoFilas {
    public static void main(String[] args) {
        Queue<Cliente> filaAtendimento = new PriorityQueue<>(
                (c1, c2) -> Integer.compare(c1.getTempoDeAtendimento(), c2.getTempoDeAtendimento()));

        // Adicionando clientes à fila
        filaAtendimento.add(new Cliente("Cliente A", 5));
        filaAtendimento.add(new Cliente("Cliente B", 3));
        filaAtendimento.add(new Cliente("Cliente C", 7));
        filaAtendimento.add(new Cliente("Cliente D", 4));
        filaAtendimento.add(new Cliente("Cliente E", 2));

        // Criando funcionários
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Funcionário 1"));
        funcionarios.add(new Funcionario("Funcionário 2"));
        funcionarios.add(new Funcionario("Funcionário 3"));
        funcionarios.add(new Funcionario("Funcionário 4"));
        funcionarios.add(new Funcionario("Funcionário 5"));

        int indiceFuncionario = 0;

        // Atendendo os clientes
        while (!filaAtendimento.isEmpty()) {
            Cliente cliente = filaAtendimento.poll();
            Funcionario funcionarioAtual = funcionarios.get(indiceFuncionario);
            System.out.println("Atendendo " + cliente.getNome() + " (Tempo de atendimento: "
                    + cliente.getTempoDeAtendimento() + " minutos) por " + funcionarioAtual.getNome());
            indiceFuncionario = (indiceFuncionario + 1) % funcionarios.size();
        }
    }
}