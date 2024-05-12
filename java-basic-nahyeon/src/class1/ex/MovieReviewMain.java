package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview pamyo = new MovieReview();
        pamyo.title = "파묘";
        pamyo.review = "재밌음ㄷㄷ";

        //영화 리뷰 정보 출력
        System.out.println("영화 제목: " + pamyo.title + ", 리뷰: " + pamyo.review);
    }
}
