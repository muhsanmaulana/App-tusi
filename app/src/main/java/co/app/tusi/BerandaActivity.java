package co.app.tusi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

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

        CircleImageView btnProfile = (CircleImageView) findViewById(R.id.profile_nav);
        btnProfile.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(BerandaActivity.this,ProfilActivity.class);
                startActivity(i);
            }
        });

        ImageButton btnTransactionNav = (ImageButton) findViewById(R.id.transaction_nav);
        btnTransactionNav.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(BerandaActivity.this,TransaksiActivity.class);
                startActivity(i);
            }
        });

        ImageButton btnNotifnav = (ImageButton) findViewById(R.id.notif_nav);
        btnNotifnav.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(BerandaActivity.this,NotifikasiActivity.class);
                startActivity(i);
            }
        });

        ImageButton btnBeranda = (ImageButton) findViewById(R.id.home_nav);
        btnBeranda.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(BerandaActivity.this,BerandaActivity.class);
                startActivity(i);
            }
        });

        ImageButton btnGO = (ImageButton) findViewById(R.id.go_nav);
        btnGO.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(BerandaActivity.this,BarcodeActivity.class);
                startActivity(i);
            }
        });

    }
}
