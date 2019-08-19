package eleciones;

/**
 * 21/12/2015
 *
 * @author Felix Aguilar
 * 
 * Este programa realiza dos funciones:
 * 1) Visualizar por pantalla el número de diputados conseguidos por cada partido
 *    para cada una de las comunidades autónomas y ciudades autónomas. El
 *    reparto de escaños será proporcional al % de número de votos obtenidos.
 * 2) Visualizar al final el reparto global de diputados obtenidos por cada uno de los
 *    partidos.
 */
public class Eleciones {

    
    public void inicio (){
        
        Comunidad r = new Comunidad ();
        
        //Introducción de los datos al programa.
        //Los datos estan por este orden: nombre comunidad, escaños, votos A, votos B, votos C, votos D.
        Comunidad comunidad1 = new Comunidad("Andalucía",60,1500000,1000000,250000,500000);
        Comunidad comunidad2 = new Comunidad("Aragon",13,150000,200000,100000,50000);
        Comunidad comunidad3 = new Comunidad("Asturias",8,50000,25000,100000,100000);
        Comunidad comunidad4 = new Comunidad("Islas Baleares",8,75000,50000,75000,60000);
        Comunidad comunidad5 = new Comunidad("Canarias",15,200000,150000,100000,150000);
        Comunidad comunidad6 = new Comunidad("Cantabría",5,45000,55000,75000,25000);
        Comunidad comunidad7 = new Comunidad("Castilla la Mancha",21,350000,450000,250000,150000);
        Comunidad comunidad8 = new Comunidad("Castilla y León",32,400000,250000,500000,250000);
        Comunidad comunidad9 = new Comunidad("Cataluña",47,550000,750000,350000,450000);
        Comunidad comunidad10 = new Comunidad("Extremadura",10,125000,75000,80000,120000);
        Comunidad comunidad11 = new Comunidad("Galicia",23,280000,400000,320000,125000);
        Comunidad comunidad12 = new Comunidad("La Rioja",4,35000,45000,20000,15000);
        Comunidad comunidad13 = new Comunidad("Comunidad de Madrid",36,675000,550000,750000,350000);
        Comunidad comunidad14 = new Comunidad("Navarra",5,50000,75000,25000,65000);
        Comunidad comunidad15 = new Comunidad("Euskadi",18,150000,75000,200000,80000);
        Comunidad comunidad16 = new Comunidad("Región de Murcia",10,125000,75000,150000,200000);
        Comunidad comunidad17 = new Comunidad("Comunidad Valenciana",33,450000,500000,350000,450000);
        Comunidad comunidad18 = new Comunidad("Ceuta",1,10000,5500,7500,3500);
        Comunidad comunidad19 = new Comunidad("Melilla",1,7500,8500,13000,2000);
        //Creamos un array para las variables comunidad.
        Comunidad comunidades[] = {
            comunidad1,comunidad2,comunidad3,comunidad4,comunidad5,comunidad6,comunidad7,comunidad8,comunidad9,
            comunidad10,comunidad11,comunidad12,comunidad13,comunidad14,comunidad15,comunidad16,comunidad17,comunidad18,comunidad19
        };
        //impresión cabecera del programa.
        System.out.println("RESULTADOS OBTENIDOS EN LAS ELECCIONES GENERALES:");
        System.out.println(" ");
        
        //Cálculo del reparto de escaños por comunidades:
        for (int i = 0; i < comunidades.length; i++) {
            r.reparto(comunidades[i]);
        }
        
        //Cálculo del reparto de escaños por partidos:
        r.total();
    }
    
    public static void main(String[] args) {
        //definir una variable para poder tener un subprograma no estatico(inicio):
        Eleciones i = new Eleciones ();
        i.inicio();
    }
}