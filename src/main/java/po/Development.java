package po;

public class Development {
    private Long dNo;

    private String dName;

    private String dNote;

    public Long getdNo() {
        return dNo;
    }

    public void setdNo(Long dNo) {
        this.dNo = dNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getdNote() {
        return dNote;
    }

    public void setdNote(String dNote) {
        this.dNote = dNote == null ? null : dNote.trim();
    }
}