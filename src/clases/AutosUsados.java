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
   private String telefono;
   private Autos auto;
   
   public AutosUsados (String codigo, String marca, String tipomarca, String modelo, int nodueños)
   {
      super(modelo, marca, nodueños, tipomarca);
      this.codigo = codigo;
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
    
   public void guardar(ObjectOutputStream salida) throws IOException{
        salida.writeObject(this);
    }
    
}
