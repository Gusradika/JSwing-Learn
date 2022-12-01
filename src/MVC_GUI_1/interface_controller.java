/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MVC_GUI_1;

import java.util.ArrayList;

/**
 *
 * @author aditn
 */
public interface interface_controller {
//    Berisi method/fungsi2 yang ada di controller
    
    void insert(String fullname, String sex, String competency, String department, String startdate);
    void update(int i, String fullname, String sex, String competency, String department, String startdate);
    void delete(int j);
    
//    3 method terkait arrayList
//    fungsi get Arraylist
    
    ArrayList<model> getArrayList(); 
    
    void setArrayList(ArrayList<model> listData);
    
    int getArrayListSize();
    
}
