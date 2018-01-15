package com.immense.rss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TableRow;

public class entertainmentnews extends Activity {
    TableRow tr4,tr5,tr6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_entertainmentnews);
        tr4= (TableRow) findViewById(R.id.tr4);
        tr5= (TableRow) findViewById(R.id.tr5);
        tr6= (TableRow) findViewById(R.id.tr6);

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
            case R.id.settings:
                Intent i5 = new Intent(getBaseContext(), settings.class);
                startActivity(i5);
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
