/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import Class.Cursos;
import Class.Estudiantes;
import Conexion.Conexion;
import Dao.DaoEstudiantes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class DaoImpEstudiantes implements DaoEstudiantes {

    @Override
    public List<Estudiantes> getListEstudiantes() {
        ArrayList<Estudiantes> listE = new ArrayList<Estudiantes>();
        Estudiantes estudiante;
        try {
            Conexion coneccion = new Conexion();
            Connection conn = null;
            conn = coneccion.getConeccion(conn);
            String sqlmostrar = "Select * From Estudiantes";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sqlmostrar);
            while (rs.next()) {
                estudiante = new Estudiantes();
                estudiante.setId(rs.getInt(1));
                estudiante.setNombres(rs.getString(2));
                estudiante.setApellidos(rs.getString(3));
                estudiante.setEmail(rs.getString(4));

                listE.add(estudiante);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return listE;
    }

    @Override
    public void newEstudiantes(Estudiantes estudiantes) {
        try {
            Conexion conexion = new Conexion();
            Connection conn = null;
            conn = conexion.getConeccion(conn);
            String sqlinsertar = "Insert into Estudiantes(id,nombres,apellidos,email) values (?,?,?,?)";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            psta.setInt(1, estudiantes.getId());
            psta.setString(2, estudiantes.getNombres());
            psta.setString(3, estudiantes.getApellidos());
            psta.setString(4, estudiantes.getEmail());
            psta.execute();
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    @Override
    public void updateEstudiantes(Estudiantes estudiantes) {
        try {
            Conexion conexion = new Conexion();
            Connection conn = null;
            conn = conexion.getConeccion(conn);
            String sqlinsertar = "Update Estudiantes set nombres=? , apellidos=? , email=? where id=?";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            psta.setString(1, estudiantes.getNombres());
            psta.setString(2, estudiantes.getApellidos());
            psta.setString(3, estudiantes.getEmail());
            psta.setInt(4, estudiantes.getId());
            psta.execute();
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    @Override
    public void deleteEstudiantes(int id) {
        try {
            Conexion coneccion = new Conexion();
            Connection conn = null;
            conn = coneccion.getConeccion(conn);
            String sqldelete = "Delete From Estudiantes where id=?";
            PreparedStatement psta = conn.prepareStatement(sqldelete);
            psta.setInt(1, id);
            psta.execute();
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    @Override
    public List<Estudiantes> getEstudiantesPorCurso(int estudianteId) {
        ArrayList<Estudiantes> listE = new ArrayList<Estudiantes>();
        Estudiantes estudiante;
        try {
            Conexion coneccion = new Conexion();
            Connection conn = null;
            conn = coneccion.getConeccion(conn);
            String sqlmostrar = "SELECT estudiantes.id,estudiantes.nombres,estudiantes.apellidos,estudiantes.email "
                    + "FROM estudiantes "
                    + "INNER JOIN cursos_estudiantes on estudiantes.id = cursos_estudiantes.estudiante_id "
                    + "WHERE cursos_estudiantes.curso_id=?";

            PreparedStatement psta = conn.prepareStatement(sqlmostrar);
            psta.setInt(1, estudianteId);
            ResultSet rs = psta.executeQuery();
            while (rs.next()) {
                estudiante = new Estudiantes();
                estudiante.setId(rs.getInt(1));
                estudiante.setNombres(rs.getString(2));
                estudiante.setApellidos(rs.getString(3));
                estudiante.setEmail(rs.getString(4));

                listE.add(estudiante);
            }


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return listE;
    }

    @Override
    public Estudiantes searchEstudiante(int id) {
        Estudiantes estudiante = new Estudiantes();
        try {
            Conexion coneccion = new Conexion();
            Connection conn = null;
            conn = coneccion.getConeccion(conn);
            String sqlmostrar = "Select * From Estudiantes Where id=?";
            PreparedStatement psta = conn.prepareStatement(sqlmostrar);
            psta.setInt(1, id);
            ResultSet rs = psta.executeQuery();
            while (rs.next()) {
                estudiante = new Estudiantes();
                estudiante.setId(rs.getInt(1));
                estudiante.setNombres(rs.getString(2));
                estudiante.setApellidos(rs.getString(3));
                estudiante.setEmail(rs.getString(4));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return estudiante;
    }
}
