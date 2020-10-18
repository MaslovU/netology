package homework3_4_2;

public class Main {
    public static void main(String[] args) {
        for (Event event: getMovies()) {
            validEvent(event);
        }
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Начало", 2010, 34),
                new Movie("Начало", 2010, 55)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Вишневый сад", 2016, 13),
                new Theatre("Мастер и Маргарита", 2010, 1),
        };
    }

    public static void validEvent(Event event){
        if (event.age <= 0)
            throw new RuntimeException("Not valid element for " + event.title + " no age");
        if (event.releaseYear <= 0)
            throw new RuntimeException("Not valid element for " + event.title + " no releaseYear");
        if (event.title == null)
            throw new RuntimeException("Not valid element for no title");
    }
}
