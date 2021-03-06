package com.example.text_to_speech.QUIZ;

import android.content.Intent;
import android.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Quiz_alph_questions {


    public String mQuestions [] = {
            "حرف الألف",
            "حرف الباء",
            "حرف الجيم",
            "حرف الدال",
            "حرف الهاء",
            "حرف الواو",
            "حرف الزاي",
            "حرف الحاء",
            "حرف الطاء",
            "حرف الياء",
            "حرف الكاف",
            "حرف اللام",
            "حرف الميم",
            "حرف النون",
            "حرف السين",
            "حرف العين",
            "حرف الفاء",
            "حرف الصاد",
            "حرف القاف",
            "حرف الراء",
            "حرف الشين",
            "حرف التاء",
            "حرف الثاء",
            "حرف الخاء",
            "حرف الذال",
            "حرف الضاد",
            "حرف الظاد",
            "حرف الغين",
    };

    public String myCorrectAnswer[]={
            "الف",
            "الباء",
            "جيم",
            "دال",
            "هاء",
            "واو",
            "زاي",
            "حاء",
            "طاء",
            "ياء",
            "كاف",
            "لام",
            "ميم",
            "نون",
            "سين",
            "عين",
            "فاء",
            "صاد",
            "قاف",
            "راء",
            "شين",
            "تاء",
            "ثاء",
            "خاء",
            "ذال",
            "ضاد",
            "ظاد",
            "غين",

    };
    public String getQuestion(int a){
        return mQuestions[a];
    }

    public String getCorrectAnswer(int a) {
        return myCorrectAnswer[a];
    }


}
