package co.app.tusi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.IOException;

public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    String email;
    String password;
    Intent intent ;

    void signIn(String email, String password){

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {

                    public void onComplete(@NonNull Task<AuthResult> task){

                        if(task.isSuccessful()){
                            Toast.makeText(LoginActivity.this, "Login Success.",
                                    Toast.LENGTH_SHORT).show();
                            startActivity(intent);



                        }
                        else{
                            Toast.makeText(LoginActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }

                    }



                });
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        final EditText emailText = findViewById(R.id.emailphone);
        final EditText passwordText = findViewById(R.id.password);
        intent = new Intent(this, BerandaActivity.class);
        final Intent register = new Intent(this, Register1Activity.class);



        final Button button = findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                email = String.valueOf(emailText.getText());
                password = String.valueOf(passwordText.getText());
                if(email.isEmpty() || password.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Tidak Boleh kosong",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    signIn(email, password);
                }


            }
        });

        final Button button1 = findViewById(R.id.register_button);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(register);


            }
        });


    }


}
