package Tienda;
public class Tienda {

    public String nombre;

    public String direccion;

    public Cliente[] clientes;

    public int index = 0;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Cliente[] getClientes() {
        return clientes;
    }
    public void addCliente(Cliente cliente) {
        this.clientes[this.index++ ]= cliente;
    }
    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.clientes = new Cliente[4];
    }
}