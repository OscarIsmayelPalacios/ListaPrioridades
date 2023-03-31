
import Controladores.PacientesController;
import Modelo.PacientesModelo;
import Vistas.frmVistaPrincipal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author PALACIOS
 */
public class main {


    public static void main(String[] args) {
        
        frmVistaPrincipal VistaPrincipal = new frmVistaPrincipal();
        PacientesModelo modeloPacientes = new PacientesModelo();
        PacientesController controlador = new PacientesController(VistaPrincipal, modeloPacientes);
    }
    
}
