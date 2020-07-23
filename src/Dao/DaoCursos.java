
package Dao;

import Class.Cursos;
import Class.Estudiantes;
import java.util.List;


public interface DaoCursos {
     
    public void newMatricula(Estudiantes estudiante, Cursos curso);

    public List<Cursos> getCursoPorEstudiantes(int estudianteId);

    public List<Cursos> getListCursos();

    public Cursos searchCursos(int id);

    public void newCursos(Cursos cursos);

    public void updateCursos(Cursos cursos);

    public void deleteCursos(int id);
    
}
