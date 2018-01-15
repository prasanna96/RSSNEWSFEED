package com.immense.rss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TableRow;

public class sportsnews extends Activity {
TableRow tr1,tr2,tr3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);

        setContentView(R.layout.activity_sportsnews);
        tr1= (TableRow) findViewById(R.id.tr1);
        tr2= (TableRow) findViewById(R.id.tr2);
        tr3= (TableRow) findViewById(R.id.tr3);

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
