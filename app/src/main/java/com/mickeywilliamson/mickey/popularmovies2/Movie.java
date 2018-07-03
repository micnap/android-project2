package com.mickeywilliamson.mickey.popularmovies2;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Movie POJO class.
 */
public class Movie implements Parcelable {

    // Movie properties.
    private String id;
    private String title;
    private String image;
    private String plot;
    private String rating;
    private String releaseDate;

    // Constructors
    Movie() {}

    private Movie(Parcel in) {
        this.title = in.readString();
        this.image = in.readString();
        this.plot = in.readString();
        this.rating = in.readString();
        this.releaseDate = in.readString();
    }

    // Setters and getters.
    public void setId(String id) { this.id = id; }

    public String getId() { return id; }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getPlot() {
        return plot;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    public void setReleaseDate(String date) {
        this.releaseDate = date;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    // Parcelable implementation.
    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(image);
        dest.writeString(plot);
        dest.writeString(rating);
        dest.writeString(releaseDate);
    }
}


