package id.putraprima.mvvmlogin.models;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelLogin implements Parcelable {
    String password="raihan";
    String username ="raihanrach@gmail.com";

    public ModelLogin(Parcel in) {
        password = in.readString();
        username = in.readString();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static final Creator<ModelLogin> CREATOR = new Creator<ModelLogin>() {
        @Override
        public ModelLogin createFromParcel(Parcel in) {
            return new ModelLogin(in);
        }

        @Override
        public ModelLogin[] newArray(int size) {
            return new ModelLogin[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(password);
        parcel.writeString(username);
    }
}
