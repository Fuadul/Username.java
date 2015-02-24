import javax.swing.JOptionPane;
public class Username {

	public static void main(String[] args) {
		String U, P;
		
		U = JOptionPane.showInputDialog("Enter Username :");
		P = JOptionPane.showInputDialog("Enter Password :");
		
		if(U .equals("Fuadul") && P.equals("123456")){
			JOptionPane.showMessageDialog(null, "Welcome " + U);
			
			
		} else{
			JOptionPane.showMessageDialog(null, "Wrong Username or Password!");
		}
		}

	}


