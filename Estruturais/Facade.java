package Estruturais;

// Subsistemas complexos
class Amplifier {
    public void on() {
        System.out.println("Amplificador ligado.");
    }
    
    public void setVolume(int volume) {
        System.out.println("Volume ajustado para " + volume + ".");
    }
}

class DvdPlayer {
    public void on() {
        System.out.println("DVD Player ligado.");
    }
    
    public void playMovie(String movie) {
        System.out.println("Reproduzindo o filme '" + movie + "'.");
    }
}

class Projector {
    public void on() {
        System.out.println("Projetor ligado.");
    }
    
    public void setInput(String source) {
        System.out.println("Fonte de entrada do projetor definida como " + source + ".");
    }
}

// Fachada
class HomeTheaterFacade {
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade() {
        this.amplifier = new Amplifier();
        this.dvdPlayer = new DvdPlayer();
        this.projector = new Projector();
    }

    public void watchMovie(String movie) {
        System.out.println("Iniciando o sistema de home theater...");
        amplifier.on();
        amplifier.setVolume(10);
        dvdPlayer.on();
        dvdPlayer.playMovie(movie);
        projector.on();
        projector.setInput("DVD");
        System.out.println("Aproveite o filme!\n");
    }
}

// Uso da Fachada
public class Facade {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie("Inception");
    }
}

