package Tienda;

public class Main {

    public static void main(String[] args) {

        Tienda tienda = new Tienda("" ,"huanuco");
        tienda.addCliente(new Cliente("Juan","Alvarez",71306521));
        tienda.addCliente(new Cliente("Pedro","Zeballos",71306522));
        tienda.addCliente(new Cliente("Luis","Trinidad",71306523));
        tienda.addCliente(new Cliente("Arnold","Aquino",71306524));

        System.out.println(tienda.getNombre() +" "+ tienda.getDireccion());
        for (Cliente cliente : tienda.getClientes()) {
            System.out.println(cliente.getNombre() +" "+ cliente.getApellidos() +" "+ cliente.getDni());
        }
    }
}