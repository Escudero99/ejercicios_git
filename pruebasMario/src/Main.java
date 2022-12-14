import Clases.Sorteo;
import Clases.UsuarioApp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Participantes
        UsuarioApp pepe = new UsuarioApp("Pepe");
        UsuarioApp paco = new UsuarioApp("Paco");
        UsuarioApp pipi = new UsuarioApp("Pipi");
        UsuarioApp papa = new UsuarioApp("Papa");
        UsuarioApp pipo = new UsuarioApp("Pipo");
        List<UsuarioApp> participantes = new ArrayList<UsuarioApp>();
        participantes.add(pepe);
        participantes.add(paco);
        participantes.add(pipi);
        participantes.add(papa);
        participantes.add(pipo);
        Sorteo sorteo = new Sorteo(participantes,2);
        sorteo.paripe();
    }
}