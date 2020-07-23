package Class;

import java.util.ArrayList;
import java.util.List;

public class Cursos {

    private int id;
    private String nombre;
    private List<Cursos> cursos = new ArrayList<>();

    public Cursos(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Cursos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(List<Cursos> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Cursos{" + "id=" + id + ", nombre=" + nombre + '}';
    }
}
