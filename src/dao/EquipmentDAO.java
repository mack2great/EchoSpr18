/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 * *
 *@author Keona.Rollerson
 */
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import core.Equipment;
import java.sql.PreparedStatement;

public class EquipmentDAO {
    private DBConnection conn;
    
    public EquipmentDAO(DBConnection conn) {
        this.conn = conn;
    }
    
    public List<Equipment> getallEquipment() throws Exception {
    List<Equipment> list = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from equipment");
            while (rs.next()) {
                Equipment fund = convertRowToEquipment(rs);
                list.add(fund);
            }
            return list;
        } finally {
            conn.close(stmt, rs);
        }
        
    }
    
    private Equipment convertRowToEquipment(ResultSet rs) throws Exception {
        String serialNum = rs.getString("serialNum");
        int ID = rs.getInt("ID");
        String _name = rs.getString("name");
        return new Equipment(serialNum,ID,_name);
    }
    
    public void addEquipment(Equipment equip) throws Exception{
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("insert into equipment values (?, ?, ?)");
            stmt.setString(1, equip.getSerialNum());
            stmt.setInt(2, equip.getID());
            stmt.setString(3,equip.getName());
            stmt.execute();
        } finally {
            conn.close(stmt, null);
        }
    }
     
    public void deleteEquipment(Equipment equip) throws Exception{
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement("delete from equipment where serial number = ?");
            stmt.setString(1,equip.getSerialNum());
            stmt.execute();
        }
        finally{
            conn.close(stmt, null);
        }
    }
    
    public void updateEquipment(Equipment equip) throws Exception{
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("update equipment set serialNum= ? where name = ?");
            stmt.setString(1, equip.getSerialNum());
            stmt.setInt(2, equip.getID());
            stmt.setString(3,equip.getName());
            stmt.execute();
        } finally {
            conn.close(stmt, null);
        }
    }
}
