package sample;

import java.io.Serializable;

public class Rating implements Serializable {

    private static final long serialVersionUID = 1L;

    private int reviewId;
    private int stars;
    private String color;

    public Rating() {
    }

    public Rating(int reviewId, int stars, String color) {
        this.reviewId = reviewId;
        this.stars = stars;
        this.color = color;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
