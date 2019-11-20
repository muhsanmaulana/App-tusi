package co.app.tusi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PesanActivity extends AppCompatActivity {


    int saldo;
    @Override
    public void onBackPressed() {
        // Do Here what ever you want do on back press;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);
        Intent before = getIntent();
        saldo = before.getIntExtra("SALDO",0);



        Button btnGO = findViewById(R.id.go_berangkat);
        btnGO.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                    Intent i = new Intent(PesanActivity.this, RuteUpGancitActivity.class);
                    i.putExtra("SALDO",saldo);
                    startActivity(i);



            }
        });






    }
}
