/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_GUI_1;

import java.util.ArrayList;

/**
 *
 * @author aditn
 */
public class controller implements interface_controller{
    
//    Deklarasi Arraylist
    ArrayList<model> listData = new ArrayList<>();
    
    //    Object model / instance of model
    model m = new model();
    
    //constructor kosong dan konstruktor berparameter arraylist

    public controller() {
    }
    
    public controller(ArrayList<model> listData) {
        this.listData = listData;
    }

    @Override
    public void insert(String fullname, String sex, String competency, String department, String startdate) {
        // simpan sementara ke constructor
        m = new model(fullname, sex, competency, department, startdate);
        // simpan ke array list
        listData.add(m);
        }

    @Override
    public void update(int i, String fullname, String sex, String competency, String department, String startdate) {
        m = new model(fullname, sex, competency, department, startdate);
        listData.get(i).setFullname(m.getFullname());
        listData.get(i).setCompetency(m.getCompetency());
        listData.get(i).setDepartment(m.getDepartment());
        listData.get(i).setSex(m.getSex());
        listData.get(i).setStartdate(m.getStartdate());
     }

    @Override
    public void delete(int j) {
        listData.remove(j);
   }

    @Override
    public ArrayList<model> getArrayList() {
        return listData;
    }

    @Override
    public void setArrayList(ArrayList<model> listData) {
 }

    @Override
    public int getArrayListSize() {
        return listData.size();
   }
//    Insert Update Delete --> ArrayList(N Dimensi)
    
    
}
