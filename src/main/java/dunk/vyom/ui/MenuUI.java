package dunk.vyom.ui;

import java.util.Scanner;

public class MenuUI {
  private final Scanner sc = new Scanner(System.in);
  static String title = """
            █████▄ ▄▄▄▄▄ ▄▄▄▄  ▄▄ ▄▄   ████▄  ▄▄ ▄▄ ▄▄  ▄▄  ▄▄▄▄ ▄▄▄▄▄  ▄▄▄  ▄▄  ▄▄
            ██▄▄█▀ ██▄▄  ██▄█▄ ██ ██   ██  ██ ██ ██ ███▄██ ██ ▄▄ ██▄▄  ██▀██ ███▄██
            ██     ██▄▄▄ ██ ██ ▀███▀   ████▀  ▀███▀ ██ ▀██ ▀███▀ ██▄▄▄ ▀███▀ ██ ▀██
      """;

  public void loop() {
    while (true) {
      System.out.println("Dungeon Matrix");
      System.out.println("1) Iniciar Sesion");
      System.out.println("2) Registrarse");
      System.out.println("3) Cambiar idioma");
      System.out.println("4) Salir");

      System.out.println();
      String opt = sc.nextLine().trim();

      switch (opt) {
        case "1" -> System.out.println("Iniciando sesion...");
        case "2" -> System.out.println("Iniciando registro...");
        case "3" -> System.out.println("No hay mas idiomas XD");
        case "4" -> {
          System.out.println("Saliendo del dungeon...");
          return;
        }
        default -> System.out.println("Opcion invalida...");
      }
    }
  }
}
