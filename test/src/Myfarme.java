import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Myfarme extends Frame{
    public Myfarme(String str){
        this.setSize(400,400);
        this.setBackground(Color.white);
        this.setLocation(300,200);
        FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT,20,30);
        this.setLayout(flowLayout);
        Button btn=new Button("button");
        this.add(btn);
        btn.addActionListener(new ActionListener()
                {
                    int num=1;
                    public void actionPerformed(ActionEvent e)
                    {
                        add(new Button("the" + ++num + "button"));
                    }
        });
    }
}

