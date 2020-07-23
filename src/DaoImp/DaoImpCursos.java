package DaoImp;

import Class.Cursos;
import Class.Estudiantes;
import Conexion.Conexion;
import Dao.DaoCursos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DaoImpCursos implements DaoCursos {

    @Override
    public ArrayList<Cursos> getListCursos() {
        ArrayList<Cursos> listC = new ArrayList<Cursos>();
        Cursos curso;
        try {
            Conexion coneccion = new Conexion();
            Connection conn = null;
            conn = coneccion.getConeccion(conn);
            String sqlmostrar = "Select * From Cursos";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sqlmostrar);
            while (rs.next()) {
                curso = new Cursos();
                curso.setId(rs.getInt(1));
                curso.setNombre(rs.getString(2));

                listC.add(curso);
            }
            return listC;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return listC;
    }

    @Override
    public void newCursos(Cursos cursos) {
        try {
            Conexion conexion = new Conexion();
            Connection conn = null;
            conn = conexion.getConeccion(conn);
            String sqlinsertar = "Insert into Cursos(id,nombre) values (?,?)";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            psta.setInt(1, cursos.getId());
            psta.setString(2, cursos.getNombre());
            psta.execute();
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    @Override
    public void updateCursos(Cursos cursos) {
        try {
            Conexion conexion = new Conexion();
            Connection conn = null;
            conn = conexion.getConeccion(conn);
            String sqlinsertar = "Update Cursos set nombre=? where id=?";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            psta.setString(1, cursos.getNombre());
            psta.setInt(2, cursos.getId());
            psta.execute();
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    @Override
    public void deleteCursos(int id) {
        try {
            Conexion coneccion = new Conexion();
            Connection conn = null;
            conn = coneccion.getConeccion(conn);
            String sqldelete = "Delete From Cursos where id=?";
            PreparedStatement psta = conn.prepareStatement(sqldelete);
            psta.setInt(1, id);
            psta.execute();
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    @Override
    public Cursos searchCursos(int id) {
        Cursos curso = new Cursos();
        try {
            Conexion coneccion = new Conexion();
            Connection conn = null;
            conn = coneccion.getConeccion(conn);
            String sqlmostrar = "Select * From Cursos Where id=?";
            PreparedStatement psta = conn.prepareStatement(sqlmostrar);
            psta.setInt(1, id);
            ResultSet rs = psta.executeQuery();
            while (rs.next()) {
                curso = new Cursos();
                curso.setId(rs.getInt(1));
                curso.setNombre(rs.getString(2));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return curso;
    }

    @Override
    public void newMatricula(Estudiantes estudiante, Cursos curso) {
        try {
            Conexion conexion = new Conexion();
            Connection conn = null;
            conn = conexion.getConeccion(conn);
            String sqlinsertar = "Insert into Cursos_Estudiantes(estudiante_id,curso_id) values (?,?)";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            psta.setInt(1, estudiante.getId());
            psta.setInt(2, curso.getId());
            psta.execute();
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    @Override
    public List<Cursos> getCursoPorEstudiantes(int cursoId) {
        ArrayList<Cursos> listC = new ArrayList<Cursos>();
        Cursos curso;
        try {
            Conexion coneccion = new Conexion();
            Connection conn = null;
            conn = coneccion.getConeccion(conn);
            String sqlmostrar = "SELECT cursos.id, cursos.nombre\n"
                    + "FROM cursos\n"
                    + "INNER JOIN cursos_estudiantes on cursos.id = cursos_estudiantes.curso_id	\n"
                    + "WHERE estudiante_id=?";

            PreparedStatement psta = conn.prepareStatement(sqlmostrar);
            psta.setInt(1, cursoId);
            ResultSet rs = psta.executeQuery();
            while (rs.next()) {
                curso = new Cursos();
                curso.setId(rs.getInt(1));
                curso.setNombre(rs.getString(2));

                listC.add(curso);
            }
            return listC;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return listC;
    }
}
