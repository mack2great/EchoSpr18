package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import core.Fixes;
import java.sql.PreparedStatement;

/**
 *
 * @author Clorissa
 */
public class FixesDAO {
    private DBConnection conn;
    
    public FixesDAO(DBConnection conn) {
        this.conn = conn;
    }


    public List<Fixes> getAllFixes() throws Exception {
        List<Fixes> list = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from fixes");
            while (rs.next()) {
                Fixes fix = convertRowToFixes(rs);
                list.add(fix);
            }
            return list;
        } finally {
            conn.close(stmt, rs);
        }
    }
    
    private Fixes convertRowToFixes(ResultSet rs) throws Exception {
        int EID = rs.getInt("EID");
        int RID = rs.getInt ("RID");
        return new Fixes(EID,RID);
    }
    
    public void addFixes(Fixes fix) throws Exception {
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("insert into fixes values (?,?)");
            stmt.setInt(1, fix.getEID());
            stmt.setInt(2, fix.getRID());
            stmt.execute();
            } finally {
            conn.close(stmt, null);
            }
    }
    
    public void deleteFixes(Fixes fix ) throws Exception {
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("delete from fixes where EID = ?");
            stmt.setInt(1, fix.getEID());
            stmt.execute();
        } finally {
            conn.close(stmt, null);
        }
    }
    
    public void updateFixes (Fixes fix) throws Exception {
        PreparedStatement stmt = null;
        String sql = "update fixes "
                + "set name = ?,"
                + "where EID = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, fix.getEID());
            stmt.setInt(2, fix.getRID());
            stmt.execute();
        } finally {
            conn.close(stmt, null);
        }
    }
    
    // Added by Jesse Houk
    public List getAllEIDs() throws Exception {
        Statement stmt1 = null;
        ResultSet rs1 = null;
        String eid;
        List EIDs = new ArrayList<>();
        stmt1 = conn.createStatement();
        rs1 = stmt1.executeQuery("select EID from fixes");
        while(rs1.next()) {
            eid = rs1.getString("EID");
            EIDs.add(eid);
        }
        return EIDs;
    }
}