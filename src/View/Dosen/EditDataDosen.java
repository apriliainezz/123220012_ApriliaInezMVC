/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Dosen;

import Controller.ControllerDosen;
import Model.Dosen.ModelDosen;
import View.Dosen.ViewDataDosen;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author USER
 */
public class EditDataDosen extends JFrame {
    ControllerDosen controller;
    
    JLabel header = new JLabel("Edit Dosen");
    JLabel labelInputNama = new JLabel("Nama");
    JLabel labelInputNIDN = new JLabel("NIDN");
    JTextField inputNama = new JTextField();
    JTextField inputNIDN = new JTextField();
    JButton tombolEdit = new JButton("Edit Dosen");
    JButton tombolKembali = new JButton("Kembali");

    public EditDataDosen(ModelDosen dosen) {
        setVisible(true);
        setTitle("Edit Dosen");
        setSize(480, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        setLocationRelativeTo(null);

        add(header);
        header.setFont(new Font("Times New Roman", Font.BOLD, 14));
        header.setBounds(20, 8, 440, 24);
        add(labelInputNama);
        labelInputNama.setBounds(20, 32, 440, 24);
        add(labelInputNIDN);
        labelInputNIDN.setBounds(20, 96, 440, 24);
        add(inputNama);
        inputNama.setBounds(18, 56, 430, 36);
        add(inputNIDN);
        inputNIDN.setBounds(18, 120, 430, 36);
        add(tombolEdit);
        tombolEdit.setBounds(240, 170, 195, 40);
        add(tombolKembali);
        tombolKembali.setBounds(28, 170, 195, 40);
        
        inputNama.setText(dosen.getNama());
        inputNIDN.setText(dosen.getNidn());
        
        controller = new ControllerDosen(this);

        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewDataDosen();
            }
        });

        tombolEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.editDosen(dosen.getId());
            }
        });
    }
   
    public String getInputNama() {
        return inputNama.getText();
    }
    
    public String getInputNIDN() {
        return inputNIDN.getText();
    }
}
