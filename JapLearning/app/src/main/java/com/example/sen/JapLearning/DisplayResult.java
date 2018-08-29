package com.example.sen.JapLearning;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class DisplayResult extends AppCompatActivity {
     TextView col_1,col_2,col_3,col_4,col_5,col_6,col_7;
    TableLayout tl;
    TableRow tR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);

        Intent data=getIntent();
        ResultType r1=(ResultType)data.getSerializableExtra("r1");
        ResultType r2=(ResultType)data.getSerializableExtra("r2");
        ResultType r3=(ResultType)data.getSerializableExtra("r3");


        init(r1,r2,r3);
        /*
        tl=(TableLayout)findViewById(R.id.tl1);
        tl.setColumnStretchable(0,true);
        tl.setColumnStretchable(1,true);
        tl.setColumnStretchable(2,true);
        tl.setColumnStretchable(3,true);
        tl.setColumnStretchable(4,true);
        tl.setColumnStretchable(5,true);
        tl.setColumnStretchable(6,true);


        tR= new TableRow(this);
        tR.setLayoutParams(new TableLayout.LayoutParams(
                TableLayout.LayoutParams.FILL_PARENT,
                TableLayout.LayoutParams.WRAP_CONTENT));

        col_1=new TextView(this);
        col_2=new TextView(this);
        col_3=new TextView(this);
        col_4=new TextView(this);
        col_5=new TextView(this);
        col_6=new TextView(this);
        col_7=new TextView(this);

        col_1.setText("1");
        col_1.setGravity(View.TEXT_ALIGNMENT_CENTER);
        col_1.setBackground(getResources().getDrawable(R.drawable.tblborder));


        col_2.setText("1");
        col_2.setGravity(View.TEXT_ALIGNMENT_CENTER);
        col_2.setBackground(getResources().getDrawable(R.drawable.tblborder));

        col_3.setText("1");
        col_3.setGravity(View.TEXT_ALIGNMENT_CENTER);
        col_3.setBackground(getResources().getDrawable(R.drawable.tblborder));

        col_4.setText("1");
        col_4.setGravity(View.TEXT_ALIGNMENT_CENTER);
        col_4.setBackground(getResources().getDrawable(R.drawable.tblborder));

        col_5.setText("1");
        col_5.setGravity(View.TEXT_ALIGNMENT_CENTER);
        col_5.setBackground(getResources().getDrawable(R.drawable.tblborder));


        col_6.setText("1");
        col_6.setGravity(View.TEXT_ALIGNMENT_CENTER);
        col_6.setBackground(getResources().getDrawable(R.drawable.tblborder));

        col_7.setText("1");
        col_7.setGravity(View.TEXT_ALIGNMENT_CENTER);
        col_7.setBackground(getResources().getDrawable(R.drawable.tblborder));

        tR.addView(col_1);
        tR.addView(col_2);
        tR.addView(col_3);
        tR.addView(col_4);
        tR.addView(col_5);
        tR.addView(col_6);
        tR.addView(col_7);
        tl.addView(tR);
        */

    }


    public void init(ResultType r1,ResultType r2,ResultType r3) {


        ResultType[] resultArry =new ResultType[3];
        resultArry[0]=r1;
        resultArry[1]=r2;
        resultArry[2]=r3;





        TableLayout stk = (TableLayout) findViewById(R.id.table_main);
        TableRow tbrow0 = new TableRow(this);








        TextView tv1 = new TextView(this);
        tv1.setText(" පාඩම් අංකය ");
        tv1.setTextColor(Color.WHITE);

        tbrow0.addView(tv1);

        TextView tv2 = new TextView(this);
        tv2.setText(" පාඩමේ නම   ");
        tv2.setTextColor(Color.WHITE);
        tbrow0.addView(tv2);

        TextView tv3 = new TextView(this);
        tv3.setText(" ප්\u200Dරශ්න ප්\u200Dරමාණය    ");
        tv3.setTextColor(Color.WHITE);
        tbrow0.addView(tv3);

        TextView tv4 = new TextView(this);
        tv4.setText("නිවැරදි පිළිතුරු");
        tv4.setTextColor(Color.WHITE);
        tbrow0.addView(tv4);

        TextView tv5 = new TextView(this);
        tv5.setText(" වැරදි පිළිතුරු ");
        tv5.setTextColor(Color.WHITE);
        tbrow0.addView(tv5);

        /**TextView tv6 = new TextView(this);
        tv6.setText("ප්\u200Dරතිශතය ");
        tv6.setTextColor(Color.WHITE);
        tbrow0.addView(tv6);*/





        stk.addView(tbrow0);
        int totalCorrect=0;
        int totalCount=0;
        double totalpre=0;
        int totalIncorect=0;
        int totalNotAnswerd=0;


        for (int i = 0; i < 3; i++) {

            totalCount=totalCount+resultArry[i].getCount();
            totalCorrect=totalCorrect+resultArry[i].getCorrectconut();
            totalIncorect=totalIncorect+resultArry[i].getIncorrectcount();
            totalNotAnswerd=totalNotAnswerd+resultArry[i].getNotanswerd();


            TableRow tbrow = new TableRow(this);
           TextView t1v = new TextView(this);
            t1v.setText("" + (i+1));
            t1v.setTextColor(Color.WHITE);
            t1v.setGravity(Gravity.CENTER);
            tbrow.addView(t1v);

            TextView t2v = new TextView(this);
           t2v.setText(resultArry[i].getType());
            t2v.setTextColor(Color.WHITE);
            t2v.setGravity(Gravity.CENTER);
            tbrow.addView(t2v);

            TextView t3v = new TextView(this);
            t3v.setText(""+resultArry[i].getCount());
            t3v.setTextColor(Color.WHITE);
            t3v.setGravity(Gravity.CENTER);
            tbrow.addView(t3v);

            TextView t4v = new TextView(this);
            t4v.setText(""+resultArry[i].getCorrectconut());
            t4v.setTextColor(Color.WHITE);
            t4v.setGravity(Gravity.CENTER);
            tbrow.addView(t4v);


            TextView t5v = new TextView(this);
            t5v.setText(""+resultArry[i].getIncorrectcount());
            t5v.setTextColor(Color.WHITE);
            t5v.setGravity(Gravity.CENTER);
            tbrow.addView(t5v);

            TextView t6v = new TextView(this);
            t6v.setText(""+resultArry[i].getNotanswerd());
            t6v.setTextColor(Color.WHITE);
            t6v.setGravity(Gravity.CENTER);
            tbrow.addView(t6v);

            TextView t7v = new TextView(this);
            t7v.setText(""+ String.format("%.2f", resultArry[i].getPrs())+"%");
            t7v.setTextColor(Color.WHITE);
            t7v.setGravity(Gravity.CENTER);
            tbrow.addView(t7v);

            stk.addView(tbrow);
        }

        totalpre=((double) totalCorrect/totalCount)*100;


        TableRow tbrow = new TableRow(this);
        TextView t1v = new TextView(this);
        t1v.setText("");
        t1v.setTextColor(Color.WHITE);
        t1v.setGravity(Gravity.CENTER);
        tbrow.addView(t1v);

        TextView t2v = new TextView(this);
        t2v.setText("TOTAL");
        t2v.setTextColor(Color.WHITE);
        t2v.setGravity(Gravity.CENTER);
        tbrow.addView(t2v);

        TextView t3v = new TextView(this);
        t3v.setText(""+totalCount);
        t3v.setTextColor(Color.WHITE);
        t3v.setGravity(Gravity.CENTER);
        tbrow.addView(t3v);

        TextView t4v = new TextView(this);
        t4v.setText(""+totalCorrect);
        t4v.setTextColor(Color.WHITE);
        t4v.setGravity(Gravity.CENTER);
        tbrow.addView(t4v);


        TextView t5v = new TextView(this);
        t5v.setText(""+totalIncorect);
        t5v.setTextColor(Color.WHITE);
        t5v.setGravity(Gravity.CENTER);
        tbrow.addView(t5v);

        TextView t6v = new TextView(this);
        t6v.setText(""+totalNotAnswerd);
        t6v.setTextColor(Color.WHITE);
        t6v.setGravity(Gravity.CENTER);
        tbrow.addView(t6v);

        TextView t7v = new TextView(this);
        t7v.setText(""+String.format("%.2f",totalpre)+"%");
        t7v.setTextColor(Color.WHITE);
        t7v.setGravity(Gravity.CENTER);
        tbrow.addView(t7v);

        stk.addView(tbrow);





    }
}
