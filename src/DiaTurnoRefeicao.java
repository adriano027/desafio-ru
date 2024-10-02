public class DiaTurnoRefeicao {
    String dia;
    String turno;
    refeicao refeicao;

    public DiaTurnoRefeicao(String dia, String turno, refeicao refeicao) {
        this.dia = dia;
        this.turno = turno;
        this.refeicao = refeicao;
    }

    @Override
    public String toString() {
        return dia + " - " + turno + ": " + refeicao;

    }

    private static class diaTurnoRefeicao {
        private String dia;
        private String turno;
        private refeicao refeicao;

        public diaTurnoRefeicao(String dia, String turno, refeicao refeicao) {
            this.dia = dia;
            this.turno = turno;
            this.refeicao = refeicao;
        }

        // Getters para os atributos da classe
        public String getDia() {
            return dia;
        }

        public String getTurno() {
            return turno;
        }

        public refeicao getRefeicao() {
            return refeicao;
        }

        @Override
        public String toString() {
            return dia + " - " + turno + ": " + refeicao;
        }
    }
}
