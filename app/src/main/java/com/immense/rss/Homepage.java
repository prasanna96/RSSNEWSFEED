package com.immense.rss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TableRow;

public class Homepage extends Activity{

TableRow tr1,tr2,tr3,tr4,tr5,tr6,tr7,tr8,tr9,tr10,tr11,tr12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_homepage);
       tr1= (TableRow) findViewById(R.id.tr1);
        tr2= (TableRow) findViewById(R.id.tr2);
        tr3= (TableRow) findViewById(R.id.tr3);
        tr4= (TableRow) findViewById(R.id.tr4);
        tr5= (TableRow) findViewById(R.id.tr5);
        tr6= (TableRow) findViewById(R.id.tr6);
        tr7= (TableRow) findViewById(R.id.tr7);
        tr8= (TableRow) findViewById(R.id.tr8);
        tr9= (TableRow) findViewById(R.id.tr9);
        tr10= (TableRow) findViewById(R.id.tr10);
        tr11= (TableRow) findViewById(R.id.tr11);
        tr12= (TableRow) findViewById(R.id.tr12);

        tr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i11 = new Intent(getBaseContext(), newspage.class);
                Bundle b11 = new Bundle();
                b11.putByte("age", (byte) 1);
                i11.putExtras(b11);
                startActivity(i11);
            }
        });

    tr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(getBaseContext(), newspage.class);
                Bundle b12 = new Bundle();
                b12.putByte("age", (byte) 2);
                i12.putExtras(b12);
                startActivity(i12);
            }
        });

        tr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i13 = new Intent(getBaseContext(), newspage.class);
                Bundle b13 = new Bundle();
                b13.putByte("age", (byte) 3);
                i13.putExtras(b13);
                startActivity(i13);
            }
        });

        tr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i14 = new Intent(getBaseContext(), newspage.class);
                Bundle b14 = new Bundle();
                b14.putByte("age", (byte) 4);
                i14.putExtras(b14);
                startActivity(i14);
            }
        });

        tr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i15 = new Intent(getBaseContext(), newspage.class);
                Bundle b15 = new Bundle();
                b15.putByte("age", (byte) 5);
                i15.putExtras(b15);
                startActivity(i15);
            }
        });

        tr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i16 = new Intent(getBaseContext(), newspage.class);
                Bundle b16 = new Bundle();
                b16.putByte("age", (byte) 6);
                i16.putExtras(b16);
                startActivity(i16);
            }
        });

        tr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i17 = new Intent(getBaseContext(), newspage.class);
                Bundle b17 = new Bundle();
                b17.putByte("age", (byte) 7);
                i17.putExtras(b17);
                startActivity(i17);
            }
        });

        tr8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i18 = new Intent(getBaseContext(), newspage.class);
                Bundle b18 = new Bundle();
                b18.putByte("age", (byte) 8);
                i18.putExtras(b18);
                startActivity(i18);
            }
        });

        tr9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i19 = new Intent(getBaseContext(), newspage.class);
                Bundle b19 = new Bundle();
                b19.putByte("age", (byte) 9);
                i19.putExtras(b19);
                startActivity(i19);
            }
        });

        tr10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i110 = new Intent(getBaseContext(), newspage.class);
                Bundle b110 = new Bundle();
                b110.putByte("age", (byte) 10);
                i110.putExtras(b110);
                startActivity(i110);
            }
        });

        tr11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i111 = new Intent(getBaseContext(), newspage.class);
                Bundle b111 = new Bundle();
                b111.putByte("age", (byte) 11);
                i111.putExtras(b111);
                startActivity(i111);
            }
        });

        tr12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i112 = new Intent(getBaseContext(), newspage.class);
                Bundle b112 = new Bundle();
                b112.putByte("age", (byte) 12);
                i112.putExtras(b112);
                startActivity(i112);
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menu) {
        switch (menu.getItemId()) {
            case R.id.sports:
                Intent i1 = new Intent(getBaseContext(), sportsnews.class);
                startActivity(i1);
                break;
            case R.id.entertainment:
                Intent i2 = new Intent(getBaseContext(), entertainmentnews.class);
                startActivity(i2);
                break;
            case R.id.technology:
                Intent i3 = new Intent(getBaseContext(), technologynews.class);
                startActivity(i3);
                break;
            case R.id.politics:
                Intent i4 = new Intent(getBaseContext(), politicsnews.class);
                startActivity(i4);
                break;
            case R.id.settings:
                Intent i5 = new Intent(getBaseContext(), settings.class);
                startActivity(i5);
                break;
            case R.id.exit:
                Intent i6=new Intent(getBaseContext(),MainActivity.class);
                i6.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                i6.putExtra("exit", true);
                startActivity(i6);
                return true;
        }
    return false;}
public void onActivityResult(Intent i){
    if(getIntent().getBooleanExtra("exit",false)){ finish();   }

}

}


