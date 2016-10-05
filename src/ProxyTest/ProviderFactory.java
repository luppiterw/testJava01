package ProxyTest;

import ProxyTest.Fonts.CachedFontProvider;
import ProxyTest.Fonts.FontProvider;
import ProxyTest.Fonts.FontProviderFromDisk;
import ProxyTest.Images.CachedImageProvider;
import ProxyTest.Images.ImageProvider;
import ProxyTest.Images.ImageProviderFromDisk;

/**
 * Created by hughie on 16/10/1.
 */
public abstract class ProviderFactory {
    /**
     * 当有多个不同的provider时，factory里需要写下如下的重复代码，此为静态代理
     * 考虑以下各种情况，有多个提供类，每个类都有getXxx(String name)方法，
     * 每个类都要加入缓存功能，使用静态代理虽然也能实现，但是也是略显繁琐，需要手动一一创建代理类。
     * TODO 使用动态代理消除此类代码 Proxy + InvocationHandler
     */


    public static FontProvider getFontProvider() {
//        return new FontProviderFromDisk();
        return new CachedFontProvider(new FontProviderFromDisk());
    }

    public static ImageProvider getImageProvider() {
        return new CachedImageProvider(new ImageProviderFromDisk());
    }
}
