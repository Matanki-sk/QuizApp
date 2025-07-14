package util;

import java.util.ArrayList;
import java.util.List;
import model.Question;

public class QuestionBank {
      public static List<Question> getQuestions() {
        List<Question> list = new ArrayList<>();

        list.add(new Question("Which is the official language for Android Development?",
                new String[]{"Java", "Kotlin", "C++", "JavaScript"}, "Kotlin"));

        list.add(new Question("What is the size of a boolean variable?",
                new String[]{"8 bit", "16 bit", "32 bit", "Not precisely defined"}, "Not precisely defined"));

        list.add(new Question("What is the default value of a boolean variable?",
                new String[]{"true", "false", "null", "Not defined"}, "false"));

        list.add(new Question("What's the default value of a long variable?",
                new String[]{"0", "0.0", "0L", "Don't know"}, "0L"));

        list.add(new Question("What kind of variables can a class consist of?",
                new String[]{"class, instance", "class, local, instance", "class only", "class and local"}, "class, local, instance"));

        list.add(new Question("What is function overloading?",
                new String[]{"Same name, different parameters", "Same name, different return type", "Methods with same name", "None of these"}, "Same name, different parameters"));

        list.add(new Question("What is Serialization?",
                new String[]{"Writing object state to another object", "Writing object state to a byte stream", "Both above", "None above"}, "Writing object state to a byte stream"));

        list.add(new Question("Which of the following is thread-safe?",
                new String[]{"StringBuilder", "StringBuffer", "Both", "None"}, "StringBuffer"));

        list.add(new Question("What is the size of a boolean variable?",
                new String[]{"8 bit", "16 bit", "32 bit", "Not precisely defined"}, "Not precisely defined"));

        list.add(new Question("Which is the official language for Android development?",
                new String[]{"Kotlin", "Java", "C++", "Not defined"}, "Kotlin"));

        return list;
    }
}
