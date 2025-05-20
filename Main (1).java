public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        elevador.inicializar(5, 10);

        elevador.entrar();
        elevador.entrar();
        elevador.subir();
        elevador.subir();
        elevador.sair();
        elevador.descer();

        System.out.println("Andar atual: " + elevador.getAndarAtual());
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());
    }
}
