/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author pared
 */
public class AutosUsados extends Autos
{
   private String codigo;
   private String nodueños;
   private String telefono;
   private Autos auto;
   
   public AutosUsados (String codigo, String marca, String tipomarca, String modelo, String nodueños)
   {
      super(modelo, marca, tipomarca);
      this.codigo = codigo;
      this.nodueños = nodueños;
   }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Autos getAuto() {
        return auto;
    }

    public void setAuto(Autos auto) {
        this.auto = auto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNodueños() {
        return nodueños;
    }

    public void setNodueños(String nodueños) {
        this.nodueños = nodueños;
    }
   
   public void guardar(ObjectOutputStream salida) throws IOException{
        salida.writeObject(this);
    }
    
}
