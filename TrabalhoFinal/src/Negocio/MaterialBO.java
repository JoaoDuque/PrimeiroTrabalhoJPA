/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.MaterialDAO;
import DomainModel.Material;

/**
 *
 * @author Iara
 */
public class MaterialBO {
    
    private MaterialDAO materialDAO = new MaterialDAO();
    
    public boolean Salvar(Material material){
        if(material.getDescricao().trim().length() == 0){
            throw new RuntimeException("O nome nao pode ser vazio!");
        }
        materialDAO.Salvar(material);
        return true;
    }
    public Material Abrir(int codigo){
        return materialDAO.Abrir(codigo);
    }
    public void Apagar(Material material){
        materialDAO.Apagar(material);
    }
    
}
