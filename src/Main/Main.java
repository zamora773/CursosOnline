package Main;

import Class.Cursos;
import Class.Estudiantes;
import DaoImp.DaoImpCursos;
import DaoImp.DaoImpEstudiantes;

//ZAMORA REYNALDO
public class Main {

    public static void main(String[] agrs) {
        DaoImpCursos daoimpCursos = new DaoImpCursos();
//        daoimpCursos.newCursos(new Cursos(1, "Base de Datos"));
//        daoimpCursos.newCursos(new Cursos(2, "Programación"));
//        daoimpCursos.newCursos(new Cursos(3, "Analisis de Datos"));
//        daoimpCursos.newCursos(new Cursos(4, "Topicos de Información"));
//
//        daoimpCursos.updateCursos(new Cursos(3, "POO II"));
//        daoimpCursos.deleteCursos(3);
        for (Cursos c : daoimpCursos.listaCursos()) {
            System.out.println(c);
        }

        DaoImpEstudiantes daoimpEstudiantes = new DaoImpEstudiantes();

//        daoimpEstudiantes.newEstudiantes(new Estudiantes(1, "Carlos Andres", "Macias Moreira", "carlosandres_21@hotmail.com"));
//        daoimpEstudiantes.updateEstudiantes(new Estudiantes(1, "Julio Juan", "Macias Moreira", "juanmacias_21@hotmail.com"));
//        daoimpEstudiantes.deleteEstudiantes(1);

        for (Estudiantes e : daoimpEstudiantes.listaEstudiantes()) {
            System.out.println(e);
        }

    }
}
