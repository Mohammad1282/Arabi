package com.example.text_to_speech.WORDS;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.text_to_speech.ALPHABETS.SingleAlphabet;
import com.example.text_to_speech.R;

import java.util.ArrayList;

public class SingleWord extends AppCompatActivity {
    EditText text ;
    Button talk ;
    Button check ;
    ImageView arabic, english;
    TextView textView ;
    private static final int RECOGNIZER_RESULT = 1;
    MediaPlayer mediaPlayer;

    private SpeechRecognizer speechRecognizer ;
    private Intent speechRecognizerIntent ;
    String keeper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_word);

        arabic = findViewById(R.id.soundplayerarabic);
        english = findViewById(R.id.soundplayerenglish);
        textView = findViewById(R.id.wordtext);

        SharedPreferences sp =getApplicationContext().getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);
        String str1 =sp.getString("TheWorld", "");
        String str2 =sp.getString("ThePronunciation", "");
        int str3 =sp.getInt("TheSoundEnglish", -1);
        int str4 = sp.getInt("TheSoundArabic",-1);
       // int str4 =sp.getInt("thepic", -1 ) ;
        //String str3 =sp.getString("thepronucVibrio", "");
        //String str4 =sp.getString("thepronucslot", "");
        //String str5 =sp.getString("thepronucbraek", "");

        textView.setText(str1);

       // final MediaPlayer mediaPlayer = MediaPlayer.create(this, str3);


        arabic.setOnClickListener(v -> {
            mediaPlayer = MediaPlayer.create(this,str4);
            mediaPlayer.start();
        });

        english.setOnClickListener(v -> {
            mediaPlayer = MediaPlayer.create(this,str3);
            mediaPlayer.start();
        });

        checkVoiceCommandPermission();
        speechRecognizer =  SpeechRecognizer.createSpeechRecognizer(SingleWord.this);
        speechRecognizerIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        speechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        speechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ar-JO");
        //Locale.getDefault()


        speechRecognizer.setRecognitionListener(new RecognitionListener() {
            @Override
            public void onReadyForSpeech(Bundle bundle) {

            }

            @Override
            public void onBeginningOfSpeech() {

            }

            @Override
            public void onRmsChanged(float v) {

            }

            @Override
            public void onBufferReceived(byte[] bytes) {

            }

            @Override
            public void onEndOfSpeech() {

            }

            @Override
            public void onError(int i) {

            }

            @Override
            public void onResults(Bundle bundle) {
                ArrayList<String> matchesFound = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);

                if(matchesFound!=null){
                    keeper =matchesFound.get(0);
                    Toast.makeText(SingleWord.this, "Result = " + keeper, Toast.LENGTH_SHORT).show();
                    text.setText(keeper);
                }
            }

            @Override
            public void onPartialResults(Bundle bundle) {

            }

            @Override
            public void onEvent(int i, Bundle bundle) {

            }
        });




//        TextView textView =findViewById(R.id.textView);
        text = (EditText) findViewById(R.id.text);
        talk = (Button) findViewById(R.id.Talk);
        check = (Button) findViewById(R.id.check);


        talk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
////                Intent text  = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
////                text.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
////                text.putExtra(RecognizerIntent.EXTRA_PROMPT,"speech to text");
////                startActivityForResult(text,RECOGNIZER_RESULT);
//                Intent voicerecogize = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
//
//                voicerecogize.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, getClass().getPackage().getName());
//                voicerecogize.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);// spilling
//                voicerecogize.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ar-JO");
//
//                startActivityForResult(voicerecogize,RECOGNIZER_RESULT);

                Toast toast = new Toast(SingleWord.this);
                ImageView imageView = new ImageView(SingleWord.this);
                imageView.setImageResource(R.drawable.mic);
                toast.setView(imageView);
                toast.show();

                speechRecognizer.startListening(speechRecognizerIntent);
                keeper= "" ;

            }
        });



        //String str3 =sp.getString("thepronucVibrio", "");
        //String str4 =sp.getString("thepronucslot", "");
        //String str5 =sp.getString("thepronucbraek", "");


        final MediaPlayer mediaPlayer = MediaPlayer.create(this, str3);

//        textView.setText(str1);


        check.setOnClickListener(view -> {
            /*
            if(text.getText().toString().equals(str3+" "+str4+" "+str5)){
                Toast.makeText(activity_singleAlphabet.this,"correct",Toast.LENGTH_SHORT).show();

            }*/
            if(text.getText().toString().equals(str2)){

                Toast.makeText(SingleWord.this,"correct",Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(SingleWord.this,"false",Toast.LENGTH_SHORT).show();
            }
        });



    }
    private void checkVoiceCommandPermission(){

        if((ContextCompat.checkSelfPermission(SingleWord.this, Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_GRANTED)){

            Toast.makeText(SingleWord.this,"You are already got permission",Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.RECORD_AUDIO}, 1 );
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            if(ContextCompat.checkSelfPermission(this,Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(SingleWord.this,"You got permission",Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(SingleWord.this,"Denied",Toast.LENGTH_LONG).show();
        }
    }
}

