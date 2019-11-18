package co.app.tusi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;


public class Register1Activity extends AppCompatActivity {

    private FirebaseAuth auth;
    EditText editText1;
    EditText editText2;

    String namaLengkap;
    String email;
    Intent intent;
    static boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    void nextIntent(String namaLengkap , String email){

            intent = new Intent(this, Register2Activity.class);
            intent.putExtra("NAMA", namaLengkap);
            intent.putExtra("EMAIL", email);

            startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);


        editText1 = findViewById(R.id.name_register);
        editText2 = findViewById(R.id.email_register);

        Button button = findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                namaLengkap = String.valueOf(editText1.getText());
                email = String.valueOf(editText2.getText());

                if(namaLengkap.isEmpty()){
                    Toast.makeText(Register1Activity.this, "Nama tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();
                }
                else if(email.isEmpty()){
                    Toast.makeText(Register1Activity.this, "Email tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();
                }
               else if(isValid(email) == false){
                    Toast.makeText(Register1Activity.this, "Email tidak valid",
                            Toast.LENGTH_SHORT).show();

                }
                else{
                    nextIntent(namaLengkap,email);
                }

            }
        });

    }
}
