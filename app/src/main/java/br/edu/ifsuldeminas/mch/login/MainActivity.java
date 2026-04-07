package br.edu.ifsuldeminas.mch.login;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private static final String USER_NAME = "emerson";
    private static final String PW = "admin";
    private static final String LOG_TAG = "login_activity_main";

    private Button buttonLogin;
    private Button buttonRegister;
    private Button buttonForgotPW;
    private EditText editTextUser;
    private EditText editTextPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = findViewById(R.id.buttonLoginId);
        buttonRegister = findViewById(R.id.buttonRegisterId);
        buttonForgotPW = findViewById(R.id.buttonForgotPWId);
        editTextUser = findViewById(R.id.textInputLayoutUserId);
        editTextPW = findViewById(R.id.textInputLayoutPWId);


        //interno
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName = editTextUser.getText().toString();
                String userPW = editTextPW.getText().toString();

                if (USER_NAME.equals(userName) && PW.equals(userPW)){

                }else {
                    Toast toast = Toast.makeText(getBaseContext(), userName + " - " + userPW, Toast.LENGTH_LONG);
                    toast.show();
                    editTextUser.requestFocus();
                }


            }
        });

        //class externa
        buttonRegister.setOnClickListener(new RegisterClickerListener());

        //Lambdas com Interface SAM
        buttonForgotPW.setOnClickListener((view) -> {
            Toast.makeText(view.getContext(), R.string.button_forgot_pw_clicked, Toast.LENGTH_LONG).show();
        });
        Log.d(LOG_TAG, "Método onCreate da MainActivity executou com sucesso!");
        }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(LOG_TAG, "Activity foi fechada.");
    }
}
