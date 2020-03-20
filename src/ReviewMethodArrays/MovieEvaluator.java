package ReviewMethodArrays;

public class MovieEvaluator {
    public static void main(String[] args){
        evaluateMovie();
        decideMovie(5.6,84500,154000.89);

    }
    public static void evaluateMovie(){
       int rate = 0;
       int imdbScore= 10;
       int totalVotes=5;
       int boxOffice=20;

        rate = imdbScore*totalVotes/boxOffice;
       if(rate>10){
           System.out.println("Watch the movie");
       }
       else{
           System.out.println("Not watch it");

        }
    }
    public static void decideMovie(double imdb, int totalVotes,double boxOffice){
        if(imdb*totalVotes/boxOffice > 10){
            System.out.println("What the movie");
        }
        else{
            System.out.println("Do not watch the movie");
        }
    }
}
