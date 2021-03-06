package mibh.mis.tmsland.realm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by ponlakiss on 05/13/2016.
 */
public class ImageTms extends RealmObject {

    private String workId;
    private String groupType;
    private String typeImg;
    @PrimaryKey
    private String fileName;
    private String docItem;
    private String lat;
    private String lng;
    private String dateImg;
    private String statUpd;
    private String commentImg;
    private String truckId;
    private String driverId;
    private String firstname;
    private String lastname;
    private String locationName;

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getTypeImg() {
        return typeImg;
    }

    public void setTypeImg(String typeImg) {
        this.typeImg = typeImg;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDocItem() {
        return docItem;
    }

    public void setDocItem(String docItem) {
        this.docItem = docItem;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getDateImg() {
        return dateImg;
    }

    public void setDateImg(String dateImg) {
        this.dateImg = dateImg;
    }

    public String getStatUpd() {
        return statUpd;
    }

    public void setStatUpd(String statUpd) {
        this.statUpd = statUpd;
    }

    public String getCommentImg() {
        return commentImg;
    }

    public void setCommentImg(String commentImg) {
        this.commentImg = commentImg;
    }

    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
