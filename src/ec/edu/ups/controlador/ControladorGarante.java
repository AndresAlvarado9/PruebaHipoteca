/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Garante;

/**
 *
 * @author Andres
 */
public class ControladorGarante extends AbstractControlador<Garante>{

    @Override
    public boolean validar(Garante objeto) throws Exception {
       return true;
    }
    
}
