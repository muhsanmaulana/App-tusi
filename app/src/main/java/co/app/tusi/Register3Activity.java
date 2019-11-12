package co.app.tusi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.Calendar;

public class Register3Activity extends AppCompatActivity {



    EditText dd;
    EditText mm;
    EditText yyyy;

    EditText editText2;

    String noTelp;
    Calendar calendar;
    Intent intent;
    Intent before;
    int d , m ,y;


    void nextIntent(String noTelp, Calendar calendar){

        intent = new Intent(this, LoginActivity.class);
        intent.putExtra("NAMA", before.getStringExtra("NAMA"));
        intent.putExtra("EMAIL", before.getStringExtra("EMAIL"));
        intent.putExtra("PASS",before.getStringExtra("PASS"));
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);
        dd = findViewById(R.id.tanggal_register);
        mm = findViewById(R.id.bulan_register);
        yyyy = findViewById(R.id.tahun_register);

        editText2 = findViewById(R.id.email_register);
        before = getIntent();


        Button button = findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(dd.getText().toString().isEmpty()){
                    Toast.makeText(Register3Activity.this, "Tanggal tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();
                }
                else if(mm.getText().toString().isEmpty()){
                    Toast.makeText(Register3Activity.this, "Bulan tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();
                }
                else if(yyyy.getText().toString().isEmpty()){
                    Toast.makeText(Register3Activity.this, "Tahun tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();
                }
                else if(editText2.getText().toString().isEmpty()){
                    Toast.makeText(Register3Activity.this, "Nomor tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();
                }

                else{
                    d = Integer.parseInt(dd.getText().toString());
                    m = Integer.parseInt(mm.getText().toString());
                    y = Integer.parseInt(yyyy.getText().toString());
                    noTelp = editText2.getText().toString();
                    calendar.set(y,m,d);

                }


            }
        });

    }
}
