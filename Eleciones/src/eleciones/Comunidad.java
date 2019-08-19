package eleciones;

/**
 *
 * @author Felix Aguilar
 */
public class Comunidad {
    
    //Variables del programa:
    int ta=0, tb=0, tc=0, td=0;//Total de escaños por partido. 
    public int escaños;//Los escaños que tiene cada comunidad.
    public String comunidad;//Nombre de cada comunidad.
    public int votosA;//Votos de cada comunidad al partido A.
    public int votosB;//Votos de cada comunidad al partido B.
    public int votosC;//Votos de cada comunidad al partido C.
    public int votosD;//Votos de cada comunidad al partido D.
    
    //Creación de la variable comunidad.
    public Comunidad (){
         escaños = 0;
         comunidad = "";
         votosA = 0;
         votosB = 0;
         votosC = 0;
         votosD = 0;         
    }
    
    //Introducción de los datos de cada comunidad.(mirar Elecciones para ver los datos intrducidos).
    public Comunidad (String prov,int esc,int A,int B,int C,int D){
        comunidad = prov;
        escaños = esc;
        votosA = A;
        votosB = B;
        votosC = C;
        votosD = D;            
    } 
    
    //Subprograma para calcular el reparto de escaños por comunidad y partido.
    public void reparto (Comunidad comunidad) {
        //Variables empleadas en el subprograma.
            double resA,resB,resC,resD;//Los escaños que le tocan a cada partido con decimales.
            int resa,resb,resc,resd;//Los escaños que le tocan a cada partido sin decimales.
            //A continuación calculamos cuantos votos vale un escaños por comunidad. 
            double porcentaje = ((comunidad.getA() + comunidad.getB() + comunidad.getC() +comunidad.getD())/comunidad.getEscaños());
        //Obtenemos cuantos escaños ha obtenido cada partido, el resultado esta con decimales.     
        resA = comunidad.getA()/porcentaje;  
        resB = comunidad.getB()/porcentaje;
        resC = comunidad.getC()/porcentaje;
        resD = comunidad.getD()/porcentaje;
        //Ahora obtenemos cuantos escaños ha obtenido cada partido, eliminando los decimales.
        resa = (int)(resA);//Escaños del partido A.
        resb = (int)(resB);//Escaños del partido B.
        resc = (int)(resC);//Escaños del partido C.
        resd = (int)(resD);//Escaños del partido D.
        
        //Entonces utilizando los datos obtenidos anteriormente, calculamos el reparto de los escaños restantes.
        int i = comunidad.getEscaños()-(resa+resb+resc+resd);//número de escaños pendientes de repartir.
        //Obtenemos las decimas de cada partido en la provincia para repartir el resto de los escaños.
        double a = resA-resa;
        double b = resB-resb;
        double c = resC-resc;
        double d = resD-resd;
        
        //En este bucle, no saldremos hasta que todos los escaños pendientes se repartan.
        while(i!=0){
            if (a>=b&&a>=c&&a>=d){//Si 'a' es el mayor de todos le concede un escaño. y imediatamente reduce el número de escaños pendientes.
                resa++;//incremetamos en 1 el número de escaños de este partido.
                a=0;//Igualamos 'a' a cero ya que con sus decimas le hemos dado un escaño y no puede aspirar a otro.
                i--;//al repartir un escaño disminuimos en 1 el número de escaños pendientes.
            }
            if (b>=c&&b>=d&&b>=a&&i>0){//Si 'b' es el mayor de todos le concede un escaño. y imediatamente reduce el número de escaños pendientes.
                resb++;//incremetamos en 1 el número de escaños de este partido.
                b=0;//Igualamos 'b' a cero ya que con sus decimas le hemos dado un escaño y no puede aspirar a otro.
                i--;//al repartir un escaño disminuimos en 1 el número de escaños pendientes.
            }
            if (c>=d&&c>=b&&c>=a&&i>0){//Si 'c' es el mayor de todos le concede un escaño. y imediatamente reduce el número de escaños pendientes.
                resc++;//incremetamos en 1 el número de escaños de este partido.
                c=0;//Igualamos 'c' a cero ya que con sus decimas le hemos dado un escaño y no puede aspirar a otro.
                i--;//al repartir un escaño disminuimos en 1 el número de escaños pendientes.
            }
            if (d>=c&&d>=b&&d>=a&&i>0){//Si 'd' es el mayor de todos le concede un escaño. y imediatamente reduce el número de escaños pendientes.
                resd++;//incremetamos en 1 el número de escaños de este partido.
                d=0;//Igualamos 'd' a cero ya que con sus decimas le hemos dado un escaño y no puede aspirar a otro.
                i--;//al repartir un escaño disminuimos en 1 el número de escaños pendientes.
            }
        }
        //Actualizamos el total de escaños por partido.
        ta=ta+resa;
        tb=tb+resb;
        tc=tc+resc;
        td=td+resd;
        
        //Mostramos la distribución de escaños por comunidad y partido.
        System.out.println("En la comunidad de "+comunidad.getNombre()+" los resultados han sido:");
        System.out.println("    El partido A ha obtenido: "+resa);
        System.out.println("    El partido B ha obtenido: "+resb);
        System.out.println("    El partido C ha obtenido: "+resc);
        System.out.println("    El partido D ha obtenido: "+resd);
    }
    
    //Subprograma que muestra los resultados globales por cada partido.
    public void total(){
        System.out.println(" ");
        System.out.println("Globalmente los resultados han sido:");
        System.out.println("    El partido A ha obtenido: "+ta);
        System.out.println("    El partido B ha obtenido: "+tb);
        System.out.println("    El partido C ha obtenido: "+tc);
        System.out.println("    El partido D ha obtenido: "+td);
        System.out.println(" ");
    }
    
    //Subprgrama que nos permite obtener los escaños por comunidad.
    public int getEscaños(){
        return escaños;
    }
    //Subprgrama que nos permite obtener los nombres de cada comunidad.
    public String getNombre(){
        return comunidad;
    }
    //Subprgrama que nos permite obtener los votos del partido A en cada comunidad.
    public int getA (){
        return votosA;
    }
    //Subprgrama que nos permite obtener los votos del partido B en cada comunidad.
    public int getB (){
        return votosB;
    }
    //Subprgrama que nos permite obtener los votos del partido C en cada comunidad.    
    public int getC (){
        return votosC;
    }
    //Subprgrama que nos permite obtener los votos del partido D en cada comunidad.
    public int getD (){
        return votosD;
    }

}
