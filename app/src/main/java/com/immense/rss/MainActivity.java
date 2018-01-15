package com.immense.rss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.io.File;
import java.io.FileInputStream;

public class MainActivity extends Activity {
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread t = new Thread() {

            public void run() {
                try {
                    Thread.sleep(5000);
                    File f = getBaseContext().getFileStreamPath("mydata.txt");
                    if (f.exists()) {
                        try {
                            FileInputStream fis = openFileInput("mydata.txt");
                            int c;
                            String temp = "";
                            while ((c = fis.read()) > 0) {
                                temp += Character.toString((char) c);
                            }

                            if (temp.equals("sports")) {
                                i = new Intent(getBaseContext(), sportsnews.class);
                                startActivity(i);
                                if (getIntent().getBooleanExtra("exit", false)) {
                                    finish();}
                            } else if (temp.equals("entertainment")) {
                                i = new Intent(getBaseContext(), entertainmentnews.class);
                                startActivity(i);
                            } else if (temp.equals("technology")) {
                                i = new Intent(getBaseContext(), technologynews.class);
                                startActivity(i);
                            } else {
                                i = new Intent(getBaseContext(), politicsnews.class);
                                startActivity(i);
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        Intent i = new Intent(getBaseContext(), Homepage.class);
                        startActivity(i);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        if (getIntent().getBooleanExtra("exit", false))
        { finish();
        System.exit(0);}
        t.start();

        }
    }

