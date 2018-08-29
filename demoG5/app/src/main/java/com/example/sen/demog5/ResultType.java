package com.example.sen.demog5;
import java.io.Serializable;
/**
 * Created by SEN on 2/25/2018.
 */

public class ResultType implements Serializable {

    String type;
    int count=0;
    int correctconut=0;
    int incorrectcount=0;
    int notanswerdcount=0;
    double prs=0;


    public int getNotanswerd() {
        return notanswerdcount;
    }



    public int getCorrectconut() {
        return correctconut;
    }

    public int getCount() {
        return count;
    }

    public int getIncorrectcount() {
        return incorrectcount;
    }

    public String getType() {
        return type;
    }


    public void  checked(){
        count=count+1;
    }

    public  void  correct(){
        correctconut=correctconut+1;
    }
    public void incorrect(){
        incorrectcount=incorrectcount+1;
    }
    public void notAnswerd(){
        notanswerdcount = notanswerdcount+1;
    }

    public double getPrs(){

        prs=((double)correctconut/count)*100;

        return prs;
    }

    public void  setType(String type){
        this.type=type;

    }



}
