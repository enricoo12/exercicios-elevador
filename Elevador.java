public class Elevador {
    // Atributos encapsulados
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    // Método para inicializar o elevador
    public void inicializar(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0; // térreo
        this.pessoasPresentes = 0;
    }

    // Método para entrar no elevador
    public void entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
        } else {
            System.out.println("Elevador cheio.");
        }
    }

    // Método para sair do elevador
    public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
        } else {
            System.out.println("Elevador vazio.");
        }
    }

    // Método para subir um andar
    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("Já está no último andar.");
        }
    }

    // Método para descer um andar
    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("Já está no térreo.");
        }
    }

    // Métodos getters e setters
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
}

