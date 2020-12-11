package lab4.instruments.clothing.parameters;

public enum ClothingState {
    NEW,
    WORN;

    private String problems = "no problem";

    public void setProblems(String problems) {
        this.problems = problems;
    }

    public String getProblems() {
        return problems;
    }
}
