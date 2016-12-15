package com.example.administrator.scrollviewtest;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.File;

/**
 * Created by Administrator on 2016/12/15.
 */
public class ImageInfo implements Parcelable {
    private static final long serialVersionUID = -3753345306395582567L;
    private File imageFile;
    private boolean isSelected = false;



    public File getImageFile() {
        return imageFile;
    }

    public void setImageFile(File imageFile) {
        this.imageFile = imageFile;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ImageInfo imageInfo = (ImageInfo)obj;
        if(isSelected != imageInfo.isSelected()) return false;
        return getImageFile().equals(imageInfo.getImageFile());
    }

    @Override
    public int hashCode() {
        int result = getImageFile().hashCode();
        result = 31 * result + (isSelected() ? 1 :0);
        return result;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.imageFile);
        parcel.writeByte(isSelected?(byte) 1 : (byte) 0);
    }
    public ImageInfo(){

    }
    protected ImageInfo(Parcel in){
        this.imageFile = (File)in.readSerializable();
        this.isSelected = in.readByte() != 0;
    }
}
