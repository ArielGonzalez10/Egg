/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidad.Electrodomestico;
import java.util.ArrayList;

/**
 *
 * @author Ariel
 */
public interface gastoTotal {

    public abstract float calculoImporteTotal(ArrayList<Electrodomestico> elec);
}
