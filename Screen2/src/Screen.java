import javax.swing.JButton;
import javax.swing.JFrame;
public class Screen extends JFrame
{
    public Screen(){  
        
        setTitle("Aula 02");  
        setVisible(true);
        setSize(700, 500);     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);
        JButton jButton = new JButton("clique aqui");
        jButton.setBounds(100, 200, 250, 70);
        add(jButton);
        pack(); 
    }
       
}