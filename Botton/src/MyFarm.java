import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFarm extends JFrame {
  /*  public MyFarm(){
        this.setLayout(new GridLayout(3, 4));
        this.setSize(300, 300);
        this.setLocation(400, 300);
        this.Btn();
    }

    public void Btn(){
        Button btn[]=new Button[10];
        int number=btn.length;
        for(int i=0;i<number;i++) {
            btn[i]=new Button(""+(i+1));
            btn[i].setFont(new Font("微软雅黑",Font.BOLD,16));
        }

        for (int i = 0; i < 9; i++){
            this.add(btn[i]);
            btn[i].setBackground(Color.blue);
        }
    }*/
    public MyFarm(String title){
        this.setLayout(new GridLayout(3, 4));
        this.setBackground(Color.blue);
        this.setSize(500, 500);
        this.setLocation(400, 400);
        GridBagLayout layout=new GridBagLayout();
        GridBagConstraints bagConstraints =new GridBagConstraints();
        this.setLayout(layout);
        bagConstraints.fill=GridBagConstraints.BOTH;
        bagConstraints.weightx=1;
        bagConstraints.weighty=1;
        this.addComponent("btn1",layout,bagConstraints);
        this.addComponent("btn2",layout,bagConstraints);
        this.addComponent("btn3",layout,bagConstraints);
        bagConstraints.gridwidth=GridBagConstraints.REMAINDER;
        this.addComponent("btn4",layout,bagConstraints);
        bagConstraints.weightx=0;
        bagConstraints.weighty=0;
        this.addComponent("btn5",layout,bagConstraints);
        bagConstraints.gridwidth=1;
        this.addComponent("btn6",layout,bagConstraints);
        bagConstraints.gridwidth=GridBagConstraints.REMAINDER;
        this.addComponent("btn7",layout,bagConstraints);
        bagConstraints.gridwidth=2;
        bagConstraints.gridheight=1;
        bagConstraints.weightx=2;
        bagConstraints.weighty=2;
        this.addComponent("btn8",layout,bagConstraints);
        bagConstraints.gridwidth=GridBagConstraints.REMAINDER;
        bagConstraints.gridheight=1;
        this.addComponent("btn9",layout,bagConstraints);
        this.addComponent("btn10",layout,bagConstraints);
        this.pack();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//需要继承JFrame类时可使用该方法关闭窗口
 /*       this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setLayout(new FlowLayout());
                if(JOptionPane.showConfirmDialog(null,"exti?")==JOptionPane.YES_NO_OPTION)
                {
                    System.exit(0);
                }
                else{
                }
                super.windowOpened(e);
            }

        });*/

    }
    private void addComponent(String name,GridBagLayout layout,GridBagConstraints bagConstraints){
        Button bt=new Button(name);
        layout.setConstraints(bt,bagConstraints);
        this.add(bt);
    }
}

