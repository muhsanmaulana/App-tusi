package co.app.tusi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register2Activity extends AppCompatActivity {



    EditText editText1;
    EditText editText2;

    String password;
    String confirmPassword;
    Intent intent;
    Intent before;

    void nextIntent(String password){

        intent = new Intent(this, Register3Activity.class);
        intent.putExtra("NAMA", before.getStringExtra("NAMA"));
        intent.putExtra("EMAIL", before.getStringExtra("EMAIL"));
        intent.putExtra("PASS",password );
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);
        editText1 = findViewById(R.id.password_register);
        editText2 = findViewById(R.id.repassword_register);
        before = getIntent();

        Button button = findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                password = String.valueOf(editText1.getText());
                confirmPassword = String.valueOf(editText2.getText());

                if(password.isEmpty()){
                    Toast.makeText(Register2Activity.this, "Password tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();
                }
                else if(confirmPassword.isEmpty()){
                    Toast.makeText(Register2Activity.this, "Konfirmasi Password",
                            Toast.LENGTH_SHORT).show();
                }
                else if(password != confirmPassword){
                    Toast.makeText(Register2Activity.this, "Password tidak sama",
                            Toast.LENGTH_SHORT).show();
                }

                else{
                    nextIntent(password);
                }

            }
        });

    }
}
