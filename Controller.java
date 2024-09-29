package simpleInterest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    Model m;
    View v;
    public Controller(Model model, View view){
        m = model;
        v = view;
    }

    public void initApp(){

        v.bCalc.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    m.setPrinciple(Integer.parseInt(v.tPrin.getText()));
                    m.setRate(Float.parseFloat(v.tRate.getText()));
                    m.setTime(Float.parseFloat(v.tTime.getText()));
                    v.lRes.setText(String.valueOf(m.getInterest(m.getPrinciple(), m.getRate(), m.getTime())));
                }
            }
        );
    }
}
