package dunk.vyom;

import java.sql.Connection;
import dunk.vyom.config.Database;
import dunk.vyom.ui.MenuUI;

public class App {
  public static void main(String[] args) {
    // try (Connection con = Database.getConnection()) {
    // System.out.println("Conectado a la DB!!" + !con.isClosed());
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    MenuUI men = new MenuUI();
    men.loop();
  }
}
