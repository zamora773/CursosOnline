package Class;

public class Cursos {
    private int id;
    private String nombre;

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

    @Override
    public String toString() {
        return "Cursos{" + "id=" + id + ", nombre=" + nombre + '}';
    }
}

