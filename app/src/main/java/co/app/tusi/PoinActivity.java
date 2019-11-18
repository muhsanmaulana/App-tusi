package co.app.tusi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PoinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poin);


        Button btnPoin = (Button) findViewById(R.id.poin_button_poin);
        btnPoin.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(PoinActivity.this,TransaksiActivity.class);
                startActivity(i);
            }
        });
    }
}
