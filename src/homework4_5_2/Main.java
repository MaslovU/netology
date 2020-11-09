package homework4_5_2;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Candidate> setCandidates = new ArrayList<>();
        while (true) {
            Candidate candidate = new Candidate();
            System.out.println("Введите информацию о кандидате (для завершения введите пустую строку): ");
            System.out.println("\tФамилия Имя Отчество, пол, возраст, релевантность резюме, оценка на собеседовании:");
            System.out.println("\tfor example: Иванов Иван Иванович, муж, 25, 4, 5");
            System.out.println("Фамилия Имя Отчество:");
            String answerSurnameNamePatronymic = scanner.nextLine();
            if (answerSurnameNamePatronymic.isEmpty()) {
                break;
            }
            candidate.setSurnameNamePatronymic(answerSurnameNamePatronymic);
            System.out.println("Пол:");
            String sex = scanner.nextLine();
            candidate.setSex(sex);
            System.out.println("Возраст:");
            String age = scanner.nextLine();
            candidate.setAge(age);
            System.out.println("Релевантность резюме:");
            String relevance = scanner.nextLine();
            candidate.setRelevance(Integer.parseInt(relevance));
            System.out.println("Оценка на собеседовании:");
            String rating = scanner.nextLine();
            candidate.setRating(Integer.parseInt(rating));
            setCandidates.add(candidate);
        }
        Comparator<Candidate> compareByName = Comparator
                .comparing(Candidate::getRelevance)
                .thenComparing(Candidate::getRating);

        Collections.sort(setCandidates, compareByName);

        System.out.println("Список кандидатов: ");
        for (Candidate element: setCandidates) {
            System.out.println(element);
        }
    }
}