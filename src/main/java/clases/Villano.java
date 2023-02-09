package clases;

public class Villano {

   protected String nombre;
    public int poder;
    private Heroe heroe;

    public int destruir(){
        int resultado=this.poder-this.heroe.getpower();
        return resultado;
    }


}
