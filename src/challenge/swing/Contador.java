package challenge.swing;

import challenge.ParametrosInvalidosException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contador extends JFrame{
    private JButton btnCount;
    private JPanel myPanel;
    private JSpinner spnParam1;
    private JSpinner spnParam2;
    private JLabel lblMSG;
    private JList lstNumbers;
    DefaultListModel list = new DefaultListModel();
    private String[] myArray;
    private int paramUm;
    private int paramDois;

    private void rewriteList() {
        list.removeAllElements();
        for(String i : myArray) {
            list.addElement(i);
        }
    }

    public Contador() {
        setContentPane(myPanel);
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Contador");
        lstNumbers.setModel(list);

        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                paramUm = (int) spnParam1.getValue();
                paramDois = (int) spnParam2.getValue();
                try{
                    int[] numberArray = Counter.count(paramUm, paramDois);
                    int arraySize = paramUm - paramDois;
                    myArray = new String[arraySize];
                    for (int i = 0; i < arraySize; i++) {
                        myArray[i] = String.format("Imprimindo o número: %d", numberArray[i]);
                    }
                    rewriteList();
                }
                catch (ParametrosInvalidosException e) {
                    lblMSG.setText("O valor do primeiro parâmetro deve ser maior que o segundo");
                }
            }
        });
    }

    public static void main(String[] args) {
        Contador meuContador = new Contador();
    }
}
