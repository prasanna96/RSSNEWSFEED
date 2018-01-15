package com.immense.rss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TableRow;

public class technologynews extends Activity {
    TableRow tr7,tr8,tr9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_technologynews);
        tr7= (TableRow) findViewById(R.id.tr7);
        tr8= (TableRow) findViewById(R.id.tr8);
        tr9= (TableRow) findViewById(R.id.tr9);

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
