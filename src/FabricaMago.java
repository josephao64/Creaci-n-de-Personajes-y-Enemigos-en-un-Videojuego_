public class FabricaMago extends FabricaPersonajes{
    @Override
    Personaje createPersonaje() {
        return new Jugador();
    }
}
