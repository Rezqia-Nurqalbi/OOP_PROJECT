/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Com.Config;

import java.sql.Connection;

/**
 *
 * @author REZQIA NURQALBI
 */
public class KoneksiDataBase {
    MyConfig Con = new MyConfig();
    Connection MyConfig = Con.getConnect();
}
