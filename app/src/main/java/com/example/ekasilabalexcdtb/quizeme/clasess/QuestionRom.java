package com.example.ekasilabalexcdtb.quizeme.clasess;

public class QuestionRom {

    // bible questions
    private String mQuestions[] = {
            "Who is Jesus Mother?",
            "How many Tribes did the Israel have?",
            "What is God Name?",
            "Who told Eve to eat the forbidden tree?",
            "What is Adam date of Birth?"

    };

    // bible choice

    private String mChoices[][] = {
            {"Ruth", "Mary", "Sarah"},
            {"13", "15", "12"},
            {"Lord", "God", "Jehovah"},
            {"Satan", "Serpent", "God"},
            {"5027B.C.E", "4026B.C.E", "3020B.C.E"}
    };

    // Bible correct answers

    private String mCorrectAnswers[] = {"Mary", "13", "Jehovah", "Satan", "4026B.C.E"};

    // Place questions
    private String pQuestions[] = {
            "Who was the first person to clim table mountain?",
            "How old is Robben Island prison?",
            "When was the mine at Gold Reef closed?",
            "Who discovered the Cango Caves?",
            "Two Oceans Aquarium is known for what?"

    };

    // place choice

    private String pChoices[][] = {
            {"António de Saldanha", "Albert instaine", "Charlotte Nikoi"},
            {"20", "43", "56"},
            {"1971", "1990", "1980"},
            {"joe Du Toit", "Jacobus Van Zyl", "Van der Merwe"},
            {"Two Oceans", "Glass view oceans", "Tourist Catch"}
    };

    // place correct answers
    private String pCorrectAnswers[] = {"António de Saldanha", "56", "1971", "Jacobus Van Zyl", "Two Oceans"};


    // Artists questions
    private String aQuestions[] = {
            "Which SA Artists is Rich?",
            "How many Awards did Kwesta get at 2017 SAMA",
            "Which Famous SA artists died at 18 September 2016 ?",
            "Who is the Master of the ultimate mix?",
            "Which SA Artists is best rapper?"

    };

    // Artist choice

    private String aChoices[][] = {
            {"Black Coffee", "Hugh Masekela", "AKA"},
            {"4", "8", "6"},
            {"Flabba", "Mandoza", "Lundi Tyamara"},
            {"DJ Kent", "Euphonic", "Stakev "},
            {"HHP", "Cassper Nyovest", "AKA"}
    };

    // Artists correct answers

    private String aCorrectAnswers[] = {"Black Coffee", "6", "Mandoza", "DJ Kent", "Cassper Nyovest"};


    // Get length of bible questions
    public int getLenth() {
        return mQuestions.length;
    }


    // method returns number of bible questions.
    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
    // End of return bible questions.



    // Get lenght of place question
    public int getLenths() {
        return pQuestions.length;
    }

    // method returns number of place questions.
    public String getQuestions(int a) {
        String question = pQuestions[a];
        return question;
    }

    public String getChoice4(int a) {
        String choice0 = pChoices[a][0];
        return choice0;
    }

    public String getChoice5(int a) {
        String choice1 = pChoices[a][1];
        return choice1;
    }

    public String getChoice6(int a) {
        String choice2 = pChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswers(int a) {
        String answer = pCorrectAnswers[a];
        return answer;
    }
    // end of  return place questions.


    // Get lenght of Artists question
    public int getLenthss() {
        return aQuestions.length;
    }

    // method returns number of Artists questions.
    public String getQuestionss(int a) {
        String question = aQuestions[a];
        return question;
    }

    public String getChoice7(int a) {
        String choice0 = aChoices[a][0];
        return choice0;
    }

    public String getChoice8(int a) {
        String choice1 = aChoices[a][1];
        return choice1;
    }

    public String getChoice9(int a) {
        String choice2 = aChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswerss(int a) {
        String answer = aCorrectAnswers[a];
        return answer;
    }
    // end of  return artists questions


}


