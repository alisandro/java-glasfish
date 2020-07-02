/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.mg.domain;
import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
@NamedQuery(name ="Persona.econtrarTodasPersonas", query ="SELECT p FROM Persona p ORDER BYp.idPersona")
})
/**
 *
 * @author alisa se envia taraves de la rede asique de besmo poner eso ala lcase
 */
public class Persona implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id_persona")//nom real en la base datos
    
    private int idPersona;
    @Column(name ="name")
    private String nombre;
    //para oder crear obetos de sta clase
    public Persona(){
        
    }
    //para utilizar llave primaria
    public Persona(int idPersona){
        this.idPersona=idPersona;
        
    }
    //para recibir todo loa argumentos
    public Persona(int idPersona, String nombre){
        this.idPersona=idPersona;
        this.nombre=nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
}
