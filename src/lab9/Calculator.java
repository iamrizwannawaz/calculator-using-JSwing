/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/**
 *
 * @author l134088
 */
public class Calculator extends javax.swing.JFrame {
    Connection myconobj=null;
    Statement mystatobj=null;
    ResultSet myresobj=null;
    ResultSetMetaData mymeta=null;
    

    private int count;
    private double double1;
    private double double2;
    private double div1, div2;
    private double floatSum;
    private long numSum;
    private String operand;
    private Boolean equals, pressed;
    public int counter;
    Stack obj = null;
    Queue obj1=null;
    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        con_db();
        count = 0; double1 = 0; double2 = 0; floatSum = 0; numSum= 0; operand = null; equals = false;
        div1 = 0; div2 = 0; pressed = false;
        counter=1;
        obj = new Stack<Double>();
        obj1=new LinkedList<Double>();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void con_db(){
        try {
            myconobj=DriverManager.getConnection("jdbc:derby://localhost:1527/calculator");
           // mymeta=myresobj.getMetaData();
           
        } catch (SQLException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        numLabel = new javax.swing.JLabel();
        oneBtn = new javax.swing.JButton();
        twoBtn = new javax.swing.JButton();
        threeBtn = new javax.swing.JButton();
        fourBtn = new javax.swing.JButton();
        sixBtn = new javax.swing.JButton();
        nineBtn = new javax.swing.JButton();
        eightBtn = new javax.swing.JButton();
        sevenBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        fullStopBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        subBtn = new javax.swing.JButton();
        multiplyBtn = new javax.swing.JButton();
        divideBtn = new javax.swing.JButton();
        fiveBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        undoBtn = new javax.swing.JButton();
        redoBtn = new javax.swing.JButton();
        sinBtn = new javax.swing.JButton();
        cosBtn = new javax.swing.JButton();
        tanBtn = new javax.swing.JButton();
        equalBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        opLabel = new javax.swing.JLabel();
        powerBtn = new javax.swing.JButton();
        rootBtn = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(153, 204, 255));
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));
        setMaximumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numLabel.setBackground(new java.awt.Color(0, 153, 204));
        numLabel.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        numLabel.setForeground(new java.awt.Color(0, 153, 204));
        numLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));
        numLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numLabelMouseClicked(evt);
            }
        });
        getContentPane().add(numLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 300, 51));

        oneBtn.setText("1");
        oneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBtnActionPerformed(evt);
            }
        });
        getContentPane().add(oneBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 56, 39));

        twoBtn.setText("2");
        twoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(twoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 56, 39));

        threeBtn.setText("3");
        threeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(threeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 56, 39));

        fourBtn.setText("4");
        fourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBtnActionPerformed(evt);
            }
        });
        getContentPane().add(fourBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 56, 39));

        sixBtn.setText("6");
        sixBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sixBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 56, 39));

        nineBtn.setText("9");
        nineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 56, 39));

        eightBtn.setText("8");
        eightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eightBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 56, 39));

        sevenBtn.setText("7");
        sevenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sevenBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 56, 39));

        zeroBtn.setText("0");
        zeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBtnActionPerformed(evt);
            }
        });
        getContentPane().add(zeroBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 56, 39));

        fullStopBtn.setText(".");
        fullStopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullStopBtnActionPerformed(evt);
            }
        });
        getContentPane().add(fullStopBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 56, 39));

        addBtn.setText("+");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 56, 39));

        subBtn.setText("—");
        subBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subBtnActionPerformed(evt);
            }
        });
        getContentPane().add(subBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 56, 39));

        multiplyBtn.setText("x");
        multiplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyBtnActionPerformed(evt);
            }
        });
        getContentPane().add(multiplyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 56, 39));

        divideBtn.setText("÷");
        divideBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideBtnActionPerformed(evt);
            }
        });
        getContentPane().add(divideBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 56, 39));

        fiveBtn.setText("5");
        fiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(fiveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 56, 39));

        clearBtn.setText("C");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 56, 39));

        undoBtn.setText("Undo");
        undoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(undoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, 39));

        redoBtn.setText("Redo");
        redoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(redoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 70, 39));

        sinBtn.setText("sin");
        sinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sinBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 56, 39));

        cosBtn.setText("cos");
        cosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 56, 39));

        tanBtn.setText("tan");
        tanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanBtnActionPerformed(evt);
            }
        });
        getContentPane().add(tanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 56, 39));

        equalBtn.setText("=");
        equalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalBtnActionPerformed(evt);
            }
        });
        getContentPane().add(equalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 56, 39));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 10, 300));

        opLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        opLabel.setText("       ");
        getContentPane().add(opLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        powerBtn.setText("^");
        powerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(powerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 56, 39));

        rootBtn.setText("√ ");
        rootBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootBtnActionPerformed(evt);
            }
        });
        getContentPane().add(rootBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 56, 39));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBtnActionPerformed
        // TODO add your handling code here:
        String text = numLabel.getText();
        if (text.length() == 10) {
            return;
        }
        if (equals) {
            text = "";
            equals = false;
            opLabel.setText("     ");
        }
        numLabel.setText(text + "1");
    }//GEN-LAST:event_oneBtnActionPerformed

    private void twoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBtnActionPerformed
        // TODO add your handling code here:
        String text = numLabel.getText();
        if (text.length() == 10) {
            return;
        }
        if (equals) {
            text = "";
            equals = false;
            opLabel.setText("     ");
        }
        numLabel.setText(text + "2");
    }//GEN-LAST:event_twoBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        if (equals) {
            equals = false;
            opLabel.setText("     ");
        }
        numLabel.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void equalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalBtnActionPerformed
        try {
            // TODO add your handling code here:
            if (opLabel.getText() == "ANS")
            {
                return;
            }
            if (numLabel.getText() == "") {
                return;
            }
            if (operand == "+") {
                String text = numLabel.getText();
                
                div2 = Double.parseDouble(text);
                div2 += div1;
                numLabel.setText(Double.toString(div2));
                opLabel.setText("ANS");
                equals = true;
                pressed = false;
            }
            else if (operand == "-") {
                String text = numLabel.getText();
                
                div2 = Double.parseDouble(text);
                div2 = div1 - div2;
                numLabel.setText(Double.toString(div2));
                opLabel.setText("ANS");
                equals = true;
                pressed = false;
            }
            else if (operand == "x") {
                String text = numLabel.getText();
                
                div2 = Double.parseDouble(text);
                div2 = div1 * div2;
                numLabel.setText(Double.toString(div2));
                opLabel.setText("ANS");
                equals = true;
                pressed = false;
            }
            else if (operand == "/") {
                String text = numLabel.getText();
                
                div2 = Double.parseDouble(text);
                div2 = div1 / div2;
                numLabel.setText(Double.toString(div2));
                opLabel.setText("ANS");
                equals = true;
                pressed = false;
            }
            else if (operand == "sin") {
                String text = numLabel.getText();
                
                div1 = Double.parseDouble(text);
                div1 = Math.toRadians(div1);
                div1 = Math.sin(div1);
                numLabel.setText(Double.toString(div1));
                opLabel.setText("ANS");
                equals = true;
                pressed = false;
            }
            else if (operand == "cos") {
                String text = numLabel.getText();
                
                div1 = Double.parseDouble(text);
                div1 = Math.toRadians(div1);
                div1 = Math.cos(div1);
                numLabel.setText(Double.toString(div1));
                opLabel.setText("ANS");
                equals = true;
                pressed = false;
            }
            else if (operand == "tan") {
                String text = numLabel.getText();
                
                div1 = Double.parseDouble(text);
                div1 = Math.toRadians(div1);
                div1 = Math.tan(div1);
                numLabel.setText(Double.toString(div1));
                opLabel.setText("ANS");
                equals = true;
                pressed = false;
            }
            else if (operand == "root") {
                String text = numLabel.getText();
                
                div1 = Double.parseDouble(text);
                div1 = Math.sqrt(div1);
                numLabel.setText(Double.toString(div1));
                opLabel.setText("ANS");
                equals = true;
                pressed = false;
            }
            else if (operand == "power") {
                String text = numLabel.getText();
                
                div2 = Double.parseDouble(text);
                div2 = Math.pow(div1, div2);
                numLabel.setText(Double.toString(div2));
                opLabel.setText("ANS");
                equals = true;
                pressed = false;
            }
            //double1 = 0; double2 = 0;
            
            obj.push(div2);
            String sql="update APP.BACKUP SET NUMBER= " + div2 + "where ID =" + counter;
            Statement update=myconobj.createStatement();
            update.execute(sql);
            counter++;
            if(counter>5){
            counter=counter%5;
            
            System.out.println("value of counter"+counter);
            }
            
            
            /*mystatobj=myconobj.createStatement();
            PreparedStatement add=myconobj.prepareStatement("insert Into APP.BACKUP values(?,?)");
            add.setInt(1,counter);
            add.setDouble(2,div2);
            add.execute();
            counter++;
            
            */
            //myresobj=mystatobj.executeQuery("Select NUMBER from calculator.BACKUP where ID"+counter);
            //System.out.print("the nuber is : "+div2);
            
            div1 = 0; div2 = 0; operand = null;
        } catch (SQLException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_equalBtnActionPerformed

    private void threeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBtnActionPerformed
        // TODO add your handling code here:
        String text = numLabel.getText();
        if (text.length() == 10) {
            return;
        }
        if (equals) {
            text = "";
            equals = false;
            opLabel.setText("     ");
        }
        numLabel.setText(text + "3");
    }//GEN-LAST:event_threeBtnActionPerformed

    private void fourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBtnActionPerformed
        // TODO add your handling code here:
        String text = numLabel.getText();
        if (text.length() == 10) {
            return;
        }
        if (equals) {
            text = "";
            equals = false;
            opLabel.setText("     ");
        }
        numLabel.setText(text + "4");
    }//GEN-LAST:event_fourBtnActionPerformed

    private void fiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBtnActionPerformed
        // TODO add your handling code here:
        String text = numLabel.getText();
        if (text.length() == 10) {
            return;
        }
        if (equals) {
            text = "";
            equals = false;
            opLabel.setText("     ");
        }
        numLabel.setText(text + "5");
    }//GEN-LAST:event_fiveBtnActionPerformed

    private void sixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBtnActionPerformed
        // TODO add your handling code here:
        String text = numLabel.getText();
        if (text.length() == 10) {
            return;
        }
        if (equals) {
            text = "";
            equals = false;
            opLabel.setText("     ");
        }
        numLabel.setText(text + "6");
    }//GEN-LAST:event_sixBtnActionPerformed

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBtnActionPerformed
        // TODO add your handling code here:
        String text = numLabel.getText();
        if (text.length() == 10) {
            return;
        }
        if (equals) {
            text = "";
            equals = false;
            opLabel.setText("     ");
        }
        numLabel.setText(text + "7");
    }//GEN-LAST:event_sevenBtnActionPerformed

    private void eightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBtnActionPerformed
        // TODO add your handling code here:
        String text = numLabel.getText();
        if (text.length() == 10) {
            return;
        }
        if (equals) {
            text = "";
            equals = false;
            opLabel.setText("     ");
        }
        numLabel.setText(text + "8");
    }//GEN-LAST:event_eightBtnActionPerformed

    private void nineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBtnActionPerformed
        // TODO add your handling code here:
        String text = numLabel.getText();
        if (text.length() == 10) {
            return;
        }
        if (equals) {
            text = "";
            equals = false;
            opLabel.setText("     ");
        }
        numLabel.setText(text + "9");
    }//GEN-LAST:event_nineBtnActionPerformed

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtnActionPerformed
        // TODO add your handling code here:
        String text = numLabel.getText();
        if (text.length() == 10) {
            return;
        }
        if (operand == "sin" || operand == "cos" || operand == "tan") {
            numLabel.setText(text + "0");
            return;
        }
        if (text.equals("")) {
            return;
        }
        if (equals) {
            text = "";
            equals = false;
            opLabel.setText("     ");
        }
        numLabel.setText(text + "0");
    }//GEN-LAST:event_zeroBtnActionPerformed

    private void fullStopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullStopBtnActionPerformed
        // TODO add your handling code here:
        String text = numLabel.getText();
        if (text.contains(".")) {
            return;
        }
        if (equals) {
            text = "";
            equals = false;
            opLabel.setText("     ");
        }
        if (text == "") {
            return;
        }
        numLabel.setText(text + ".");
    }//GEN-LAST:event_fullStopBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String text = numLabel.getText();
        if (text == "") {
            return;
        }
        if (pressed) {
            return;
        }
        pressed = true;
        operand = "+";
