package program.androidheight.layoutdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class FrameLayoutActivity extends ActionBarActivity  implements View.OnClickListener{
ImageView ivImage;
    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        ivImage =(ImageView)findViewById(R.id.ivimage);
        txtView = (TextView)findViewById(R.id.tvtext);
        ivImage.setOnClickListener(this);
        txtView.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_frame_layout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.ivimage:
                Toast.makeText(getApplicationContext(),"You have click on Image",Toast.LENGTH_LONG).show();
                break;
            case R.id.tvtext:
                Toast.makeText(getApplicationContext(),"You have click on Text",Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }

    }
}
