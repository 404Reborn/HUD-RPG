package src.ejercicios;

public class ejercicios {

    public static void main(String[] args) {

        int vidaPersonaje, vidaEnemigo, ataquePersonaje, ataqueEnemigo, defensaPersonaje, defensaEnemigo;
        char menu, menuAtaque, menuDefensa, menuCuracion, menuObjeto;

        do {

            System.out.println("Seleccione una opcion:\n"
                    + "A - Atacar\n"
                    + "B - Defender\n"
                    + "C - Curar\n"
                    + "D - Usar objeto\n"
                    + "E - Ver inventario\n"
                    + "F - Ver estadísticas\n"
                    + "G - Salir");

            menu = Consola.leeChar("Cual será tu estrategia?\n ");

            switch (menu) {
                case 'A':
                    System.out.println("Atacando...");
                    System.out.println("Seleccione un tipo de ataque:\n"
                            + "A - Ráfaga Solar\n"
                            + "B - Destello Igneo\n"
                            + "C - Desintegracion Plasmática\n");

                    menuAtaque = Consola.leeChar("Seleccione un tipo de ataque: ");

                    switch (menuAtaque) {
                        case 'A':
                            System.out.println("Usando Ráfaga Solar...");
                            break;
                        case 'B':
                            System.out.println("Usando Destello Igneo...");
                            break;
                        case 'C':
                            System.out.println("Usando Desintegracion Plasmática...");
                            break;
                        default:
                            System.out.println("Opción inválida. Intente de nuevo.");
                    }
                    break;

                case 'B':
                    System.out.println("Defendiendo...");
                    System.out.println("Seleccione un tipo de defensa:\n"
                            + "A - Escudo Solar\n"
                            + "B - Barrera Ignea\n"
                            + "C - Muro de Fuego\n");

                    menuDefensa = Consola.leeChar("Seleccione un tipo de defensa: ");

                    switch (menuDefensa) {
                        case 'A':
                            System.out.println("Usando Escudo Solar...");
                            break;
                        case 'B':
                            System.out.println("Usando Barrera Ignea...");
                            break;
                        case 'C':
                            System.out.println("Usando Muro de Fuego...");
                            break;
                        default:
                            System.out.println("Opción inválida. Intente de nuevo.");
                    }
                    break;

                case 'C':
                    System.out.println("Curando...");
                    System.out.println("Seleccione un tipo de curación:\n"
                            + "A - Poción de Vida\n"
                            + "B - Poción de Energía\n"
                            + "C - Poción de Resistencia\n");

                    menuCuracion = Consola.leeChar("Seleccione un tipo de curación: ");

                    switch (menuCuracion) {
                        case 'A':
                            System.out.println("Usando Poción de Vida...");
                            break;
                        case 'B':
                            System.out.println("Usando Poción de Energía...");
                            break;
                        case 'C':
                            System.out.println("Usando Poción de Resistencia...");
                            break;
                        default:
                            System.out.println("Opción inválida. Intente de nuevo.");
                    }
                    break;

                case 'D':
                    System.out.println("Usando objeto...");
                    System.out.println("seleccione un objeto:\n"
                            + "A - Granada de Plasma\n"
                            + "B - Bomba de Fusión\n"
                            + "C - Cañón de Rayo\n");

                    menuObjeto = Consola.leeChar("Seleccione un objeto: ");

                   switch (menuObjeto) {
                        case 'A':
                            System.out.println("Usando Granada de Plasma...");
                            break;
                        case 'B':
                            System.out.println("Usando Bomba de Fusión...");
                            break;
                        case 'C':
                            System.out.println("Usando Cañón de Rayo...");
                            break;
                        default:
                            System.out.println("Opción inválida. Intente de nuevo.");
                    }
                    break;

                case 'E':
                    System.out.println("Mostrando inventario...");
                    System.out.println("Inventario:\n"
                            + "1. Granada de Plasma\n"
                            + "2. Bomba de Fusión\n"
                            + "3. Cañón de Rayo\n"
                            + "4. Poción de Vida\n"
                            + "5. Poción de Energía\n"
                            + "6. Poción de Resistencia\n");

                            switch (Consola.leeChar("Seleccione un objeto para usar: ")) {
                                case '1':
                                    System.out.println("Usando Granada de Plasma...");
                                    break;
                                case '2':
                                    System.out.println("Usando Bomba de Fusión...");
                                    break;
                                case '3':
                                    System.out.println("Usando Cañón de Rayo...");
                                    break;
                                case '4':
                                    System.out.println("Usando Poción de Vida...");
                                    break;
                                case '5':
                                    System.out.println("Usando Poción de Energía...");
                                    break;
                                case '6':
                                    System.out.println("Usando Poción de Resistencia...");
                                    break;
                                default:
                                    System.out.println("Opción inválida. Intente de nuevo.");
                            }
                    break;

                case 'F':
                    System.out.println("Mostrando estadísticas...");
                    System.out.println("Estadísticas del personaje:\n"
                            + "Vida: 100\n"
                            + "Ataque: 50\n"
                            + "Defensa: 30\n"
                            + "Energía: 80\n");
                    break;

                case 'G':
                    System.out.println("Saliendo del juego...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        }while(menu!='G');
    }
}
