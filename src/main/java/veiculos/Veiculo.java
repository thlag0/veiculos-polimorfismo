package veiculos;

public abstract class Veiculo {
    protected String nome;
    protected long velocidadeAtual;

    public Veiculo(String nome) {
        this.nome = nome;
    }

    public Veiculo(long velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public long getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(long velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
