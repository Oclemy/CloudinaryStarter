package com.tutorials.hp.cloudinarystart.mCloud;

import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;

/**
 * Created by Oclemmy on 4/25/2016 for ProgrammingWizards Channel.
 */
public class CloudinaryClient {

    public static String getRoundedCorners()
    {
        Cloudinary cloud=new Cloudinary(MyConfiguration.getMyConfigs());

        //MANIPULATION
        Transformation t=new Transformation();
        t.radius(60);

        return cloud.url().transformation(t).generate("red_s9jrzj.jpg");
    }
    
    public static String resize()
    {
        Cloudinary cloud=new Cloudinary(MyConfiguration.getMyConfigs());

        //MANIPULATION
        Transformation t=new Transformation();
        t.width(300);
        t.height(250);

        return cloud.url().transformation(t).generate("red_s9jrzj.jpg");
    }


}
