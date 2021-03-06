package com.example.text_to_speech.WORDS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.text_to_speech.R;

public class Words extends AppCompatActivity {

    Button greet , peace , same , how , good , morning , evening , welcome , come , thank , nothing , bye , bye2 , hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        SharedPreferences sp ;
        sp = getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);

        greet = (Button) findViewById(R.id.greetings);
        peace = (Button) findViewById(R.id.peace);
        same = (Button) findViewById(R.id.same);
        how = (Button) findViewById(R.id.how);
        good = (Button) findViewById(R.id.good);
        morning = (Button) findViewById(R.id.morning);
        evening = (Button) findViewById(R.id.evening);
        welcome = (Button) findViewById(R.id.welcome);
        come = (Button) findViewById(R.id.come);
        thank = (Button) findViewById(R.id.thank);
        nothing = (Button) findViewById(R.id.nothing);
        bye = (Button) findViewById(R.id.bye);
        bye2 = (Button) findViewById(R.id.bye_bye);
        hello = (Button) findViewById(R.id.hello);

        greet.setOnClickListener(v -> {
            String word = "التحيات" ;
            String pronunciation = "التحيات" ;
            int SoundEnglish = R.raw.greetings ;
            int SoundArabic = R.raw.greetingarabic;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheWorld",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundEnglish",SoundEnglish);
            editor.putInt("TheSoundArabic",SoundArabic);

            editor.apply();

            Intent intent = new Intent(Words.this, SingleWord.class);
            startActivity(intent);
        });

        peace.setOnClickListener(v -> {
            String word = "السلام عليكم" ;
            String pronunciation = "السلام عليكم" ;
            int SoundEnglish = R.raw.peace_be_with_you ;
            int SoundArabic = R.raw.peaceuponarabic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheWorld",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundEnglish",SoundEnglish);
            editor.putInt("TheSoundArabic",SoundArabic);

            editor.apply();

            Intent intent = new Intent(Words.this, SingleWord.class);
            startActivity(intent);

        });

        same.setOnClickListener(v -> {
            String word = "عليكم السلام" ;
            String pronunciation = "عليكم السلام" ;
            int SoundEnglish = R.raw.sam_to_you ;
            int SoundArabic = R.raw.sametoyouarabic ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheWorld",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundEnglish",SoundEnglish);
            editor.putInt("TheSoundArabic",SoundArabic);

            editor.apply();

            Intent intent = new Intent(Words.this, SingleWord.class);
            startActivity(intent);
        });

        how.setOnClickListener(v -> {
            String word = "كيف حالك" ;
            String pronunciation = "كيف حالك" ;
            int SoundEnglish = R.raw.how_are_you ;
            int SoundArabic = R.raw.howareyouarabic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheWorld",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundEnglish",SoundEnglish);
            editor.putInt("TheSoundArabic",SoundArabic);

            editor.apply();

            Intent intent = new Intent(Words.this, SingleWord.class);
            startActivity(intent);
        });

        good.setOnClickListener(v -> {
            String word = "بخير" ;
            String pronunciation = "بخير" ;
            int SoundEnglish = R.raw.fine_thanks_god ;
            int SoundArabic = R.raw.goodarabic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheWorld",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundEnglish",SoundEnglish);
            editor.putInt("TheSoundArabic",SoundArabic);

            editor.apply();

            Intent intent = new Intent(Words.this, SingleWord.class);
            startActivity(intent);
        });

        morning.setOnClickListener(v -> {
            String word = "صباح الخير" ;
            String pronunciation = "صباح الخير" ;
            int SoundEnglish = R.raw.good_morning ;
            int SoundArabic = R.raw.goodmorningarabic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheWorld",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundEnglish",SoundEnglish);
            editor.putInt("TheSoundArabic",SoundArabic);

            editor.apply();

            Intent intent = new Intent(Words.this, SingleWord.class);
            startActivity(intent);
        });

        evening.setOnClickListener(v -> {
            String word = "مساء الخير" ;
            String pronunciation = "مساء الخير" ;
            int SoundEnglish = R.raw.good_evening ;
            int SoundArabic = R.raw.goodeveningarabic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheWorld",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundEnglish",SoundEnglish);
            editor.putInt("TheSoundArabic",SoundArabic);

            editor.apply();

            Intent intent = new Intent(Words.this, SingleWord.class);
            startActivity(intent);
        });

        welcome.setOnClickListener(v -> {
            String word = "اهلا وسهلا" ;
            String pronunciation = "اهلا وسهلا" ;
            int SoundEnglish = R.raw.welcome ;
            int SoundArabic = R.raw.welcomearabic ;
            int SoundBoy = R.raw.welcomeboy;
            int SoundGirl = R.raw.welcomegirl;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheWorld",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundEnglish",SoundEnglish);
            editor.putInt("TheSoundArabic",SoundArabic);
            editor.putInt("TheSoundBoy",SoundBoy);
            editor.putInt("TheSoundGirl",SoundGirl);

            editor.apply();

            Intent intent = new Intent(Words.this, SingleWord.class);
            startActivity(intent);
        });

        come.setOnClickListener(v -> {
            String word = "تفضل" ;
            String pronunciation = "تفضل" ;
            int SoundEnglish = R.raw.please_come_in ;
            int SoundArabic = R.raw.comeinarabic ;
            int SoundGirl = R.raw.comeingirl;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheWorld",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundEnglish",SoundEnglish);
            editor.putInt("TheSoundArabic",SoundArabic);
            editor.putInt("TheSoundGirl",SoundGirl);

            editor.apply();

            Intent intent = new Intent(Words.this, SingleWord.class);
            startActivity(intent);
        });

        thank.setOnClickListener(v -> {
            String word = "شكرا" ;
            String pronunciation = "شكرا" ;
            int SoundEnglish = R.raw.thank_you ;
            int SoundArabic = R.raw.thankyouarabic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheWorld",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundEnglish",SoundEnglish);
            editor.putInt("TheSoundArabic",SoundArabic);

            editor.apply();

            Intent intent = new Intent(Words.this, SingleWord.class);
            startActivity(intent);
        });

        nothing.setOnClickListener(v -> {
            String word = "عفوا" ;
            String pronunciation = "عفوا" ;
            int SoundEnglish = R.raw.for_nothing ;
            int SoundArabic = R.raw.fornothingarabic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheWorld",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundEnglish",SoundEnglish);
            editor.putInt("TheSoundArabic",SoundArabic);

            editor.apply();

            Intent intent = new Intent(Words.this, SingleWord.class);
            startActivity(intent);
        });

        bye.setOnClickListener(v -> {
            String word = "مع السلامه" ;
            String pronunciation = "مع السلامه" ;
            int SoundEnglish = R.raw.good_bye ;
            int SoundArabic = R.raw.goodbyearabic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheWorld",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundEnglish",SoundEnglish);
            editor.putInt("TheSoundArabic",SoundArabic);

            editor.apply();

            Intent intent = new Intent(Words.this, SingleWord.class);
            startActivity(intent);
        });

        bye2.setOnClickListener(v -> {
            String word = "في امان الله" ;
            String pronunciation = "في امان الله" ;
            int SoundEnglish = R.raw.bye_bye ;
            int SoundArabic = R.raw.byebyearabic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheWorld",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundEnglish",SoundEnglish);
            editor.putInt("TheSoundArabic",SoundArabic);

            editor.apply();

            Intent intent = new Intent(Words.this, SingleWord.class);
            startActivity(intent);
        });

        hello.setOnClickListener(v -> {
            String word = "مرحبا" ;
            String pronunciation = "مرحبا" ;
            int SoundEnglish = R.raw.hello ;
            int SoundArabic = R.raw.helloarabic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheWorld",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundEnglish",SoundEnglish);
            editor.putInt("TheSoundArabic",SoundArabic);

            editor.apply();

            Intent intent = new Intent(Words.this, SingleWord.class);
            startActivity(intent);
        });
    }
}