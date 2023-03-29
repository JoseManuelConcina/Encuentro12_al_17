package proyectoh;

import java.util.ArrayList;
import newpackage.Empleado;

public class ProyectoH {

    public static void main(String[] args) {
        ArrayList<Empleado> listaDeEmpleados = new ArrayList<Empleado>();
        Empleado emp1 = new Empleado();
        Empleado emp2 = new Empleado();
        Empleado emp3 = new Empleado();
        emp1.calcular_aumento();
        emp2.calcular_aumento();
        emp3.calcular_aumento();

        listaDeEmpleados.add(emp1);
        listaDeEmpleados.add(emp2);
        listaDeEmpleados.add(emp3);
        System.out.println("Imprimiendo lista de empleados.");
        for (int i = 0; i < listaDeEmpleados.size(); i++) {
            System.out.println(listaDeEmpleados.get(i));
            
        }
    }

}
