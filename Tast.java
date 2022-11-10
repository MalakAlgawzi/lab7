    import java.util.ArrayList;
import java.util.Scanner;

    public class Test {
        public static void main(String[] args) {
            ArrayList<Question> all= new ArrayList<>();
            Question q1= new Question();
            q1.setText("whats your name?");
            q1.setAnswer("Ali");


            ChoiceQuestion q2= new ChoiceQuestion();
            q2.setText("Who are you?");
            q2.addChoice("Fatima",false);
            q2.addChoice("Ali",true);
            q2.addChoice("Ahmed",false);
            Question q3= new Question();
            q3.setText("how are you?");
            q3.setAnswer("fine");
            all.add(q1);all.add(q2);all.add(q3);
            for (int i = 0; i < all.size(); i++) {
                presentQuestion(all.get(i));

            }

        }
        public static void presentQuestion(Question q)
        {
            q.disply();
            Scanner in = new Scanner(System.in);
            String r=in.next();
            System.out.println(q.checkAnswer(r));

        }
    }

