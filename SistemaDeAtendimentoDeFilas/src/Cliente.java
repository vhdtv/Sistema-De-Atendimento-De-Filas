class Cliente {
    private String nome;
    private int tempoDeAtendimento;

    public Cliente(String nome, int tempoDeAtendimento) {
        this.nome = nome;
        this.tempoDeAtendimento = tempoDeAtendimento;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoDeAtendimento() {
        return tempoDeAtendimento;
    }
}