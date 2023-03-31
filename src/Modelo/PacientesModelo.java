
package Modelo;

import java.util.PriorityQueue;
import javax.swing.table.DefaultTableModel;

public class PacientesModelo {
    
    PriorityQueue<Pacientes> ListaPacientes = new PriorityQueue<Pacientes>();
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    
    public void IngresarPacientes (String ape, String nom, String tel, int grav)
    {
        Pacientes nuevoPacientes = new Pacientes(ape, nom, tel, grav);
        ListaPacientes.add(nuevoPacientes);   
    }
    
    public DefaultTableModel DesenlistarAntiguos()
    {
        this.ModeloTabla.setRowCount(0);
        return ModeloTabla;
    }
    
    public DefaultTableModel ListarPacientes()
    {   
        for(Pacientes MiListaDePacientes: ListaPacientes)
        {
            this.ModeloTabla.addRow(new Object[]{MiListaDePacientes.getApellidos(),
            MiListaDePacientes.getNombres(), MiListaDePacientes.getTelefono(), MiListaDePacientes.getGravedad()});
        }
        return ModeloTabla;
    }
    
    public DefaultTableModel ColumnaPacientes()
    {
        this.ModeloTabla.addColumn("Apellidos");
        this.ModeloTabla.addColumn("Nombres");
        this.ModeloTabla.addColumn("Telefono");
        this.ModeloTabla.addColumn("Gravedad");
        
        return ModeloTabla;
    }
    public void DesEncolar()
    {
        this.ListaPacientes.poll();
    }
    
}
