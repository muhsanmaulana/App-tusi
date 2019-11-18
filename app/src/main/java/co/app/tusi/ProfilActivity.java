package co.app.tusi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        CircleImageView btnProfile = (CircleImageView) findViewById(R.id.profile_nav);
        btnProfile.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(ProfilActivity.this,ProfilActivity.class);
                startActivity(i);
            }
        });

        ImageButton btnTransactionNav = (ImageButton) findViewById(R.id.transaction_nav);
        btnTransactionNav.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(ProfilActivity.this,TransaksiActivity.class);
                startActivity(i);
            }
        });

        ImageButton btnNotifnav = (ImageButton) findViewById(R.id.notif_nav);
        btnNotifnav.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(ProfilActivity.this,NotifikasiActivity.class);
                startActivity(i);
            }
        });

        ImageButton btnBeranda = (ImageButton) findViewById(R.id.home_nav);
        btnBeranda.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(ProfilActivity.this,BerandaActivity.class);
                startActivity(i);
            }
        });

        ImageButton btnGO = (ImageButton) findViewById(R.id.go_nav);
        btnGO.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(ProfilActivity.this,PesanActivity.class);
                startActivity(i);
            }
        });

    }
}
