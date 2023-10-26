package guerra;

/**Esta clase representa a un Guerrero, que nuevamente es un
*concepto abstracto: los guerreros han de ser Terricolas o
*Marcianos*/
public abstract class Guerrero extends SerVivo {
	
/*Variables del objeto, una cadena de caracteres dónde se
*almacenará “Terricola” o “Marciano” según el guerrero sea un
*terricola o un marciano, y un entero, que es el entero
*aleatorio con el que han de acertar para matar a este
*Guerrero*/
	protected int blanco;
	private final String soy;
	
/**Constructor. Almacena la cadena de caracteres que se le
*pasa en la variable soy del objeto, e inicializa la variable
*blanco empleando el método generablanco*/
    public Guerrero (String soy){
        blanco = generaBlanco();
        this.soy = soy;
    }
/**Si el guerrero está vivo (la variable vivo la hereda de
*ser vivo vale true) el guerrero “dispara” mediante este
*método un número aleatorio entre 0 y 10. Si está muerto
*dispara un 100, que nunca matará a nadie; de esa forma
*modelamos que un muerto nunca mata a nadie.*/
    public int dispara (){
        if (vivo){
             int disparo = ((int)(Math.random()*10));
             System.out.println(soy + "Dispara no " +disparo);
             return disparo;
        }
        else
        return 100;
    }
/**Método que devuelve el valor de la variable blanco*/
    public int getBlanco(){
        return blanco;
    }
/**Método privado, que por lo tanto sólo será accesible por
*el propio objeto, que emplea para iniciar la variable
*blanco*/
    private int generaBlanco (){
        return ((int)(Math.random()*10));
    }

} ///:~