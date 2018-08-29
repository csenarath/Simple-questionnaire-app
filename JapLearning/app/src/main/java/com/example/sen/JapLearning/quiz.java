package com.example.sen.JapLearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static android.graphics.Color.parseColor;


public class quiz extends AppCompatActivity {

        RadioGroup rg;
        RadioButton rbtn;
        TextView txtv;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //rg=(RadioGroup)findViewById(R.id.rdgrp_1);
        txtv=(TextView)findViewById(R.id.txtq_1);
        txtv.setText(q1.getQue());
        txtv=(TextView)findViewById(R.id.txtq_2);
        txtv.setText(q2.getQue());
        txtv=(TextView)findViewById(R.id.txtq_3);
        txtv.setText(q3.getQue());
        txtv=(TextView)findViewById(R.id.txtq_4);
        txtv.setText(q4.getQue());
        txtv=(TextView)findViewById(R.id.txtq_5);
        txtv.setText(q5.getQue());
        //q1
        rbtn=(RadioButton)findViewById(R.id.rdgrp_1_ans_1);
        rbtn.setText(q1.getAns1());
        rbtn=(RadioButton)findViewById(R.id.rdgrp_1_ans_2);
        rbtn.setText(q1.getAns2());
        rbtn=(RadioButton)findViewById(R.id.rdgrp_1_ans_3);
        rbtn.setText(q1.getAns3());

        //q2
        rbtn=(RadioButton)findViewById(R.id.rdgrp_2_ans_1);
        rbtn.setText(q2.getAns1());
        rbtn=(RadioButton)findViewById(R.id.rdgrp_2_ans_2);
        rbtn.setText(q2.getAns2());
        rbtn=(RadioButton)findViewById(R.id.rdgrp_2_ans_3);
        rbtn.setText(q2.getAns3());

        //q3
        rbtn=(RadioButton)findViewById(R.id.rdgrp_3_ans_1);
        rbtn.setText(q3.getAns1());
        rbtn=(RadioButton)findViewById(R.id.rdgrp_3_ans_2);
        rbtn.setText(q3.getAns2());
        rbtn=(RadioButton)findViewById(R.id.rdgrp_3_ans_3);
        rbtn.setText(q3.getAns3());

        //q4
        rbtn=(RadioButton)findViewById(R.id.rdgrp_4_ans_1);
        rbtn.setText(q4.getAns1());
        rbtn=(RadioButton)findViewById(R.id.rdgrp_4_ans_2);
        rbtn.setText(q4.getAns2());
        rbtn=(RadioButton)findViewById(R.id.rdgrp_4_ans_3);
        rbtn.setText(q4.getAns3());
        //q5
        rbtn=(RadioButton)findViewById(R.id.rdgrp_5_ans_1);
        rbtn.setText(q5.getAns1());
        rbtn=(RadioButton)findViewById(R.id.rdgrp_5_ans_2);
        rbtn.setText(q5.getAns2());
        rbtn=(RadioButton)findViewById(R.id.rdgrp_5_ans_3);
        rbtn.setText(q5.getAns3());


        Button btnResult = (Button)findViewById(R.id.btnResult);
        btnResult.setText("RESULTS");
            btnResult.setVisibility(View.INVISIBLE);
        ////////////////////

        Button btnSubmit = (Button)findViewById(R.id.btnSubmit);
        btnSubmit.setText("SUBMIT");
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Button btnResult = (Button)findViewById(R.id.btnResult);
                btnResult.setVisibility(View.VISIBLE);

                Button btnSubmit = (Button)findViewById(R.id.btnSubmit);
                btnSubmit.setVisibility(View.INVISIBLE);

                r1.setType("Grammar");
                r2.setType("Kanji");
                r3.setType("Katakana");

                int radioId;
                //check_q1
                r1.checked();
                rg=(RadioGroup)findViewById(R.id.rdgrp_1);

                //disable radiobtn

                for (int i = 0; i <rg.getChildCount(); i++) {
                    rg.getChildAt(i).setEnabled(false);
                }



                 radioId=rg.getCheckedRadioButtonId();
                if (radioId == 0||radioId==-1){
                    r1.notAnswerd();
                    txtv=(TextView)findViewById(R.id.txta_1);
                    txtv.setText("Correct Answer Is "+q1.getAns());

                }else{
                    rbtn=(RadioButton)findViewById(radioId);
                    if(q1.checkAns(rbtn)){
                        r1.correct();
                        rbtn.setTextColor(parseColor("#32CD32"));


                    }else{
                        r1.incorrect();
                        rbtn.setTextColor(parseColor("#FF0000"));

                        txtv=(TextView)findViewById(R.id.txta_1);
                        txtv.setText("Correct Answer Is "+q1.getAns());






                    }
                }

                //check_q2
                rg=(RadioGroup)findViewById(R.id.rdgrp_2);
                r1.checked();
                //disable radiobtn

                for (int i = 0; i <rg.getChildCount(); i++) {
                    rg.getChildAt(i).setEnabled(false);
                }

