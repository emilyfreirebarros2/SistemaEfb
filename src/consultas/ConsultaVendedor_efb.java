/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

import controles.*;
import bean.VendedorEfb;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ConsultaVendedor_efb extends AbstractTableModel{


    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public VendedorEfb getVendedorEfb(int row) {
        return (VendedorEfb) lista.get(row);
    }

    @Override
    public int getRowCount() {
        if (lista == null) {
            return 0;
        } else {
            return lista.size();
        }
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendedorEfb vendedorEfb = (VendedorEfb) lista.get(rowIndex);
        if (columnIndex == 0) {
            return vendedorEfb.getIdvendedorEfb();
        }
        if (columnIndex == 1) {
            return vendedorEfb.getNomeEfb();
        }
        if (columnIndex == 2) {
            return vendedorEfb.getSobrenomeEfb();
        }
        if (columnIndex == 3) {
            return vendedorEfb.getEnderecoEfb();
        }
        if (columnIndex == 4) {
            return vendedorEfb.getAtivoEfb();
        }

        return "";
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nome";
            case 2:
                return "Sobrenome";
            case 3:
                return "Endereço";
            case 4:
                return "Ativo";
           
        }
        return "";
    }

 
    
}