//        if (text.contains(".")) {
//            double1 += Double.parseDouble(text);
//            numLabel.setText("");
//            opLabel.setText("+");
//            return;
//        }
        div1 = Double.parseDouble(text);
        numLabel.setText("");
        opLabel.setText("+");
    }//GEN-LAST:event_addBtnActionPerformed

    private void subBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subBtnActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String text = numLabel.getText();
        if (text == "") {
            return;
        }
        if (pressed) {
            return;
        }
        pressed = true;
        operand = "-";
//        if (text.contains(".")) {
//            double1 = Double.parseDouble(text);
//            numLabel.setText("");
//            opLabel.setText("+");
//            return;
//        }
        div1 = Double.parseDouble(text);
        numLabel.setText("");
        opLabel.setText("—");
    }//GEN-LAST:event_subBtnActionPerformed

    private void multiplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyBtnActionPerformed
        // TODO add your handling code here:
        String text = numLabel.getText();
        if (text == "") {
            return;
        }
        if (pressed) {
            return;
        }
        pressed = true;
        operand = "x";
//        if (text.contains(".")) {
//            double1 = Double.parseDouble(text);
//            numLabel.setText("");
//            opLabel.setText("x");
//            return;
//        }
        div1 = Double.parseDouble(text);
        numLabel.setText("");
        opLabel.setText("x");
    }//GEN-LAST:event_multiplyBtnActionPerformed

    private void divideBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideBtnActionPerformed
        // TODO add your handling code here:
        String text = numLabel.getText();
        if (text == "") {
            return;
        }
        if (pressed) {
            return;
        }
        pressed = true;
        operand = "/";
