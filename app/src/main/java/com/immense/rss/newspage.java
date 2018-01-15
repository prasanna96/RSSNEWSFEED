package com.immense.rss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class newspage extends Activity {
TextView tv;
ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_newspage);
        iv= (ImageView)findViewById(R.id.iv1);
        tv= (TextView) findViewById(R.id.tv1);
        Bundle b;
        b=getIntent().getExtras();
        Byte b1 = b.getByte("age");
        switch (b1)
        {   case 1:
                iv.setImageResource(R.drawable.sports1);
                tv.setText(R.string.sports11);
                break;
            case 2:
                iv.setImageResource(R.drawable.sports2);
                tv.setText(R.string.sports12);
                break;
            case 3:
                iv.setImageResource(R.drawable.sports3);
                tv.setText(R.string.sports13);
                break;
            case 4:
                iv.setImageResource(R.drawable.entertainment1);
                tv.setText(R.string.entertainment11);
                break;
            case 5:
                iv.setImageResource(R.drawable.entertainment2);
                tv.setText(R.string.entertainment12);
                break;
            case 6:
                iv.setImageResource(R.drawable.entertainment3);
                tv.setText(R.string.entertainment13);break;
            case 7:
                iv.setImageResource(R.drawable.technology1);
                tv.setText(R.string.technology11);break;
            case 8:
                iv.setImageResource(R.drawable.technology2);
                tv.setText(R.string.technology12);break;
            case 9:
                iv.setImageResource(R.drawable.technology3);
                tv.setText(R.string.technology13);break;
            case 10:
                iv.setImageResource(R.drawable.politics1);
                tv.setText(R.string.politics11);break;
            case 11:
                iv.setImageResource(R.drawable.politics2);
                tv.setText(R.string.politics12);break;
            case 12:
                iv.setImageResource(R.drawable.politics3);
                tv.setText(R.string.politics13);break;
                default:System.out.print("Not Found");
                break;

        }

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
