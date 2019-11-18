package co.app.tusi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransaksiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksi);

        Button btnTransaksi = (Button) findViewById(R.id.transaksi_button_transaksi);
        btnTransaksi.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(TransaksiActivity.this,PoinActivity.class);
                startActivity(i);
            }
        });
    }
}