                radioId=rg.getCheckedRadioButtonId();
                if (radioId == 0||radioId==-1){
                    r1.notAnswerd();
                    txtv=(TextView)findViewById(R.id.txta_2);
                    txtv.setText("Correct Answer Is "+q2.getAns());

                }else{
                    rbtn=(RadioButton)findViewById(radioId);
                    if(q2.checkAns(rbtn)){
                        r1.correct();
                        rbtn.setTextColor(parseColor("#32CD32"));


                    }else{
                        r1.incorrect();
                        rbtn.setTextColor(parseColor("#FF0000"));
                        txtv=(TextView)findViewById(R.id.txta_2);
                        txtv.setText("Correct Answer Is "+q2.getAns());







                    }
                }

                //check_q3
                rg=(RadioGroup)findViewById(R.id.rdgrp_3);
                r1.checked();
                //disable radiobtn

                for (int i = 0; i <rg.getChildCount(); i++) {
                    rg.getChildAt(i).setEnabled(false);
                }

                radioId=rg.getCheckedRadioButtonId();
                if (radioId == 0||radioId==-1){
                    r1.notAnswerd();
                    txtv=(TextView)findViewById(R.id.txta_3);
                    txtv.setText("Correct Answer Is "+q3.getAns());

                }else{
                    rbtn=(RadioButton)findViewById(radioId);
                    if(q3.checkAns(rbtn)){
                        r1.correct();
                        rbtn.setTextColor(parseColor("#32CD32"));


                    }else{
                        r1.incorrect();
                        rbtn.setTextColor(parseColor("#FF0000"));
                        txtv=(TextView)findViewById(R.id.txta_3);
                        txtv.setText("Correct Answer Is "+q3.getAns());
                    }
                }

                //check_q4
                rg=(RadioGroup)findViewById(R.id.rdgrp_4);
                r2.checked();
                //disable radiobtn

                for (int i = 0; i <rg.getChildCount(); i++) {
                    rg.getChildAt(i).setEnabled(false);
                }


                radioId=rg.getCheckedRadioButtonId();
                if (radioId == 0||radioId==-1){
                    r2.notAnswerd();
                    txtv=(TextView)findViewById(R.id.txta_4);
                    txtv.setText("Correct Answer Is "+q4.getAns());

                }else{
                    rbtn=(RadioButton)findViewById(radioId);
                    if(q4.checkAns(rbtn)){
                        r2.correct();
                        rbtn.setTextColor(parseColor("#32CD32"));


                    }else{
                        r2.incorrect();
                        rbtn.setTextColor(parseColor("#FF0000"));
                        txtv=(TextView)findViewById(R.id.txta_4);
                        txtv.setText("Correct Answer Is "+q4.getAns());
                    }
                }
                //check_q5
                rg=(RadioGroup)findViewById(R.id.rdgrp_5);
                r3.checked();

                //disable radiobtn

                for (int i = 0; i <rg.getChildCount(); i++) {
                    rg.getChildAt(i).setEnabled(false);
                }



                 radioId=rg.getCheckedRadioButtonId();
                if (radioId == 0||radioId==-1){
                    r3.notAnswerd();
                    txtv=(TextView)findViewById(R.id.txta_5);
                    txtv.setText("Correct Answer Is "+q5.getAns());

                }else{
                    rbtn=(RadioButton)findViewById(radioId);
                    if(q5.checkAns(rbtn)){
                        r3.correct();
                        rbtn.setTextColor(parseColor("#32CD32"));


                    }else{
                        r3.incorrect();
                        rbtn.setTextColor(parseColor("#FF0000"));
                        txtv=(TextView)findViewById(R.id.txta_5);
                        txtv.setText("Correct Answer Is "+q5.getAns());
                    }
                }







            }

        });

            ///Button result

        btnResult.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                openActivityResult();
            }

                    });





    }



    Question q1 = new Question("ජපන් භාෂාව - අ.පො.ස. උසස් පෙල ආදර්ශ ප්\u200Dරශ්න පත්\u200Dරය - 日本語　－　A/レベル私見 - モデルペーパー" +
            "1.友達とけんかをして、今はなかが＿＿＿＿＿＿＿＿＿＿です。","Grammar","b.\tわるい","a.\tいい　","b.\tわるい","c.\tおもい");


    Question q2 = new Question("2.つなみにあった人のことを考えるとむねが＿＿＿＿＿＿＿＿なります。","Grammar","b.\tいたく","a.\tさむく　","b.\tいたく","c.\tかなしく");


    Question q3 = new Question("3.私はいま、日本を勉強していまます。","Kanji","a.\tべんきょ","a.\tべんきょ","b.\tれんしゅう"," c.\tたべる" );



    Question q4 = new Question("4.私たちは毎日学校へいきます。","Kanji","c.\tがっこ","a.\tびょういん","b.\tびじゅつかん","c.\tがっこ");



    Question q5 = new Question("5.＿＿＿＿＿＿＿＿はとてもたのしかったです。です。","Katakana","b.\tパーティー","a.\tスパート","b.\tパーティー","c.\tデパート " );


    ResultType r1 =new ResultType();
    ResultType r2=new ResultType();
    ResultType r3=new ResultType();



    public void openActivityResult(){
        Intent intent = new Intent(this,DisplayResult.class);
        intent.putExtra("r1",r1);
        intent.putExtra("r2",r2);
        intent.putExtra("r3",r3);

        startActivity(intent);


    }






}
