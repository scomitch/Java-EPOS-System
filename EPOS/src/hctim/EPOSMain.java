/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hctim;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Date;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimerTask;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.ListModel;

/**
 *
 * @author 30246059
 */
public class EPOSMain extends javax.swing.JFrame {

    /**
     * Creates new form EPOSMain
     */
    public EPOSMain() {
        initComponents();
        
        //Add listeners for quantity buttons.
        btnQua0.addActionListener(actionListener);
        btnQua1.addActionListener(actionListener);
        btnQua2.addActionListener(actionListener);
        btnQua3.addActionListener(actionListener);
        btnQua4.addActionListener(actionListener);
        btnQua5.addActionListener(actionListener);
        btnQua6.addActionListener(actionListener);
        btnQua7.addActionListener(actionListener);
        btnQua8.addActionListener(actionListener);
        btnQua9.addActionListener(actionListener);
        btnItem7.addActionListener(priceListener);
        btnItem6.addActionListener(priceListener);
        btnItem5.addActionListener(priceListener);
        btnItem4.addActionListener(priceListener);
        btnItem3.addActionListener(priceListener);
        btnItem8.addActionListener(priceListener);
        btnItem10.addActionListener(priceListener);
        btnItem1.addActionListener(priceListener);
        btnItem0.addActionListener(priceListener);
        btnItem9.addActionListener(priceListener);
        btnItem11.addActionListener(priceListener);
        btnItem2.addActionListener(priceListener);
        btnUpdateItem1.addActionListener(managerListener);
        btnUpdateItem2.addActionListener(managerListener);
        btnUpdateItem3.addActionListener(managerListener);
        btnUpdateItem4.addActionListener(managerListener);
        btnUpdateItem5.addActionListener(managerListener);
        btnUpdateItem6.addActionListener(managerListener);
        btnUpdateItem7.addActionListener(managerListener);
        btnUpdateItem8.addActionListener(managerListener);
        btnUpdateItem9.addActionListener(managerListener);
        btnUpdateItem10.addActionListener(managerListener);
        btnUpdateItem11.addActionListener(managerListener);
        btnUpdateItem12.addActionListener(managerListener);
        txtAreaOrders.setModel(listModel);
        txtAreaPrice.setModel(priceModel);
        
        //Set component Orders.
        panItems.setComponentZOrder(btnItem0, 0);
        panItems.setComponentZOrder(btnItem1, 1);
        panItems.setComponentZOrder(btnItem2, 2);
        panItems.setComponentZOrder(btnItem3, 3);
        panItems.setComponentZOrder(btnItem4, 4);
        panItems.setComponentZOrder(btnItem5, 5);
        panItems.setComponentZOrder(btnItem6, 6);
        panItems.setComponentZOrder(btnItem7, 7);
        panItems.setComponentZOrder(btnItem8, 8);
        panItems.setComponentZOrder(btnItem9, 9);
        panItems.setComponentZOrder(btnItem10, 10);
        panItems.setComponentZOrder(btnItem11, 11);
        panManItems.setComponentZOrder(btnUpdateItem1, 0);
        panManItems.setComponentZOrder(btnUpdateItem2, 1);
        panManItems.setComponentZOrder(btnUpdateItem3, 2);
        panManItems.setComponentZOrder(btnUpdateItem4, 3);
        panManItems.setComponentZOrder(btnUpdateItem5, 4);
        panManItems.setComponentZOrder(btnUpdateItem6, 5);
        panManItems.setComponentZOrder(btnUpdateItem7, 6);
        panManItems.setComponentZOrder(btnUpdateItem8, 7);
        panManItems.setComponentZOrder(btnUpdateItem9, 8);
        panManItems.setComponentZOrder(btnUpdateItem10, 9);
        panManItems.setComponentZOrder(btnUpdateItem11, 10);
        panManItems.setComponentZOrder(btnUpdateItem12, 11);
        
        //Set button action commands.
        btnManagerYes.setActionCommand("Yes");
        btnManagerNo.setActionCommand("No");
        btnUpdateYes.setActionCommand("Yes");
        btnUpdateNo.setActionCommand("No");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        bGroupManager = new javax.swing.ButtonGroup();
        bGroupUpdate = new javax.swing.ButtonGroup();
        panManager = new javax.swing.JPanel();
        panManAgentInfo = new javax.swing.JPanel();
        lblManInfoUserFN = new javax.swing.JLabel();
        lblManInfoUserID = new javax.swing.JLabel();
        lblManInfoUserSN = new javax.swing.JLabel();
        lblManInfoUserPos = new javax.swing.JLabel();
        lblManInfoUserTS = new javax.swing.JLabel();
        lblManInfoUserHS = new javax.swing.JLabel();
        lblManagerUserID = new javax.swing.JLabel();
        lblManagerFirstname = new javax.swing.JLabel();
        lblManagerLastname = new javax.swing.JLabel();
        lblManagerPos = new javax.swing.JLabel();
        lblManagerTotal = new javax.swing.JLabel();
        lblManagerHighest = new javax.swing.JLabel();
        panManReports = new javax.swing.JPanel();
        lblManInfoCust = new javax.swing.JLabel();
        lblManTotalSales = new javax.swing.JLabel();
        lblManMinSales = new javax.swing.JLabel();
        lblManAvgSales = new javax.swing.JLabel();
        lblManMaxSales = new javax.swing.JLabel();
        lblManagerCustomers = new javax.swing.JLabel();
        lblManagerAvgSales = new javax.swing.JLabel();
        lblManagerMinSales = new javax.swing.JLabel();
        lblManagerMaxSales = new javax.swing.JLabel();
        lblManagerTotSales = new javax.swing.JLabel();
        panManItems = new javax.swing.JPanel();
        btnUpdateItem1 = new javax.swing.JButton();
        btnUpdateItem2 = new javax.swing.JButton();
        btnUpdateItem3 = new javax.swing.JButton();
        btnUpdateItem4 = new javax.swing.JButton();
        btnUpdateItem5 = new javax.swing.JButton();
        btnUpdateItem6 = new javax.swing.JButton();
        btnUpdateItem7 = new javax.swing.JButton();
        btnUpdateItem8 = new javax.swing.JButton();
        btnUpdateItem9 = new javax.swing.JButton();
        btnUpdateItem10 = new javax.swing.JButton();
        btnUpdateItem11 = new javax.swing.JButton();
        btnUpdateItem12 = new javax.swing.JButton();
        panManCRUD = new javax.swing.JPanel();
        CRUDPane = new javax.swing.JTabbedPane();
        crudCreate = new javax.swing.JPanel();
        lblCreateInfoUserID = new javax.swing.JLabel();
        lblCreateInfoFN = new javax.swing.JLabel();
        lblCreateInfoLN = new javax.swing.JLabel();
        lblCreatePinInfo = new javax.swing.JLabel();
        lblCreateUserPin = new javax.swing.JTextField();
        lblCreateUserHelp = new javax.swing.JLabel();
        lblCreateUserID = new javax.swing.JTextField();
        lblCreateUserLN = new javax.swing.JTextField();
        lblCreateUserFN = new javax.swing.JTextField();
        lblCreateUserHelpPin = new javax.swing.JLabel();
        btnCreateUser = new javax.swing.JButton();
        lblcreateError = new javax.swing.JLabel();
        lblCreateInfoLN1 = new javax.swing.JLabel();
        btnManagerYes = new javax.swing.JRadioButton();
        btnManagerNo = new javax.swing.JRadioButton();
        crudUpdate = new javax.swing.JPanel();
        lblUpdateInfoUserID = new javax.swing.JLabel();
        lblUpdateInfoFN = new javax.swing.JLabel();
        lblUpdateInfoLN = new javax.swing.JLabel();
        lblUpdateUserID = new javax.swing.JTextField();
        lblUpdateUserFN = new javax.swing.JTextField();
        lblUpdateUserLN = new javax.swing.JTextField();
        lblUpdateUserHelp = new javax.swing.JLabel();
        btnUpdateUser = new javax.swing.JButton();
        lblUpdateUserError = new javax.swing.JLabel();
        cboxUsers = new javax.swing.JComboBox<>();
        lblCreateInfoLN2 = new javax.swing.JLabel();
        btnUpdateYes = new javax.swing.JRadioButton();
        btnUpdateNo = new javax.swing.JRadioButton();
        crudDelete = new javax.swing.JPanel();
        cboxUsersDel = new javax.swing.JComboBox<>();
        lblSelectUser = new javax.swing.JLabel();
        btnDeleteUser = new javax.swing.JButton();
        lblDeleteWarning = new javax.swing.JLabel();
        btnRestart = new javax.swing.JButton();
        btnDeauth = new javax.swing.JButton();
        panAgent = new javax.swing.JPanel();
        panAgentInfo = new javax.swing.JPanel();
        lblAgInfoUserFN = new javax.swing.JLabel();
        lblAgInfoUserID1 = new javax.swing.JLabel();
        lblAgInfoUserSN = new javax.swing.JLabel();
        lblAgInfoUserPos = new javax.swing.JLabel();
        lblAgInfoUserTS = new javax.swing.JLabel();
        lblAgInfoUserHS = new javax.swing.JLabel();
        lblAgentUserID = new javax.swing.JLabel();
        lblAgentFirstname = new javax.swing.JLabel();
        lblAgentLastname = new javax.swing.JLabel();
        lblAgentPos = new javax.swing.JLabel();
        lblAgentTotal = new javax.swing.JLabel();
        lblAgentHighest = new javax.swing.JLabel();
        panReports = new javax.swing.JPanel();
        lblAgtInfoCust = new javax.swing.JLabel();
        lblAgtTotalSales = new javax.swing.JLabel();
        lblAgtMinSales = new javax.swing.JLabel();
        lblAgtAvgSales = new javax.swing.JLabel();
        lblAgtMaxSales = new javax.swing.JLabel();
        lblAgentCustomers = new javax.swing.JLabel();
        lblAgentAvgSales = new javax.swing.JLabel();
        lblAgentMinSales = new javax.swing.JLabel();
        lblAgentMaxSales = new javax.swing.JLabel();
        lblAgentTotSales = new javax.swing.JLabel();
        btnAgentReturn = new javax.swing.JButton();
        panMain = new javax.swing.JPanel();
        panUserInfo = new javax.swing.JPanel();
        lblOrderInfo = new javax.swing.JLabel();
        lblUserInfo = new javax.swing.JLabel();
        lblPOSInfo = new javax.swing.JLabel();
        lblOrderTime = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPOS = new javax.swing.JLabel();
        lblDateTimeInfo = new javax.swing.JLabel();
        lblDateTime = new javax.swing.JLabel();
        lblLoginImage = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        lblFullnameInfo = new javax.swing.JLabel();
        lblFullname = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        btnQua6 = new javax.swing.JButton();
        btnQua3 = new javax.swing.JButton();
        btnQua4 = new javax.swing.JButton();
        btnQua5 = new javax.swing.JButton();
        btnQua9 = new javax.swing.JButton();
        btnQua7 = new javax.swing.JButton();
        btnQua8 = new javax.swing.JButton();
        btnLarge = new javax.swing.JButton();
        btnSmall = new javax.swing.JButton();
        btnMedium = new javax.swing.JButton();
        panItems = new javax.swing.JPanel();
        btnItem0 = new javax.swing.JButton();
        btnItem1 = new javax.swing.JButton();
        btnItem2 = new javax.swing.JButton();
        btnItem3 = new javax.swing.JButton();
        btnItem4 = new javax.swing.JButton();
        btnItem5 = new javax.swing.JButton();
        btnItem6 = new javax.swing.JButton();
        btnItem7 = new javax.swing.JButton();
        btnItem8 = new javax.swing.JButton();
        btnItem9 = new javax.swing.JButton();
        btnItem10 = new javax.swing.JButton();
        btnItem11 = new javax.swing.JButton();
        btnAgent = new javax.swing.JButton();
        btnManager = new javax.swing.JButton();
        btnCheckout = new javax.swing.JButton();
        btnQua0 = new javax.swing.JButton();
        btnQua1 = new javax.swing.JButton();
        btnQua2 = new javax.swing.JButton();
        lblTotalInfo = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaOrders = new javax.swing.JList<>();
        btnVoid = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaPrice = new javax.swing.JList<>();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panManager.setMaximumSize(new java.awt.Dimension(1071, 555));
        panManager.setMinimumSize(new java.awt.Dimension(1071, 555));
        panManager.setPreferredSize(new java.awt.Dimension(1138, 569));

        panManAgentInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Logged User Information"));
        panManAgentInfo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        lblManInfoUserFN.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblManInfoUserFN.setText("Firstname:");

        lblManInfoUserID.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblManInfoUserID.setText("UserID:");

        lblManInfoUserSN.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblManInfoUserSN.setText("Lastname:");

        lblManInfoUserPos.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblManInfoUserPos.setText("Position:");

        lblManInfoUserTS.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblManInfoUserTS.setText("Total Sales:");

        lblManInfoUserHS.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblManInfoUserHS.setText("Highest Sales:");

        lblManagerUserID.setText("placeholder");

        lblManagerFirstname.setText("placeholder");

        lblManagerLastname.setText("placeholder");

        lblManagerPos.setText("placeholder");

        lblManagerTotal.setText("placeholder");

        lblManagerHighest.setText("placeholder");

        javax.swing.GroupLayout panManAgentInfoLayout = new javax.swing.GroupLayout(panManAgentInfo);
        panManAgentInfo.setLayout(panManAgentInfoLayout);
        panManAgentInfoLayout.setHorizontalGroup(
            panManAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManAgentInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panManAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panManAgentInfoLayout.createSequentialGroup()
                        .addComponent(lblManInfoUserHS)
                        .addGap(18, 18, 18)
                        .addComponent(lblManagerHighest))
                    .addGroup(panManAgentInfoLayout.createSequentialGroup()
                        .addGroup(panManAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblManInfoUserID)
                            .addComponent(lblManInfoUserFN)
                            .addComponent(lblManInfoUserSN)
                            .addComponent(lblManInfoUserPos)
                            .addComponent(lblManInfoUserTS))
                        .addGroup(panManAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panManAgentInfoLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(panManAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblManagerPos)
                                    .addComponent(lblManagerLastname)
                                    .addComponent(lblManagerFirstname)
                                    .addComponent(lblManagerUserID)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panManAgentInfoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblManagerTotal)))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        panManAgentInfoLayout.setVerticalGroup(
            panManAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManAgentInfoLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(panManAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManInfoUserID)
                    .addComponent(lblManagerUserID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panManAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManInfoUserFN)
                    .addComponent(lblManagerFirstname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panManAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManInfoUserSN)
                    .addComponent(lblManagerLastname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panManAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManInfoUserPos)
                    .addComponent(lblManagerPos))
                .addGap(18, 18, 18)
                .addGroup(panManAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManInfoUserTS)
                    .addComponent(lblManagerTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panManAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManInfoUserHS)
                    .addComponent(lblManagerHighest)))
        );

        panManReports.setBorder(javax.swing.BorderFactory.createTitledBorder("Session Reports"));

        lblManInfoCust.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblManInfoCust.setText("Total Customers Served:");

        lblManTotalSales.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblManTotalSales.setText("Total Sales (Session):");

        lblManMinSales.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblManMinSales.setText("Minimum Sales Cost:");

        lblManAvgSales.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblManAvgSales.setText("Average Sales Cost:");

        lblManMaxSales.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblManMaxSales.setText("Maximum Sales Cost:");

        lblManagerCustomers.setText("placeholder");

        lblManagerAvgSales.setText("placeholder");

        lblManagerMinSales.setText("placeholder");

        lblManagerMaxSales.setText("placeholder");

        lblManagerTotSales.setText("placeholder");

        javax.swing.GroupLayout panManReportsLayout = new javax.swing.GroupLayout(panManReports);
        panManReports.setLayout(panManReportsLayout);
        panManReportsLayout.setHorizontalGroup(
            panManReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManReportsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panManReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManInfoCust)
                    .addComponent(lblManAvgSales)
                    .addComponent(lblManMinSales)
                    .addComponent(lblManMaxSales)
                    .addComponent(lblManTotalSales))
                .addGap(32, 32, 32)
                .addGroup(panManReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManagerTotSales)
                    .addComponent(lblManagerMaxSales)
                    .addComponent(lblManagerMinSales)
                    .addComponent(lblManagerAvgSales)
                    .addComponent(lblManagerCustomers))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panManReportsLayout.setVerticalGroup(
            panManReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManReportsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panManReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManInfoCust)
                    .addComponent(lblManagerCustomers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panManReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManAvgSales)
                    .addComponent(lblManagerAvgSales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panManReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManMinSales)
                    .addComponent(lblManagerMinSales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panManReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManMaxSales)
                    .addComponent(lblManagerMaxSales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panManReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManTotalSales)
                    .addComponent(lblManagerTotSales))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panManItems.setBorder(javax.swing.BorderFactory.createTitledBorder("Item Change"));

        btnUpdateItem1.setText("Item 1");
        btnUpdateItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItem1ActionPerformed(evt);
            }
        });

        btnUpdateItem2.setText("Item 2");

        btnUpdateItem3.setText("Item 3");

        btnUpdateItem4.setText("Item 4");

        btnUpdateItem5.setText("Item 5");
        btnUpdateItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItem5ActionPerformed(evt);
            }
        });

        btnUpdateItem6.setText("Item 6");

        btnUpdateItem7.setText("Item 7");

        btnUpdateItem8.setText("Item 8");

        btnUpdateItem9.setText("Item 9");
        btnUpdateItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItem9ActionPerformed(evt);
            }
        });

        btnUpdateItem10.setText("Item 10");

        btnUpdateItem11.setText("Item 11");

        btnUpdateItem12.setText("Item 12");

        javax.swing.GroupLayout panManItemsLayout = new javax.swing.GroupLayout(panManItems);
        panManItems.setLayout(panManItemsLayout);
        panManItemsLayout.setHorizontalGroup(
            panManItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panManItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panManItemsLayout.createSequentialGroup()
                        .addComponent(btnUpdateItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateItem4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panManItemsLayout.createSequentialGroup()
                        .addComponent(btnUpdateItem5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateItem7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateItem8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panManItemsLayout.createSequentialGroup()
                        .addComponent(btnUpdateItem9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateItem10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateItem11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateItem12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panManItemsLayout.setVerticalGroup(
            panManItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManItemsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panManItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdateItem1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(btnUpdateItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateItem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateItem4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panManItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdateItem5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateItem6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateItem7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateItem8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panManItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdateItem9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateItem10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateItem11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateItem12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panManCRUD.setBorder(javax.swing.BorderFactory.createTitledBorder("User CRUD"));

        lblCreateInfoUserID.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCreateInfoUserID.setText("UserID");

        lblCreateInfoFN.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCreateInfoFN.setText("Firstname:");

        lblCreateInfoLN.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCreateInfoLN.setText("Lastname:");

        lblCreatePinInfo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCreatePinInfo.setText("Pin:");

        lblCreateUserHelp.setText("User ID must be over 10000");

        lblCreateUserHelpPin.setText("User Pin must be over 1000");

        btnCreateUser.setText("Create User");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        lblCreateInfoLN1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCreateInfoLN1.setText("Manager:");

        bGroupManager.add(btnManagerYes);
        btnManagerYes.setText("Yes");

        bGroupManager.add(btnManagerNo);
        btnManagerNo.setSelected(true);
        btnManagerNo.setText("No");

        javax.swing.GroupLayout crudCreateLayout = new javax.swing.GroupLayout(crudCreate);
        crudCreate.setLayout(crudCreateLayout);
        crudCreateLayout.setHorizontalGroup(
            crudCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudCreateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crudCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crudCreateLayout.createSequentialGroup()
                        .addComponent(lblCreateInfoUserID)
                        .addGap(56, 56, 56)
                        .addComponent(lblCreateUserID))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crudCreateLayout.createSequentialGroup()
                        .addComponent(lblcreateError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crudCreateLayout.createSequentialGroup()
                        .addGroup(crudCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCreatePinInfo)
                            .addComponent(lblCreateInfoLN)
                            .addComponent(lblCreateInfoFN)
                            .addComponent(lblCreateInfoLN1))
                        .addGap(28, 28, 28)
                        .addGroup(crudCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCreateUserPin)
                            .addComponent(lblCreateUserFN)
                            .addComponent(lblCreateUserLN)
                            .addGroup(crudCreateLayout.createSequentialGroup()
                                .addComponent(btnManagerYes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnManagerNo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 60, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(crudCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreateUserHelpPin)
                    .addComponent(lblCreateUserHelp))
                .addGap(26, 26, 26))
        );
        crudCreateLayout.setVerticalGroup(
            crudCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudCreateLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(crudCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateInfoUserID)
                    .addComponent(lblCreateUserHelp)
                    .addComponent(lblCreateUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crudCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreatePinInfo)
                    .addComponent(lblCreateUserPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCreateUserHelpPin))
                .addGap(18, 18, 18)
                .addGroup(crudCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateInfoFN)
                    .addComponent(lblCreateUserFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crudCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateInfoLN)
                    .addComponent(lblCreateUserLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crudCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateInfoLN1)
                    .addComponent(btnManagerYes)
                    .addComponent(btnManagerNo))
                .addGroup(crudCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crudCreateLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblcreateError))
                    .addGroup(crudCreateLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        CRUDPane.addTab("Create User", crudCreate);

        lblUpdateInfoUserID.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblUpdateInfoUserID.setText("UserID");

        lblUpdateInfoFN.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblUpdateInfoFN.setText("Firstname:");

        lblUpdateInfoLN.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblUpdateInfoLN.setText("Lastname:");

        lblUpdateUserHelp.setText("User ID must be over 10000");

        btnUpdateUser.setText("Update User");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        cboxUsers.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                cboxUsersComponentShown(evt);
            }
        });
        cboxUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxUsersActionPerformed(evt);
            }
        });

        lblCreateInfoLN2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCreateInfoLN2.setText("Manager:");

        bGroupUpdate.add(btnUpdateYes);
        btnUpdateYes.setText("Yes");

        bGroupUpdate.add(btnUpdateNo);
        btnUpdateNo.setSelected(true);
        btnUpdateNo.setText("No");

        javax.swing.GroupLayout crudUpdateLayout = new javax.swing.GroupLayout(crudUpdate);
        crudUpdate.setLayout(crudUpdateLayout);
        crudUpdateLayout.setHorizontalGroup(
            crudUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crudUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crudUpdateLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblUpdateUserError)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crudUpdateLayout.createSequentialGroup()
                        .addGroup(crudUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(crudUpdateLayout.createSequentialGroup()
                                .addComponent(lblUpdateInfoFN)
                                .addGap(28, 28, 28)
                                .addComponent(lblUpdateUserFN))
                            .addComponent(btnUpdateUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboxUsers, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crudUpdateLayout.createSequentialGroup()
                                .addComponent(lblUpdateInfoUserID)
                                .addGap(56, 56, 56)
                                .addComponent(lblUpdateUserID))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crudUpdateLayout.createSequentialGroup()
                                .addGroup(crudUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUpdateInfoLN)
                                    .addComponent(lblCreateInfoLN2))
                                .addGap(30, 30, 30)
                                .addGroup(crudUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(crudUpdateLayout.createSequentialGroup()
                                        .addComponent(btnUpdateYes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnUpdateNo)
                                        .addGap(0, 94, Short.MAX_VALUE))
                                    .addComponent(lblUpdateUserLN))))
                        .addGap(18, 18, 18)
                        .addComponent(lblUpdateUserHelp)
                        .addGap(33, 33, 33))))
        );
        crudUpdateLayout.setVerticalGroup(
            crudUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudUpdateLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(cboxUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(crudUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUpdateInfoUserID)
                    .addComponent(lblUpdateUserHelp)
                    .addComponent(lblUpdateUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(crudUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUpdateInfoFN)
                    .addComponent(lblUpdateUserFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(crudUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUpdateInfoLN)
                    .addComponent(lblUpdateUserLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(crudUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateInfoLN2)
                    .addComponent(btnUpdateYes)
                    .addComponent(btnUpdateNo))
                .addGap(18, 18, 18)
                .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(lblUpdateUserError)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        CRUDPane.addTab("Update User", crudUpdate);

        cboxUsersDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxUsersDelActionPerformed(evt);
            }
        });

        lblSelectUser.setText("Select User");

        btnDeleteUser.setText("Delete User");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        lblDeleteWarning.setForeground(new java.awt.Color(255, 0, 0));
        lblDeleteWarning.setText("You are about to delete user +firstname+ +lastname+ with userID +userid+");

        javax.swing.GroupLayout crudDeleteLayout = new javax.swing.GroupLayout(crudDelete);
        crudDelete.setLayout(crudDeleteLayout);
        crudDeleteLayout.setHorizontalGroup(
            crudDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crudDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboxUsersDel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(crudDeleteLayout.createSequentialGroup()
                        .addGroup(crudDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSelectUser)
                            .addComponent(lblDeleteWarning))
                        .addGap(0, 94, Short.MAX_VALUE)))
                .addContainerGap())
        );
        crudDeleteLayout.setVerticalGroup(
            crudDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelectUser)
                .addGap(3, 3, 3)
                .addComponent(cboxUsersDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lblDeleteWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );

        CRUDPane.addTab("Delete User", crudDelete);

        javax.swing.GroupLayout panManCRUDLayout = new javax.swing.GroupLayout(panManCRUD);
        panManCRUD.setLayout(panManCRUDLayout);
        panManCRUDLayout.setHorizontalGroup(
            panManCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CRUDPane)
                .addContainerGap())
        );
        panManCRUDLayout.setVerticalGroup(
            panManCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CRUDPane)
                .addContainerGap())
        );

        btnRestart.setText("Restart");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        btnDeauth.setText("De-auth");
        btnDeauth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeauthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panManagerLayout = new javax.swing.GroupLayout(panManager);
        panManager.setLayout(panManagerLayout);
        panManagerLayout.setHorizontalGroup(
            panManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panManItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panManagerLayout.createSequentialGroup()
                        .addComponent(panManAgentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panManReports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panManCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeauth, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        panManagerLayout.setVerticalGroup(
            panManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panManagerLayout.createSequentialGroup()
                        .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(367, 367, 367)
                        .addComponent(btnDeauth, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panManCRUD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panManagerLayout.createSequentialGroup()
                            .addGroup(panManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(panManReports, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panManAgentInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panManItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        panAgent.setMaximumSize(new java.awt.Dimension(1071, 555));
        panAgent.setMinimumSize(new java.awt.Dimension(1071, 555));
        panAgent.setPreferredSize(new java.awt.Dimension(1138, 569));

        panAgentInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Logged User Information"));
        panAgentInfo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        lblAgInfoUserFN.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblAgInfoUserFN.setText("Firstname:");

        lblAgInfoUserID1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblAgInfoUserID1.setText("UserID:");

        lblAgInfoUserSN.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblAgInfoUserSN.setText("Lastname:");

        lblAgInfoUserPos.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblAgInfoUserPos.setText("Position:");

        lblAgInfoUserTS.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblAgInfoUserTS.setText("Total Sales:");

        lblAgInfoUserHS.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblAgInfoUserHS.setText("Highest Sales:");

        lblAgentUserID.setText("placeholder");

        lblAgentFirstname.setText("placeholder");

        lblAgentLastname.setText("placeholder");

        lblAgentPos.setText("placeholder");

        lblAgentTotal.setText("No Sales");

        lblAgentHighest.setText("No Sales");

        javax.swing.GroupLayout panAgentInfoLayout = new javax.swing.GroupLayout(panAgentInfo);
        panAgentInfo.setLayout(panAgentInfoLayout);
        panAgentInfoLayout.setHorizontalGroup(
            panAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAgentInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAgentInfoLayout.createSequentialGroup()
                        .addComponent(lblAgInfoUserHS)
                        .addGap(18, 18, 18)
                        .addComponent(lblAgentHighest))
                    .addGroup(panAgentInfoLayout.createSequentialGroup()
                        .addGroup(panAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAgInfoUserID1)
                            .addComponent(lblAgInfoUserFN)
                            .addComponent(lblAgInfoUserSN)
                            .addComponent(lblAgInfoUserPos)
                            .addComponent(lblAgInfoUserTS))
                        .addGroup(panAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panAgentInfoLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(panAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAgentPos)
                                    .addComponent(lblAgentLastname)
                                    .addComponent(lblAgentFirstname)
                                    .addComponent(lblAgentUserID)))
                            .addGroup(panAgentInfoLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblAgentTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        panAgentInfoLayout.setVerticalGroup(
            panAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAgentInfoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgInfoUserID1)
                    .addComponent(lblAgentUserID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgInfoUserFN)
                    .addComponent(lblAgentFirstname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgInfoUserSN)
                    .addComponent(lblAgentLastname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgInfoUserPos)
                    .addComponent(lblAgentPos))
                .addGap(18, 18, 18)
                .addGroup(panAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgInfoUserTS)
                    .addComponent(lblAgentTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAgentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgInfoUserHS)
                    .addComponent(lblAgentHighest))
                .addContainerGap(385, Short.MAX_VALUE))
        );

        panReports.setBorder(javax.swing.BorderFactory.createTitledBorder("Session Reports"));

        lblAgtInfoCust.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblAgtInfoCust.setText("Total Customers Served:");

        lblAgtTotalSales.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblAgtTotalSales.setText("Total Sales (Session):");

        lblAgtMinSales.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblAgtMinSales.setText("Minimum Sales Cost:");

        lblAgtAvgSales.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblAgtAvgSales.setText("Average Sales Cost:");

        lblAgtMaxSales.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblAgtMaxSales.setText("Maximum Sales Cost:");

        lblAgentCustomers.setText("No Sales");

        lblAgentAvgSales.setText("No Sales");

        lblAgentMinSales.setText("No Sales");

        lblAgentMaxSales.setText("No Sales");

        lblAgentTotSales.setText("No Sales");

        javax.swing.GroupLayout panReportsLayout = new javax.swing.GroupLayout(panReports);
        panReports.setLayout(panReportsLayout);
        panReportsLayout.setHorizontalGroup(
            panReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panReportsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgtInfoCust)
                    .addComponent(lblAgtAvgSales)
                    .addComponent(lblAgtMinSales)
                    .addComponent(lblAgtMaxSales)
                    .addComponent(lblAgtTotalSales))
                .addGap(32, 32, 32)
                .addGroup(panReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgentTotSales)
                    .addComponent(lblAgentMaxSales)
                    .addComponent(lblAgentMinSales)
                    .addComponent(lblAgentAvgSales)
                    .addComponent(lblAgentCustomers))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        panReportsLayout.setVerticalGroup(
            panReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panReportsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgtInfoCust)
                    .addComponent(lblAgentCustomers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgtAvgSales)
                    .addComponent(lblAgentAvgSales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgtMinSales)
                    .addComponent(lblAgentMinSales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgtMaxSales)
                    .addComponent(lblAgentMaxSales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgtTotalSales)
                    .addComponent(lblAgentTotSales))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgentReturn.setText("Back");
        btnAgentReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgentReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAgentLayout = new javax.swing.GroupLayout(panAgent);
        panAgent.setLayout(panAgentLayout);
        panAgentLayout.setHorizontalGroup(
            panAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAgentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panAgentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panReports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgentReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(348, Short.MAX_VALUE))
        );
        panAgentLayout.setVerticalGroup(
            panAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAgentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panAgentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgentReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panAgentInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panReports, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panMain.setMaximumSize(new java.awt.Dimension(1071, 555));
        panMain.setMinimumSize(new java.awt.Dimension(1071, 555));

        panUserInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblOrderInfo.setText("Order Time:");

        lblUserInfo.setText("UserID:");

        lblPOSInfo.setText("POS:");

        lblOrderTime.setText("0:00");

        lblUsername.setText("placeholder");

        lblPOS.setText("placeholder");

        lblDateTimeInfo.setText("Date/Time:");

        lblDateTime.setText("placeholder");

        lblAmount.setText("0");

        lblFullnameInfo.setText("User Name:");

        lblFullname.setText("placeholder");

        lblSize.setText("M");

        javax.swing.GroupLayout panUserInfoLayout = new javax.swing.GroupLayout(panUserInfo);
        panUserInfo.setLayout(panUserInfoLayout);
        panUserInfoLayout.setHorizontalGroup(
            panUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panUserInfoLayout.createSequentialGroup()
                        .addGroup(panUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panUserInfoLayout.createSequentialGroup()
                                .addComponent(lblOrderInfo)
                                .addGap(28, 28, 28)
                                .addGroup(panUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFullname)
                                    .addComponent(lblUsername)
                                    .addComponent(lblOrderTime)))
                            .addComponent(lblFullnameInfo)
                            .addComponent(lblUserInfo))
                        .addGap(152, 152, 152)
                        .addComponent(lblLoginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panUserInfoLayout.createSequentialGroup()
                        .addComponent(lblSize, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panUserInfoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblPOSInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPOS))
                    .addGroup(panUserInfoLayout.createSequentialGroup()
                        .addComponent(lblDateTimeInfo)
                        .addGap(63, 63, 63)
                        .addComponent(lblDateTime)))
                .addContainerGap())
        );
        panUserInfoLayout.setVerticalGroup(
            panUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrderInfo)
                    .addComponent(lblOrderTime)
                    .addComponent(lblDateTimeInfo)
                    .addComponent(lblDateTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserInfo)
                    .addComponent(lblUsername)
                    .addComponent(lblPOSInfo)
                    .addComponent(lblPOS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFullnameInfo)
                    .addComponent(lblFullname))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(panUserInfoLayout.createSequentialGroup()
                .addComponent(lblLoginImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmount)
                    .addComponent(lblSize)))
        );

        btnQua6.setText("6");
        btnQua6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQua6.setPreferredSize(new java.awt.Dimension(60, 60));

        btnQua3.setText("3");
        btnQua3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQua3.setPreferredSize(new java.awt.Dimension(60, 60));

        btnQua4.setText("4");
        btnQua4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQua4.setPreferredSize(new java.awt.Dimension(60, 60));

        btnQua5.setText("5");
        btnQua5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQua5.setPreferredSize(new java.awt.Dimension(60, 60));

        btnQua9.setText("9");
        btnQua9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQua9.setPreferredSize(new java.awt.Dimension(60, 60));

        btnQua7.setText("7");
        btnQua7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQua7.setPreferredSize(new java.awt.Dimension(60, 60));

        btnQua8.setText("8");
        btnQua8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQua8.setPreferredSize(new java.awt.Dimension(60, 60));

        btnLarge.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLarge.setText("Large");
        btnLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLargeActionPerformed(evt);
            }
        });

        btnSmall.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSmall.setText("Small");
        btnSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSmallActionPerformed(evt);
            }
        });

        btnMedium.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMedium.setText("Medium");
        btnMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediumActionPerformed(evt);
            }
        });

        panItems.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnItem0.setText("Item 0");
        btnItem0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItem0ActionPerformed(evt);
            }
        });

        btnItem1.setText("Item 0");
        btnItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItem1ActionPerformed(evt);
            }
        });

        btnItem2.setText("Item 0");
        btnItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItem2ActionPerformed(evt);
            }
        });

        btnItem3.setText("Item 0");

        btnItem4.setText("Item 0");
        btnItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItem4ActionPerformed(evt);
            }
        });

        btnItem5.setText("Item 0");

        btnItem6.setText("Item 0");

        btnItem7.setText("Item 0");
        btnItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItem7ActionPerformed(evt);
            }
        });

        btnItem8.setText("Item 0");

        btnItem9.setText("Item 0");

        btnItem10.setText("Item 0");

        btnItem11.setText("Item 0");

        javax.swing.GroupLayout panItemsLayout = new javax.swing.GroupLayout(panItems);
        panItems.setLayout(panItemsLayout);
        panItemsLayout.setHorizontalGroup(
            panItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panItemsLayout.createSequentialGroup()
                        .addGroup(panItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnItem0, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnItem4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnItem1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(btnItem5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panItemsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panItemsLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(btnItem6, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnItem7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panItemsLayout.createSequentialGroup()
                        .addComponent(btnItem8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnItem9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnItem10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnItem11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panItemsLayout.setVerticalGroup(
            panItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnItem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnItem0, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnItem4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnItem5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnItem6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnItem7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnItem8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnItem9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnItem10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnItem11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgent.setText("Agent");
        btnAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgentActionPerformed(evt);
            }
        });

        btnManager.setText("Manager");
        btnManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerActionPerformed(evt);
            }
        });

        btnCheckout.setText("<html>Check<br />&nbsp;&nbsp;Out</html>");
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        btnQua0.setText("0");
        btnQua0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQua0.setPreferredSize(new java.awt.Dimension(60, 60));

        btnQua1.setText("1");
        btnQua1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQua1.setPreferredSize(new java.awt.Dimension(60, 60));

        btnQua2.setText("2");
        btnQua2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQua2.setPreferredSize(new java.awt.Dimension(60, 60));

        lblTotalInfo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblTotalInfo.setText("Total:");

        lblTotal.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblTotal.setText("£0.00");

        txtAreaOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtAreaOrdersMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtAreaOrders);

        btnVoid.setText("Void");
        btnVoid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoidActionPerformed(evt);
            }
        });

        txtAreaPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtAreaPriceMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtAreaPrice);

        javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(panMainLayout);
        panMainLayout.setHorizontalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTotalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addComponent(btnQua0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQua1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQua2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQua3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQua4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQua5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQua6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQua7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQua8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQua9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panUserInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panMainLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnMedium, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSmall, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLarge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVoid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCheckout))))
                        .addGap(368, 368, 368))))
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panMainLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTotal)
                                    .addComponent(lblTotalInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panMainLayout.createSequentialGroup()
                                .addComponent(panUserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnQua4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnQua3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnQua9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnQua8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnQua7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnQua5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnQua6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnQua1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnQua0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnQua2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panMainLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(btnSmall, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(btnMedium, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLarge, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panMainLayout.createSequentialGroup()
                                        .addComponent(btnManager, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnVoid, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(panItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(panMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 1220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panManager, javax.swing.GroupLayout.PREFERRED_SIZE, 1261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panManager, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Global Defines.
     * loggedUser = The stored "Logged in" user with their information.
     * itemAmount = The amount of items selected for the EPOS (1-9)
     * totalPrice = The accumulated price for the current check-in session.
     * itemSize = ("small", "medium" or "large") - defines the item size.
     * listModel = The model generated for the checkout list.
     * priceModel = The model generated for the prices of each checkout comp.
    */
    EPOS_User_Construct loggedUser;
    int itemAmount = 1;
    int sessionID = 0;
    int sessionStarted = 0;
    double totalPrice = 0;
    boolean allowEvent = true;
    Timer caltimer;
    String itemSize = "";
    DefaultListModel listModel = new DefaultListModel();
    DefaultListModel priceModel = new DefaultListModel();
    
    /**
     * This event is called when the window first opens.
     * It will call for the user to log into an account.
     * 
     * @param evt 
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        //First we can remove some important panels so unauthorized users can't see.
        System.out.println("Setting Panels Invisible");
        panAgent.setVisible(false);
        panMain.setVisible(false);
        panManager.setVisible(false);
        System.out.println("Removed Panel");
        
        //First Establish a DB Connection
        EPOS_Database_Utilities.getConnection();

        //Call the function to login and set to an int variable.
        try {
            loggedUser = EPOS_Users_Database.requestLogin();
        } catch (NoSuchAlgorithmException e) {
            JOptionPane.showMessageDialog(null, "Error fetching the logged-in user.");
        }
        int logSuccess = EPOS_Users_Database.checkSuccess();
        
        
        //Check for what was returned and act on that. 1 or 2 = Successful Login.
        if(logSuccess == 1 || logSuccess == 2){
            //User logged in successfully. Setting variables for the program.
            
            //Append Program Details
            appendItems();
            panMain.setVisible(true);
            System.out.println("Connected");
            
            //Append the User Details
            appendUserDetails();
            setSessionID();
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * Set Session ID
     * Grabs the last SessionID from the db and sets the new ID.
     */
    public void setSessionID(){
        //Get Current SessionID
        Connection con = EPOS_Database_Utilities.getConnection();
        String sessionQuery = "SELECT * FROM Sales ORDER BY ID DESC LIMIT 1";
        ArrayList<String> result = EPOS_Database_Utilities.queryDatabase(con, sessionQuery, "SessionID");
        String sessID = result.toString();

        //Convert the SessionID (Usually [num]) to int.
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(sessID);
        while (m.find()) {
            sessionID = Integer.parseInt(m.group()) + 1;
        }
        System.out.println("Your current Session ID is " + sessionID);
    }
   
   
    /**
     * Agent Return
     * Returns the agent back to the main shop page.
     * @param evt 
     */
    private void btnAgentReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgentReturnActionPerformed
       //Set Panel Visibility
       panMain.setVisible(true);
       panAgent.setVisible(false);
    }//GEN-LAST:event_btnAgentReturnActionPerformed

    private void btnUpdateItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateItem1ActionPerformed

    private void btnUpdateItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateItem5ActionPerformed

    private void btnUpdateItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateItem9ActionPerformed

    /**
     * Manager De-auth
     * De-auths the current manager session and returns to the main EPOS screen.
     * Managers will have to re-authenticate to access this menu again.
     * @param evt 
     */
    private void btnDeauthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeauthActionPerformed
        //Hide the manus.
        panManager.setVisible(false);
        panMain.setVisible(true);
        
        allowEvent = false;
        
        //Clear Info.
        cboxUsersDel.removeAllItems();
        cboxUsers.removeAllItems();
    }//GEN-LAST:event_btnDeauthActionPerformed

    private void btnItem0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnItem0ActionPerformed

    private void btnItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnItem4ActionPerformed

    /**
     * Check-out button pressed.
     * In current version, simply end the order and notify how much change
     * should be given.
     * @param evt 
     */
    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        //Guard.
        if (totalPrice <= 0) {
            JOptionPane.showMessageDialog(null, "Nothing to check-out");
            return;
        }

        //Prompt a box to enter amount given and to present change amount.
        JTextField field1 = new JTextField("Amount Given");
 
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Enter Posting Amount Given (£)"));
        panel.add(field1);
        int result = JOptionPane.showConfirmDialog(null, panel, "",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            if (field1.getText().equalsIgnoreCase("Amount Given")) {
                JOptionPane.showMessageDialog(null, "You must enter something into the price field");
            }
            if (field1.getText().matches(".*\\d+.*")) {
                if(Double.parseDouble(field1.getText()) < totalPrice){
                    JOptionPane.showMessageDialog(null, "Posting amount is less than price.");
                    return;
                }
                
                double calculatedChange = Double.parseDouble(field1.getText()) - totalPrice;
                
                int dialogResult = JOptionPane.showConfirmDialog(null, "Please return " + new DecimalFormat("£#0.00").format(calculatedChange) + " to the customer.", "Change", JOptionPane.YES_OPTION);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    setTimer(1);
                    EPOS_Database_Utilities db = new EPOS_Database_Utilities();
                    /**
                     * Database Manipulation Data from the items sold has to be
                     * entered into the database. We will concatenate strings to
                     * show what items were sold. We will also give the price.
                     */

                    //Connection
                    Connection con = EPOS_Database_Utilities.getConnection();

                    //Get Current Price (String to Int)
                    String totPrice = lblTotal.getText().substring(1, lblTotal.getText().length());
                    double intPrice = Double.parseDouble(totPrice);
                    System.out.println(intPrice);

                    //Get Items.
                    String items = listModel.toString().substring(1, listModel.toString().length() - 1);

                    //Create a database manipulation string.
                    String insertQuery = "INSERT INTO Sales (SessionID, Items, SalePrice, AgentID) VALUES (\"" + sessionID + "\",\"" + items + "\"," + intPrice + ",\"" + loggedUser.getUserID() + "\")";
                    EPOS_Database_Utilities.manipulateDatabase(con, insertQuery);
                    sessionStarted = 1;

                    //Restart Global Vars.
                    itemAmount = 1;
                    totalPrice = 0;
                    allowEvent = true;
                    itemSize = "";

                    //Clear Models and Price.
                    listModel.clear();
                    priceModel.clear();
                    lblTotal.setText("£0.00");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Your price must have didgets only.");
            }
        } else {
            System.out.println("Clicked OFF");
        }
        
    }//GEN-LAST:event_btnCheckoutActionPerformed

    /**
     * Void button. When the user selects an item from the itemList, he is able
     * to void it and have that specific item price deducted from the total.
     * @param evt 
     */
    private void btnVoidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoidActionPerformed

        //Item must be selected in order to void.
        if(txtAreaOrders.getSelectedIndex() != -1){
            int itmIndex = txtAreaOrders.getSelectedIndex();

            String initPrice = priceModel.getElementAt((itmIndex)).toString();
            String subPrice = initPrice.substring(1, initPrice.length());
            double price = Double.parseDouble(subPrice);
            totalPrice = totalPrice - price;
            lblTotal.setText(new DecimalFormat("£#0.00").format(totalPrice));

            //Remove items.
            listModel.removeElementAt(itmIndex);
            priceModel.removeElementAt(itmIndex);

            //Check to see if there is any more elements in the list.
            if(listModel.isEmpty()){
                JOptionPane.showMessageDialog(null, "You have cancelled this order.");
                lblTotal.setText("£0.00");
            }

        } else {
            JOptionPane.showMessageDialog(null, "You must select an item to void");
        }
    }//GEN-LAST:event_btnVoidActionPerformed

    /**
     * Agent Menu.
     * Session and history statistics are available in the Agent Menu
     * This button simply parses the data.
     * @param evt 
     */
//GEN-FIRST:event_btnAgentActionPerformed
    private void btnAgentActionPerformed(java.awt.event.ActionEvent evt) {  
        //Grab Agend Data.
        EPOS_Users_Database userDB = new EPOS_Users_Database();
        //Set panels state.
        panMain.setVisible(false);
        panAgent.setVisible(true);
        
        //Parse info.
        Double overallTotal = userDB.getUserTotalSales(loggedUser.getUserID());
        Double highestSale = userDB.getUserHighestSale(loggedUser.getUserID());
        //Set Dynamic Sales Data.
        if(sessionStarted == 1){
            Double averageSale = userDB.getSessionAverageSale(sessionID);
            Double minimumSale = userDB.getSessionMinSale(sessionID);
            Double maximumSale = userDB.getSessionMaxSale(sessionID);
            Double sessTotalSale = userDB.getSessionTotalSale(sessionID);
            lblAgentCustomers.setText(Integer.toString(userDB.getSessionCustomersServed(sessionID)));
            lblAgentAvgSales.setText(new DecimalFormat("£#0.00").format(averageSale));
            lblAgentMinSales.setText(new DecimalFormat("£#0.00").format(minimumSale));
            lblAgentMaxSales.setText(new DecimalFormat("£#0.00").format(maximumSale));
            lblAgentTotSales.setText(new DecimalFormat("£#0.00").format(sessTotalSale));
        } else {
            lblAgentCustomers.setText("N/A");
            lblAgentAvgSales.setText("No Sales");
            lblAgentMinSales.setText("No Sales");
            lblAgentMaxSales.setText("No Sales");
            lblAgentTotSales.setText("No Sales");
        }
        lblAgentTotal.setText(new DecimalFormat("£#0.00").format(overallTotal));
        lblAgentHighest.setText(new DecimalFormat("£#0.00").format(highestSale));
    }         
//GEN-LAST:event_btnAgentActionPerformed

    /**
     * Manager Menu
     * Sends the user to a manager menu provided they have re-authenticated.
     * Manager menu gives options to alter the system dynamically.
     * @param evt 
     */
    private void btnManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerActionPerformed
        
        /*
            * Firstly we need to implement the authentication.
            * Since we have no card system or "swiper", a re-log in with manager
            * Credentials is appropriate.
         */

        //2 = Manager | 1 = User
        int authVal = 1;
        
        try {
            authVal = EPOS_Users_Database.getManagerAuthentication();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(EPOSMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(authVal == 2){
            //Grab Agend Data.
            EPOS_Users_Database userDB = new EPOS_Users_Database();

            //Hide any menus.
            panMain.setVisible(false);
            panManager.setVisible(true);

            //Parse info.
            Double overallTotal = userDB.getUserTotalSales(loggedUser.getUserID());
            Double highestSale = userDB.getUserHighestSale(loggedUser.getUserID());
            //Set Dynamic Sales Data.
            if (sessionStarted == 1) {
                Double averageSale = userDB.getSessionAverageSale(sessionID);
                Double minimumSale = userDB.getSessionMinSale(sessionID);
                Double maximumSale = userDB.getSessionMaxSale(sessionID);
                Double sessTotalSale = userDB.getSessionTotalSale(sessionID);
                lblManagerCustomers.setText(Integer.toString(userDB.getSessionCustomersServed(sessionID)));
                lblManagerAvgSales.setText(new DecimalFormat("£#0.00").format(averageSale));
                lblManagerMinSales.setText(new DecimalFormat("£#0.00").format(minimumSale));
                lblManagerMaxSales.setText(new DecimalFormat("£#0.00").format(maximumSale));
                lblManagerTotSales.setText(new DecimalFormat("£#0.00").format(sessTotalSale));
            } else {
                lblManagerCustomers.setText("N/A");
                lblManagerAvgSales.setText("No Sales");
                lblManagerMinSales.setText("No Sales");
                lblManagerMaxSales.setText("No Sales");
                lblManagerTotSales.setText("No Sales");
            }
            lblManagerTotal.setText(new DecimalFormat("£#0.00").format(overallTotal));
            lblManagerHighest.setText(new DecimalFormat("£#0.00").format(highestSale));
            
            //We want to fill in misc info on the page CRUD system such as filling in user accounts.
            Connection con = EPOS_Database_Utilities.getConnection();
            String query = "SELECT * FROM Users";
            ArrayList<String> userID = null;
            ArrayList<String> userFN = null;
            ArrayList<String> userLN = null;
            userID = EPOS_Database_Utilities.queryDatabase(con, query, "UserID");
            userFN = EPOS_Database_Utilities.queryDatabase(con, query, "UserForename");
            userLN = EPOS_Database_Utilities.queryDatabase(con, query, "UserSur");
            for (int i = 0; i < userID.size(); i++) {
                cboxUsers.addItem("ID: " + userID.get(i) + " (" + userFN.get(i) + " " + userLN.get(i) + ")");
                cboxUsersDel.addItem("ID: " + userID.get(i) + " (" + userFN.get(i) + " " + userLN.get(i) + ")");
            }
            
            allowEvent = true;
            
        } else {
            JOptionPane.showMessageDialog(null, "Management Authentication Failed.");
        }
        
    }//GEN-LAST:event_btnManagerActionPerformed

    private void btnLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLargeActionPerformed
        itemSize = "large";
        lblSize.setText("L");
    }//GEN-LAST:event_btnLargeActionPerformed

    private void btnMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediumActionPerformed
        itemSize = "medium";
        lblSize.setText("M");
    }//GEN-LAST:event_btnMediumActionPerformed

    //Set Item Sizes.
    private void btnSmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSmallActionPerformed
        itemSize = "small";
        lblSize.setText("S");
    }//GEN-LAST:event_btnSmallActionPerformed

//GEN-FIRST:event_txtAreaPriceMousePressed
   
//GEN-LAST:event_txtAreaPriceMousePressed

    /**
     * MousePressed Event.
     * Highlights the opposing txtAreaPrice with the same index that has 
     * been selected.
     * @param evt 
     */
    private void txtAreaOrdersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaOrdersMousePressed
        int orderIndex = txtAreaOrders.getSelectedIndex();
        txtAreaPrice.setSelectedIndex(orderIndex);
    }//GEN-LAST:event_txtAreaOrdersMousePressed

    private void btnItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnItem2ActionPerformed

    private void btnItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnItem1ActionPerformed

    private void btnItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnItem7ActionPerformed

    /**
     * Create User (Manager Option)
     * Implements a new user to the database (Which can then be logged in to)
     * @param evt 
     */
    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        //Defines for all of the required information to create a user.
        String userPin = lblCreateUserPin.getText();
        String userID = lblCreateUserID.getText();
        String firstName = lblCreateUserFN.getText();
        String lastName = lblCreateUserLN.getText();
        int isUserManager = 0;
        ButtonModel mSelection = bGroupManager.getSelection();
        
        /**
         * Guards.
         * We need to make sure some of the strings can be converted to integers.
         * If not, then there is an issue with the input.
         * 
         * userPin = Must be a string (To be parsed in sha-256) and > 5 digits.
         * userID = Must be an int and > 10000.
         * firstName = String field must not be empty.
         * lastName = String field must not be empty.
         * userManager = Must be yes/no
         */
        
        try {
            int guardUserPin = Integer.parseInt(userPin);
            int finalUserID = Integer.parseInt(userID);
            if(guardUserPin < 10000){
                JOptionPane.showMessageDialog(null, "User Pin must contain 5 digits");
            } else if (finalUserID < 10000){
                JOptionPane.showMessageDialog(null, "User ID must be greater than 10000");
            } else if (firstName.length() < 1 || lastName.length() < 1){
                JOptionPane.showMessageDialog(null, "Firstname / Lastname must be filled in.");
            } else {
                //We can convert UserPin back to string for parsing.
                String finalUserPin = Integer.toString(guardUserPin);
                
                //Check if the user is to be a manager.
                if(mSelection.getActionCommand().equals("Yes")){
                    isUserManager = 1;
                } else {
                    isUserManager = 0;
                }
                
                //Check if the userID exists in the database.
                Connection con = EPOS_Database_Utilities.getConnection();
                String query = "SELECT UserID FROM Users WHERE UserID = " + finalUserID;
                ArrayList<String> check = EPOS_Database_Utilities.queryDatabase(con, query, "UserID");
                if(check.size() > 0){
                    JOptionPane.showMessageDialog(null, "This UserID already exists.");
                } else {
                    //Call the createUserToDatabase function.
                    int res = EPOS_User_Construct.createUserToDatabase(finalUserPin, finalUserID, firstName, lastName, isUserManager);
                    if(res == 1){
                        //Success, clear fields.
                        lblCreateUserID.setText("");
                        lblCreateUserPin.setText("");
                        lblCreateUserFN.setText("");
                        lblCreateUserLN.setText("");
                        updateComboBoxData();
                    }
                }    
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please follow creation rules. Error in trying to parse the data.");
        }
        
        
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void cboxUsersComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cboxUsersComponentShown
        //Test
        System.out.println("You've selected" + evt.paramString());
    }//GEN-LAST:event_cboxUsersComponentShown

    private void cboxUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxUsersActionPerformed

        if(allowEvent){
            //Call in the db utils.
            Connection con = EPOS_Database_Utilities.getConnection();
            String query = "SELECT * FROM Users";
            ArrayList<String> userID = null;
            ArrayList<String> userFN = null;
            ArrayList<String> userLN = null;
            userID = EPOS_Database_Utilities.queryDatabase(con, query, "UserID");
            userFN = EPOS_Database_Utilities.queryDatabase(con, query, "UserForename");
            userLN = EPOS_Database_Utilities.queryDatabase(con, query, "UserSur");
            int selIndex = cboxUsers.getSelectedIndex();
            lblUpdateUserID.setText(userID.get(selIndex));
            lblUpdateUserFN.setText(userFN.get(selIndex));
            lblUpdateUserLN.setText(userLN.get(selIndex));
        }        
    }//GEN-LAST:event_cboxUsersActionPerformed

    /**
     * Update User.
     * This grabs the current index of the selected users and updates it with new info.
     * @param evt 
     */
    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        Connection con = EPOS_Database_Utilities.getConnection();
        String userQuery = "SELECT * FROM Users";
        ArrayList<String> getUserIDs = EPOS_Database_Utilities.queryDatabase(con, userQuery, "UserID");
        
        //Defines for all of the required information to create a user.
        String userID = lblUpdateUserID.getText();
        String firstName = lblUpdateUserFN.getText();
        String lastName = lblUpdateUserLN.getText();
        int selIndex = cboxUsers.getSelectedIndex();
        int oldID = Integer.parseInt(getUserIDs.get(selIndex));
        int isUserManager = 0;
        ButtonModel updateSel = bGroupUpdate.getSelection();

        /**
         * Guards. We need to make sure some of the strings can be converted to
         * integers. If not, then there is an issue with the input.
         *
         * userPin = Must be a string (To be parsed in sha-256) and > 5 digits.
         * userID = Must be an int and > 10000. firstName = String field must
         * not be empty. lastName = String field must not be empty. userManager
         * userManager = Must be yes/no
         */
        try {
            int finalUserID = Integer.parseInt(userID);
            if (finalUserID < 10000) {
                JOptionPane.showMessageDialog(null, "User ID must be greater than 10000");
            } else if (firstName.length() < 1 || lastName.length() < 1) {
                JOptionPane.showMessageDialog(null, "Firstname / Lastname must be filled in.");
            } else {

                //Check if the user is to be a manager.
                if (updateSel.getActionCommand().equals("Yes")) {
                    isUserManager = 1;
                } else {
                    isUserManager = 0;
                }

                //Check if the userID exists in the database.
                String query = "SELECT UserID FROM Users WHERE UserID = " + finalUserID;
                ArrayList<String> check = EPOS_Database_Utilities.queryDatabase(con, query, "UserID");
                if (check.size() > 0) {
                    if(check.get(0).equals(lblUpdateUserID.getText())){
                        int res = EPOS_User_Construct.updateUser(oldID, finalUserID, firstName, lastName, isUserManager);
                        if (res == 1) {
                            //Success, clear fields.
                            lblCreateUserID.setText("");
                            lblCreateUserPin.setText("");
                            lblCreateUserFN.setText("");
                            lblCreateUserLN.setText("");
                            updateComboBoxData();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "This UserID already exists.");
                        return;
                    }
                } else {
                    //Call the createUserToDatabase function.
                    int res = EPOS_User_Construct.updateUser(oldID, finalUserID, firstName, lastName, isUserManager);
                    if (res == 1) {
                        //Success, clear fields.
                        lblCreateUserID.setText("");
                        lblCreateUserPin.setText("");
                        lblCreateUserFN.setText("");
                        lblCreateUserLN.setText("");
                        updateComboBoxData();
                    }
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please follow creation rules. Error in trying to parse the data.");
            System.out.println(e);
        }
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void updateComboBoxData(){
        //Vars.
        Connection con = EPOS_Database_Utilities.getConnection();
        
        //Refresh UI.
        allowEvent = false;

        //Clear Info.
        cboxUsersDel.removeAllItems();
        cboxUsers.removeAllItems();

        //We want to fill in misc info on the page CRUD system such as filling in user accounts.
        String refreshQuery = "SELECT * FROM Users";
        ArrayList<String> userarrID = null;
        ArrayList<String> userarrFN = null;
        ArrayList<String> userarrLN = null;
        userarrID = EPOS_Database_Utilities.queryDatabase(con, refreshQuery, "UserID");
        userarrFN = EPOS_Database_Utilities.queryDatabase(con, refreshQuery, "UserForename");
        userarrLN = EPOS_Database_Utilities.queryDatabase(con, refreshQuery, "UserSur");
        for (int i = 0; i < userarrID.size(); i++) {
            cboxUsers.addItem("ID: " + userarrID.get(i) + " (" + userarrFN.get(i) + " " + userarrLN.get(i) + ")");
            cboxUsersDel.addItem("ID: " + userarrID.get(i) + " (" + userarrFN.get(i) + " " + userarrLN.get(i) + ")");
        }

        allowEvent = true;
    }
    private void cboxUsersDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxUsersDelActionPerformed

        if(allowEvent){
            //Call in the db utils.
            Connection con = EPOS_Database_Utilities.getConnection();
            String query = "SELECT * FROM Users";
            ArrayList<String> userID = EPOS_Database_Utilities.queryDatabase(con, query, "UserID");
            ArrayList<String> userFN = EPOS_Database_Utilities.queryDatabase(con, query, "UserForename");
            ArrayList<String> userLN = EPOS_Database_Utilities.queryDatabase(con, query, "UserSur");
            int selIndex = cboxUsersDel.getSelectedIndex();
            System.out.println("Selected Index = " + selIndex);
            lblDeleteWarning.setText("You are about to delete user " + userFN.get(selIndex) + " " + userLN.get(selIndex) + " with user ID " + userID.get(selIndex));
        }
    }//GEN-LAST:event_cboxUsersDelActionPerformed

    /**
     * Delete User Button
     * Grabs the data from the combo box and parses the user ID to be deleted.
     * This ID is then passed onto the deleteUser function in another class.
     * @param evt 
     */
    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        int index = cboxUsersDel.getSelectedIndex();
        String indexName = cboxUsers.getItemAt(index);
        
        //Matcher to get ID from the string.
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(indexName);
        int result = 0;

        while (m.find()) {
            result = Integer.parseInt(m.group());
        }
        
        if(loggedUser.getUserID() == result){
            JOptionPane.showMessageDialog(null, "You can not delete a user that is currently logged in");
            return;
        } else if(result == 12345){
            JOptionPane.showMessageDialog(null, "Error. You can not delete the master account.");
            return;
        }
        
        //Pass the result to the deleteUser function.
        int res = EPOS_User_Construct.deleteUser(result);
        if(res == 1){
            updateComboBoxData();
        } else {
            JOptionPane.showMessageDialog(null, "Error in deleting user ID " + result);
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        //First we can remove some important panels so unauthorized users can't see.
        System.out.println("Setting Panels Invisible");
        panAgent.setVisible(false);
        panMain.setVisible(false);
        panManager.setVisible(false);
        System.out.println("Removed Panel");
        updateComboBoxData();

        //First Establish a DB Connection
        EPOS_Database_Utilities.getConnection();

        //Call the function to login and set to an int variable.
        try {
            loggedUser = EPOS_Users_Database.requestLogin();
        } catch (NoSuchAlgorithmException e) {
            JOptionPane.showMessageDialog(null, "Error fetching the logged-in user.");
        }
        int logSuccess = EPOS_Users_Database.checkSuccess();

        //Check for what was returned and act on that. 1 or 2 = Successful Login.
        if (logSuccess == 1 || logSuccess == 2) {
            //User logged in successfully. Setting variables for the program.

            //Append Program Details
            panMain.setVisible(true);
            System.out.println("Connected");

            //Append the User Details
            appendUserDetails();
            setSessionID();
            
            //Restart Global Vars.
            itemAmount = 1;
            sessionStarted = 0;
            totalPrice = 0;
            allowEvent = true;
            itemSize = "";
            
            //Clear Models and Price.
            listModel.clear();
            priceModel.clear();
            lblTotal.setText("£0.00");
            
            //Clears misc cbox data.
            updateComboBoxData();
        }
    }//GEN-LAST:event_btnRestartActionPerformed

    private void txtAreaPriceMousePressed(java.awt.event.MouseEvent evt) {                                          
        int orderIndex = txtAreaPrice.getSelectedIndex();
        txtAreaOrders.setSelectedIndex(orderIndex);
    } 
    
    /**
     * Check to see which button is clicked and append the data of the button
     * to the appropriate itemAmount variable. Calls the setAmountText.
     */
    ActionListener actionListener = (ActionEvent actionEvent) -> {
        String val = actionEvent.getActionCommand();
        for(int i = 0; i < 13; i++){
            int valInt = Integer.parseInt(val);
            if(i == valInt){
                if(i == 0){
                   setAmountText(1);
                } else {
                   setAmountText(valInt); 
                }
                return;
            }
        }
    };
    
    /**
     * Manager Button Change Listener.
     * Exactly the same as above, however it changes the value in the database.
     */
    
    ActionListener managerListener = (ActionEvent actionEvent) -> {
        String val = actionEvent.getActionCommand();
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(val);
        int result = 0;

        while(m.find()){
            result = Integer.parseInt(m.group());
        }       
        System.out.println(result);
        changeItemChangebox(result);
    };
    
    public void changeItemChangebox(int val){
        Component c = panItems.getComponent(val - 1);
        String btnName = ((JButton) c).getText();
        String btnPrice = ((JButton) c).getActionCommand();
        JTextField field1 = new JTextField(btnName);
        JTextField field2 = new JTextField(btnPrice);
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Product Name: "));
        panel.add(field1);
        panel.add(new JLabel("Product Price: (£)"));
        panel.add(field2);
        int result = JOptionPane.showConfirmDialog(null, panel, "Change Item #" + val,
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            if(field1.getText().equalsIgnoreCase("Insert Name") || field2.getText().equalsIgnoreCase("Insert Price")){
                JOptionPane.showMessageDialog(null, "You must enter something into the name/price fields");
            }
            if(field2.getText().matches(".*\\d+.*")){
                int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to change Item #" + val + " to have the values [Name: " + field1.getText() + " | £" + field2.getText() + " ] ?", "Warning", JOptionPane.YES_NO_OPTION);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    Connection con = EPOS_Database_Utilities.getConnection();
                    System.out.println("Done. Changed Item #"+val+ " to [Name: " + field1.getText() + " | £" + field2.getText() + " ]");
                    try {
                        double price = Double.parseDouble(field2.getText());
                        String query = "UPDATE Items SET itemName = \"" + field1.getText() + "\", ItemPrice = \"" + price + "\" WHERE ID = \"" + val + "\"";
                        System.out.println(query);
                        EPOS_Database_Utilities.manipulateDatabase(con, query);
                        appendItems();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error with setting the price. Must contain 0-9 and . only");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Your price must have didgets only.");
            }
        } else {
            System.out.println("Clicked OFF");
        }
    }
    
    public void setAmountText(int val){
        lblAmount.setText(Integer.toString(val));
        itemAmount = val;
    }
    
    /**
     * Similar to the actionEvent above, however it checks for item presses.
     * If the item is pressed, the following happens.
     * 
     * : Grabs the appended price from Action Command.
     * : Calculates the price TIMES the quantity
     * : Appends the name to the listView.
     * : Totals the price for the over-all total.
     */
    ActionListener priceListener = (ActionEvent priceEvent) -> {
        JButton button = (JButton) priceEvent.getSource();
        String strPrice = button.getActionCommand();
        appendItemDetails(button.getText(), strPrice);
        setAmountText(1);
    };
    
    /**
     * Function appends the passed items into the listView and calculates
     * the total price. Small = tot-0.5 Large = tot+0.5
     * @param item
     * @param price 
     */
    public void appendItemDetails(String item, String price){
        if(listModel.isEmpty()){
            setTimer(0); 
        }
        double itmPrice = Double.parseDouble(price);
        if(itemSize.equals("small")){
            listModel.addElement(itemAmount + "x Sml " + item);
            priceModel.addElement(new DecimalFormat("£#0.00").format((itmPrice * itemAmount) - 0.50));
            totalPrice = totalPrice + (itmPrice * itemAmount) - 0.50;
        } else if(itemSize.equals("large")){
            listModel.addElement(itemAmount + "x Lrg " + item);
            totalPrice = totalPrice + (itmPrice * itemAmount) + 0.50;
            priceModel.addElement(new DecimalFormat("£#0.00").format((itmPrice * itemAmount) + 0.50));
        } else {
            listModel.addElement(itemAmount + "x Med " + item);
            totalPrice = totalPrice + (itmPrice * itemAmount); 
            priceModel.addElement(new DecimalFormat("£#0.00").format((itmPrice * itemAmount)));
        }
        int appendedIndex = listModel.getSize() - 1;
        lblTotal.setText(new DecimalFormat("£#0.00").format(totalPrice));
        lblSize.setText("M");
        itemSize = "";
        
    }
    
    /**
     * This function appends the user details once the user has successfully
     * logged in. This only appends details to the GUI.
     */
    private void appendUserDetails(){
        //Database Utilities Class.
        EPOS_Users_Database userQuery = new EPOS_Users_Database();
        
        //Set the POS User Information.
        System.out.println("Setting User Details");
        lblUsername.setText(Integer.toString(loggedUser.getUserID()));
        lblFullname.setText(loggedUser.getUserFullname());
        lblLoginImage.setIcon(new ImageIcon("Data/images/User.png"));
        if(loggedUser.getUserRole() == 1){
            lblLoginImage.setIcon(new ImageIcon("Data/images/Manager.png"));
        }
        
        //Define the POS as 0. More than 1 POS system in a network should increment this. For future rev.
        lblPOS.setText("POS-0");
        
        //Set the system time.        
        //We need to get the time once every second.
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                setDateTime();
            }
        };
        timer.schedule(task, 0L, 1000L);
        
        //Append the User Details for the Agent and Manager Panel.
        lblAgentUserID.setText(Integer.toString(loggedUser.getUserID()));
        lblAgentFirstname.setText(loggedUser.getUserFirstname());
        lblAgentLastname.setText(loggedUser.getUserLastname());
        lblManagerUserID.setText(Integer.toString(loggedUser.getUserID()));
        lblManagerFirstname.setText(loggedUser.getUserFirstname());
        lblManagerLastname.setText(loggedUser.getUserLastname());
        if(loggedUser.getUserRole() == 0){
            lblAgentPos.setText("Agent");
            lblManagerPos.setText("Agent");
        } else {
            lblAgentPos.setText("Manager");
            lblManagerPos.setText("Manager");
        }
    }
    
    /**
     * Simple function to set the Date/Time to a label.
     */
    public void setDateTime(){
        //Define and call the format class.
        DateFormat dt = new SimpleDateFormat("yyyy/MM/dd HH:mm:s");
        Calendar cal = Calendar.getInstance();
        String curDateTime = dt.format(cal.getTime());
        lblDateTime.setText(curDateTime);
    }
    
    /**
     * Another timer function to count up from 0:00 in time.
     */
    public void setTimer(int cancel){
        //Define and call the format class.
        DateFormat dt = new SimpleDateFormat("mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        
        caltimer = new Timer();
        TimerTask caltask = new TimerTask() {
            public void run() {
                cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + 1);
                lblOrderTime.setText(dt.format(cal.getTime()));
            }
        };
        
        caltimer.schedule(caltask, 0L, 1000L);
        if(cancel == 1){
            caltimer.purge();
            caltimer.cancel();
        }
    }
    
    /**
     * Function to grab the items from the EPOS_Items table and append
     * them to the buttons (Including the set prices)
     */
    public void appendItems(){
        EPOS_Items item = new EPOS_Items();
        ArrayList<String> items = item.getItems();
        ArrayList<String> prices = item.getPrices();
        for(int i = 0; i < items.size(); i++){
            System.out.println(items.get(i));
        }
        for(int i = 0; i < items.size(); i++){
            Component c = panItems.getComponent(i);
            ((JButton) c).setText(items.get(i));
            ((JButton) c).setMinimumSize(new Dimension(126, 88));
            ((JButton) c).setMaximumSize(new Dimension(126, 88));
            ((JButton) c).setActionCommand(prices.get(i));
        }
    }
    
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
            java.util.logging.Logger.getLogger(EPOSMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EPOSMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EPOSMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EPOSMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EPOSMain().setVisible(true);
            }
        });
        
        
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane CRUDPane;
    private javax.swing.ButtonGroup bGroupManager;
    private javax.swing.ButtonGroup bGroupUpdate;
    private javax.swing.JButton btnAgent;
    private javax.swing.JButton btnAgentReturn;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnDeauth;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnItem0;
    private javax.swing.JButton btnItem1;
    private javax.swing.JButton btnItem10;
    private javax.swing.JButton btnItem11;
    private javax.swing.JButton btnItem2;
    private javax.swing.JButton btnItem3;
    private javax.swing.JButton btnItem4;
    private javax.swing.JButton btnItem5;
    private javax.swing.JButton btnItem6;
    private javax.swing.JButton btnItem7;
    private javax.swing.JButton btnItem8;
    private javax.swing.JButton btnItem9;
    private javax.swing.JButton btnLarge;
    private javax.swing.JButton btnManager;
    private javax.swing.JRadioButton btnManagerNo;
    private javax.swing.JRadioButton btnManagerYes;
    private javax.swing.JButton btnMedium;
    private javax.swing.JButton btnQua0;
    private javax.swing.JButton btnQua1;
    private javax.swing.JButton btnQua2;
    private javax.swing.JButton btnQua3;
    private javax.swing.JButton btnQua4;
    private javax.swing.JButton btnQua5;
    private javax.swing.JButton btnQua6;
    private javax.swing.JButton btnQua7;
    private javax.swing.JButton btnQua8;
    private javax.swing.JButton btnQua9;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnSmall;
    private javax.swing.JButton btnUpdateItem1;
    private javax.swing.JButton btnUpdateItem10;
    private javax.swing.JButton btnUpdateItem11;
    private javax.swing.JButton btnUpdateItem12;
    private javax.swing.JButton btnUpdateItem2;
    private javax.swing.JButton btnUpdateItem3;
    private javax.swing.JButton btnUpdateItem4;
    private javax.swing.JButton btnUpdateItem5;
    private javax.swing.JButton btnUpdateItem6;
    private javax.swing.JButton btnUpdateItem7;
    private javax.swing.JButton btnUpdateItem8;
    private javax.swing.JButton btnUpdateItem9;
    private javax.swing.JRadioButton btnUpdateNo;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JRadioButton btnUpdateYes;
    private javax.swing.JButton btnVoid;
    private javax.swing.JComboBox<String> cboxUsers;
    private javax.swing.JComboBox<String> cboxUsersDel;
    private javax.swing.JPanel crudCreate;
    private javax.swing.JPanel crudDelete;
    private javax.swing.JPanel crudUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAgInfoUserFN;
    private javax.swing.JLabel lblAgInfoUserHS;
    private javax.swing.JLabel lblAgInfoUserID1;
    private javax.swing.JLabel lblAgInfoUserPos;
    private javax.swing.JLabel lblAgInfoUserSN;
    private javax.swing.JLabel lblAgInfoUserTS;
    private javax.swing.JLabel lblAgentAvgSales;
    private javax.swing.JLabel lblAgentCustomers;
    private javax.swing.JLabel lblAgentFirstname;
    private javax.swing.JLabel lblAgentHighest;
    private javax.swing.JLabel lblAgentLastname;
    private javax.swing.JLabel lblAgentMaxSales;
    private javax.swing.JLabel lblAgentMinSales;
    private javax.swing.JLabel lblAgentPos;
    private javax.swing.JLabel lblAgentTotSales;
    private javax.swing.JLabel lblAgentTotal;
    private javax.swing.JLabel lblAgentUserID;
    private javax.swing.JLabel lblAgtAvgSales;
    private javax.swing.JLabel lblAgtInfoCust;
    private javax.swing.JLabel lblAgtMaxSales;
    private javax.swing.JLabel lblAgtMinSales;
    private javax.swing.JLabel lblAgtTotalSales;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblCreateInfoFN;
    private javax.swing.JLabel lblCreateInfoLN;
    private javax.swing.JLabel lblCreateInfoLN1;
    private javax.swing.JLabel lblCreateInfoLN2;
    private javax.swing.JLabel lblCreateInfoUserID;
    private javax.swing.JLabel lblCreatePinInfo;
    private javax.swing.JTextField lblCreateUserFN;
    private javax.swing.JLabel lblCreateUserHelp;
    private javax.swing.JLabel lblCreateUserHelpPin;
    private javax.swing.JTextField lblCreateUserID;
    private javax.swing.JTextField lblCreateUserLN;
    private javax.swing.JTextField lblCreateUserPin;
    private javax.swing.JLabel lblDateTime;
    private javax.swing.JLabel lblDateTimeInfo;
    private javax.swing.JLabel lblDeleteWarning;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblFullnameInfo;
    private javax.swing.JLabel lblLoginImage;
    private javax.swing.JLabel lblManAvgSales;
    private javax.swing.JLabel lblManInfoCust;
    private javax.swing.JLabel lblManInfoUserFN;
    private javax.swing.JLabel lblManInfoUserHS;
    private javax.swing.JLabel lblManInfoUserID;
    private javax.swing.JLabel lblManInfoUserPos;
    private javax.swing.JLabel lblManInfoUserSN;
    private javax.swing.JLabel lblManInfoUserTS;
    private javax.swing.JLabel lblManMaxSales;
    private javax.swing.JLabel lblManMinSales;
    private javax.swing.JLabel lblManTotalSales;
    private javax.swing.JLabel lblManagerAvgSales;
    private javax.swing.JLabel lblManagerCustomers;
    private javax.swing.JLabel lblManagerFirstname;
    private javax.swing.JLabel lblManagerHighest;
    private javax.swing.JLabel lblManagerLastname;
    private javax.swing.JLabel lblManagerMaxSales;
    private javax.swing.JLabel lblManagerMinSales;
    private javax.swing.JLabel lblManagerPos;
    private javax.swing.JLabel lblManagerTotSales;
    private javax.swing.JLabel lblManagerTotal;
    private javax.swing.JLabel lblManagerUserID;
    private javax.swing.JLabel lblOrderInfo;
    private javax.swing.JLabel lblOrderTime;
    private javax.swing.JLabel lblPOS;
    private javax.swing.JLabel lblPOSInfo;
    private javax.swing.JLabel lblSelectUser;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalInfo;
    private javax.swing.JLabel lblUpdateInfoFN;
    private javax.swing.JLabel lblUpdateInfoLN;
    private javax.swing.JLabel lblUpdateInfoUserID;
    private javax.swing.JLabel lblUpdateUserError;
    private javax.swing.JTextField lblUpdateUserFN;
    private javax.swing.JLabel lblUpdateUserHelp;
    private javax.swing.JTextField lblUpdateUserID;
    private javax.swing.JTextField lblUpdateUserLN;
    private javax.swing.JLabel lblUserInfo;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblcreateError;
    private javax.swing.JPanel panAgent;
    private javax.swing.JPanel panAgentInfo;
    private javax.swing.JPanel panItems;
    private javax.swing.JPanel panMain;
    private javax.swing.JPanel panManAgentInfo;
    private javax.swing.JPanel panManCRUD;
    private javax.swing.JPanel panManItems;
    private javax.swing.JPanel panManReports;
    private javax.swing.JPanel panManager;
    private javax.swing.JPanel panReports;
    private javax.swing.JPanel panUserInfo;
    private javax.swing.JList<String> txtAreaOrders;
    private javax.swing.JList<String> txtAreaPrice;
    // End of variables declaration//GEN-END:variables
}
