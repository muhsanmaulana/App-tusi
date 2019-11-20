package co.app.tusi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Register1Activity extends AppCompatActivity {

    private FirebaseAuth auth;
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;

    String namaLengkap;
    String email;
    Intent intent;
    String password;
    String noTelp;
    String confirmPassword;

    FirebaseAuth mAuth;

    DatabaseReference databaseUser;

    static boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);
        mAuth= FirebaseAuth.getInstance();

        databaseUser = FirebaseDatabase.getInstance().getReference();
        editText1 = findViewById(R.id.name_register);
        editText2 = findViewById(R.id.email_register);
        editText3 = findViewById(R.id.password_register);
        editText4 = findViewById(R.id.repassword_register);
        editText5 = findViewById(R.id.phone_register);
        intent = new Intent(this,LoginActivity.class);

        Button button = findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                namaLengkap = String.valueOf(editText1.getText());
                email = String.valueOf(editText2.getText());
                password = String.valueOf(editText3.getText());
                confirmPassword = String.valueOf(editText4.getText());
                noTelp = String.valueOf(editText5.getText());


                if(namaLengkap.isEmpty()){
                    Toast.makeText(Register1Activity.this, "Nama tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();
                }
                else if(email.isEmpty()){
                    Toast.makeText(Register1Activity.this, "Email tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();
                }
//               else if(isValid(email) == false){
//                    Toast.makeText(Register1Activity.this, "Email tidak valid",
//                            Toast.LENGTH_SHORT).show();
//
//                }
//               else if(password != confirmPassword){
//
//                    Toast.makeText(Register1Activity.this, "Password tidak sama",
//                            Toast.LENGTH_SHORT).show();
//                }
                else if(noTelp.isEmpty()){

                    Toast.makeText(Register1Activity.this, "Nomor tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    registerUser(email,password);
                    addUser(email,namaLengkap,noTelp);
                    startActivity(intent);
                }

            }
        });

    }

    private void registerUser(String email, String password) {

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            
                            FirebaseUser user = mAuth.getCurrentUser();
                        } else {
                            // If sign in fails, display a message to the user.

                            Toast.makeText(Register1Activity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();

                        }

                        // ...
                    }
                });





    }


    private void addUser(String email, String namaLengkap,String noTelp) {
        String id = databaseUser.push().getKey();
        User user = new User(namaLengkap,noTelp,email);

        databaseUser.child(id).setValue(user);
        Toast.makeText(Register1Activity.this, "Akun Ter-Register",
                Toast.LENGTH_SHORT).show();
    }
}
