package ProxyTest.Images;

import ProxyTest.Fonts.FontProvider;

import java.awt.*;
import java.util.Map;

/**
 * Created by hughie on 16/10/1.
 */
public class CachedImageProvider implements ImageProvider{
    private ImageProvider imageProvider;
    private Map<String, Image> cached;

    public CachedImageProvider(ImageProvider imageProvider) {
        this.imageProvider = imageProvider;
    }

    @Override
    public Image getImage(String imageName) {
        Image image = cached.get(imageName);
        if(image == null) {
            image = this.imageProvider.getImage(imageName);
            cached.put(imageName, image);
        }
        return image;
    }
}
