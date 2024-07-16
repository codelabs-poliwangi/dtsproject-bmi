package id.sepyankristanto.kalkulatorbmi;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText tinggi;
    private EditText bobot;
    private EditText umur;
    private RadioGroup rgGender;
    private RadioButton rdGender;

    int tampilBerat;
    int tampilTinggi;
    int tampilUmur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tinggi= (EditText)findViewById(R.id.inputTinggi);
        bobot = (EditText)findViewById(R.id.inputBerat);
        umur = (EditText)findViewById(R.id.inputUmur);
        rgGender = (RadioGroup)findViewById(R.id.pilihGender);
        Integer pilihGender = rgGender.getCheckedRadioButtonId();
        rdGender=(RadioButton)findViewById(pilihGender);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void krgBerat (View view){
        tampilBerat = tampilBerat - 1;
        displayBerat(tampilBerat);
    }
    public void tmbBerat (View view){
        tampilBerat = tampilBerat + 1;
        displayBerat(tampilBerat);
    }

    public void krgTinggi (View view){
        tampilTinggi = tampilTinggi - 1;
        displayTinggi(tampilTinggi);
    }
    public void tmbTinggi (View view){
        tampilTinggi = tampilTinggi + 1;
        displayTinggi(tampilTinggi);
    }

    public void krgUmur(View view) {
        tampilUmur = tampilUmur - 1;
        displayUmur(tampilUmur);
    } public void tmbUmur(View view){
        tampilUmur = tampilUmur + 1;
        displayUmur(tampilUmur);
    }


    private void displayBerat(int number){
        EditText inputBerat = (EditText) findViewById(R.id.inputBerat);
        inputBerat.setText("" + number)
    }
    private void displayTinggi(int number){
        EditText inputTinggi = (EditText) findViewById(R.id.inputTinggi);
        inputTinggi.setText("" + number)
    }
    private void displayUmur(int number){
        EditText inputUmur = (EditText) findViewById(R.id.inputUmur);
        inputUmur.setText("" + number)
    }




}