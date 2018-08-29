package com.example.sen.demog5;

import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by SEN on 2/24/2018.
 */

public class Question {
    String que;
    String ans;
    String type;
    String ans1;
    String ans2;
    String ans3;





    public Question(String que,String type,String ans,String ans1,String ans2, String ans3){
        this.que =que;
        this.type =type;
        this.ans =ans;
        this.ans1=ans1;
        this.ans2=ans2;
        this.ans3=ans3;
    }

    public boolean checkAns(RadioButton gave){

        if(gave.getText()==this.ans){
            return true;
        }else
            return false;

    }

    public String getType(){
        return this.type;
    }


    public String getQue() {
        return this.que;

    }

    public String getAns1() {
        return ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public String getAns() {
        return ans;
    }
}
