package co.app.tusi;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class NotifikasiActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifikasi);

        CircleImageView btnProfile = (CircleImageView) findViewById(R.id.profile_nav);
        btnProfile.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(NotifikasiActivity.this,ProfilActivity.class);
                startActivity(i);
            }
        });

        ImageButton btnTransactionNav = (ImageButton) findViewById(R.id.transaction_nav);
        btnTransactionNav.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(NotifikasiActivity.this,TransaksiActivity.class);
                startActivity(i);
            }
        });

        ImageButton btnNotifnav = (ImageButton) findViewById(R.id.notif_nav);
        btnNotifnav.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(NotifikasiActivity.this,NotifikasiActivity.class);
                startActivity(i);
            }
        });

        ImageButton btnBeranda = (ImageButton) findViewById(R.id.home_nav);
        btnBeranda.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(NotifikasiActivity.this,BerandaActivity.class);
                startActivity(i);
            }
        });

        ImageButton btnGO = (ImageButton) findViewById(R.id.go_nav);
        btnGO.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(NotifikasiActivity.this,PesanActivity.class);
                startActivity(i);
            }
        });

    }
}
