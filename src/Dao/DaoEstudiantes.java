/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Class.Estudiantes;
import java.util.List;

/**
 *
 * @author core i5
 */
public interface DaoEstudiantes {

    public List<Estudiantes> listaEstudiantes();

    public void newEstudiantes(Estudiantes estudiantes);

    public void updateEstudiantes(Estudiantes estudiantes);

    public void deleteEstudiantes(int id);

}
