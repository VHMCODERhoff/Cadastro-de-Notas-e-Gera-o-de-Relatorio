package registerpanel.Constructors;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vsk
 */
public  class Management {
 
    private String name;
    private String year;
    private String np1;
    private String np2;
    private String sub;
    private String exam;
    public ArrayList Name;
    public ArrayList Year;
    public ArrayList Np1;
    public ArrayList Np2;
    public ArrayList Sub;
    public ArrayList Exam;

    public ArrayList getName() {
        return Name;
    }

    public void setName(ArrayList Name) {
        this.Name = Name;
    }

    public ArrayList getYear() {
        return Year;
    }

    public void setYear(ArrayList Year) {
        this.Year = Year;
    }

    public ArrayList getNp1() {
        return Np1;
    }

    public void setNp1(ArrayList Np1) {
        this.Np1 = Np1;
    }

    public ArrayList getNp2() {
        return Np2;
    }

    public void setNp2(ArrayList Np2) {
        this.Np2 = Np2;
    }

    public ArrayList getSub() {
        return Sub;
    }

    public void setSub(ArrayList Sub) {
        this.Sub = Sub;
    }

    public ArrayList getExam() {
        return Exam;
    }

    public void setExam(ArrayList Exam) {
        this.Exam = Exam;
    }

    public Management(ArrayList Name, ArrayList Year, ArrayList Np1, ArrayList Np2, ArrayList Sub, ArrayList Exam) {
        this.Name = Name;
        this.Year = Year;
        this.Np1 = Np1;
        this.Np2 = Np2;
        this.Sub = Sub;
        this.Exam = Exam;
    }
   
    

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setNp1(String np1) {
        this.np1 = np1;
    }

    public void setNp2(String np2) {
        this.np2 = np2;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }
    
    
    public Management(String name_,String year_,String np1_,String np2_,String exam_,String sub_){
        this.name = name_;
        this.year = year_;
        this.np1 = np1_;
        this.np2 = np2_;
        this.exam = exam_;
        this.sub = sub_;
    }
    

    public Management(){}
    
    public String returnMatter(){
        return this.name;
    }
    
    
    public String returnYear(){
        return this.year;
    }
    
    public String returnNp1(){
        return this.np1;
    }
    
    public String returnNp2(){
        return this.np2;
    }
    
    public String returnSub(){
        return this.sub;
    }
    
    public String returnExam(){
        return this.exam;
    }
    
    public String returnStatus(){
        float note[] = {Float.parseFloat(this.np1),Float.parseFloat(this.np2) ,Float.parseFloat(this.sub) };
        Arrays.sort(note);
        if (note[1] + note[2]/2 >= 7){
            return "Aprovado";
        }else if(note[2]+Float.parseFloat(this.exam)/2 >= 7){
            return "Aprovado por Exame";
        }else{
            return "Reprovado";
        }
    }
    

}
