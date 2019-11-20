package co.app.tusi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class RuteUpGancitActivity extends AppCompatActivity {

    int saldo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rute_up_gancit);
        Button pil1 = findViewById(R.id.detail_pil1);
        Button pil2 = findViewById(R.id.detail_pil2);
        Button pil3 = findViewById(R.id.detail_pil3);
        Intent before = getIntent();
        saldo = before.getIntExtra("SALDO",0);
        ImageButton back = findViewById(R.id.back_to);

        back.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                Intent i = new Intent(RuteUpGancitActivity.this, BerandaActivity.class);
                i.putExtra("SALDO",saldo);
                startActivity(i);

            }
        });
       //////////////////////////////////////////////////////////
        pil1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                Intent i = new Intent(RuteUpGancitActivity.this, Pil1RuteUpGancitActivity.class);
                i.putExtra("SALDO",saldo);
                startActivity(i);



            }
        });
        pil2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                Intent i = new Intent(RuteUpGancitActivity.this, Pil2RuteUpGancitActivity.class);
                i.putExtra("SALDO",saldo);
                startActivity(i);



            }
        });
        pil3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                Intent i = new Intent(RuteUpGancitActivity.this, Pil3RuteUpGancitActivity.class);
                i.putExtra("SALDO",saldo);
                startActivity(i);



            }
        });



        ///////////////////////////////////////////////////////////////



    }
}
