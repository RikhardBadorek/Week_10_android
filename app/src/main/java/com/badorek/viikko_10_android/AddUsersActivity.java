package com.badorek.viikko_10_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddUsersActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        context = AddUsersActivity.this;
    }
    public void addUser(View view) {
        EditText firstName = findViewById(R.id.editTextFirstName);
        EditText lastName = findViewById(R.id.editTextLastName);
        EditText email = findViewById(R.id.editTextEmail);

        RadioGroup rgDegreeType = findViewById(R.id.rgDegreeType);

        switch (rgDegreeType.getCheckedRadioButtonId()) {
            case R.id.rbTITE:
                String degreeTITE = "Tietotekniikka";
                UserStorage.getInstance().addUser(new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), degreeTITE));
                break;
            case R.id.rbTUTA:
                String degreeTUTA = "Tuotantotalous";
                UserStorage.getInstance().addUser(new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), degreeTUTA));
                break;
            case R.id.rbLATE:
                String degreeLATE = "Laskennallinen tekniikka";
                UserStorage.getInstance().addUser(new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), degreeLATE));
                break;
            case R.id.rbSTE:
                String degreeSTE = "Sähkötekniikka";
                UserStorage.getInstance().addUser(new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), degreeSTE));
                break;

        }

        UserStorage.getInstance().saveUsers(context);

        Intent intent = new Intent(this, AddUsersActivity.class);
        startActivity(intent);


    }
    public void returnToMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}