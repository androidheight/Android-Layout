package program.androidheight.layoutdemo;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


public class RelativeLayoutActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_relative_layout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.linear_layout:
                startActivity(new Intent(RelativeLayoutActivity.this, LinearLayoutActivity.class));
                break;

            case R.id.frame_layout:
                startActivity(new Intent(RelativeLayoutActivity.this, FrameLayoutActivity.class));
                break;
            case R.id.table_layout:
                startActivity(new Intent(RelativeLayoutActivity.this, TableLayoutActivity.class));
                break;
            default:
                break;
        }
            return super.onOptionsItemSelected(item);

    }
}
