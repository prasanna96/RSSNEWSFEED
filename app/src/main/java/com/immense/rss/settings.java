package com.immense.rss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import static android.widget.Toast.makeText;

public class settings extends Activity {
    RadioGroup rg;
    Button b;
    String s="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        rg = (RadioGroup) findViewById(R.id.rg);
        b = (Button) findViewById(R.id.b);



                    rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            if(i == R.id.rb1)
                            {
                                s="sports";
                            }
                            else if(i==R.id.rb2)
                            {
                                s="entertainment";
                            }
                            else if(i==R.id.rb3)
                            {
                                s="technology";
                            }
                            else {
                                s="politics";
                            }
                        }
                    });


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    FileOutputStream fos = openFileOutput("mydata.txt", MODE_PRIVATE);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    osw.write(s);
                    osw.flush();
                    osw.close();
                    Toast.makeText(getBaseContext(),"Saved",Toast.LENGTH_SHORT).show();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar1, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menu) {
        switch (menu.getItemId()) {
            case R.id.homepage:
                Intent i1 = new Intent(getBaseContext(), Homepage.class);
                startActivity(i1);
                break;
            case R.id.exit:
                Intent i4=new Intent(getBaseContext(),MainActivity.class);
                i4.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                i4.putExtra("exit", true);
                startActivity(i4);
                return true;
        }
        return false;}
}


