package edu.whitworth.app2.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends Activity {
    Flip coin = new Flip();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * For when they push the button
     * @param v
     */
    public void toggleLabel(View v){
        TextView f = (TextView)this.findViewById(R.id.txtHello);//gets the label
        String result = coin.flipCoin();//result of the coin flip
        f.setText(result);//updates the label with the result
        if (result=="Heads!"){
            ImageView g = (ImageView)this.findViewById(R.id.imageView);
            g.setVisibility(View.VISIBLE);
            g = (ImageView)this.findViewById(R.id.imageView2);
            g.setVisibility(View.INVISIBLE);
        }
        else{
            ImageView g = (ImageView)this.findViewById(R.id.imageView2);
            g.setVisibility(View.VISIBLE);
            g = (ImageView)this.findViewById(R.id.imageView);
            g.setVisibility(View.INVISIBLE);
        }


    }

}
