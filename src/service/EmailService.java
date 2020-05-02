package service;

import model.Email;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class EmailService {

    public static String GenerateEmailAddres (Email email) {

        String formattedEmail = email.getFirstName().toLowerCase() + "." + email.getLastName().toLowerCase() +
                "@" + email.getDepartment().toLowerCase() + "." + "company.com";
        String normalizedString = Normalizer.normalize(formattedEmail, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalizedString).replaceAll("");
    }
}
