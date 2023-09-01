public class FabricaGuerrero extends FabricaPersonajes{
    @Override
    Personaje createPersonaje() {
        return new  Jugador();
    }
}
