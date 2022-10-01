package org.taehyeon.welcome_pet_khackathon.Auth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.taehyeon.welcome_pet_khackathon.MainActivity;
import org.taehyeon.welcome_pet_khackathon.R;
import org.taehyeon.welcome_pet_khackathon.Userinfo.userinfo_Fragment;

public class Login extends AppCompatActivity {

    private FirebaseAuth mfirebaseAuth; // 파이어베이스 인증처리
    private DatabaseReference mdataRef;

    EditText et_id,et_pw;
    TextView join_tbtn;
    Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mfirebaseAuth = FirebaseAuth.getInstance();
        mdataRef = FirebaseDatabase.getInstance().getReference("WelcomePet");

        EditText et_id = findViewById(R.id.enter_ID);
        EditText et_pw = findViewById(R.id.enter_PW);
        TextView join_tbtn = findViewById(R.id.join);
        Button login_btn = findViewById(R.id.login);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str_id = et_id.getText().toString();
                String str_pw = et_pw.getText().toString();
                mfirebaseAuth.signInWithEmailAndPassword(str_id,str_pw).addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(Login.this,"로그인을 성공하셨습니다!",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                        }
                        else
                        {
                            Toast.makeText(Login.this,"로그인을 실패",Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });

        join_tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Userinput.class);
                startActivity(intent);
            }
        });
    }
}