
package Dao;

import Class.Cursos;
import java.util.List;


public interface DaoCursos {
    
    void ingresar(Cursos cursos);
    void actualizar(Cursos curso);
    void eliminir(int id);
    List<Cursos>getCursos();
    
    public List<Cursos> listaCursos();

    public void newCursos(Cursos cursos);

    public void updateCursos(Cursos cursos);

    public void deleteCursos(int id);
    
}
