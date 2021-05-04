package com.company.controller;

import javax.swing.*;
import java.awt.*;

public class SecondPanel {
    private static JPanel panel = null;
    private static JFrame frame = null;
    private static JList list1 = null;// 定义列表框
    private static  JList list2 = null;// 定义列表框
    private static JList list3= null;// 定义列表框
    private static  JList list4 = null;// 定义列表框


    public static JPanel secondView() {

        //导入frame
        frame = PatchController.returnJFrame();

        panel = new JPanel();

        //添加新的panel
        frame.add(panel);

        panel.setBounds(-1, 31, 1103, 718);
        panel.setLayout(null);

      
        String nation[] = { "60012","60012","60012","60012","60012","60012","60012","60012",
                "60012","60012","60012","60012","60012","60012","60012",
                "60012","60012","60012","60012","60012","60012","60012","60012","60012"};
        String vector[] ={"2021/12.27","2021/12.28","2021/12.27","2021/12.28","2021/12.27","2021/12.28",
                "2021/12.27","2021/12.28","2021/12.27","2021/12.28","2021/12.27","2021/12.28",
                "2021/12.27","2021/12.28","2021/12.27","2021/12.28","2021/12.27","2021/12.28",
                "2021/12.27","2021/12.28",};
        String linglun[] ={"合同金额和确认收入金额。" ,"合同金额和确认收入金额。","合同金额和确认收入金额。"
        ,"合同金额和确认收入金额。","合同金额和确认收入金额。","合同金额和确认收入金额。","合同金额和确认收入金额。","合同金额和确认收入金额。",
                "合同金额和确认收入金额。","合同金额和确认收入金额。" ,"合同金额和确认收入金额。","合同金额和确认收入金额。"
                ,"合同金额和确认收入金额。","合同金额和确认收入金额。","合同金额和确认收入金额。" ,"合同金额和确认收入金额。","合同金额和确认收入金额。"
                ,"合同金额和确认收入金额。","合同金额和确认收入金额。","合同金额和确认收入金额。" ,"合同金额和确认收入金额。","合同金额和确认收入金额。"
                ,"合同金额和确认收入金额。","合同金额和确认收入金额。"};
        String queren[] = {"是","是","是","是","是","是","是","是","是","是","是"};
        list1 = new JList(nation);
        list1.setFont(new Font("宋体", Font.PLAIN, 15));
        list2 = new JList(vector);
        list2.setFont(new Font("宋体", Font.PLAIN, 15));

        list1.setBounds(0,20,50,1000);
        list2.setBounds(60,20,100,1000);

        list3 = new JList(linglun);

        list3.setFont(new Font("宋体", Font.PLAIN, 15));

        list3.setBounds(170,20,830,1000);

        list4 = new JList(queren);
        list4.setFont(new Font("宋体", Font.PLAIN, 15));

        list4.setBounds(1020,20,20,1000);

        panel.add(list1);
        panel.add(list2);
        panel.add(list3);
        panel.add(list4);

        return panel;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public static int[] getList(){
        int[] list = new int[]{1};
        return list;
    }


}
