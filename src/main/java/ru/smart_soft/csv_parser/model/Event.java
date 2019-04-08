package ru.smart_soft.csv_parser.model;

import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "csv_parser")
@Access(AccessType.FIELD)
public class Event extends BaseEntity {

    @Column(name = "ssoid")
    private String userId;

    @Column(name = "ts")
    private String time;

    @Column(name = "grp")
    private String group;

    @Column(name = "type")
    private String type;

    @Column(name = "subtype")
    private String subtype;

    @Column(name = "url")
    @URL
    private String url;

    @Column(name = "orgid")
    private String orgId;

    @Column(name = "formid")
    private String formid;

    @Column(name = "code")
    private String ltpa;

    @Column(name = "ltpa")
    private String code;

    @Column(name = "sudirresponse")
    private String sudirresponse;

    @Column(name = "ymdh", columnDefinition = "timestamp")
    private String dateTime;

    public Event() {

    }

    public Event(String userId, String time, String group, String type, String subtype, String url, String orgId, String formid, String ltpa, String code, String sudirresponse, String dateTime) {
        this.userId = userId;
        this.time = time;
        this.group = group;
        this.type = type;
        this.subtype = subtype;
        this.url = url;
        this.orgId = orgId;
        this.formid = formid;
        this.ltpa = ltpa;
        this.code = code;
        this.sudirresponse = sudirresponse;
        this.dateTime = dateTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getFormid() {
        return formid;
    }

    public void setFormid(String formid) {
        this.formid = formid;
    }

    public String getLtpa() {
        return ltpa;
    }

    public void setLtpa(String ltpa) {
        this.ltpa = ltpa;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSudirresponse() {
        return sudirresponse;
    }

    public void setSudirresponse(String sudirresponse) {
        this.sudirresponse = sudirresponse;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "userId='" + userId + '\'' +
                ", time=" + time +
                ", group='" + group + '\'' +
                ", type='" + type + '\'' +
                ", subtype='" + subtype + '\'' +
                ", url=" + url +
                ", orgId='" + orgId + '\'' +
                ", formid='" + formid + '\'' +
                ", ltpa='" + ltpa + '\'' +
                ", code='" + code + '\'' +
                ", sudirresponse='" + sudirresponse + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Event event = (Event) o;
        return Objects.equals(userId, event.userId) &&
                Objects.equals(time, event.time) &&
                Objects.equals(group, event.group) &&
                Objects.equals(type, event.type) &&
                Objects.equals(subtype, event.subtype) &&
                Objects.equals(url, event.url) &&
                Objects.equals(orgId, event.orgId) &&
                Objects.equals(formid, event.formid) &&
                Objects.equals(dateTime, event.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, time, group, type, subtype, url, orgId, formid, dateTime);
    }
}
