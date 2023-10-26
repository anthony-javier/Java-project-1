package guerra;

/**Esta clase modela a un terricola*/
public class Terricola extends Guerrero{
	
	/*Variable estática que nos permite llevar cuenta de cuantos
	Terricola hay en cada momento, ya que se incrementa al crear
	un Terricola y se decrementa al morir*/
	        private static int total = 0;
	/**Cadena de caracteres que almacenará “Terricola”*/
	        private String soy;    
	
	/**Contructor*/
    Terricola(String soy){
    	//Invoca al constructor del padre, al de Guerrero.
        super(soy);
        //Incrementa la variable estática total
        total++;
        //Almacena en el objeto la cadena de caracteres que se le ha
        //pasado al constructor.
        this.soy= soy;
    }
    
    
/**Mediante este método se le comunica al Terricola que le
*han disparado. Si el número del disparo coincide con el
*valor de la variable blanco, que ha heredado de Guerrero, se
*muere, decrementa la variable estática total,e imprime un
mensaje por consola*/
    public void recibeDisparo(int i){
        if (vivo && blanco == i){
            vivo = false;
            total--;
            System.out.println (soy + " Muerto por disparo no" +i);
        }
    }
 /**Método que devuelve el valor de la variable total*/
    public int getTotal(){
        return total;
    }

} ///:~
