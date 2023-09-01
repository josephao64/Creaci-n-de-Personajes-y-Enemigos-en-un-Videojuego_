public class FabricaEnemigoJefe extends FabricaEnemigos{
    @Override
    Enemigo crearEnemigos() {
        return new EnemigoNormal();
    }
}
