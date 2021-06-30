package com.example.freediamondfree;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    EditText emaill,passwordl;
    Button loginbtnl;
    TextView registerbtnl;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emaill=(EditText)findViewById(R.id.emaill);
        passwordl=(EditText)findViewById(R.id.passwordl);
        loginbtnl=(Button)findViewById(R.id.loginbtnl);
        registerbtnl=(TextView)findViewById(R.id.registerbtnl);

        mAuth = FirebaseAuth.getInstance();

        loginbtnl.setOnClickListener(view -> {
            loginUser();

        });
        registerbtnl.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
        });
    }

    private void loginUser() {
        String email = emaill.getText().toString();
        String password = passwordl.getText().toString();

        if (TextUtils.isEmpty(email)){
            emaill.setError("Email is required");
            emaill.requestFocus();
        }else if (TextUtils.isEmpty(password)){
            passwordl.setError("Password is required");
            passwordl.requestFocus();
        }else{
            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(LoginActivity.this,"User login sucessfully",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(LoginActivity.this,MainActivity.class));
                    }else{
                        Toast.makeText(LoginActivity.this,"Login error" + task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
    @Override
    public void onBackPressed() {
        // counter++;
        //if (counter == 2);
        // super.onBackPressed();
        finishAffinity();
        // finish();
    }
}