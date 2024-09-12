package pl.sii.interview.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InterviewItem)) return false;
        InterviewItem that = (InterviewItem) o;
        return Objects.equals(question, that.question) && Objects.equals(answer, that.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer);
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