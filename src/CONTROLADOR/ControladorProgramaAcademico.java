//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: ControladorProgramaAcademico.java
//
// FECHA:12/03/30
//
// AUTORES:
// Gustavo Adolfo Rodriguez    0932979-3743
// gustalibreros@hotmail.com
//
// José Antonio Nobile Rendón  0747102-2711
// jose.nobile@gmail.com
//
// Roberto Ceballos            0441812-3743
// robertrock2000@gmail.com
//
// ESCUELA DE INGENIERIA DE SISTEMAS Y COMPUTACION
// UNIVERSIDAD DEL VALLE
//*********************************************************

package CONTROLADOR;

//~--- non-JDK imports --------------------------------------------------------

import ACCESO_DATOS.DaoPrograma;

import LOGICA.Programa;

//~--- JDK imports ------------------------------------------------------------

import java.util.Vector;

public class ControladorProgramaAcademico {
    DaoPrograma daoPrograma;

    public ControladorProgramaAcademico() {
        daoPrograma = new DaoPrograma();
    }

    public void insertarPrograma(String nombre, String codigo, String nivel, int numCreditos) {
        Programa p = new Programa();

        p.setCodigo(codigo);
        p.setNombre(nombre);
        p.setNivel(nivel);
        p.setCreditos(numCreditos);

        // Se llama al dao para guardar
        System.out.println("Se va a insertar un programa");
        daoPrograma.guardarPrograma(p);
        System.out.println("Se va a insertó  un  nuevo programa");
    }    // end

    public Vector consultarPrograma(String codigo) {
        Vector   v = new Vector();
        Programa p = new Programa();

        System.out.println("Se va a consultar un programa");
        p = daoPrograma.consultarPrograma(codigo);

        // se asignan datos al vector
        v.add(p.getCodigo());
        v.add(p.getNombre());
        v.add(p.getNivel());
        v.add(p.getCreditos());

        return v;
    }

    public void listarProgramas() {}
}


//~ Formatted by Jindent --- http://www.jindent.com
