public class Juego {
    public static void main(String[] args) {
        // Crear una fábrica de jugadores guerreros
        FabricaPersonajes fabricaGuerrero = new FabricaGuerrero();
        Personaje jugadorGuerrero = fabricaGuerrero.createPersonaje();

        // Crear una fábrica de enemigos normales
        FabricaEnemigos fabricaEnemigoNormal = new FabricaEnemigoNormal();
        Enemigo enemigoNormal = fabricaEnemigoNormal.crearEnemigos();

        // Interacciones entre el jugador guerrero y el enemigo normal
        jugadorGuerrero.atacar();
        enemigoNormal.recibirDaño();

        // Crear una fábrica de jugadores magos
        FabricaPersonajes fabricaMago = new FabricaMago();
        Personaje jugadorMago = fabricaMago.createPersonaje();

        // Crear una fábrica de enemigos jefes
        FabricaEnemigos fabricaEnemigoJefe = new FabricaEnemigoJefe();
        Enemigo enemigoJefe = fabricaEnemigoJefe.crearEnemigos();

        // Interacciones entre el jugador mago y el enemigo jefe
        jugadorMago.atacar();
        enemigoJefe.recibirDaño();

        // Continuar con más interacciones y lógica del juego

    }
}
