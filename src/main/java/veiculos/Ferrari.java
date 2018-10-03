package veiculos;


public class Ferrari extends Veiculo implements Conversivel {

    private boolean capotaAberta;
    private boolean farolNeblina;

    public Ferrari(String n) {
        super(n);
        capotaAberta = false;
        farolNeblina = false;
    }

    @Override
    public boolean abrirCapota() {
        if (velocidadeAtual ==0 || velocidadeAtual<=20) {
            if (capotaAberta) {
                System.out.println("capota já estava aberta da ferrari " + nome);
                return false;
            }
            capotaAberta = true;
            System.out.println("abrindo capota da ferrari " + nome);
            return true;
        } else System.out.println("Não é possível abrir a capota a velocidade atual do carro é" +velocidadeAtual);
            return false;
    }

    @Override
    public boolean fecharCapota() {
        if (velocidadeAtual == 0 || velocidadeAtual <= 20) {
            if (capotaAberta) {
                System.out.println("fechando capota da ferrari " + nome);
                capotaAberta = false;
                return true;
            }
            System.out.println("capota da ferrari " + nome + " já estava fechada");
            return false;
        } else System.out.println("Não é possível fechar a capota a velocidade atual do carro é" +velocidadeAtual);
            return false;
    }

    @Override
    public void frear(int i) {
        System.out.println("Ferrari "+ nome+" freando com intensidade " + i);
    }

    @Override
    public void acelerar(int i) {
        velocidadeAtual+=i;
        System.out.println("Ferrari "+ nome + " acelerando com intensidade " + i);
    }

    public boolean ligarFarolNeblina(){
        if (farolNeblina){
            System.out.println("Farol já estava ligado da ferrari " + nome);
            return false;
        }
        System.out.println("Ligando farol de neblina da ferrari " + nome);
        farolNeblina = true;
        return true;
    }
}