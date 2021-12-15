package com.example.retrofitusingrecycleview.DataModel;

import android.os.Parcel;
import android.os.Parcelable;

public class Files implements Parcelable {


        private String voice_path;

        private String finished_index;

        private String android_token;

        private String created_at;

        private String isVideo;

        private String encoding;

        private String isYoutube;

        private String job_key;

        private String youtube_link;

        private String piano_path;

        private String number_of_stems;

        private String job_status;

        private String file;

        private String ios_token;

        private String updated_at;

        private String user_id;

        private String other_path;

        private String drum_path;

        private String bass_path;

        private String id;

        private String present_index;

        private String music_path;

        public String getVoice_path ()
        {
            return voice_path;
        }

        public void setVoice_path (String voice_path)
        {
            this.voice_path = voice_path;
        }

        public String getFinished_index ()
        {
            return finished_index;
        }

        public void setFinished_index (String finished_index)
        {
            this.finished_index = finished_index;
        }

        public String getAndroid_token ()
        {
            return android_token;
        }

        public void setAndroid_token (String android_token)
        {
            this.android_token = android_token;
        }

        public String getCreated_at ()
        {
            return created_at;
        }

        public void setCreated_at (String created_at)
        {
            this.created_at = created_at;
        }

        public String getIsVideo ()
        {
            return isVideo;
        }

        public void setIsVideo (String isVideo)
        {
            this.isVideo = isVideo;
        }

        public String getEncoding ()
        {
            return encoding;
        }

        public void setEncoding (String encoding)
        {
            this.encoding = encoding;
        }

        public String getIsYoutube ()
        {
            return isYoutube;
        }

        public void setIsYoutube (String isYoutube)
        {
            this.isYoutube = isYoutube;
        }

        public String getJob_key ()
        {
            return job_key;
        }

        public void setJob_key (String job_key)
        {
            this.job_key = job_key;
        }

        public String getYoutube_link ()
        {
            return youtube_link;
        }

        public void setYoutube_link (String youtube_link)
        {
            this.youtube_link = youtube_link;
        }

        public String getPiano_path ()
        {
            return piano_path;
        }

        public void setPiano_path (String piano_path)
        {
            this.piano_path = piano_path;
        }

        public String getNumber_of_stems ()
        {
            return number_of_stems;
        }

        public void setNumber_of_stems (String number_of_stems)
        {
            this.number_of_stems = number_of_stems;
        }

        public String getJob_status ()
        {
            return job_status;
        }

        public void setJob_status (String job_status)
        {
            this.job_status = job_status;
        }

        public String getFile ()
        {
            return file;
        }

        public void setFile (String file)
        {
            this.file = file;
        }

        public String getIos_token ()
        {
            return ios_token;
        }

        public void setIos_token (String ios_token)
        {
            this.ios_token = ios_token;
        }

        public String getUpdated_at ()
        {
            return updated_at;
        }

        public void setUpdated_at (String updated_at)
        {
            this.updated_at = updated_at;
        }

        public String getUser_id ()
        {
            return user_id;
        }

        public void setUser_id (String user_id)
        {
            this.user_id = user_id;
        }

        public String getOther_path ()
        {
            return other_path;
        }

        public void setOther_path (String other_path)
        {
            this.other_path = other_path;
        }

        public String getDrum_path ()
        {
            return drum_path;
        }

        public void setDrum_path (String drum_path)
        {
            this.drum_path = drum_path;
        }

        public String getBass_path ()
        {
            return bass_path;
        }

        public void setBass_path (String bass_path)
        {
            this.bass_path = bass_path;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getPresent_index ()
        {
            return present_index;
        }

        public void setPresent_index (String present_index)
        {
            this.present_index = present_index;
        }

        public String getMusic_path ()
        {
            return music_path;
        }

        public void setMusic_path (String music_path)
        {
            this.music_path = music_path;
        }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.voice_path);
        dest.writeString(this.finished_index);
        dest.writeString(this.android_token);
        dest.writeString(this.created_at);
        dest.writeString(this.isVideo);
        dest.writeString(this.encoding);
        dest.writeString(this.isYoutube);
        dest.writeString(this.job_key);
        dest.writeString(this.youtube_link);
        dest.writeString(this.piano_path);
        dest.writeString(this.number_of_stems);
        dest.writeString(this.job_status);
        dest.writeString(this.file);
        dest.writeString(this.ios_token);
        dest.writeString(this.updated_at);
        dest.writeString(this.user_id);
        dest.writeString(this.other_path);
        dest.writeString(this.drum_path);
        dest.writeString(this.bass_path);
        dest.writeString(this.id);
        dest.writeString(this.present_index);
        dest.writeString(this.music_path);
    }

    public void readFromParcel(Parcel source) {
        this.voice_path = source.readString();
        this.finished_index = source.readString();
        this.android_token = source.readString();
        this.created_at = source.readString();
        this.isVideo = source.readString();
        this.encoding = source.readString();
        this.isYoutube = source.readString();
        this.job_key = source.readString();
        this.youtube_link = source.readString();
        this.piano_path = source.readString();
        this.number_of_stems = source.readString();
        this.job_status = source.readString();
        this.file = source.readString();
        this.ios_token = source.readString();
        this.updated_at = source.readString();
        this.user_id = source.readString();
        this.other_path = source.readString();
        this.drum_path = source.readString();
        this.bass_path = source.readString();
        this.id = source.readString();
        this.present_index = source.readString();
        this.music_path = source.readString();
    }

    public Files() {
    }

    protected Files(Parcel in) {
        this.voice_path = in.readString();
        this.finished_index = in.readString();
        this.android_token = in.readString();
        this.created_at = in.readString();
        this.isVideo = in.readString();
        this.encoding = in.readString();
        this.isYoutube = in.readString();
        this.job_key = in.readString();
        this.youtube_link = in.readString();
        this.piano_path = in.readString();
        this.number_of_stems = in.readString();
        this.job_status = in.readString();
        this.file = in.readString();
        this.ios_token = in.readString();
        this.updated_at = in.readString();
        this.user_id = in.readString();
        this.other_path = in.readString();
        this.drum_path = in.readString();
        this.bass_path = in.readString();
        this.id = in.readString();
        this.present_index = in.readString();
        this.music_path = in.readString();
    }

    public static final Parcelable.Creator<Files> CREATOR = new Parcelable.Creator<Files>() {
        @Override
        public Files createFromParcel(Parcel source) {
            return new Files(source);
        }

        @Override
        public Files[] newArray(int size) {
            return new Files[size];
        }
    };
}
