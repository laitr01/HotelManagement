/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectinterface;

import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public interface DAOConnection {
    
    public ResultSet getData();
    public void insert();
    public void update();
    public void delete();
    
}
