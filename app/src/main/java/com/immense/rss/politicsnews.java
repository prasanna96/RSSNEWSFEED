package com.immense.rss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TableRow;

public class politicsnews extends Activity {
    TableRow tr10,tr11,tr12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_politicsnews);
        tr10= (TableRow) findViewById(R.id.tr10);
        tr11= (TableRow) findViewById(R.id.tr11);
        tr12= (TableRow) findViewById(R.id.tr12);

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
