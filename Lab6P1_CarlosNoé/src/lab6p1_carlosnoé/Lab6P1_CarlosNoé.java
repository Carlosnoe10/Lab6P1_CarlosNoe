
package lab6p1_carlosnoé;
import java.util.Scanner;
import java.util.Random;

public class Lab6P1_CarlosNoé {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al menu de juegos"
                + "Ingrese la opcion correcta para ingresar al juego deseado"
                + "1. El juego de la vida :D "
                + "2. Pierda, papel o ..."
                + "3. Blink-182");
        int menu=scanner.nextInt();
        switch(menu){
            case 1:
                juego1();
                break;
                
            case 2:
                juego2();
                break;
                
            case 3:
                juego3();
                break;
        }
        



    }
    public static void juego1(){
        Scanner scanner = new Scanner(System.in);
        int tam1= 7;
        int tam2= 7;
        String Matriz[][]=GeneradorM(tam1,tam2);
        // codigo dado
        int movimiento=0;
        int movimientof=0;
        int columnav=0;
        int contchirola =0;
        int conedad=18;
        int contimp=0;
        int cont1=2;
        int cont2 =0;
        int cont3 = 3;
        int cont4= 0;
        int cont5=0;
        int cont6=2;
                
        while(columnav+movimiento == 14) {
            movimientof= movimiento;
            imprimirMatriz(Matriz);
            System.out.println("Oprima espacio");
            String espacio=scanner.nextLine();
            if (espacio==" ") {
                int dado= new Random().nextInt((6-0)+1)+0 ;
                movimiento= dado;            
                if (movimiento>7) 
                movimiento=movimientof-dado+(movimiento-7);
                columnav= columnav +1;
                Matriz=(llenarMatriz(Matriz, movimiento, movimientof, columnav));
                    if ((columnav==movimiento||((columnav==cont1)))){
                        contimp= contimp ;
                        contchirola += contchirola + 1250000 ;
                }else if((columnav==cont1)&&(movimiento==cont2)) {
                    contchirola += contchirola + 1250000 ;
                    cont2=cont2+1;
                    cont1=cont1+1;
                }else if((columnav==cont4)&&(movimiento==cont3)){
                        contchirola += contchirola + 1250000 ;
                        cont3=cont3+1;
                        cont4=cont4+1;
                }else if((columnav==cont5)&&(movimiento==cont6)){
                        conedad=conedad+5;
                        cont5=cont5+2;
                        cont6=0;
                        
                       
                            
                }
        }
            }
        }
    


        
        
    
    
    
    public static void juego2(){
        Scanner scanner = new Scanner(System.in);
        int tam1= 4;
        int tam2= 4;
        int ganador=0;
        int perdedor=0;
        String Matriz[][]=GeneradorM(tam1,tam2);
        for (int i = 0; i < 5; i++) {
        System.out.println("1.Scissors, 2.cuts, 3. paper, 4.rock, 5.Spock" );
        System.out.println("Ingrese su turno");
        int num = new Random().nextInt((5-1)+1)+1;
        Matriz
        }
            
        
    }
    
    
    public static void juego3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Cuantas filas desea");
        int tam1=scanner.nextInt();
        System.out.println("Ingrese Cuantas columnas desea");
        int tam2=scanner.nextInt();
        int Matriz[][]=GeneradorM1(tam1,tam2);
        Matriz=llenarMatriz1(Matriz);
        imprimirMatriz1(Matriz);
        char matriz[][]=llenarMatriz12(Matriz, tam1, tam2);
        imprimirMatriz12(matriz);
        if (true) {
            
        }
    }
        public static char [][] llenarMatriz12(int[][] matriz, int filas, int columnas){
        char[][] matrizChar= new char[filas][columnas]; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                 char elemento = (char)matriz[i][j];
                 matrizChar[i][j]= elemento;
                
            }
        }
       return matrizChar;
        }
            public static int [][] llenarMatriz12(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                ;
                
            }
        }
    return matriz;
    }
         public static boolean [][] llenarMatriz122(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==j) {
                    matriz[i][j]=0;
                }
        matriz[2][1]= false; 
    
    }
            return matriz;
        }
         }
    public static int [][] llenarMatriz1(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = new Random().nextInt((122-97)+1)+97 ;
                
            }
        }
    return matriz;
    }

        
    public static int [][] GeneradorM1 (int fila, int columna){
        int[][]matriz= new int[fila][columna];
        
        return matriz;
    }

    
    public static String [][] GeneradorM (int fila, int columna){
        String[][]matriz= new String[fila][columna];
        return matriz;
    }

    public static String [][] llenarMatriz(String[][] matriz, int posact , int posp, int v){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            matriz [v][posp]= "";    
            matriz[v][posact]= "*";
            
}
            
}
          return matriz;      
            }


    
    
    
    
    
    
    
    public static void imprimirMatriz (String [][] matriz){
        for (int i = 0; i < matriz.length; i++) { // fila
            for (int j = 0; j < matriz[i].length; j++) {// columna
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("-");
        }
    }
        public static void imprimirMatriz1 (int [][] matriz){
        for (int i = 0; i < matriz.length; i++) { // fila
            for (int j = 0; j < matriz[i].length; j++) {// columna
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
            public static void imprimirMatriz12 (char [][] matriz){
        for (int i = 0; i < matriz.length; i++) { // fila
            for (int j = 0; j < matriz[i].length; j++) {// columna
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
    
}