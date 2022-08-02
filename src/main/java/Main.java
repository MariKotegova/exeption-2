public class Main {
    public static void main(String[] arg){
       for (Event event: getMovie()){
           validEvent(event);
       }

       for(Event event: getTheatre()){
           validEvent(event);
       }

        System.out.println("Все поля проверенны");
    }

    static Movie[] getMovie(){

        return new Movie[]{
                new Movie("Начало", 2010, 16 ),
                new Movie("А зори здесь тихие", 1988, 18),
                new Movie("Гарри поттер", 2000, 12),
                new Movie("iiii", 1900, 19)
        };
    }
    public static Theatre[] getTheatre (){

        return new Theatre[]{
                new Theatre("Анна коренина", 1650, 15),
                new Theatre("hhhhh", 2010, 16),
                new Theatre("nnnn", 2017, 5)
        };

    }
    public static void validEvent (Event event) throws RuntimeException{
        System.out.println(event.toString());
        if (event.title== null || event.age == 0 || event.releaseYear == 0){
          throw new RuntimeException(" Проверьте поля, не все заполненны корректно");
        }
    }
}
