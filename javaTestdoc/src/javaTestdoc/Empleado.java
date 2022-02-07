package javaTestdoc;
/*
 * @author sara
 * @version 1.0
 * @see Persona
 */
public class Empleado extends Persona{
    /**
     * @param numeroEmpleado guardando un valor numerico
     * @param Departamento guardando un String del departamento
     * @param puesto guardando un String del puesto
     */
    private int numeroEmpleado;
    private String departamento;
    private String puesto;

public Empleado() {
}
/**
 * @param nombre
 * @param edad
 * @param numeroEmpleado
 * @param departamento
 * @param puesto
 */
public Empleado(String nombre, 
        int edad,
        char sexo,
        int numeroEmpleado,
        String departamento,
        String puesto) {
	
	
	super(nombre, edad, sexo);
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
        this.puesto = puesto;
   
        
}
/**
 * @retun NumeroEmpleado
 */
public int getNumeroEmpleado() {
    return numeroEmpleado;
}
/**
 *@param numeroEmpleado
 */
public void setNumeroEmpleado(int numeroEmpleado) {
    this.numeroEmpleado = numeroEmpleado;
}
/**
 * @return departamento
 */
public String getDepartamento() {
    return departamento;
}
/**
 * @param departamento
 */
public void setDepartamento(String departamento) {
    this.departamento = departamento;
}
/**
 * @return puesto
 */
public String getPuesto() {
    return puesto;
}
/**
 * @param puesto
 */
public void setPuesto(String puesto) {
    this.puesto = puesto;
}
}