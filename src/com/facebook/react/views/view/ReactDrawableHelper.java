package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.TypedValue;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;

/* loaded from: classes7.dex */
public class ReactDrawableHelper {
    private static final TypedValue sResolveOutValue = new TypedValue();

    @TargetApi(21)
    public static Drawable createDrawableFromJSDescription(Context context, ReadableMap readableMap) {
        String string = readableMap.getString("type");
        if ("ThemeAttrAndroid".equals(string)) {
            String string2 = readableMap.getString("attribute");
            int attrId = getAttrId(context, string2);
            if (context.getTheme().resolveAttribute(attrId, sResolveOutValue, true)) {
                return setRadius(readableMap, getDefaultThemeDrawable(context));
            }
            throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " with id " + attrId + " couldn't be resolved into a drawable");
        } else if ("RippleAndroid".equals(string)) {
            return setRadius(readableMap, getRippleDrawable(context, readableMap));
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid type for android drawable: " + string);
        }
    }

    @TargetApi(21)
    private static int getAttrId(Context context, String str) {
        SoftAssertions.assertNotNull(str);
        if ("selectableItemBackground".equals(str)) {
            return 16843534;
        }
        if ("selectableItemBackgroundBorderless".equals(str)) {
            return 16843868;
        }
        return context.getResources().getIdentifier(str, "attr", "android");
    }

    private static int getColor(Context context, ReadableMap readableMap) {
        if (readableMap.hasKey(ViewProps.COLOR) && !readableMap.isNull(ViewProps.COLOR)) {
            return readableMap.getInt(ViewProps.COLOR);
        }
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = sResolveOutValue;
        if (theme.resolveAttribute(16843820, typedValue, true)) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        throw new JSApplicationIllegalArgumentException("Attribute colorControlHighlight couldn't be resolved into a drawable");
    }

    private static Drawable getDefaultThemeDrawable(Context context) {
        return context.getResources().getDrawable(sResolveOutValue.resourceId, context.getTheme());
    }

    private static Drawable getMask(ReadableMap readableMap) {
        if (readableMap.hasKey("borderless") && readableMap.getBoolean("borderless")) {
            return null;
        }
        if (!readableMap.hasKey("rippleCornerRadius")) {
            return new ColorDrawable(-1);
        }
        float pixelFromDIP = PixelUtil.toPixelFromDIP(readableMap.getDouble("rippleCornerRadius"));
        return new ShapeDrawable(new RoundRectShape(new float[]{pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP}, null, null));
    }

    private static RippleDrawable getRippleDrawable(Context context, ReadableMap readableMap) {
        return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{getColor(context, readableMap)}), null, getMask(readableMap));
    }

    private static Drawable setRadius(ReadableMap readableMap, Drawable drawable) {
        if (readableMap.hasKey("rippleRadius") && (drawable instanceof RippleDrawable)) {
            ((RippleDrawable) drawable).setRadius((int) PixelUtil.toPixelFromDIP(readableMap.getDouble("rippleRadius")));
        }
        return drawable;
    }
}
