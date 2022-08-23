package uz.exemple.less6_1_task.model;

public class AlphabetModel {
    private Integer iconId;
    private String letters;

    public AlphabetModel(Integer iconId,String letters) {
        this.iconId = iconId;
        this.letters = letters;
    }

    public Integer getIconId() {
        return iconId;
    }

    public String getLetters() {
        return letters;
    }
}
