package com.example.freediamondfree;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    EditText emailr,passwordr;
    Button registerbtnr;
    TextView loginbtnr;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        emailr=(EditText)findViewById(R.id.emailr);
        passwordr=(EditText)findViewById(R.id.passwordr);
        registerbtnr=(Button)findViewById(R.id.registerbtnr);
        loginbtnr=(TextView)findViewById(R.id.loginbtnr);

        mAuth = FirebaseAuth.getInstance();

        registerbtnr.setOnClickListener(view -> {
            createUser();
        });

        loginbtnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            }
        });

    }

    private void createUser() {
        String email = emailr.getText().toString();
        String password = passwordr.getText().toString();

        if (TextUtils.isEmpty(email)){
            emailr.setError("Email is required");
            emailr.requestFocus();
        }else if (TextUtils.isEmpty(password)){
            passwordr.setError("Password is required");
            passwordr.requestFocus();
        }else{
            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                       Toast.makeText(RegisterActivity.this,"User register sucessful",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
                    }else{
                        Toast.makeText(RegisterActivity.this,"Register error" + task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}