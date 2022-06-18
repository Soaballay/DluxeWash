package dluxewash;

import Controlador.CtrlServicio;
import Modelo.ConsultasServicios;
import Modelo.Servicio;
import Vista.Inicio;

public class DluxeWash {
    public static void main(String[] args) {

        Servicio mod = new Servicio();
        ConsultasServicios modc = new ConsultasServicios();
        Inicio frm = new Inicio();
        
        CtrlServicio ctrl = new CtrlServicio (mod, modc, frm);
        ctrl.Iniciar();
        frm.setVisible(true);
    }
}
