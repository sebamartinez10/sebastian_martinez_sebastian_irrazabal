package testgatos;

import java.util.Scanner;

public class Testgatos {

    public static void main(String[] args) {

        boolean principal = true;
        while (principal) {

            boolean t = true;
            int op = 0;
            int filas;
            int columnas;

            Scanner scan = new Scanner(System.in);
            System.out.println("----------------------------------");
            System.out.println("Bienvenido al creador de planos");
            System.out.println("----------------------------------");
            System.out.println("Regla: Todo lo que sea coordenada");
            System.out.println("se debe ingresar separado por una");
            System.out.println("coma EJ: 1,4");
            String coordenada;
            System.out.println("Ingrese coordenadas:");
            coordenada = scan.nextLine();
            String puntos[] = coordenada.split(",");
            columnas = Integer.parseInt(puntos[0]);
            filas = Integer.parseInt(puntos[1]);
            if (columnas > 20 || filas > 20) {
                System.out.println("No debe superar a 20, ingrese nuevamente");
            } else {

                String[][] plano = new String[filas][columnas];

                //Con esto limpiamos el mapa se ingresan - en todas las poscisiones
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        plano[i][j] = "-";

                    }
                }

                // Con esto mostramos
                //reglon
                for (int i = 0; i < columnas * 4; i++) {
                    System.out.print("-");

                }
                System.out.println("");
                //Termina reglon

                System.out.print("f/c ");
                for (int i = 0; i < columnas; i++) {
                    System.out.print("0" + (i + 1) + " ");

                }
                System.out.println();

                for (int i = 0; i < filas; i++) {
                    System.out.print("0" + (i + 1) + "  ");

                    for (int j = 0; j < columnas; j++) {
                        System.out.print(plano[i][j] + "  ");
                    }
                    System.out.println();
                }
                for (int i = 0; i < columnas * 4; i++) {
                    System.out.print("-");
                }
                System.out.println("");

                while (t) {
                    
                    //Menu de las opciones
                    System.out.println("----------------------------");
                    System.out.println("-Ingrese el numero que desea-");
                    System.out.println("opcion 1 mostrar mapa actual");
                    System.out.println("opcion 2 Ingresar Gato");
                    System.out.println("opcion 3 Ingresar Raton");
                    System.out.println("opcion 4 Salir");
                    System.out.println("----------------------------");

                    op = scan.nextInt();
                    if (op == 1) {
                    
                    // Con esto mostramos
                    //reglon
                        for (int i = 0; i < columnas * 4; i++) {
                            System.out.print("-");

                        }
                        System.out.println("");
                        //Termina reglon

                        System.out.print("f/c ");
                        for (int i = 0; i < columnas; i++) {
                            System.out.print("0" + (i + 1) + " ");

                        }
                        System.out.println();

                        for (int i = 0; i < filas; i++) {
                            System.out.print("0" + (i + 1) + "  ");

                            for (int j = 0; j < columnas; j++) {
                                System.out.print(plano[i][j] + "  ");
                            }
                            System.out.println();
                        }
                        for (int i = 0; i < columnas * 4; i++) {
                            System.out.print("-");
                        }
                        System.out.println("");

                    } else if (op == 2) {
                        
                        // Ahora se vuelven a pedir parametros de coordenadas
                        Scanner oScanner = new Scanner(System.in);
                        int x, y;
                        String ingresoG;
                        System.out.println("donde desea poner el gato");
                        ingresoG = oScanner.nextLine();
                        System.out.println("");
                        String[] separadors = ingresoG.split(",");

                        x = Integer.parseInt(separadors[0]) - 1;

                        y = Integer.parseInt(separadors[1]) - 1;
                        plano[y][x] = "G";

                        for (int i = 0; i < columnas * 4; i++) {
                            System.out.print("-");

                        }
                        System.out.println("");
                        
                        //Termina reglon

                        System.out.print("f/c ");
                        for (int i = 0; i < columnas; i++) {
                            System.out.print("0" + (i + 1) + " ");

                        }
                        System.out.println();

                        for (int i = 0; i < filas; i++) {
                            System.out.print("0" + (i + 1) + "  ");

                            for (int j = 0; j < columnas; j++) {
                                System.out.print(plano[i][j] + "  ");
                            }
                            System.out.println();
                        }
                        for (int i = 0; i < columnas * 4; i++) {
                            System.out.print("-");
                        }
                        System.out.println("");
                    } else if (op == 3) {
                        
                        // Ahora se vuelven a pedir parametros de coordenadas
                        Scanner oScanner = new Scanner(System.in);
                        int x, y;
                        String ingresoR;
                        System.out.println("donde desea poner el Raton");
                        ingresoR = oScanner.nextLine();
                        System.out.println("");
                        String[] separadors = ingresoR.split(",");

                        x = Integer.parseInt(separadors[0]) - 1;

                        y = Integer.parseInt(separadors[1]) - 1;
                        plano[y][x] = "R";

                        for (int i = 0; i < columnas * 4; i++) {
                            System.out.print("-");

                        }
                        System.out.println("");
                        //Termina reglon

                        System.out.print("f/c ");
                        for (int i = 0; i < columnas; i++) {
                            System.out.print("0" + (i + 1) + " ");

                        }
                        System.out.println();

                        for (int i = 0; i < filas; i++) {
                            System.out.print("0" + (i + 1) + "  ");

                            for (int j = 0; j < columnas; j++) {
                                System.out.print(plano[i][j] + "  ");
                            }
                            System.out.println();
                        }
                        for (int i = 0; i < columnas * 4; i++) {
                            System.out.print("-");
                        }
                        System.out.println("");
                    } else if (op == 4) {
                        t = false;
                        principal=false;
                        System.out.println("Gracias por usar el generador de planos");
                    } else {
                        System.out.println(" Debe ingresar una opcion valida! ");
                    }

                }
            }

        }
    }

}
