package com.company.controller;

import javax.swing.*;
import java.awt.*;

public class FirstPanel {
    private static JPanel panel = null;
    private static JFrame frame = null;

    public static JPanel firstView(){

        //导入frame
        frame = PatchController.returnJFrame();

        panel = new JPanel();

        //添加新的panel
        frame.add(panel);

        panel.setBounds(-1, 31, 1103, 718);
        panel.setLayout(null);

        /*JLabel label = new JLabel("界面一");
        label.setFont(new Font("宋体", Font.PLAIN, 99));
        label.setBounds(356, 108, 326, 297);
        panel.add(label);*/

        JTextField txtfield1=new JTextField();    //创建文本框
        txtfield1.setFont(new Font("楷体",Font.BOLD,30));    //修改字体样式

        txtfield1.setText("股票编号");    //设置文本框的内容

        txtfield1.setBounds(300,300,140,30);

        JTextField txtfield2=new JTextField(28);
        txtfield2.setFont(new Font("楷体",Font.BOLD,30));    //修改字体样式
        txtfield2.setText("请输入股票编号");
        txtfield2.setBounds(450,300,200,30);



        JButton btn1=new JButton("开始搜索");    //创建JButton对象
        btn1.setBounds(300,360,350,40);

        //弄个进度条
        JProgressBar progressBar=new JProgressBar();
        progressBar.setBounds(300,460,350,40);
        progressBar.setStringPainted(true);
        //如果不需要进度上显示“升级进行中...”，可注释此行
        progressBar.setString("评论数据下载中");
        int[] progressValues={6,18,27,39,51,66,81,100};
        progressBar.setIndeterminate(false);


        panel.add(txtfield1);
        panel.add(txtfield2);
        panel.add(btn1);
        panel.add(progressBar);

        btn1.addActionListener((e)-> {

                    System.out.println("下载进度");
                    for (int i = 0; i < progressValues.length; i++) {
                        //设置进度条的值
                        System.out.println(new StringBuilder().append("下载进度").append(String.valueOf(progressValues[i])).toString());
                        progressBar.setValue(progressValues[i]);
                       // progressBar.setStringPainted(true);
                        //progressBar.setIndeterminate(true);
                        progressBar.setString(String.valueOf(progressValues[i]));
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }


                    }
                }
                );

        return panel;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
