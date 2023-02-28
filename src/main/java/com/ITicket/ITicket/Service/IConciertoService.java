/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.ITicket.Service;

import com.ITicket.ITicket.Entity.Concierto;
import java.util.List;

/**
 *
 * @author tannyagranados
 */
public interface IConciertoService {
    
    public List<Concierto> listar();
    public Concierto getConciertoById(int id);
    public int save(Concierto concierto);
    public void delete(int id);
    
    
    
}
