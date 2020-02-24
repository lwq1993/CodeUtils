package cn.arvinyl.generate.ui;


import cn.arvinyl.generate.core.GeneratorFacade;
import cn.arvinyl.generate.entity.DataBase;
import cn.arvinyl.generate.entity.Settings;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CodeUtil extends JFrame {

	private DataBase db;
	private String dbName;

	public CodeUtil(DataBase db, String dbName) {
		this.db = db;
		this.dbName = dbName;
		initComponents();
	}


	private void initComponents() {

		jLabel1 = new JLabel();
		jLabel4 = new JLabel();
		jSeparator1 = new JSeparator();
		//jTextField4 = new javax.swing.JTextField();
		jLabel5 = new JLabel();
		jTextField5 = new JTextField();
		jSeparator2 = new JSeparator();
		jLabel6 = new JLabel();
		jTextField6 = new JTextField();
		jLabel7 = new JLabel();
		jTextField7 = new JTextField();
		jLabel8 = new JLabel();
		jTextField8 = new JTextField();
		jLabel9 = new JLabel();
		jTextField9 = new JTextField();
		jButton1 = new JButton();
		jButton2 = new JButton();
		//jButton6 = new javax.swing.JButton();
		jButton7 = new JButton();
		数据库 = new JLabel();
		jTextField10 = new JTextField();
		jLabel10 = new JLabel();
		jTextField11 = new JTextField();
		jLabel11 = new JLabel();
		jTextField12 = new JTextField();
		jComboBox1 = new JComboBox();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("代码生成器v1.0");
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowActivated(java.awt.event.WindowEvent evt) {
				formWindowActivated(evt);
			}

			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}

			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		jLabel1.setText("\u6a21\u677f");


		jLabel5.setText("\u4ee3\u7801\u751f\u6210\u8def\u5f84");

		jLabel6.setText("\u9879\u76ee\u540d\uff08\u82f1\u6587\uff09");

		jLabel7.setText("\u9879\u76ee\u4e2d\u6587\u540d\u79f0");

		jLabel8.setText("\u5305\u540d");

		jLabel9.setText("\u4f5c\u8005");

		jButton1.setText("\u751f\u6210\u4ee3\u7801");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u5173\u95ed");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});



		jButton7.setText("\u9009\u62e9");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		数据库.setText("\u6570\u636e\u5e93");

		jLabel10.setText("\u7528\u6237\u540d");

		jLabel11.setText("\u5bc6\u7801");

		jComboBox1.setModel(new DefaultComboBoxModel(
				new String[] { "--请选择模板--" }));

		GroupLayout layout = new GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(jSeparator2,
						GroupLayout.DEFAULT_SIZE, 543,
						Short.MAX_VALUE)
				.addComponent(jSeparator1,
						GroupLayout.Alignment.TRAILING,
						GroupLayout.DEFAULT_SIZE, 543,
						Short.MAX_VALUE)
				.addGroup(
						GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(26, 26,
																		26)
																.addGroup(
																		layout.createParallelGroup(
																				GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel4)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addPreferredGap(
																										LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabel5))))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(25, 25,
																		25)
																.addGroup(
																		layout.createParallelGroup(
																				GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel6)
																				.addComponent(
																						jLabel8)
																				.addComponent(
																						jLabel7)
																				.addComponent(
																						jLabel9)
																				.addComponent(
																						数据库)
																				.addComponent(
																						jLabel10))))
								.addGap(0, 0, 0)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jTextField11,
																		GroupLayout.PREFERRED_SIZE,
																		104,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jLabel11)
																.addGap(36, 36,
																		36)
																.addComponent(
																		jTextField12,
																		GroupLayout.DEFAULT_SIZE,
																		118,
																		Short.MAX_VALUE))
												.addComponent(
														jTextField10,
														GroupLayout.DEFAULT_SIZE,
														300, Short.MAX_VALUE)
												.addGroup(
														GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		jButton1)
																.addPreferredGap(
																		LayoutStyle.ComponentPlacement.RELATED,
																		140,
																		Short.MAX_VALUE)
																.addComponent(
																		jButton2,
																		GroupLayout.PREFERRED_SIZE,
																		79,
																		GroupLayout.PREFERRED_SIZE))
//												.addComponent(
//														jTextField4,
//														javax.swing.GroupLayout.DEFAULT_SIZE,
//														300, Short.MAX_VALUE)
												.addComponent(
														jTextField5,
														GroupLayout.DEFAULT_SIZE,
														300, Short.MAX_VALUE)
												.addComponent(
														jTextField6,
														GroupLayout.DEFAULT_SIZE,
														300, Short.MAX_VALUE)
												.addComponent(
														jTextField7,
														GroupLayout.DEFAULT_SIZE,
														300, Short.MAX_VALUE)
												.addComponent(
														jTextField8,
														GroupLayout.DEFAULT_SIZE,
														300, Short.MAX_VALUE)
												.addComponent(
														jTextField9,
														GroupLayout.DEFAULT_SIZE,
														300, Short.MAX_VALUE))
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.TRAILING,
												false)
