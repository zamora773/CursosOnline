package Main;

import Class.Cursos;
import Class.Estudiantes;
import DaoImp.DaoImpCursos;
import DaoImp.DaoImpEstudiantes;

//ZAMORA REYNALDO
public class Main {

    static DaoImpEstudiantes daoimpEstudiantes = new DaoImpEstudiantes();
    static DaoImpCursos daoimpCursos = new DaoImpCursos();

    public static void main(String[] agrs) {

        /*Agregar Materias a la tabla Curso*/
//        daoimpCursos.newCursos(new Cursos(1, "Base de Datos"));
//        daoimpCursos.newCursos(new Cursos(2, "Programación"));
//        daoimpCursos.newCursos(new Cursos(3, "Analisis de Datos"));
//        daoimpCursos.newCursos(new Cursos(4, "Topicos de Información"));

        /*Actualizar Materias a la tabla Curso*/
//        daoimpCursos.updateCursos(new Cursos(3, "POO II"));

        /*Eliminar Materias a la tabla Curso*/
//        daoimpCursos.deleteCursos(3);

        /*Leer Cursos de la tabla Curso*/
//        for (Cursos c : daoimpCursos.listaCursos()) {
//            System.out.println(c);
//        }

        /*Agregar Estudiante a la tabla Estudiantes*/
//        daoimpEstudiantes.newEstudiantes(new Estudiantes(2, "Jorge Andres", "Macias Moreira", "jorgeandres_21@hotmail.com"));

        /*Actualizar Estudiante a la tabla Estudiantes*/
//        daoimpEstudiantes.updateEstudiantes(new Estudiantes(1, "Julio Juan", "Macias Moreira", "juanmacias_21@hotmail.com"));

        /*Eliminar Estudiante a la tabla Estudiantes*/
//        daoimpEstudiantes.deleteEstudiantes(1);

        /*Leer Estudiante de la tabla Estudiantes*/
//        for (Estudiantes e : daoimpEstudiantes.listaEstudiantes()) {
//            System.out.println(e);
//        }

        /*Ingresar Curso que recibe el Estudiante a la tabla Cursos_Estudiantes*/
//        Estudiantes estudiante = daoimpEstudiantes.searchEstudiante(1);
//        estudiante.getCursos().add(daoimpCursos.searchCursos(1));
//        estudiante.getCursos().add(daoimpCursos.searchCursos(2));
//        estudiante.getCursos().add(daoimpCursos.searchCursos(3));
//
//        for (int i = 0; i < estudiante.getCursos().size(); i++) {
//
//            daoimpCursos.newMatricula(estudiante, estudiante.getCursos().get(i));
//        }

        /*Obtener Estudiantes por Curso*/
        for (Estudiantes e : daoimpEstudiantes.getEstudiantesPorCurso(1)) {
            System.out.println(e);
        }

        /*Obtener Curso por Estudiantes*/
        for (Cursos e : daoimpCursos.getCursoPorEstudiantes(1)) {
            System.out.println(e);
        }
    }
}
