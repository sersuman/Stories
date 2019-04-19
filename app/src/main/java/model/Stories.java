package model;

public class Stories {
    private int imgProfileId, imgStoryId;

    public Stories(int imgProfileId, int imgStoryId) {
        this.imgProfileId = imgProfileId;
        this.imgStoryId = imgStoryId;
    }

    public int getImgProfileId() {
        return imgProfileId;
    }

    public void setImgProfileId(int imgProfileId) {
        this.imgProfileId = imgProfileId;
    }

    public int getImgStoryId() {
        return imgStoryId;
    }

    public void setImgStoryId(int imgStoryId) {
        this.imgStoryId = imgStoryId;
    }
}
