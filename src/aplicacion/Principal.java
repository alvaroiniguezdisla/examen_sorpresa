package aplicacion;
import dominio.*;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        ArrayList <Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("12345678A","Pepe","Perez"));
        clientes.add(new Cliente("05458720C","Alejandro","Lillo"));
        clientes.add(new Cliente("46567786S","Daniel","Lillo"));
        clientes.add(new Cliente("87654321B","Juan","Garcia"));
        System.out.println(Gestion.listar(clientes));
        System.out.println(Gestion.consultar("46567786S",clientes));
        Gestion.modificarnombreapellido("46567786S","Daniel","Lillo",clientes);
        System.out.println(Gestion.listar(clientes));
        Gestion.eliminar("46567786S",clientes);
        System.out.println(Gestion.listar(clientes));




    }
}
