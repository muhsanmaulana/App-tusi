package co.app.tusi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;

import de.hdodenhof.circleimageview.CircleImageView;

public class BerandaActivity extends AppCompatActivity {

    Intent before;
    String email;
    int saldo;
    DatabaseReference databaseUser;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
        before = getIntent();
        saldo = before.getIntExtra("SALDO",0);
        textView = findViewById(R.id.saldo_user);
        textView.setText(Integer.toString(saldo));


        ImageButton btnTopup = (ImageButton) findViewById(R.id.top_up);
        btnTopup.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(BerandaActivity.this,TopUpActivity.class);
                i.putExtra("SALDO",saldo);
                startActivity(i);
            }
        });

        CircleImageView btnProfile = (CircleImageView) findViewById(R.id.profile_nav);
        btnProfile.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(BerandaActivity.this,ProfilActivity.class);
                i.putExtra("SALDO",saldo);
                startActivity(i);
            }
        });

        ImageButton btnTransactionNav = (ImageButton) findViewById(R.id.transaction_nav);
        btnTransactionNav.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(BerandaActivity.this,TransaksiActivity.class);
                i.putExtra("SALDO",saldo);
                startActivity(i);
            }
        });

        ImageButton btnNotifnav = (ImageButton) findViewById(R.id.notif_nav);
        btnNotifnav.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(BerandaActivity.this,NotifikasiActivity.class);
                i.putExtra("SALDO",saldo);
                startActivity(i);
            }
        });

        ImageButton btnBeranda = (ImageButton) findViewById(R.id.home_nav);
        btnBeranda.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                finish();
                Intent i = new Intent(BerandaActivity.this,BerandaActivity.class);
                i.putExtra("SALDO",saldo);
                startActivity(i);
            }
        });

        ImageButton btnGO = (ImageButton) findViewById(R.id.go_nav);
        btnGO.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent i = new Intent(BerandaActivity.this,PesanActivity.class);
                i.putExtra("SALDO",saldo);
                startActivity(i);
            }
        });

    }



}
