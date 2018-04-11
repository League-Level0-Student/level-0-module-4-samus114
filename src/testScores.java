import javax.swing.JOptionPane;

public class testScores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("what was your text score?");
int skore = Integer.parseInt(score);
	if (skore>=1 && skore<=50) {
	JOptionPane.showMessageDialog(null, "did you study?");
}else if (skore>=51 && skore<=75) {
	JOptionPane.showMessageDialog(null, "good job");
}else if (skore>=76 && skore<=100) {
	JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
}else {
	JOptionPane.showMessageDialog(null, "what kind of score is that?");
}
}
}
