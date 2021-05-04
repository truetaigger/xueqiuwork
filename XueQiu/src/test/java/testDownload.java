import com.company.controller.SecondPanel;
import org.jfree.data.time.Second;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.Assert.*;

public class testDownload {
    public static void main(String[] args) {

    }



    @Test
    public  void testDownloadlist(){

        JPanel panel =SecondPanel.secondView();
        //assertNotEquals();
        assertNotNull(SecondPanel.getList());


    }
}
