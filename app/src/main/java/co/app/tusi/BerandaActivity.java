package co.app.tusi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BerandaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        ImageButton btnTopup = (ImageButton) findViewById(R.id.top_up);
        btnTopup.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(BerandaActivity.this,TopUpActivity.class);
                startActivity(i);
            }
        });

    }
}
