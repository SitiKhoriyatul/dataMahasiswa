/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuration;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Barang;

/**
 *
 * @author nana
 */
public class BarangTableModel extends AbstractTableModel {
    private List<Barang> barangs = new ArrayList<>();
    private final String HEADER[] = {"ID Barang", "Nama Barang",
    "Jenis Barang", "Tanggal Kadaluarsa"};

    public BarangTableModel(List<Barang> barangs) {
        this.barangs = barangs;
    }

    @Override
    public int getRowCount() {
        return barangs.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return HEADER[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    Barang barang = barangs.get(rowIndex);

    switch (columnIndex) {
        case 0:
            return barang.getIdBarang();
        case 1:
            return barang.getNamaBarang();
        case 2:
            return barang.getJenisBarang();
        case 3:
            return barang.getTanggalKadaluarsa();
        default:
            return null;
    }
 }
}