//        if (text.contains(".")) {
//            double1 = Double.parseDouble(text);
//            numLabel.setText("");
//            opLabel.setText("÷");
//            return;
//        }
        div1 = Double.parseDouble(text);
        numLabel.setText("");
        opLabel.setText("÷");
    }//GEN-LAST:event_divideBtnActionPerformed

    private void sinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinBtnActionPerformed
        // TODO add your handling code here:
        if (equals) {
            numLabel.setText("");
            equals = false;
            opLabel.setText("     ");
        }
        opLabel.setText("sin");
        if (pressed) {
            return;
        }
        pressed = true;
        operand = "sin";
    }//GEN-LAST:event_sinBtnActionPerformed

    private void cosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosBtnActionPerformed
        // TODO add your handling code here:
        if (equals) {
            numLabel.setText("");
            equals = false;
            opLabel.setText("     ");
        }
        opLabel.setText("cos");
        if (pressed) {
            return;
        }
        pressed = true;
        operand = "cos";
    }//GEN-LAST:event_cosBtnActionPerformed

    private void tanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanBtnActionPerformed
        // TODO add your handling code here:
        if (equals) {
            numLabel.setText("");
            equals = false;
            opLabel.setText("     ");
        }
        opLabel.setText("tan");
        if (pressed) {
            return;
        }
        pressed = true;
        operand = "tan";
    }//GEN-LAST:event_tanBtnActionPerformed

    private void powerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerBtnActionPerformed
        // TODO add your handling code here:
        String text = numLabel.getText();
        if (text == "") {
            return;
        }
        if (pressed) {
            return;
        }
        pressed = true;
        operand = "power";
