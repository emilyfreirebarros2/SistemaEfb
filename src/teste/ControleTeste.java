/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import bean.ClienteEfb;
import dao.ClienteDao_efb;
import java.util.ArrayList;

/**
 *
 * @author "Autor"
 */
public class ControleTeste extends AbstractTableModel {

    List lista;

    public ControleTeste() {
        lista = new ArrayList();
        this.fireTableDataChanged();
    }

    public void setValor(List clienteEfb) {
        lista.addAll(clienteEfb);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ClienteEfb clienteEfb = new ClienteEfb();
        clienteEfb = (ClienteEfb) lista.get(rowIndex);
        if (columnIndex == 0) {
            return clienteEfb.getNomeEfb();
        }
        if (columnIndex == 1) {
            return clienteEfb.getTelefoneEfb();
        }
        if (columnIndex == 2) {
            return clienteEfb.getEnderecoEfb();
        }
        if (columnIndex == 3) {
            return clienteEfb.getEstadoEfb();
        } else {
            return "";
        }
    }

    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Nome";
        }
        if (columnIndex == 1) {
            return "Telefone";
        }
        if (columnIndex == 2) {
            return "Enereço";
        }
        if (columnIndex == 3) {
            return "Estado";
        }

        return "";
    }
}
