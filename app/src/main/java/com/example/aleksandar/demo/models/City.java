package com.example.aleksandar.demo.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Aleksandar on 23.09.2017.
 */

//        "lng": 21.431407,
//        "geonameId": 785842,
//        "countrycode": "MK",
//        "name": "Skopje",
//        "fclName": "city, village,...",
//        "toponymName": "Skopje",
//        "fcodeName": "capital of a political entity",
//        "wikipedia": "en.wikipedia.org/wiki/Skopje",
//        "lat": 41.996457,
//        "fcl": "P",
//        "population": 474889,
//        "fcode": "PPLC"

public class City implements Parcelable {

    @SerializedName("geonameId")
    private int GeonameId;
    @SerializedName("countrycode")
    private String CountryCode;
    @SerializedName("name")
    private String Name;
    @SerializedName("toponymName")
    private String ToponymName;
    @SerializedName("lat")
    private float Lat;
    @SerializedName("lng")
    private float Lng;
    @SerializedName("population")
    private int population;

    public City() {
    }

    protected City(Parcel in) {
        GeonameId = in.readInt();
        CountryCode = in.readString();
        Name = in.readString();
        ToponymName = in.readString();
        Lat = in.readFloat();
        Lng = in.readFloat();
        population = in.readInt();
    }

    public City(int geonameId, String countryCode, String name, String toponymName, float lat, float lng, int population) {
        GeonameId = geonameId;
        CountryCode = countryCode;
        Name = name;
        ToponymName = toponymName;
        Lat = lat;
        Lng = lng;
        this.population = population;
    }

    public int getGeonameId() {
        return GeonameId;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getToponymName() {
        return ToponymName;
    }

    @Override
    public String toString() {
        return "City{" +
                "GeonameId=" + GeonameId +
                ", CountryCode='" + CountryCode + '\'' +
                ", Name='" + Name + '\'' +
                ", ToponymName='" + ToponymName + '\'' +
                ", Lat=" + Lat +
                ", Lng=" + Lng +
                ", population=" + population +
                '}';
    }

    public void setToponymName(String toponymName) {
        ToponymName = toponymName;
    }

    public float getLat() {
        return Lat;
    }

    public void setLat(float lat) {
        Lat = lat;
    }

    public float getLng() {
        return Lng;
    }

    public void setLng(float lng) {
        Lng = lng;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(GeonameId);
        dest.writeString(CountryCode);
        dest.writeString(Name);
        dest.writeString(ToponymName);
        dest.writeFloat(Lat);
        dest.writeFloat(Lng);
        dest.writeInt(population);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<City> CREATOR = new Parcelable.Creator<City>() {
        @Override
        public City createFromParcel(Parcel in) {
            return new City(in);
        }

        @Override
        public City[] newArray(int size) {
            return new City[size];
        }
    };
}
