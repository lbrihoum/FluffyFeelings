package com.example.bloop.fluffyfeelings;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    private EditText inputEmail, inputPassword;
    private FirebaseAuth auth;
    private Button loginBtn;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Logging In...");

        auth = FirebaseAuth.getInstance();

        inputEmail = (EditText) findViewById(R.id.email);
        inputPassword = (EditText) findViewById(R.id.password);
        loginBtn = (Button) findViewById(R.id.loginButton);

        addButtonClickEventListener();
    }

    public void addButtonClickEventListener() {
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email = inputEmail.getText().toString();
                final String password = inputPassword.getText().toString();
                if (password.length() == 0 || email.length() == 0) {
                    Toast.makeText(Login.this, "Fill All Fields", Toast.LENGTH_LONG).show();
                } else {
                    progressDialog.show();
                    Intent intent = new Intent(Login.this, AnimalChoice.class);
                    startActivity(intent);
                    progressDialog.dismiss();
                }
//                try {
//                    if (password.length() != 0 || email.length() != 0) {
//                        progressDialog.show();
//                        auth.signInWithEmailAndPassword(email, password)
//                                .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
//                                    @Override
//                                    public void onComplete(@NonNull Task<AuthResult> task) {
//                                        if (!task.isSuccessful()) {
//                                            Toast.makeText(Login.this, "Authentication Failed", Toast.LENGTH_LONG).show();
//                                            Log.v("error", task.getResult().toString());
//                                        } else {
//                                            Intent intent = new Intent(Login.this, AnimalChoice.class);
//                                            startActivity(intent);
//                                            progressDialog.dismiss();
//                                        }
//                                        progressDialog.dismiss();
//                                    }
//                                });
//                    } else {
//                        Toast.makeText(Login.this, "Fill All Fields", Toast.LENGTH_LONG).show();
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
            }
        });
    }

}
