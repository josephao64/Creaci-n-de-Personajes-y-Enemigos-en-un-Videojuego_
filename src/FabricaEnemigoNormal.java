public class FabricaEnemigoNormal  extends FabricaEnemigos{
    @Override
    Enemigo crearEnemigos() {
        return new EnemigoNormal() ;
    }
}
