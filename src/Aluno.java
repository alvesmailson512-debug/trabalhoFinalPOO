public class Aluno extends Usuario {
    
    // Construtor do Aluno que repassa os dados para a classe pai (Usuario)
    public Aluno(String nome, String email, String senha, String matricula) {
        super(nome, email, senha, matricula);
    }

    // Implementação obrigatória do método abstrato da classe pai
    @Override
    public void exibirMenu() {
        System.out.println("=== MENU DO ALUNO ===");
        System.out.println("1 - Visualizar projetos disponíveis");
        System.out.println("2 - Inscrever-se em projeto");
        System.out.println("3 - Cancelar inscrição");
        System.out.println("4 - Ver histórico de projetos");
        System.out.println("5 - Notificações");
        System.out.println("6 - Sair");
        System.out.print("Escolha uma opção: ");
    }
}