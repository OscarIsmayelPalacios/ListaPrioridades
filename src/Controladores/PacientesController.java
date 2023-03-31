
package Controladores;

import Modelo.PacientesModelo;
import Vistas.frmVistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PacientesController implements ActionListener {
    
    frmVistaPrincipal VistaPrincipal = new frmVistaPrincipal();
    PacientesModelo modeloPacientes = new PacientesModelo();
    

    public PacientesController(frmVistaPrincipal VistaPrincipal, PacientesModelo modeloPacientes) {
        this.VistaPrincipal = VistaPrincipal;
        this.modeloPacientes = modeloPacientes;
        
        this.VistaPrincipal.btnIngresar.addActionListener(this);
        this.VistaPrincipal.btnAtender.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmVistaPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.VistaPrincipal.btnIngresar)
        {
            if(this.VistaPrincipal.jtTablaPacientes.getColumnCount() == 0)
            {
                this.VistaPrincipal.jtTablaPacientes.setModel(this.modeloPacientes.ColumnaPacientes());
            }
            this.modeloPacientes.DesenlistarAntiguos();
            
            this.modeloPacientes.IngresarPacientes(this.VistaPrincipal.txtApellidos.getText(), 
                this.VistaPrincipal.txtNombres.getText(), 
                this.VistaPrincipal.txtTelefono.getText(), Integer.parseInt(this.VistaPrincipal.txtPrioridad.getText()));
            
            this.VistaPrincipal.jtTablaPacientes.setModel(this.modeloPacientes.ListarPacientes());
        }
        
        if(e.getSource() == this.VistaPrincipal.btnAtender)
        {
            this.modeloPacientes.DesEncolar();
            this.modeloPacientes.DesenlistarAntiguos();
            this.VistaPrincipal.jtTablaPacientes.setModel(this.modeloPacientes.ListarPacientes());
        }
        
    }
    
}
