package android.example.mycards;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    ImageButton androidImageButton;
    TextView NoCard,test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NoCard = (TextView) findViewById(R.id.NoCard);
        test = (TextView) findViewById(R.id.test);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        androidImageButton = (ImageButton) findViewById(R.id.image_button_profile);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "It works", Toast.LENGTH_SHORT).show();
            }
        });

        FloatingActionButton floatingActionButton = findViewById(R.id.fab_1);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddCard();
            }
        });
    }

    public void openAddCard(){
        Intent intent = new Intent(this, AddCard.class);
        startActivity(intent);
    }

    public void hide(View view){
        NoCard.setVisibility(View.GONE);
       // test.setVisibility(View.GONE);
    }
}
