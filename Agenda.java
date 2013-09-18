/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Vector;

/**
 *
 * @author alunos
 */
public class Agenda {
    
    private Vector listaContatos;
    
    public Agenda(){
        listaContatos = new Vector();     
    }
    
    public String adicionarContatos(Contato novoContato){
        listaContatos.add(novoContato);
        return "Contato adicionado com sucesso!";
    
    }
}
