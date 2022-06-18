package Controlador;

import Modelo.ConsultasServicios;
import Modelo.Servicio;
import Vista.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlServicio implements ActionListener{
    
    private final Servicio mod;
    private final ConsultasServicios modc;
    private final Inicio frm;
    
    public CtrlServicio (Servicio mod, ConsultasServicios modc, Inicio frm)
    {
        this.mod = mod;
        this.modc = modc;
        this.frm = frm;
        this.frm.bntAServicio.addActionListener(this);
    }
    
    public void Iniciar()                       
    {
        frm.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == frm.bntAServicio){
            mod.setDescripcion(frm.txtServicio.getText());
            mod.setPrecio(Integer.parseInt(frm.txtPrecio.getText()));
            mod.setTiempo(frm.txtTiempo.getText());
            
            if(modc.Agregar(mod)){
                JOptionPane.showMessageDialog(null, "Servicio agregrado");
            } else {
                JOptionPane.showMessageDialog(null, "Erro al cargar el servicio");
            }
        }
    }
    
   
    
}
