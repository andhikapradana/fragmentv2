package www.smktelkom_mlg.sch.id.fragmentasiv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override  protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);  }

    public void multiple (View view){  Intent intent = new Intent(getApplicationContext(), MultipleFragment.class);
        startActivity(intent); } }

