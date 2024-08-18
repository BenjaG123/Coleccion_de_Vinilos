package coleccionVinilos;

public class ColeccionVinilos{
    public static void main (String [] args) {
        

        String[][] vinilos=new String[100][3];
        agregarVinilo(vinilos, "Iron maiden", "Iron maiden", "1980");
        agregarVinilo(vinilos, "Iron maiden", "Killers", "1981");
        agregarVinilo(vinilos, "Iron maiden", "The numbers of the beast", "1982");
        agregarVinilo(vinilos, "AC-DC", "Back in Black", "1980");
        agregarVinilo(vinilos, "AC-DC","Highway to Hell","1979");
        agregarVinilo(vinilos,"AC-CD","Who Made Who","1986");
        agregarVinilo(vinilos,"Judas Priest","British Steel","1980");
        agregarVinilo(vinilos,"Judas Priest","Painkiller","1990");
        agregarVinilo(vinilos,"Judas Priest","Defenders of the Faith","1984");
        agregarVinilo(vinilos,"Kiss","Destroyer","1976");

        System.out.println("Espacio máximo de la coleecion: "+vinilos.length);

        mostrarTotal(totalOcupados(vinilos));
        mostrarDisponibles(disponibles(vinilos));

        String artista="AC-DC";
        System.out.println("Buscar artista: "+artista);
        mostrarBusquedaArtista(vinilos, artista);

        buscarArtista(vinilos, artista);
        mostrarColeccion(vinilos);


    }

    public static int totalVinilos(String[][] matrizVinilos){
        int contador=0;
        for (int fila=matrizVinilos.length-1; fila>=0; fila--){
            for (int columna=0; columna<matrizVinilos[fila].length; columna++){
                if (matrizVinilos[fila][columna] != null){
                    contador+=1;
                }
            }
        }
        return contador;
    }

    public static String[][] agregarVinilo(String[][] matrizVinilos, String group, String disc, String year){
        for (int fila=0; fila<matrizVinilos.length; fila++){
            if (matrizVinilos[fila][0]==null){
                matrizVinilos[fila][0]=group;
                matrizVinilos[fila][1]=disc;
                matrizVinilos[fila][2]=year;
                return matrizVinilos;}
        }
        return matrizVinilos;
    }

    public static boolean buscarArtista(String matrizVinilos[][], String artista){
        for (int fila=0; fila<matrizVinilos.length; fila++){
            if (matrizVinilos[fila][0].equals(artista)){
                return true;
            }
        }
        return false;
    }

    public static void mostrarColeccion (String[][] matrizVinilos){
        int contador=1;
        for (int fila=0; fila<matrizVinilos.length; fila++){
            if (matrizVinilos[fila][0]!=null)
            {System.out.println("Fila "+contador+": "+matrizVinilos[fila][0]+" - "+matrizVinilos[fila][1]+" - "+matrizVinilos[fila][2]);
                contador++;}
        }
    }

    public static void mostrarTotal (int espacioOcupado){
        System.out.println("Hay un total de: "+ espacioOcupado +" vinilos en la colección");
    }

    public static int totalOcupados(String[][] matrizVinilos){
        int contador=0;
        for (int fila=0; fila<matrizVinilos.length; fila++){
            if (matrizVinilos[fila][0]!=null){
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarDisponibles (int espacioDisponible){
        System.out.println("Hay un total de: "+espacioDisponible +" espacios disponibles en la coleccion");
    }

    public static int disponibles(String[][] matrizVinilos){
        int contador=0;
        for(int fila=0; fila<matrizVinilos.length; fila++){
            if (matrizVinilos[fila][0]==null){
                contador+=1;
            }
        }
        return contador;
    }

    public static void mostrarBusquedaArtista(String[][] matrizVinilos, String artista){
        if (buscarArtista(matrizVinilos, artista)){
            System.out.println("El artista "+artista+" si esta en la coleccion");
        } else {
            System.out.println("El artista "+artista+" no esta en la coleccion");
        }
    }

}