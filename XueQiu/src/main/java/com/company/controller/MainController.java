/*
package com.company.controller;

import com.company.model.DaoImpl;
import com.company.model.PinglunDao;
import com.company.model.TagDao;
import com.company.model.bean.Tag;
import com.company.view.ListPage;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

*/
/**
 * @author **N4c1**
 * @create 2021-04-20 23:56
 *//*

public class MainController  {

    private static JFrame frame = new JFrame();

    private static JPanel panel = null;
    */
/*
     * @Author chengpunan
     * @Description //TODO
     * @Date
     * @Param
     * @return
     * 下面没用的
     *
     *
     *
     * 参考连接：https://blog.csdn.net/qq_40935723/article/details/90942887
     *
     **//*


    JButton search = null;
    JButton deletePinglun = null;
    JButton changeTag=null;
    JList pinglunlist = null;
    JList taglist = null;

    public MainController() {


        DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        //JFreeChart chart= ChartFactory.createPieChart("某公司人员组织数据图",dpd,true,true,false);


        frame = new JFrame("切换界面");
        frame.setBounds(100, 100, 1116, 790);
        frame.getContentPane().setLayout(null);

        //使窗体不能放大
     //   frame.setResizable(false);

        //使窗体在屏幕中间出现
       // frame.setResizable(false);

        // 菜单栏
        // 新建一个菜单条
        JMenuBar jb = new JMenuBar();
        jb.setBounds(0, 0, 1116, 30);
        frame.getContentPane().add(jb);


        // 新建一个菜单选项
        JMenu jmenu1 = new JMenu("评论");
        JMenu jMenu2 = new JMenu("搜索");
        JMenu jMenu3 = new JMenu("数据");

        jb.add(jmenu1);
        jb.add(jMenu2);
        jb.add(jMenu3);

        // 新建一个菜单项
        JMenuItem jm1 = new JMenuItem("界面一");

        jmenu1.add(jm1);

        JMenuItem jm2 = new JMenuItem("界面二");
        jmenu1.add(jm2);


        //初始  panel
        panel = new JPanel();

        frame.add(panel);

        panel.setBounds(-1, 31, 1103, 718);
        panel.setLayout(null);

        JLabel label = new JLabel("首页");
        label.setFont(new Font("宋体", Font.PLAIN, 99));
        label.setBounds(356, 108, 326, 297);
        panel.add(label);

        //使窗体可见
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void  searchpageCreate(){

    }




    public void bingtuPageCreate(){

    }

    public static JFrame returnJFrame() {

        return frame;
    }

    public static void main(String[] args) {
        new MainController();

        //new



    }


    public void Stockadd() {

    }


    public void Stockdelete() {

    }


    public void Stockquery() {

    }


    public void Stockchange() {

    }

    public void Tagadd() {

    }


    public void Tagdelete() {

    }


    public void Tagquery() {

    }


    public void Tagchange() {

    }



}
*/
