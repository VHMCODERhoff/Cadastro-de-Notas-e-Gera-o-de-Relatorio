/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insert;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import registerpanel.Constructors.Management;
import registerpanel.registerpanel;

/**
 *
 * @author vitur
 */
public class methods extends Management{
    
    public  methods(ArrayList Name,ArrayList Year,ArrayList Np1,ArrayList Np2,ArrayList Exam,ArrayList Sub){
     super(Name,Year,Np1,Np2,Exam,Sub);
    }
    
    public static void Cadaster(String name,String year,String np1,String np2,String exam,String sub){
     Management man = new Management();
     man.setName(name);
     man.setYear(year);
     man.setNp1(np1);
     man.setNp2(np2);
     man.setExam(exam);
     man.setSub(sub);
     registerpanel.managementList.add(man);
     JOptionPane.showMessageDialog(null,"Cadastrado Com Sucesso", "Sucesso", 1);
    }
    
    public static void show(JTable tbl_report, ArrayList<Management>managementList){
      DefaultTableModel model = (DefaultTableModel) tbl_report.getModel();
      model.setRowCount(managementList.size());
      tbl_report.setModel(model);
      
      int line = 0;
      for(Management a: managementList){
       tbl_report.setValueAt(a.getName(), line, 0);
       tbl_report.setValueAt(a.getYear(), line, 1);
       tbl_report.setValueAt(a.getNp1(), line, 2);
       tbl_report.setValueAt(a.getNp2(), line, 3);
       tbl_report.setValueAt(a.getSub(), line, 4);
       tbl_report.setValueAt(a.getExam(), line, 5);
       line++;
      }
    }
   
    public void Relatorio(String name_, String year_, String np1_, String np2_, String exam_, String sub_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    public String Search(String name,String year,String np1,String np2,String exam,String sub) {
        String search="";
        if(super.Name.contains(name)==true && super.Year.contains(year)==true && super.Np1.contains(np1)==true && super.Np2.contains(np2)==true && super.Exam.contains(exam)==true && super.Sub.contains(sub)==true){
         search=super.Name.get(super.Name.indexOf(name)).toString();
         search=super.Year.get(super.Year.indexOf(year)).toString();
         search=super.Np1.get(super.Np1.indexOf(np1)).toString();
         search=super.Np2.get(super.Np2.indexOf(np2)).toString();
         search=super.Exam.get(super.Exam.indexOf(exam)).toString();
         search=super.Sub.get(super.Sub.indexOf(sub)).toString();
        }
        else{
         search="Não Existe Nenhuma Materia Com Esse Nome";
        }
        return search;
    }
    
}
