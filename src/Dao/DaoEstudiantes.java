package Dao;

import Class.Estudiantes;
import java.util.List;

public interface DaoEstudiantes {

    public List<Estudiantes> getEstudiantesPorCurso(int estudianteId);

    public List<Estudiantes> getListEstudiantes();

    public Estudiantes searchEstudiante(int id);

    public void newEstudiantes(Estudiantes estudiantes);

    public void updateEstudiantes(Estudiantes estudiantes);

    public void deleteEstudiantes(int id);

}
