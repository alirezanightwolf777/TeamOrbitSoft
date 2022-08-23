package com.orbitsoft.teamorbitsoft.example;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;

public class IntentSample extends AppCompatActivity {

    Button b1, b2, b3, b4, b5;
    int request_Code = 1;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        //---Web browser button---
        b1 = (Button) findViewById(R.id.btn_webbrowser);
        b1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
            	/*
                Intent i = new
                    Intent(android.content.Intent.ACTION_VIEW,
                      Uri.parse("http://www.amazon.com"));
                */

                //---OR---
                Intent i = new
                        Intent("android.ints.action.VIEW");
                //Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.amazon.com"));

                startActivity(i);
            }
        });

        //---Make calls button---
        //b2 = (Button) findViewById(R.id.maz_makecalls);
        b2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){

                Intent i = new
                Intent(android.content.Intent.ACTION_DIAL,
                        Uri.parse("tel:+651234567"));
                startActivity(i);


                //---OR---

//                Intent i = new
//                        Intent(android.content.Intent.ACTION_CALL,
//                        Uri.parse("tel:+651234567"));
//                startActivity(i);

            }
        });

        //---Show Map button---
        b3 = (Button) findViewById(R.id.btn_showMap);
        b3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
                Intent i = new
                        Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:37.827500,-122.481670"));
                startActivity(i);
            }
        });

        //---Choose Contact button---
       // b4 = (Button) findViewById(R.id.btn_chooseContact);
        b4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
                Intent i = new
                        Intent(android.content.Intent.ACTION_PICK);
                //i.setType(ContactsContract.Contacts.CONTENT_TYPE);
                i.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);
                startActivityForResult(i,request_Code);

            }
        });

        b5 = (Button) findViewById(R.id.btn_launchMyBrowser);
        b5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {

            	//---Method 1---
//           	Intent i = new
//                  Intent("com.orbitsoft.teamorbitsoft.MyBrowser");
//            	i.setData(Uri.parse("http://www.amazon.com"));
//                    startActivity(i);

                Intent i = new
                        Intent(IntentSample.this,MyBrowserActivity.class);
               Bundle bundle = new Bundle();
               bundle.putLong("testputLong",12);
               i.putExtra("test", bundle);
                i.setData(Uri.parse("http://www.amazon.com"));
                startActivity(i);

//                Uri uri = Uri.parse("https://instagram.com/metacomplex");
//                Intent i = new Intent(Intent.ACTION_VIEW, uri);
//
//                i.setPackage("com.instagram.android");
//                    startActivity(i);

            	/*
                //---Method 2---
                Intent i = new
                    Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://www.amazon.com"));
                startActivity(i);
                */

                //---Method 3---
//                Intent i = new
//                        Intent("com.orbitsoft.teamorbitsoft.MyBrowser",
//                        Uri.parse("http://www.amazon.com"));
//                i.addCategory("com.orbitsoft.teamorbitsoft.OtherApps");
//                i.addCategory("com.orbitsoft.teamorbitsoft.SomeOtherApps");
//                startActivity(i);

            }

        });

    }

    @SuppressLint("Range")
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == request_Code) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(this, data.getData().toString(),
                        Toast.LENGTH_SHORT).show();
                Uri uri = data.getData();

                Cursor cursor = getContentResolver().query(uri, null, null, null, null);

                cursor.moveToFirst();
              String  name = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));

                cursor.moveToFirst();
               String number = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
//                Intent i = new Intent(
//                        Intent.ACTION_VIEW,
//                        Uri.parse(data.getData().toString()));
//                startActivity(i);
            }else {
                Toast.makeText(this, "Not OK",
                        Toast.LENGTH_SHORT).show();
            }
        }
    }
}
