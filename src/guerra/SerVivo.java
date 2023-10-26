package guerra;

/**Esta clase está formada por una variable protegida de tipo
*boolean llamada edad, con un método que devuelve su valor.
*Representa as un SerVivo y es abstracta, al igual que el
*concepto de ser vivo es abstracto: en el mundo hay platas,
*animales, personas... que son seres vivos, pero no “seres
*vivos” de modo independiente*/
public abstract class SerVivo{
    public boolean isVivo(){
        return vivo;
    }
    protected boolean vivo = true;
} ///:~
