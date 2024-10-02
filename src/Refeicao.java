public class Refeicao {
    private alimento salada;
    private alimento pratoPrincipal;
    private alimento acompanhamento;

    public Refeicao(alimento salada, alimento pratoPrincipal, alimento acompanhamento) {
        this.salada = salada;
        this.pratoPrincipal = pratoPrincipal;
        this.acompanhamento = acompanhamento;
    }

    // Getters para os componentes da refeição
    public alimento getSalada() {
        return salada;
    }

    public alimento getPratoPrincipal() {
        return pratoPrincipal;
    }

    public alimento getAcompanhamento() {
        return acompanhamento;
    }

    @Override
    public String toString() {
        return "Salada: " + salada + ", Prato Principal: " + pratoPrincipal + ", Acompanhamento: " + acompanhamento;
    }
}

