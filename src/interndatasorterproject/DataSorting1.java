/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interndatasorterproject;


import java.util.Arrays;
import java.util.TreeMap;
import java.util.*;



/**
 *
 * @author boby
 */
public class DataSorting1 extends javax.swing.JFrame {

    /**
     * Creates new form DataDemo
     */
    public DataSorting1() {
        initComponents();
       
      /* String arr[] = {"Ice-Cream","Ball","Dog","Apple",
                       "Fish","Hen","Gun","Elephant","Cat"};*/
      
      // TextArea_1.setText(Arrays.toString(arr));
    
      
        
    }
        
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ComboBox_1 = new javax.swing.JComboBox<>();
        btn_Sorter = new javax.swing.JButton();
        lbl_Sorter2 = new javax.swing.JLabel();
        lbl_Sorter3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea_1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<<< DATA SORTER >>>");

        ComboBox_1.setFont(new java.awt.Font("Arial Narrow", 3, 19)); // NOI18N
        ComboBox_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Sort From Second Word", "Sort From Third Word", "Sort From Last Word" }));
        ComboBox_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_1ActionPerformed(evt);
            }
        });

        btn_Sorter.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        btn_Sorter.setForeground(new java.awt.Color(0, 0, 255));
        btn_Sorter.setText("SORT THE DATA");
        btn_Sorter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SorterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Sorter, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(ComboBox_1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ComboBox_1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(btn_Sorter, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_Sorter2.setBackground(new java.awt.Color(204, 255, 51));
        lbl_Sorter2.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        lbl_Sorter2.setForeground(new java.awt.Color(102, 0, 153));
        lbl_Sorter2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Sorter2.setText("<< ENTER THE DATA >>");
        lbl_Sorter2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lbl_Sorter3.setBackground(new java.awt.Color(204, 255, 51));
        lbl_Sorter3.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        lbl_Sorter3.setForeground(new java.awt.Color(102, 0, 153));
        lbl_Sorter3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Sorter3.setText("<< SORTED DATA >>");
        lbl_Sorter3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        TextArea_2.setColumns(20);
        TextArea_2.setRows(5);
        jScrollPane1.setViewportView(TextArea_2);

        TextArea_1.setColumns(20);
        TextArea_1.setRows(5);
        jScrollPane2.setViewportView(TextArea_1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Sorter3, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(lbl_Sorter2, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl_Sorter2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Sorter3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SorterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SorterActionPerformed

    TextArea_2.setText("");
    
    boolean isLastIndexSorting=false;
    String arr[] = TextArea_1.getText().split("\n");
    
    int index=0;
    if(ComboBox_1.getSelectedIndex()<3) index=ComboBox_1.getSelectedIndex();
    else isLastIndexSorting=true;
    
    String ans[]=new String[arr.length];
    
    TreeMap<Character, List<String>> map=new TreeMap<>();
    
    for(String s: arr){
        
        char c;
        if(isLastIndexSorting){
            c=s.charAt(s.length()-1);
        }else
            c=s.charAt(index);
        
        List<String> temp;
        if(!map.containsKey(c)){
            temp=new ArrayList<>();
        }else{
            temp=map.get(c);
        }
        temp.add(s);
        map.put(c,temp);
    }
    
    System.out.println(map);
    index=0;
    
    for(List<String> ls : map.values()){
        for(int i=0;i<ls.size();i++){
            ans[index++]=ls.get(i);
        }
    }
    
    for(String s: ans){
        TextArea_2.append(s + "\n");
    }
    
    
    
//    if(ComboBox_1.getSelectedIndex() == 0){    
//    for(int i = 0; i < arr.length; i++){
//        for(int j = 0; j<arr.length - 1; j++){
//            if(arr[j].compareTo(arr[j+1])<0){
//                String A = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = A;
//            }
//        }
//    }
//            for (String arr1 : arr) {
//                TextArea_2.append(arr1 + "\n");
//            }
//   }
    
       
    }//GEN-LAST:event_btn_SorterActionPerformed

    private void ComboBox_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_1ActionPerformed
       
        
    }//GEN-LAST:event_ComboBox_1ActionPerformed

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
            java.util.logging.Logger.getLogger(DataSorting1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataSorting1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataSorting1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataSorting1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataSorting1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_1;
    private javax.swing.JTextArea TextArea_1;
    private javax.swing.JTextArea TextArea_2;
    private javax.swing.JButton btn_Sorter;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Sorter2;
    private javax.swing.JLabel lbl_Sorter3;
    // End of variables declaration//GEN-END:variables
}
