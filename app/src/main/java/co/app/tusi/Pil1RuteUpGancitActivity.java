package co.app.tusi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Pil1RuteUpGancitActivity extends AppCompatActivity {

    int saldo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pil3_rute_up_gancit);
        Button button = findViewById(R.id.jalan_button_pilrute);
        Intent before = getIntent();
        saldo = before.getIntExtra("SALDO",0);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                Intent i = new Intent(Pil1RuteUpGancitActivity.this, BarcodeActivity.class);
                i.putExtra("SALDO",saldo);
                startActivity(i);



            }
        });
    }
}
