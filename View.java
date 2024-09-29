package simpleInterest;
import java.awt.*;
import java.awt.event.*;
public class View extends Frame implements ActionListener{
    Label lPrin, lRate, lTime, lRes;
    TextField tPrin, tRate, tTime;
    Button bCalc;

    public View(){
        setTitle("Simple Interest Calculator");
        setLayout(new GridLayout(4,2));
        setSize(400,250);

        lPrin = new Label("Enter Principle Amount");
        add(lPrin);
        tPrin = new TextField();
        add(tPrin);
        lRate = new Label("Enter Rate (In Percentage)");
        add(lRate);
        tRate = new TextField();
        add(tRate);
        lTime = new Label("Enter Time Period (In Years)");
        add(lTime);
        tTime = new TextField();
        add(tTime);
        bCalc = new Button("Calculate Interest");
        add(bCalc);
        lRes = new Label("Simple Interest will be displayed here");
        add(lRes);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){ 
                dispose(); 
            } 
        }); 
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
}