//        if (text.contains(".")) {
//            double1 += Double.parseDouble(text);
//            numLabel.setText("");
//            opLabel.setText("+");
//            return;
//        }
        div1 = Double.parseDouble(text);
        numLabel.setText("");
        opLabel.setText("pow");
    }//GEN-LAST:event_powerBtnActionPerformed

    private void rootBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootBtnActionPerformed
        // TODO add your handling code here:
        if (equals) {
            numLabel.setText("");
            equals = false;
            opLabel.setText("     ");
        }
        opLabel.setText("sqrt");
        if (pressed) {
            return;
        }
        pressed = true;
        operand = "root";
    }//GEN-LAST:event_rootBtnActionPerformed

    private void undoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoBtnActionPerformed
//       double n1=0;
//       if(obj.isEmpty()){
//           return;
//       }
//       n1=(double) obj.pop();
//       obj1.add(n1);
//       numLabel.setText(Double.toString(n1));
 

 try {                                        
            // TODO add your handling code here:
            counter--;
            if(counter==0)
                counter=5;
            mystatobj=myconobj.createStatement();
            String q="Select * from APP.BACKUP";
            myresobj=mystatobj.executeQuery(q);
            int cid=counter;
            double n=0;
            
            while(myresobj.next()){
                n=myresobj.getDouble("number");
                cid=myresobj.getInt("ID");
                if(cid==counter)
                    break;
            
            }
            numLabel.setText(Double.toString(n));
        }
            catch(SQLException e) {
            }
           
//            Statement sel=myconobj.createStatement();
//            try {
//                @num=sel.execute(sql);
//            } catch (SQLException ex) {
//                Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            numLabel.setText(sql);
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }//GEN-LAST:event_undoBtnActionPerformed

    private void redoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoBtnActionPerformed
        // TODO add your handling code here:
        if(obj1.isEmpty()){
            return;
        }
        double num1=(double) obj1.peek();
        obj.push(num1);
        numLabel.setText(Double.toString(num1));
        obj1.remove();
        
    }//GEN-LAST:event_redoBtnActionPerformed

    private void numLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_numLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton cosBtn;
    private javax.swing.JButton divideBtn;
    private javax.swing.JButton eightBtn;
    private javax.swing.JButton equalBtn;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JButton fourBtn;
    private javax.swing.JButton fullStopBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton multiplyBtn;
    private javax.swing.JButton nineBtn;
    private javax.swing.JLabel numLabel;
    private javax.swing.JButton oneBtn;
    private javax.swing.JLabel opLabel;
    private javax.swing.JButton powerBtn;
    private javax.swing.JButton redoBtn;
    private javax.swing.JButton rootBtn;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JButton sinBtn;
    private javax.swing.JButton sixBtn;
    private javax.swing.JButton subBtn;
    private javax.swing.JButton tanBtn;
    private javax.swing.JButton threeBtn;
    private javax.swing.JButton twoBtn;
    private javax.swing.JButton undoBtn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables
}
