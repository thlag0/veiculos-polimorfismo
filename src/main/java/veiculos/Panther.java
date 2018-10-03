package veiculos;

public class Panther extends Veiculo implements VeiculoAnfibio, TracaoIntegral, Conversivel {
    private boolean tracaoIntegral;
    private boolean capotaAberta;
    private boolean rodasRecolhidas;
    private double lastro;
    private int temperaturaRefrigerador;

    public Panther(String n) {
        super(n);
        tracaoIntegral = false;
        capotaAberta = false;
        rodasRecolhidas = false;
        temperaturaRefrigerador = 15;
    }

    @Override
    public boolean abrirCapota() {
        if (velocidadeAtual == 0) {
            if (capotaAberta) {
                System.out.println("capota já estava aberta do panther " + nome);
                return false;
            }
            capotaAberta = true;
            System.out.println("abrindo capota do panther " + nome);
            return true;
        } else System.out.println("Não é possível abrir capota o carro está em movimento " + nome);
        return false;
    }

    @Override
    public boolean fecharCapota() {
        if (velocidadeAtual==0){
        if (capotaAberta) {
            System.out.println("fechando capota do panther " + nome);
            capotaAberta = false;
            return true;
        }
        System.out.println("capota do panther " + nome + " já estava fechada");
        return false;
    } else System.out.println("Não é possível abrir capota o carro está em movimento ");
        return false;
}

    @Override
    public boolean ativarDesativarTracao() {
        if (velocidadeAtual == 0 && rodasRecolhidas == false) {
            tracaoIntegral = !tracaoIntegral;
            System.out.println("Tração integral do panther: " + nome + " está " + tracaoIntegral);
            return tracaoIntegral;
        }else System.out.println("Não é possível ativar ou desativar a tração ");
        return false;
    }

    @Override
    public boolean recolherRodas() {
        if (rodasRecolhidas){
            System.out.println("rodas do panther "+ nome+" já estavam recolhidas");
            return false;
        }
        rodasRecolhidas = true;
        esvaziarLastro();
        System.out.println("recolhendo rodas do panther "+ nome);
        return true;
    }

    @Override
    public boolean abrirRodas() {
        if (rodasRecolhidas){
            System.out.println("abrindo rodas do panther "+ nome);
            rodasRecolhidas = false;
            return true;
        }
        System.out.println("rodas do panther "+ nome+" já estavam abertas");
        return false;
    }

    @Override
    public void esvaziarLastro() {
        System.out.println("Esvaziando lastro do panther "+ nome);
        lastro = 0;
    }

    @Override
    public void frear(int i) {
        System.out.println("Panther "+ nome+" freando com intensidade " + i);
    }

    @Override
    public void acelerar(int i) {
        velocidadeAtual+=i;
        System.out.println("Panther "+ nome+"acelerando com intensidade " + velocidadeAtual);

    }

    public void setTempRefri(int temperaturaRefrigerador) {
        if ((temperaturaRefrigerador > 0) && (temperaturaRefrigerador < 20)){
            this.temperaturaRefrigerador = temperaturaRefrigerador;
        }
    }
}