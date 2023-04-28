package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.content.res.C2367h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class ReactFontManager {
    private static final String[] EXTENSIONS = {"", "_bold", "_italic", "_bold_italic"};
    private static final String[] FILE_EXTENSIONS = {".ttf", ".otf"};
    private static final String FONTS_ASSET_PATH = "fonts/";
    private static ReactFontManager sReactFontManagerInstance;
    private final Map<String, AssetFontFamily> mFontCache = new HashMap();
    private final Map<String, Typeface> mCustomTypefaceCache = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class AssetFontFamily {
        private SparseArray<Typeface> mTypefaceSparseArray;

        public Typeface getTypefaceForStyle(int i) {
            return this.mTypefaceSparseArray.get(i);
        }

        public void setTypefaceForStyle(int i, Typeface typeface) {
            this.mTypefaceSparseArray.put(i, typeface);
        }

        private AssetFontFamily() {
            this.mTypefaceSparseArray = new SparseArray<>(4);
        }
    }

    private ReactFontManager() {
    }

    private static Typeface createAssetTypeface(String str, int i, AssetManager assetManager) {
        String[] strArr;
        if (str != null) {
            strArr = str.split(",");
        } else {
            strArr = null;
        }
        if (strArr != null) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr[i2] = strArr[i2].trim();
            }
        }
        if (strArr != null && strArr.length > 1) {
            if (Build.VERSION.SDK_INT >= 29) {
                return createAssetTypefaceWithFallbacks(strArr, i, assetManager);
            }
            str = strArr[0];
        }
        String str2 = EXTENSIONS[i];
        for (String str3 : FILE_EXTENSIONS) {
            try {
                return Typeface.createFromAsset(assetManager, FONTS_ASSET_PATH + str + str2 + str3);
            } catch (RuntimeException unused) {
            }
        }
        return Typeface.create(str, i);
    }

    private static Typeface createAssetTypefaceWithFallbacks(String[] strArr, int i, AssetManager assetManager) {
        Typeface build;
        Font build2;
        FontFamily build3;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : FILE_EXTENSIONS) {
                try {
                    build2 = new Font.Builder(assetManager, FONTS_ASSET_PATH + str + str2).build();
                    build3 = new FontFamily.Builder(build2).build();
                    arrayList.add(build3);
                } catch (IOException | RuntimeException unused) {
                }
            }
        }
        if (arrayList.size() == 0) {
            return createAssetTypeface(strArr[0], i, assetManager);
        }
        Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder((FontFamily) arrayList.get(0));
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            customFallbackBuilder.addCustomFallback((FontFamily) arrayList.get(i2));
        }
        build = customFallbackBuilder.build();
        return build;
    }

    public static ReactFontManager getInstance() {
        if (sReactFontManagerInstance == null) {
            sReactFontManagerInstance = new ReactFontManager();
        }
        return sReactFontManagerInstance;
    }

    public void addCustomFont(Context context, String str, int i) {
        Typeface h = C2367h.m37982h(context, i);
        if (h != null) {
            this.mCustomTypefaceCache.put(str, h);
        }
    }

    public Typeface getTypeface(String str, int i, AssetManager assetManager) {
        return getTypeface(str, new TypefaceStyle(i), assetManager);
    }

    public void setTypeface(String str, int i, Typeface typeface) {
        if (typeface != null) {
            AssetFontFamily assetFontFamily = this.mFontCache.get(str);
            if (assetFontFamily == null) {
                assetFontFamily = new AssetFontFamily();
                this.mFontCache.put(str, assetFontFamily);
            }
            assetFontFamily.setTypefaceForStyle(i, typeface);
        }
    }

    public Typeface getTypeface(String str, int i, boolean z, AssetManager assetManager) {
        return getTypeface(str, new TypefaceStyle(i, z), assetManager);
    }

    public void addCustomFont(String str, Typeface typeface) {
        if (typeface != null) {
            this.mCustomTypefaceCache.put(str, typeface);
        }
    }

    public Typeface getTypeface(String str, int i, int i2, AssetManager assetManager) {
        return getTypeface(str, new TypefaceStyle(i, i2), assetManager);
    }

    public Typeface getTypeface(String str, TypefaceStyle typefaceStyle, AssetManager assetManager) {
        if (this.mCustomTypefaceCache.containsKey(str)) {
            return typefaceStyle.apply(this.mCustomTypefaceCache.get(str));
        }
        AssetFontFamily assetFontFamily = this.mFontCache.get(str);
        if (assetFontFamily == null) {
            assetFontFamily = new AssetFontFamily();
            this.mFontCache.put(str, assetFontFamily);
        }
        int nearestStyle = typefaceStyle.getNearestStyle();
        Typeface typefaceForStyle = assetFontFamily.getTypefaceForStyle(nearestStyle);
        if (typefaceForStyle != null) {
            return typefaceForStyle;
        }
        Typeface createAssetTypeface = createAssetTypeface(str, nearestStyle, assetManager);
        assetFontFamily.setTypefaceForStyle(nearestStyle, createAssetTypeface);
        return createAssetTypeface;
    }
}
