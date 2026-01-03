package com.demo.model;

public class User {
		private String name;
		private String gender;
		private String[] skill;
		private String question;
		private String answer;
		private String email;
		private String password;
		public User() {
			super();
		}
		public User(String name, String gender, String[] skill, String question, String answer, String email,
				String password) {
			super();
			this.name = name;
			this.gender = gender;
			this.skill = skill;
			this.question = question;
			this.answer = answer;
			this.email = email;
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String[] getSkill() {
			return skill;
		}
		public void setSkill(String[] skill) {
			this.skill = skill;
		}
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		public String getAnswer() {
			return answer;
		}
		public void setAnswer(String answer) {
			this.answer = answer;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "User [name=" + name + ", gender=" + gender + ", skill=" + skill + ", question=" + question
					+ ", answer=" + answer + ", email=" + email + ", password=" + password + "]";
		}
		
		
}
