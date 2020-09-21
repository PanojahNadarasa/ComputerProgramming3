public class CscExamples
{
 int questionNo;
 String category;
 String text;

  public int getQuestionNo()
 {
   return questionNo;
 }

 public String getCategory()
 {
   return category;
 }

 public String getText()
 {
   return text;
 }

 public void setQuestionNo(int a)
 {
   questionNo = a;
 }

 public void setCategory(String b)
 {
   category = b;
 }

 public void setText(String c)
 {
   text=c;
 }


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
