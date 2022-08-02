public abstract class Event {
    public String title;
    public int releaseYear;
    public int age;

    public Event(String title, int releaseYear, int age){
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    @Override
    public String toString (){
        return "Фильм '" + title + "' " + releaseYear +
                " года выпуска, разрешен для зрителей старше " + age + " лет";
    }
}
