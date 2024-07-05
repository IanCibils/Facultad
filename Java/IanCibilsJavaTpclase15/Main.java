public class Main {
    public static void main(String[] args) {
        Instrumento[] instrumentos = new Instrumento[6];

        instrumentos[0] = new Instrumento();
        instrumentos[1] = new Guitarra();
        instrumentos[2] = new Piano();
        instrumentos[3] = new Bateria();
        instrumentos[4] = new Flauta();
        instrumentos[5] = new Violin();

        for (Instrumento instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}
