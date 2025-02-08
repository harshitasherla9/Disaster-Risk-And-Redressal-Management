/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
/**
 *
 * @author harsh
 */
public class Tables {
    public static void main(String args[]){
    try{
        String complaintTable = "create table complaint(cid varchar(100) primary key,name varchar(200),phoneNumber varchar(100),state varchar(200),place_incident varchar(200),disaster varchar(200),pictureproof blob,date_inc date";
        DbOperations.setDataorDelete(complaintTable, "Complaint Table created successfully");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
    }
}
