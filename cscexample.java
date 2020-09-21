public class CscExamples
{
 int questionNo;
 String category;
 String text;
 public void addQuestion(CscExamples qu)
 {
   setQuestionNo(qu.getQuestionNo());
   setText(qu.getText());
   setCategory(qu.getCategory());
 }

 public void removeQuestion(int quId)
 {

 }

 public void editQuestion(int quId)
 {

 }
}
