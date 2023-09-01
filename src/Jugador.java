public class Jugador implements Personaje{
    @Override
    public void atacar() {
        System.out.println("atacando");
    }

    @Override
    public void recibirDaño() {
        System.out.println("daño recibido");

    }
}
