package com.facebook.react.bridge;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.core.content.res.C2367h;

/* loaded from: classes7.dex */
public class ColorPropConverter {
    private static final String ATTR = "attr";
    private static final String ATTR_SEGMENT = "attr/";
    private static final String JSON_KEY = "resource_paths";
    private static final String PACKAGE_DELIMITER = ":";
    private static final String PATH_DELIMITER = "/";
    private static final String PREFIX_ATTR = "?";
    private static final String PREFIX_RESOURCE = "@";

    public static Integer getColor(Object obj, Context context) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        }
        if (context == null) {
            throw new RuntimeException("Context may not be null.");
        } else if (obj instanceof ReadableMap) {
            ReadableArray array = ((ReadableMap) obj).getArray(JSON_KEY);
            if (array != null) {
                for (int i = 0; i < array.size(); i++) {
                    Integer resolveResourcePath = resolveResourcePath(context, array.getString(i));
                    if (resolveResourcePath != null) {
                        return resolveResourcePath;
                    }
                }
                throw new JSApplicationCausedNativeException("ColorValue: None of the paths in the `resource_paths` array resolved to a color resource.");
            }
            throw new JSApplicationCausedNativeException("ColorValue: The `resource_paths` must be an array of color resource path strings.");
        } else {
            throw new JSApplicationCausedNativeException("ColorValue: the value must be a number or Object.");
        }
    }

    private static int resolveResource(Context context, String str) {
        String[] split = str.split(PACKAGE_DELIMITER);
        String packageName = context.getPackageName();
        if (split.length > 1) {
            packageName = split[0];
            str = split[1];
        }
        String[] split2 = str.split(PATH_DELIMITER);
        String str2 = split2[0];
        return C2367h.m37986d(context.getResources(), context.getResources().getIdentifier(split2[1], str2, packageName), context.getTheme());
    }

    public static Integer resolveResourcePath(Context context, String str) {
        if (str != null && !str.isEmpty()) {
            boolean startsWith = str.startsWith(PREFIX_RESOURCE);
            boolean startsWith2 = str.startsWith(PREFIX_ATTR);
            String substring = str.substring(1);
            try {
                if (startsWith) {
                    return Integer.valueOf(resolveResource(context, substring));
                }
                if (startsWith2) {
                    return Integer.valueOf(resolveThemeAttribute(context, substring));
                }
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    private static int resolveThemeAttribute(Context context, String str) {
        String replaceAll = str.replaceAll(ATTR_SEGMENT, "");
        String[] split = replaceAll.split(PACKAGE_DELIMITER);
        String packageName = context.getPackageName();
        if (split.length > 1) {
            packageName = split[0];
            replaceAll = split[1];
        }
        int identifier = context.getResources().getIdentifier(replaceAll, ATTR, packageName);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(identifier, typedValue, true)) {
            return typedValue.data;
        }
        throw new Resources.NotFoundException();
    }
}
