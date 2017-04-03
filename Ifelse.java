import javax.swing.JOptionPane;
public class Ifelse{
	public static void main(String [] args){
		String uname=JOptionPane.showInputDialog(null, "Enter user name");
		String pw=JOptionPane.showInputDialog(null, "Enter password");
		String result=(uname.equals("sung") && pw.equals("a1234"))?"Welcome " + uname:"Wrong Username or Password!";
		JOptionPane.showMessageDialog(null, result);
		JOptionPane.showMessageDialog(null, "Bye");
	}
}

