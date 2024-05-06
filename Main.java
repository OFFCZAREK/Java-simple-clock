import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main extends JFrame
{
   public Main()
   {
   this.setBounds(300 ,300 ,300 ,200);
   initComponents();
    this.setDefaultCloseOperation(3);
   }
  public void initComponents()
  {
      panel.add(label);
      panel.add(Time);
      
      ActionListener stoper = new Clock();
      
      Timer clock = new Timer(1000, stoper );
      
      clock.start();
      
      this.getContentPane().add(panel);
  }  
  private class Clock implements ActionListener
  {
     public void actionPerformed(ActionEvent e)
     {
         Time.setText(downloadTime());
     }
  }
    
  JPanel panel =new JPanel();
  JLabel label =new JLabel("Time : ");
  JLabel Time = new JLabel(downloadTime());
    
  public String downloadTime()
  {
      GregorianCalendar calendar = new GregorianCalendar();
         
         String h = ""+calendar.get(Calendar.HOUR_OF_DAY);
         String min = ""+calendar.get(Calendar.MINUTE);
         String sec = ""+calendar.get(Calendar.SECOND);
         
         if(Integer.parseInt(h) <10)
             h= "0"+h;
         if(Integer.parseInt(min) <10)
             min= "0"+min;
         if(Integer.parseInt(sec) <10)
             sec= "0"+sec;
      return h+" : "+min+" : "+sec;
  }
    
public static void main(String[] args) 
    {
        new Main().setVisible(true);
    }
 
}
