package guerra;

/**Clase Guerra. Es una clase auxiliar que nos permitirá
simular la guerra*/
class Guerra {
	
    private Nave nave1, nave2;
    
/**Constructor. Constuye las dos naves e invoca al método
*empiezaGuerra*/
    public Guerra(){
        nave1 = new Nave("Terricolas");
        nave2 = new Nave("Marcianos");
        empiezaGuerra();
    }
/**Método que simula la guerra*/
    public void empiezaGuerra(){
//Bucle do que (ver la condición) se ejecuta mientras haya
//tripulantes vivos en ambas naves
        do{
            for(int i = 0; i<10;i++){
//Esta línea invoca el método generaDisparo sobre la nave de
//los Terricolas, método que devuelve un entero aleatorio que
//es el disparo del tripulante i de la nave de los Terricolas
//(nave1.generaDisparo(i), y le comunica el resultado a la
//nave de los Marcianos.
                 nave2.recibeDisparo(nave1.generaDisparo(i));
//Idem, pero esta vez disparan los marcianos
                 nave1.recibeDisparo(nave2.generaDisparo(i));
            }
}while(nave1.cuantosQuedan()>0&&nave2.cuantosQuedan()>0);
//Si hay tripulantes vivos en la nave de los Terricolas
//ganaron ellos
        if(nave1.cuantosQuedan()>0){
            System.out.println("GANARON LOS TERRICOLAS!!!!!");
        }
//Si hay tripulantes vivos en la nave de los Marcianos
//ganaron ellos.
        else if (nave2.cuantosQuedan()>0){
             System.out.println("GANARON LOS MARCIANOS");
        }
    }
/**Método main, desde el se arranca el programa, creando un
*objeto Guerra, pero no se hace nada más, serán los objetos
*que se creen los que “dialogando entre ellos” resuelvan el
*programa.*/
    public static void main(String[] args){
        new Guerra();
    }

} ///:~

