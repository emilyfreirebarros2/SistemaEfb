/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

import controles.*;
import bean.ClienteEfb;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ConsultaCliente_efb extends AbstractTableModel{


    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public ClienteEfb getCliente(int row) {
        return (ClienteEfb) lista.get(row);
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
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ClienteEfb cliente = (ClienteEfb) lista.get(rowIndex);
        if (columnIndex == 0) {
            return cliente.getIdclienteEfb();
        }
        if (columnIndex == 1) {
            return cliente.getNomeEfb();
        }
        if (columnIndex == 2) {
            return cliente.getCidadeEfb();
        }
        if (columnIndex == 3) {
            return cliente.getEstadoEfb();
        }
        if (columnIndex == 4) {
            return cliente.getSexoEfb();
        }
        if (columnIndex == 5) {
            return cliente.getTelefoneEfb();
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
                return "Cidade";
            case 3:
                return "Estado";
            case 4:
                return "Sexo";
            case 5:
                return "Telefone";
        }
        return "";
    }

 
    
}
