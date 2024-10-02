public class Alimento {
    String nome;

    public Alimento(String nome) {
        this.nome = nome;
        class alimento {
            private String nome;

            public alimento(String nome) {
                this.nome = nome;
            }

            // Getter para o nome do alimento
            public String getNome() {
                return nome;
            }

            @Override
            public String toString() {
                return nome;
            }
        }

    }

    @Override
    public String toString() {
        return nome;
    }
}