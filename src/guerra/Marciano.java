package guerra;

/**Todos los comentarios que hay en la clase Terricola son
*igualmente válidos para la clase Guerrero. Sus códigos son
*idénticos. ¿No podíamos haber empleado la herencia para no
*replicar el código?. En este caso no ya que todos los
*métodos y el constructor que aquí hay acceden a la variable
*estática total, que debe ser definida al nivel de las clases
*Marciano y Terricola para contar con dos variables
*estáticas, cada una de las cuales lleva cuenta del número de
*marcianos  y de terrícolas que hay en cada momento.*/
public class Marciano extends Guerrero{

    private static int total = 0;
    private String soy;

    Marciano(String soy){
        super(soy);
        this.soy =soy;
        total++;
    }
    public void recibeDisparo(int i){
        if (vivo && blanco == i){
            vivo = false;
            total--;
            System.out.println (soy + "Muerto por disparo no" +i);
        }
    }
    public int getTotal(){
        return total;
    }

} ///:~

