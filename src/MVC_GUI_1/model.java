/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_GUI_1;

/**
 *
 * @author aditn
 */
public class model {
//    Berisi atrbutm cibst
    // setter = update data, getter = select data
    
    public String fullname, sex, competency, department, startdate;


    
    public model() {
    }

    public model(String fullname, String sex, String competency, String department, String startdate) {
        this.fullname = fullname;
        this.sex = sex;
        this.competency = competency;
        this.department = department;
        this.startdate = startdate;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCompetency() {
        return competency;
    }

    public void setCompetency(String competency) {
        this.competency = competency;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }
    
    
    
}
