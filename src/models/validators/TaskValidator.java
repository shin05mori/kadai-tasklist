package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class TaskValidator {
    public static List<String> validate(Task t) {
        List<String> error = new ArrayList<String>();

        String content_error = validateContent(t.getContent());
        if(!content_error.equals("")) {
            error.add(content_error);
        }

        return error;
    }

    private static String validateContent(String content) {
        if(content == null || content.equals("")) {
            return "メッセージを入力してください。";
        }

        return "";
    }
}