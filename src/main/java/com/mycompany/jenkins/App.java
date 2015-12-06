package com.mycompany.jenkins;

/**
 * La distancia de Levenshtein, distancia de edición o distancia entre palabras es el 
 * número mínimo de operaciones requeridas para transformar una cadena de caracteres en 
 * otra, se usa ampliamente en teoría de la información y ciencias de la computación. 
 * Se entiende por operación, bien una inserción, eliminación o la sustitución de un carácter. 
 * Esta distancia recibe ese nombre en honor al científico ruso Vladimir Levenshtein, quien se 
 * ocupó de esta distancia en 1965. Es útil en programas que determinan cuán similares son dos 
 * cadenas de caracteres, como es el caso de los correctores de ortografía.
 */

public class App {
    /**
     * Calcula el minimo entre tres enteros de entrada
     * @param a valor 1
     * @param b valor 2
     * @param c valor 3
     * @return El mínimo valor de los tres.
     */
    private static int minimum(int a, int b, int c) {
        if(a<=b && a<=c)
        {
            return a;
        } 
        if(b<=a && b<=c)
        {
            return b;
        }
        return c;
    }

    /**
     * Devuelve la distancia entre dos palabras.
     * @param str1 primer string de la comparacion
     * @param str2 segundo string de la comparacion
     * @return distancia, devuelta entre las dos palabras
     */
    
    public static int computeLevenshteinDistance(String str1, String str2) {
        return computeLevenshteinDistance(str1.toCharArray(),
                                          str2.toCharArray());
    }

    /**
     * Calcula la distancia Levenshtein entre las dos cadenas de caracteres.
     * @param str1
     * @param str2
     * @return 
     */
    
    private static int computeLevenshteinDistance(char [] str1, char [] str2) {
        int [][]distance = new int[str1.length+1][str2.length+1];

        for(int i=0;i<=str1.length;i++)
        {
                distance[i][0]=i;
        }
        for(int j=0;j<=str2.length;j++)
        {
                distance[0][j]=j;
        }
        for(int i=1;i<=str1.length;i++)
        {
            for(int j=1;j<=str2.length;j++)
            { 
                  distance[i][j]= minimum(distance[i-1][j]+1,
                                        distance[i][j-1]+1,
                                        distance[i-1][j-1]+
                                        ((str1[i-1]==str2[j-1])?0:1));
            }
        }
        return distance[str1.length][str2.length];
        
    }
    
    /**
     * Funcion de ejecucion de la clase.
     * @param args Argumentos de la Linea de Comandos
     */
    
    public static void main(String args[]) {
    	App l = new App();
    	int di;
    	di = l.computeLevenshteinDistance("Amor", "Coche");
    	System.out.println(""+di);
    }
    
}