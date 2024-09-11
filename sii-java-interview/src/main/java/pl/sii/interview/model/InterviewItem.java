package pl.sii.interview.model;

public class InterviewItem {
    private final String question;
    private final String answer;

    private InterviewItem(Builder builder) {
        this.question = builder.question;
        this.answer = builder.answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private String question;
        private String answer;

        public Builder question(String question) {
            this.question = question;
            return this;
        }

        public Builder answer(String answer) {
            this.answer = answer;
            return this;
        }

        public InterviewItem build() {
            return new InterviewItem(this);
        }
    }
}