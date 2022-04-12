package springcoreq2;

public class Question {
	public String  questionId;
	public String question;
	public String answers;
	public Question(String questionId, String question, String answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
	}
	
	

}
