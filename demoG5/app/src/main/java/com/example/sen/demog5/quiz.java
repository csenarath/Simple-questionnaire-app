package com.example.sen.demog5;

import android.app.Instrumentation;
import android.content.Intent;
import android.support.annotation.IdRes;
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

                r1.setType("Time");
                r2.setType("Money");
                r3.setType("Relation");

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

    Question q1 = new Question("1.පෙරේදා හා අනිද්දා අතර ඇති දින ගණන කීයද?","Time","a.\t4","a.\t4","b.\t5","c.\t6");


    Question q2 = new Question("2.ඔරලෝසුවක පැය කටුව 12 සංඛ්\u200Dයාවේ සිට 3 සංඛ්\u200Dයාව දක්වා ගමන් කරන විට මිනිත්තු කටුව ගමන් කරන වාර ගණන කීයද?","Time","c.\t3","a.\t180","b.\t120","c.\t3");


    Question q3 = new Question("3.ඔරලෝසුවේ දක්වා ඇති වේලාවට පැයකට පසු වේලාව සම්මත වේලාවෙන් ලියන්න.","Time","a.\tපෙ.ව. 04.00","a.\tපෙ.ව. 04.00","b.\tප.ව. 12.00"," c.\tප.ව. 15.00" );



    Question q4 = new Question("4.රුපියල් 10.00ක් දී රුපියල් 7.50ක භාණ්ඩයක් මිලදී ගන්නා ලදී. ඉතිරි මුදල ලැබුනේ එකම වර්ගයේ කාසි පහකිනි. එම කාසිය කුමක්ද?","Money","a.\tශත 50","a.\tශත 50","b.\tරුපියල","c.\tශත 25");



    Question q5 = new Question("5.මගේ දකුණු පස වාඩිවී සිටින්නේ මගේ සීයාගේ ලොකු දුවය. මගේ වම්පස වාඩිවී සිටින්නේ මගේ පුංචි අම්මා ය. මගේ පුංචි අම්මා සීයාගේ කව්ද?","Relation","c.\tපොඩි දුව ","a.\tබිරිඳ","b.\tලොකු දුව","c.\tපොඩි දුව " );


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
