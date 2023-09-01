public class EnemigoNormal implements Enemigo{
    @Override
    public void atacar() {
        System.out.println("ataque de enemigo");
    }

    @Override
    public void recibirDaño() {
        System.out.println("daño recibido de enemigo");
    }


}
