# CloudinaryStarter
Introduction to Cloudinary.How to create account,resize images and apply rounded corners.
# Android Cloudinary Round  Image

- - -
## What we do:
- Dowload image from our free cloudinary account online.
- Load the image into an ImageView into our android app.
- Resize the image automatically to our liking.
- Apply round corners to the image,at whatever degree we like.


- - -
### Step 1 : Setup Cloudinary account free.
- Everything is already explained on  our video tutorial so its not fun repeating.
- We need to do that and download cloudinary sdk
```java
    compile 'com.cloudinary:cloudinary-core:1.4.1'
    compile 'com.cloudinary:cloudinary-android:1.4.1'
```

- - -

### Step 2 : Create Configuration class

```java
public class MyConfiguration {

    public static HashMap getMyConfigs()
    {
        HashMap config=new HashMap();
        config.put("cloud_name","xxxxx");
        config.put("api_key","kkkkkk");
        config.put("api_secret","hhhhh");

        return config;
    }
}
```

- - -
### Step 3 : Perform manipulations
- e.g To get round corners.

```java

    public static String getRoundedCorners()
    {
        Cloudinary cloud=new Cloudinary(MyConfiguration.getMyConfigs());

        //MANIPULATION
        Transformation t=new Transformation();
        t.radius(60);

        return cloud.url().transformation(t).generate("red_s9jrzj.jpg");
    }
```

Everything is in the code of course.
For more eaasy to understand check http://camposha.info

![](http://)

#### Author
Oclemy,Cheers.
http://camposha.info
















