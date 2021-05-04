package com.company.controller;

import javax.swing.*;
import java.awt.*;

public class TagPanel {
    private static JPanel jpanel = null;
    private static JFrame frame = null;

    public static JPanel TAgView() {


        //导入frame
        frame = PatchController.returnJFrame();

        jpanel = new JPanel();

        //添加新的panel
        frame.add(jpanel);

        jpanel.setBounds(-1, 31, 1103, 718);
        jpanel.setLayout(null);

        JButton btn1=new JButton("中立评论");    //创建按钮
        btn1.setBounds(100,100,200,100);
        btn1.setFont(new Font("楷体",Font.BOLD,30));
        JButton btn2=new JButton("非广告贴");
        btn2.setBounds(400,100,200,100);
        btn2.setFont(new Font("楷体",Font.BOLD,30));

        JButton btn3=new JButton("精品贴");
        btn3.setBounds(700,100,200,100);
        btn3.setFont(new Font("楷体",Font.BOLD,30));

        JButton btn4=new JButton("自定义标签");
        btn4.setBounds(400,400,200,100);
        btn4.setFont(new Font("楷体",Font.BOLD,30));

        JButton btn5=new JButton("5");

        jpanel.add(btn1);    //面板中添加按钮
        jpanel.add(btn2);
        jpanel.add(btn3);
        jpanel.add(btn4);
        jpanel.add(btn5);

        //向JPanel添加FlowLayout布局管理器，将组件间的横向和纵向间隙都设置为20像素
        jpanel.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
        jpanel.setBackground(Color.gray);    //设置背景色





        return jpanel;
    }

    public static void main(String[] args) {

    }

}
