package Models;
import javax.swing.*;
import java.net.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;

public class LoadAvatar implements Runnable {
    BufferedImage imgOut = null;

    @Override
    public void run()
    {
try
{
    System.out.println("Reading image from disk. ");
    File n=new File("D://КАРТИНКИ/стейк смажений.jpg");
    String fileName=n.getName();
    imgOut = ImageIO.read(n);
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ImageIO.write(imgOut, "jpg", baos);
    baos.flush();
    byte[] bytes = baos.toByteArray();
    baos.close();
    System.out.println("Sending image to server. ");
    int count=bytes.length;
    ByteArrayInputStream in=new ByteArrayInputStream(bytes);
    while((count=in.read())!=-1){

        ImageIO.write(imgOut,"jpg",new File("D://Idea/Start/src/Pictures/"+fileName));
    }
}
catch (Exception e)
{
System.out.println(e.getMessage());
}
    }
}
