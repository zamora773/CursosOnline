
package Main;

import Class.Cursos;
import DaoImp.DaoImpCursos;

//ZAMORA REYNALDO
public class Main {

    public static void main(String[] agrs) {
        DaoImpCursos daoimpCursos = new DaoImpCursos();
//        daoimpCursos.newCursos(new Cursos(1, "Base de Datos"));
//        daoimpCursos.newCursos(new Cursos(2, "Programación"));
//        daoimpCursos.newCursos(new Cursos(3, "Analisis de Datos"));
//        daoimpCursos.newCursos(new Cursos(4, "Topicos de Información"));

        //Como yo en la base de datos ya tengo el id 1,2,3,4,5,6,7,8 esos no los puedo volver a repetir por ende debo poner otro numero en este caso 5
          //daoimpCursos.newCursos(new Cursos(5,"Marketing Digital"));
          //daoimpCursos.newCursos(new Cursos(6, "Matematica Financiera"));
          //daoimpCursos.newCursos(new Cursos(7, "Base de Datos"));
          daoimpCursos.newCursos(new Cursos(8, "Ingles"));
        //daoimpCursos.updateCursos(new Cursos(3, "POO II"));
//        daoimpCursos.deleteCursos(3);
    
        for (Cursos c : daoimpCursos.listaCursos()) {
            System.out.println(c);
        }

    }
}

