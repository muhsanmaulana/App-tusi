package co.app.tusi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class PesanActivity extends AppCompatActivity {

    String lokasiAkhir;
    String lokasiAwal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);

        EditText FromLoc = (EditText) findViewById(R.id.my_berangkat);
        lokasiAwal = FromLoc.getText().toString();

        EditText ToLoc = (EditText) findViewById(R.id.my_tujuan);
        lokasiAkhir = ToLoc.getText().toString();

        Button btnGO = (Button) findViewById(R.id.go_berangkat);
        btnGO.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(PesanActivity.this, lokasiAkhir,
                        Toast.LENGTH_SHORT).show();
                Toast.makeText(PesanActivity.this, lokasiAwal,
                        Toast.LENGTH_SHORT).show();

                if (lokasiAkhir == "Gandaria City" && lokasiAwal == "Universitas Pertamina") {
                    Intent i = new Intent(PesanActivity.this, RuteUpGancitActivity.class);
                    startActivity(i);

                }

            }
        });






    }
}
