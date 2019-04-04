package android.example.mycards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class AddCard extends AppCompatActivity {

    ImageButton backImageButton;
    Button button_save;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);



        button_save = (Button) findViewById(R.id.button_save);
        button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddCard.this, "It works", Toast.LENGTH_SHORT).show();
            }
        });

        backImageButton = (ImageButton) findViewById(R.id.image_button_back);
        backImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }




}
