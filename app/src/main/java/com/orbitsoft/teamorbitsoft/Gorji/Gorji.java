package com.orbitsoft.teamorbitsoft.Gorji;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.example.MyDialog;

public class Gorji extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
private Button insta,myInfo,metaco,exit,login,fact;
private CheckBox loginCheckBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorji);
        entry();

        Toast.makeText(getApplicationContext(), "دکمه  صفحه لاگین مخفی است", Toast.LENGTH_LONG).show();

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_gorji_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.exit_menu) {
            Toast.makeText(getApplicationContext(), "صفحه خروج اجباری :)", Toast.LENGTH_LONG).show();
            Intent init = new Intent(getApplicationContext(), GorjiCustomDialog.class);
            startActivity(init);
        }
        if(item.getItemId()==R.id.metaco_menu){
            Toast.makeText(getApplicationContext(),"سایت متاکو",Toast.LENGTH_LONG).show();
            Intent init1 = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("https://tr.metacomplex.com/");
            init1.setData(uri);
            startActivity(init1);
        }
        if(item.getItemId()==R.id.instagram_menu){
            Toast.makeText(getApplicationContext(),"به صفحه اینستا گرام عباس گرجی خوش آمدید",Toast.LENGTH_LONG).show();
            Uri uri = Uri.parse("https://instagram.com/abbas1gorji");
            Intent init = new Intent(Intent.ACTION_VIEW,uri);
            init.setPackage("com.instagram.android");

            startActivity(init);
        }
        if (item.getItemId()==R.id.info_menu){
            Toast.makeText(getApplicationContext(),"صفحه درباره",Toast.LENGTH_LONG).show();
            Intent init = new Intent(Gorji.this, GorjiMyDialogActivity.class);
            startActivity(init);
        }
        if(item.getItemId()==R.id.login_menu);{
            Toast.makeText(getApplicationContext(),"دکمه صفحه لاگین اضافه شد",Toast.LENGTH_LONG).show();
        login.setVisibility(View.VISIBLE);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==insta.getId()){
            Toast.makeText(getApplicationContext(),"به صفحه اینستا گرام عباس گرجی خوش آمدید",Toast.LENGTH_LONG).show();
            Uri uri = Uri.parse("https://instagram.com/abbas1gorji");
            Intent init = new Intent(Intent.ACTION_VIEW,uri);
            init.setPackage("com.instagram.android");

        startActivity(init);
        }
        if(v.getId()==myInfo.getId()){
            Toast.makeText(getApplicationContext(),"صفحه درباره",Toast.LENGTH_LONG).show();

            Intent init = new Intent(Gorji.this, GorjiMyDialogActivity.class);
        startActivity(init);
        }
        if(v.getId()==metaco.getId()){
            Toast.makeText(getApplicationContext(),"سایت متاکو",Toast.LENGTH_LONG).show();
            Intent init1 = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("https://tr.metacomplex.com/");
            init1.setData(uri);
            startActivity(init1);

        }
        if(v.getId() == fact.getId()){
        int x = fact1(5);
        Toast.makeText(getApplicationContext(),String.valueOf(x),Toast.LENGTH_LONG).show();
        }
        if(v.getId()==exit.getId()){
            Toast.makeText(getApplicationContext(),"صفحه خروج اجباری :)",Toast.LENGTH_LONG).show();

            Intent init = new Intent(getApplicationContext(),GorjiCustomDialog.class);
            startActivity(init);
        }
        if(v.getId() == login.getId()){
                Intent initLogin = new Intent(getApplicationContext(),GorjiPhoneNumberActivity.class);
                startActivity(initLogin);


        }

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (loginCheckBox.isChecked()) {
            login.setVisibility(View.VISIBLE);
            login.setEnabled(b);
        }
        else
        {login.setVisibility(View.GONE);
        }
        if (loginCheckBox.isChecked()){
            fact.setVisibility(View.VISIBLE);
            fact.setEnabled(b);
        }else {fact.setVisibility(View.GONE);}

    }
    private void entry (){
        insta=findViewById(R.id.insta);
        myInfo=findViewById(R.id.my_info);
        metaco=findViewById(R.id.metaco);
        exit=findViewById(R.id.exit);
        login=findViewById(R.id.login);
        loginCheckBox=findViewById(R.id.checkBox_login);
        fact = findViewById(R.id.fact_gorji);
        fact.setVisibility(View.GONE);
        fact.setOnClickListener(this);
        loginCheckBox.setChecked(false);
        login.setVisibility(View.GONE);
        login.setOnClickListener(this);
        insta.setOnClickListener(this);
        myInfo.setOnClickListener(this);
        metaco.setOnClickListener(this);
        exit.setOnClickListener(this);
        loginCheckBox.setOnCheckedChangeListener(this);

    }

    public int fact1(int fa){
        int b = 1,c=1;

        if (fa == c)
        {
            return b;
        }
        else
        {
            b*=fa;
            return fact1(fa-1);
        }
    }
}