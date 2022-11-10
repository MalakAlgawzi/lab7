public class Question {

        private String text,answer;

        public Question() {
            text="";
            answer="";
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }
        public void disply()
        {
            System.out.println(text);
        }
        public boolean checkAnswer(String response)
        {
            return response.equals(answer);
        }
    }

