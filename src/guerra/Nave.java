package guerra;

/**Clase Nave, que actúa como contenerdor de los Marcianos y
de los Terricolas*/
class Nave {

/**Array de Guerreros (tanto Marcianos como Terricolas son
*Guerreros). Es la tripulacion de la nave. Contendrá
*Terricolas si es la nave de Terricolas, Marcianos en caso
*contrario*/
    private Guerrero[] tripulacion = new Guerrero[10];
    private String somos;

/**Constructor, se le pasa una cadena de caracteres que será
“Terricolas” si es una nave de Terricolas, y “Marcianos” si
es la nave de los Marcianos*/
    public Nave (String somos){
        this.somos = somos;
        for (int i = 0; i<10; i++){
//Si es la nave de los terricolas inicializa cada una de las
//posiciones del array de guerreros con Terricolas, que son
//Guerreros, de ahí que puedan almacenarse en un contenedor
//de Guerreros
             if (somos.equals("Terricolas")){
                 tripulacion [i] = new Terricola(somos);
             }
//Si es la nave de los marcianos creamos una tripulación de
//Marcianos
             else{
                 tripulacion [i] = new Marciano(somos);
             }
        }
//Imprimios un texto por consola para saber que nave se creó
        System.out.println("Creada nave de " + somos);
    }
/**Método que invocará un nave sobre la otra para notificarle
*que le han disparado*/
    public void recibeDisparo(int i){
        for (int j=0; j<10;j++){
        	 //Si es la nave de los Terricolos
             if (somos.equals("Terricolas")){
             //Hago un cast del Guerrero que está en la posición [j] del
             //array de tripulates a Terricola:
             //((Terricola)(tripulacion[j])), de este modo puedo recuperar
             //el método recibeDisparo de Terricola
            	 ((Terricola)(tripulacion[j])).recibeDisparo(i);
             }
             else{
             //Si es la nave de los Marcianos el cast se hace a Marciano
            	 ((Marciano)(tripulacion[j])).recibeDisparo(i);
             }
        }
    }
    /**Este método se invoca sobre la nave indicándole que el
     *tripulante i ha de disparar*/
    public int generaDisparo(int i){
    //El método dispara() se definió en Guerrero, esta vez no es
	//necesario realizar ningún cast.
        return tripulacion[i].dispara();
    }
/**Método que indica cuantos tripulantes quedan en la nave*/
    public int cuantosQuedan(){
//Si es la nave de los Terricolas
        if (somos.equals("Terricolas")){
//Cojo al tripulante que está en la posición 1 y le hago un
//cast a Terricola, invocando el método getTotal(), que me
//devuelve el número de Terricolas que quedan vivos. Este es
//el valor que devuelve el método.
             return ((Terricola)(tripulacion[1])).getTotal();
        }
        else{
//Idem para los Marcianos.
             return ((Marciano)(tripulacion[1])).getTotal();
        }
    }

} ///:~
