package po;

import java.util.Date;

public class WorkRecord {
    private Long wId;

    private Integer wType;

    private Long wNo;

    private Integer wApprove;

    private Integer wDuration;

    private Date wDate;

    private String wReason;

    public Long getwId() {
        return wId;
    }

    public void setwId(Long wId) {
        this.wId = wId;
    }

    public Integer getwType() {
        return wType;
    }

    public void setwType(Integer wType) {
        this.wType = wType;
    }

    public Long getwNo() {
        return wNo;
    }

    public void setwNo(Long wNo) {
        this.wNo = wNo;
    }

    public Integer getwApprove() {
        return wApprove;
    }

    public void setwApprove(Integer wApprove) {
        this.wApprove = wApprove;
    }

    public Integer getwDuration() {
        return wDuration;
    }

    public void setwDuration(Integer wDuration) {
        this.wDuration = wDuration;
    }

    public Date getwDate() {
        return wDate;
    }

    public void setwDate(Date wDate) {
        this.wDate = wDate;
    }

    public String getwReason() {
        return wReason;
    }

    public void setwReason(String wReason) {
        this.wReason = wReason == null ? null : wReason.trim();
    }
}