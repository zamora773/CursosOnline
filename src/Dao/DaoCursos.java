
package Dao;

import Class.Cursos;
import java.util.List;


public interface DaoCursos {
     
    public List<Cursos> listaCursos();

    public void newCursos(Cursos cursos);

    public void updateCursos(Cursos cursos);

    public void deleteCursos(int id);
    
}
