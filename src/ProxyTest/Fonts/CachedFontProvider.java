package ProxyTest.Fonts;

import java.awt.*;
import java.util.Map;

/**
 * Created by hughie on 16/10/1.
 */
public class CachedFontProvider implements FontProvider {
    private FontProvider fontProvider;
    private Map<String, Font> cached;

    public CachedFontProvider(FontProvider fontProvider) {
        this.fontProvider = fontProvider;
    }

    @Override
    public Font getFont(String fontName) {
        Font font = cached.get(fontName);
        if(font == null) {
            font = this.fontProvider.getFont(fontName);
            cached.put(fontName, font);
        }
        return font;
    }
}
