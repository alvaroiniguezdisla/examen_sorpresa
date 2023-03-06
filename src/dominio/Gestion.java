package dominio;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Gestion {
    public Gestion add(Cliente cliente, ArrayList<Cliente> clientes) {
       clientes.add(cliente);
       return this;

    }
    public static ArrayList listar(ArrayList<Cliente> clientes) {
       return Stream.iterate(0,i->i+1).limit(clientes.size()).map(i->clientes.get(i)).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
    public static Cliente consultar(String DNI, ArrayList<Cliente> clientes) {
        return Stream.iterate(0,i->i+1).limit(clientes.size()).map(i->clientes.get(i)).filter(c->c.getDNI().equals(DNI)).findFirst().orElse(null);
    }
    public static void modificarnombreapellido(String DNI,String nombre,String apellido,ArrayList<Cliente> clientes){
        Stream.iterate(0,i->i+1).limit(clientes.size()).map(i->clientes.get(i)).filter(i->i.getDNI().equals(DNI)).forEach(i->i.setNombre(nombre));
        Stream.iterate(0,i->i+1).limit(clientes.size()).map(i->clientes.get(i)).filter(i->i.getDNI().equals(DNI)).forEach(i->i.setApellido(apellido));
    }
    public static void eliminar(String DNI,ArrayList<Cliente> clientes){
        Stream.iterate(0,i->i+1).limit(clientes.size()).map(i->clientes.get(i)).filter(i->!i.getDNI().equals(DNI)).collect(Collectors.toCollection(ArrayList::new));
    }

}
