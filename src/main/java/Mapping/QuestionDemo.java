package Mapping;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.LinkedList;
import java.util.List;

public class QuestionDemo {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Question q = new Question();
        q.setQuestionId(1001);
        q.setQuestion("Who is Samindra ?");
        Answer a1 = new Answer();
        a1.setAnswerId(2001);
        a1.setAnswer("Mubin's dream girl");
        Answer a2 = new Answer();
        a2.setAnswerId(2002);
        a2.setAnswer("Mubin's Love ");
        Answer a3 = new Answer();
        a3.setAnswerId(2003);
        a3.setAnswer("Everything ");
        List<Answer> answers = new LinkedList<>();

        q.setAnswers(answers);
        answers.add(a1);
        answers.add(a2);
        answers.add(a3);




        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        session.save(a1);
        session.save(a2);
        session.save(a3);
        session.save(q);
        transaction.commit();
        Question q1 = (Question) session.get(Question.class,1001);
        System.out.println(q1.getQuestion());
        for(Answer an:q.getAnswers()){
            System.out.println(an.getAnswer());
        }

        session.close();
        sessionFactory.close();








    }
}
