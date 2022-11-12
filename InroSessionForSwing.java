import javax.swing.*;

public class InroSessionForSwing {
    JFrame myframe;
    InroSessionForSwing(){
        myframe=new JFrame("Today Frame");
        JTextArea area=new JTextArea("Welcome to javatpoint");
        area.setBounds(10,30, 200,200);
        myframe.add(area);
        myframe.setSize(300,300);
        myframe.setLayout(null);
        myframe.setVisible(true);
    }
    public static void main(String []arg){
        InroSessionForSwing xy=new InroSessionForSwing();
    }
}
