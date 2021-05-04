package com.company.controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatchController {

    private final int MAX_PAGE =5;
    private final int MAX_LISTSUM =200;

    private static JFrame frame = new JFrame();

    private static JPanel panel = null;

    public PatchController() {

        frame = new JFrame("数据标记软件");
        frame.setBounds(100, 100, 1116, 790);
        frame.getContentPane().setLayout(null);

        //使窗体不能放大
        frame.setResizable(false);

        //使窗体在屏幕中间出现
        frame.setResizable(false);

        // 菜单栏
        // 新建一个菜单条
        JMenuBar jb = new JMenuBar();
        jb.setBounds(0, 0, 1116, 40);
        frame.getContentPane().add(jb);


        // 新建一个菜单选项
        JMenu jmenu1 = new JMenu("评论");
        jb.add(jmenu1);

        //增加三个菜单选项
        JMenu jmenu2 = new JMenu("搜索");
        JMenu jmenu3 = new JMenu("饼图");
        //JMenu jmenu1 = new JMenu("界面");
        jb.add(jmenu2);
        jb.add(jmenu3);

        // 新建一个菜单项
        JMenuItem jm1 = new JMenuItem("增加");

        jmenu1.add(jm1);

        JMenuItem jm2 = new JMenuItem("是否已经标注标签|√");
        jmenu1.add(jm2);

        //增加相关的点击
        JMenuItem jm3 = new JMenuItem("删除");
        jmenu1.add(jm3);

        JMenuItem jm4 = new JMenuItem("修改");
        jmenu1.add(jm4);

        JMenuItem jm5 = new JMenuItem("关于标签");
        jmenu1.add(jm5);

        JMenuItem jmsou = new JMenuItem("搜索");
        jmenu2.add(jmsou);

        JMenuItem jmbing = new JMenuItem("饼图");
        jmenu3.add(jmbing);

        //-----------------------------------------------------------------
        //-----------------------------------------------------------------
        //-----------------------------------------------------------------
        //-----------------------------------------------------------------
        //-----------------------------------------------------------------

        //初始  panel
        //首界面，确定身份：
        panel = new JPanel();

        frame.add(panel);

        panel.setBounds(-1, 31, 1103, 718);
        panel.setLayout(null);
/*
        JLabel label = new JLabel("首页");
        label.setFont(new Font("宋体", Font.PLAIN, 99));
        label.setBounds(356, 108, 326, 297);
        panel.add(label);*/


        JLabel label1=new JLabel("选择角色：");
        JRadioButton rb1=new JRadioButton("春天");    //创建JRadioButton对象
        JRadioButton rb2=new JRadioButton("夏天");    //创建JRadioButton对象
        JRadioButton rb3=new JRadioButton("秋天",true);    //创建JRadioButton对象
        JRadioButton rb4=new JRadioButton("冬天");    //创建JRadioButton对象
        label1.setFont(new Font("楷体",Font.BOLD,45));    //修改字体样式
        label1.setBounds(100, 108, 326, 297);
        JLabel label2=new JLabel("数据标注者");
        label2.setFont(new Font("楷体",Font.BOLD,45));    //修改字体样式
        label2.setBounds(120, 118, 400, 400);
        JLabel label3=new JLabel("数据管理者");
        label3.setFont(new Font("楷体",Font.BOLD,45));    //修改字体样式
        label3.setBounds(120, 218, 400, 400);

        ButtonGroup group=new ButtonGroup();
        rb1.setBounds(100, 308,20,20);
        rb1.setFont(new Font("楷体",Font.BOLD,20));    //修改字体样式
        rb2.setBounds(100, 408,20,20);

        //添加JRadioButton到ButtonGroup中
        group.add(rb1);
        group.add(rb2);
        panel.add(label1);
        panel.add(rb1);
        panel.add(rb2);
        panel.add(label2);
        panel.add(label3);





        //关键地方来了，下面就是窗体的切换过程了。



        //打开界面一
        jmsou.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Log:打开下载界面");
                frame.remove(panel);
                panel = FirstPanel.firstView();

                //在这里，我们为什么要先frame.remove(panel)，这是因为，如果我们不是remove，
                //而是add()话，会出现，有一些组件重合，那么就会导致我们一些功能，无法使用，所以我们要先remve掉frame当前的panel。

                //为什么要？panel = FirstPanel.firstView();
                //这是因为，frame添加的panel已经改变了，如果我们不重新赋值panel的话，那我们，想要再次切换时，将会remove以前的panel
                //对frame现在添加的panel，没有任何影响，所以要重新赋值panel
            }
        });

        //打开界面二
        jmbing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Log:打开饼图界面");

                frame.remove(panel);
                //原因同上。
                panel = ThirdPanel.thirdView();
            }
        });

        //打开界面二
        jm1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Log:打开评论界面");

                frame.remove(panel);
                panel = SecondPanel.secondView();
                //原因同上。
            }
        });

        //打开标签界面
        jm5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel);
                panel = TagPanel.TAgView();
            }
        });

        //使窗体可见
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static JFrame returnJFrame() {

        return frame;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        new PatchController();
    }

}
