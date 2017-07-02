package hibernate;

public class Data  implements java.io.Serializable {
     private String idx;
     private String namex;
     private String emailx;
     private String musicx;
     private int mcount;
     private String friendx;
     private int fcount;
     private String picture;

    public Data() {
    }

    public Data(String idx, String namex, String emailx, String musicx, int mcount, String friendx, int fcount, String picture) {
       this.idx = idx;
       this.namex = namex;
       this.emailx = emailx;
       this.musicx = musicx;
       this.mcount = mcount;
       this.friendx = friendx;
       this.fcount = fcount;
    }
   
    public String getIdx() {
        return this.idx;
    }
    
    public void setIdx(String idx) {
        this.idx = idx;
    }
    public String getNamex() {
        return this.namex;
    }
    
    public void setNamex(String namex) {
        this.namex = namex;
    }
    public String getEmailx() {
        return this.emailx;
    }
    
    public void setEmailx(String emailx) {
        this.emailx = emailx;
    }
    public String getMusicx() {
        return this.musicx;
    }
    
    public void setMusicx(String musicx) {
        this.musicx = musicx;
    }
    public int getMcount() {
        return this.mcount;
    }
    
    public void setMcount(int mcount) {
        this.mcount = mcount;
    }
    public String getFriendx() {
        return this.friendx;
    }
    
    public void setFriendx(String friendx) {
        this.friendx = friendx;
    }
    public int getFcount() {
        return this.fcount;
    }
    
    public void setFcount(int fcount) {
        this.fcount = fcount;
    }
    public String getPicture() {
        return this.picture;
    }
    
    public void setPicture(String picture) {
        this.picture = picture;
    }
}


