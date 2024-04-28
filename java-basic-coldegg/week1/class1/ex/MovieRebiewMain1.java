package class1.ex;

public class MovieRebiewMain1 {

    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview();
        movie1.title = "인셉션";
        movie1.review = "훌륭한 영화 별 다섯백오십개";

        MovieReview movie2 = new MovieReview();
        movie2.title = "해리포터";
        movie2.review = "호그와트로 편입하고 싶다";

        System.out.println("영화 제목: " + movie1.title + ", 리뷰: " + movie1.review);
    }
}
