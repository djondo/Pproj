package com.rudolf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ContainerAdapter;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by rudi on 10/31/2016.
 */
public class pet_Survey extends JFrame {
    private JPanel rootPane;
    private JCheckBox fishCheckBox;
    private JCheckBox catCheckBox;
    private JCheckBox dogCheckBox;
    private JLabel surveyResultsLabel;
    private JLabel surveyResults;

    private boolean dog;
    private boolean cat;
    private boolean fish;


    protected pet_Survey() {
        setContentPane(rootPane);
        pack();
        setSize(new Dimension(350, 200));
        setTitle("Pet Survey");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        fishCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                fish = fishCheckBox.isSelected();
                updateResults();
            }
        });
        catCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                cat = catCheckBox.isSelected();
                updateResults();
            }
        });
        dogCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                dog = dogCheckBox.isSelected();
                updateResults();
            }
        });
        rootPane.addContainerListener(new ContainerAdapter() {
        });
    }
    private void updateResults(){
        String hasDogs = dog ? "one dog" : "no dogs";
        String hasCats = cat ? "one cat" : "no cats";
        String hasFish = fish ? "one fish" : "no fish";

        String result = "You have " + hasDogs + " and " + hasCats + " and " + hasFish;
        surveyResultsLabel.setText(result);

    }
}