//												.addComponent(
//														jButton7,
//														javax.swing.GroupLayout.Alignment.LEADING,
//														0, 0, Short.MAX_VALUE)
												.addComponent(
														jButton7,
														GroupLayout.Alignment.LEADING,
														GroupLayout.DEFAULT_SIZE,
														73, Short.MAX_VALUE)
									)
								.addGap(54, 54, 54))
				.addGroup(
						GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(27, 27, 27)
								.addComponent(jLabel1)
								.addGap(57, 57, 57)
								.addComponent(jComboBox1,
										GroupLayout.PREFERRED_SIZE,
										299,
										GroupLayout.PREFERRED_SIZE)
								.addGap(136, 136, 136)));
		layout.setVerticalGroup(layout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(96, 96, 96)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.BASELINE)
												.addComponent(
														jComboBox1,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel1))
								.addGap(18, 18, 18)
								.addComponent(jSeparator1,
										GroupLayout.PREFERRED_SIZE,
										10,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
//												.addComponent(jTextField4)
												//.addComponent(jButton6)
								)
								.addGap(15, 15, 15)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel5)
												.addComponent(jTextField5)
												.addComponent(jButton7))
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jSeparator2,
										GroupLayout.PREFERRED_SIZE,
										10,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel6)
												.addComponent(jTextField6))
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.LEADING)
												.addComponent(jLabel8)
												.addComponent(jTextField7))
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel7)
												.addComponent(jTextField8))
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.BASELINE)
												.addComponent(jTextField9)
												.addComponent(jLabel9))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.BASELINE)
												.addComponent(数据库)
												.addComponent(jTextField10))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel10)
												.addComponent(
														jTextField11,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel11)
												.addComponent(
														jTextField12,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addGap(26, 26, 26)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.BASELINE)
												.addComponent(jButton2)
												.addComponent(jButton1))
								.addGap(24, 24, 24)));

		pack();
	}

	private void formWindowClosing(java.awt.event.WindowEvent evt) {
		dispose();
		System.exit(0);
	}


	private void formWindowOpened(java.awt.event.WindowEvent evt) {
		setLocationRelativeTo(null);
		//获取当前文件夹下的模板目录下的所有文件夹
		File directory = new File(new File("").getAbsolutePath() + "\\templates");//设定为当前文件夹
		File[] listFiles = directory.listFiles();
		if (listFiles != null) {
			for (File f : listFiles) {
				if (f.isDirectory()) {
					this.jComboBox1.addItem(f.getName());
				}
			}
		}
	}

	private void formWindowActivated(java.awt.event.WindowEvent evt) {

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	public void setDbInfo(DataBase dbs,String name) {
		this.jTextField10.setText(name);
		this.jTextField11.setText(dbs.getUserName());
		this.jTextField12.setText(dbs.getPassWord());

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		jButton1.setEnabled(false);
		jButton1.setText("代码生成中...");
		final Thread t=new Thread(new Runnable(){
			  public void run(){
				  try{
					//路径map封装
						Map<String, String> pathMap = new HashMap<String, String>();
						//获取当前文件夹下的模板目录下的所有文件夹
						String basePath = new File("").getAbsolutePath() + "\\templates\\"
								+ jComboBox1.getSelectedItem();//设定为当前文件夹

						String templetPath = basePath;
						String outpath = jTextField5.getText();

						//全局替换符
						Map<String, String> publicMap = new HashMap<String, String>();
						String project = jTextField6.getText();
						String pPackage = jTextField7.getText();
						String projectComment = jTextField8.getText();
						String author = jTextField9.getText();
					  Settings settings = new Settings(project,pPackage,projectComment,author);
					  generator(templetPath,outpath,settings,db);
					  JOptionPane.showMessageDialog(null, "代码生成成功", "提示",
								JOptionPane.DEFAULT_OPTION);
				  }catch (Exception e) {
				     e.printStackTrace();
				     JOptionPane.showMessageDialog(null, "发生错误", "错误详情请查看error.log",
								JOptionPane.INFORMATION_MESSAGE);
				     
				  }
				  jButton1.setEnabled(true);
				  jButton1.setText("生成代码");
				  
			  }}
		  );
		t.start();
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		this.jTextField5.setText(selectPath("选择代码生成路径"));
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		//this.jTextField2.setText(selectPath("选择表级模板路径"));
	}

	/**
	 * 选择路径
	 * @param title
	 * @return
	 */
	private String selectPath(String title) {
		JFileChooser jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		jfc.showDialog(new JLabel(), title);
		File file = jfc.getSelectedFile();
		if (file == null) {
			return null;
		}
		return file.getPath();
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				DataBase db = new DataBase("mysql","ihrm");
				db.setUserName("root");
				db.setPassWord("111111");
				new CodeUtil(db,null).setVisible(true);
			}
		});
	}


	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton6;
	private JButton jButton7;
	private JComboBox jComboBox1;
	private JLabel jLabel1;
	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JSeparator jSeparator1;
	private JSeparator jSeparator2;
	private JTextField jTextField10;
	private JTextField jTextField11;
	private JTextField jTextField12;
	private JTextField jTextField4;
	private JTextField jTextField5;
	private JTextField jTextField6;
	private JTextField jTextField7;
	private JTextField jTextField8;
	private JTextField jTextField9;
	private JLabel 数据库;


	//UI调用程序入口

	/**
	 *
	 * @param templetPath		模板所在路径
	 * @param outpath			选择代码生成路径
	 * @param settings			工程配置对象
	 * @param db				数据库信息
	 */
	private void generator(String templetPath, String outpath, Settings settings, DataBase db) throws Exception {
		GeneratorFacade gf = new GeneratorFacade(templetPath,outpath,settings,db);
		gf.generatorByDataBase();
	}

}