package net.fajarachmad.prayer.evaluation.wrapper;

import android.net.Uri;

/**
 * Created by user on 3/11/2016.
 */
public class Reminder {
    private String id;
    private String evaluationId;
    private String message;
    private String time;
    private String tone;
    private String toneUri;
    private boolean repeatSun;
    private boolean repeatMon;
    private boolean repeatTue;
    private boolean repeatWed;
    private boolean repeatThu;
    private boolean repeatFri;
    private boolean repeatSat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTone() {
        return tone;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }

    public String getToneUri() {
        return toneUri;
    }

    public void setToneUri(String toneUri) {
        this.toneUri = toneUri;
    }

    public boolean isRepeatSun() {
        return repeatSun;
    }

    public void setRepeatSun(boolean repeatSun) {
        this.repeatSun = repeatSun;
    }

    public boolean isRepeatMon() {
        return repeatMon;
    }

    public void setRepeatMon(boolean repeatMon) {
        this.repeatMon = repeatMon;
    }

    public boolean isRepeatTue() {
        return repeatTue;
    }

    public void setRepeatTue(boolean repeatTue) {
        this.repeatTue = repeatTue;
    }

    public boolean isRepeatWed() {
        return repeatWed;
    }

    public void setRepeatWed(boolean repeatWed) {
        this.repeatWed = repeatWed;
    }

    public boolean isRepeatThu() {
        return repeatThu;
    }

    public void setRepeatThu(boolean repeatThu) {
        this.repeatThu = repeatThu;
    }

    public boolean isRepeatFri() {
        return repeatFri;
    }

    public void setRepeatFri(boolean repeatFri) {
        this.repeatFri = repeatFri;
    }

    public boolean isRepeatSat() {
        return repeatSat;
    }

    public void setRepeatSat(boolean repeatSat) {
        this.repeatSat = repeatSat;
    }
}
