package com.orbitsoft.teamorbitsoft.Saeidian;

//public class thesheox {
//
//    private String name;
//    private String family;
//    private float weight;
//    private float height;
//    private int number;
//    private float avg;
//    private float bmi;
//    private float s1 = 10;
//    private float s2 = 20;
//    private float s3 = 17;
//    private float s4 = 19;
//    private float s5 = 16;
//    private float s6 = 18;
//    private float s7 = 15;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;

//
//    public thesheox(String name, String family, float weight, float height, int number, float avg, float bmi, float s1, float s2, float s3, float s4, float s5, float s6, float s7) {
//        this.name = name;
//        this.family = family;
//        this.weight = weight;
//        this.height = height;
//        this.number = number;
//        this.avg = avg;
//        this.bmi = bmi;
//        this.s1 = s1;
//        this.s2 = s2;
//        this.s3 = s3;
//        this.s4 = s4;
//        this.s5 = s5;
//        this.s6 = s6;
//        this.s7 = s7;
//    }
//
//    public thesheox() {
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getFamily() {
//        return family;
//    }
//
//    public void setFamily(String family) {
//        this.family = family;
//    }
//
//    public float getWeight() {
//        return weight;
//    }
//
//    public void setWeight(float weight) {
//        this.weight = weight;
//    }
//
//    public float getHeight() {
//        return height;
//    }
//
//    public void setHeight(float height) {
//        this.height = height;
//    }
//
//    public float getBmi() {
//        return bmi;
//    }
//
//    public void setBmi(float bmi) {
//        this.bmi = bmi;
//    }
//
//    public int getNumber() {
//        return number;
//    }
//
//    public void setNumber(int number) {
//        this.number = number;
//    }
//
//    public float getAvg() {
//        return avg;
//    }
//
//    public void setAvg(float avg) {
//        this.avg = avg;
//    }
//
//    public float getS1() {
//        return s1;
//    }
//
//    public void setS1(float s1) {
//        this.s1 = s1;
//    }
//
//    public float getS2() {
//        return s2;
//    }
//
//    public void setS2(float s2) {
//        this.s2 = s2;
//    }
//
//    public float getS3() {
//        return s3;
//    }
//
//    public void setS3(float s3) {
//        this.s3 = s3;
//    }
//
//    public float getS4() {
//        return s4;
//    }
//
//    public void setS4(float s4) {
//        this.s4 = s4;
//    }
//
//    public float getS5() {
//        return s5;
//    }
//
//    public void setS5(float s5) {
//        this.s5 = s5;
//    }
//
//    public float getS6() {
//        return s6;
//    }
//
//    public void setS6(float s6) {
//        this.s6 = s6;
//    }
//
//    public float getS7() {
//        return s7;
//    }
//
//    public void setS7(float s7) {
//        this.s7 = s7;
//    }
public class thesheox extends AppCompatActivity {
    //    EditText namein;
    TextView print;
    TextView print2;
//    EditText familyin;
//    Button print;
//    String name;
//    String family;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thesheox);
        Bundle bundle = getIntent().getExtras();
        print= findViewById(R.id.print);
        print2= findViewById(R.id.print2);
        if (bundle != null) {
            String Name = bundle.getString("test", "nothing");
            String Family= bundle.getString("test2", "nothing");
            // Long number = bundle.getLong("test2", 12);
            print.setText("Name : " + Name);
            print2.setText("Family: " + Family);
            //Toast.makeText(saeidian2.this, "Name/Family : "+Name, Toast.LENGTH_LONG).show();

//+Long.toString(number)
        }

    }
}