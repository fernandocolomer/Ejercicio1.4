package com.aplicacion.ejercicio1_4.Configuracion;

public class Transacciones {
    public static final String NameDatabase = "DBPersona";

    public static final String tablaDatos = "persona";

    public static final String id = "id";
    public static final String nombre = "nombre";
    public static final String descripcion = "descripcion";
    public static final String pathImage = "pathImage";
    public static final String image = "image";

    public static final String CreateTableDatos = "CREATE TABLE "+tablaDatos+"("+
            id+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
            nombre+" TEXT, "+
            descripcion+" TEXT," +
            pathImage+" TEXT, "+
            image+" BLOB)";

    public static final String DropTableDatos = "DROP TABLE IF EXISTS " + tablaDatos;

    public  static final String consultDatos = "SELECT * FROM "+tablaDatos;
}
