package com.discord.theme.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.g;
import com.discord.theme.DiscordTheme;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import xf.c;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a\u0016\u0010\n\u001a\u00020\u0003*\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0003H\u0007\u001a\u0016\u0010\n\u001a\u00020\u0003*\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0003H\u0007\u001a \u0010\u000f\u001a\u00020\u0003*\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0003H\u0007\u001a(\u0010\u000f\u001a\u00020\u0003*\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\u001a\u001b\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0018\u001a\u001b\u0010\u0014\u001a\u00020\u0015*\u00020\u00192\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"rgbaPattern", "Lkotlin/text/Regex;", "argbWithAdjustedAlpha", "", ViewProps.COLOR, "alpha", "", "rgbaToArgb", "rgbaString", "", "getColorCompat", "Landroid/content/Context;", "id", "Landroid/view/View;", "colorRes", "getThemeColor", "lightColorRes", "darkColorRes", "theme", "Lcom/discord/theme/DiscordTheme;", "setTintColor", "", "Landroid/widget/ImageView;", "colorInt", "(Landroid/widget/ImageView;Ljava/lang/Integer;)V", "Lcom/facebook/drawee/view/SimpleDraweeView;", "(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V", "theme_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class ColorUtilsKt {
    private static final Regex rgbaPattern = new Regex("rgba\\((\\d+),\\s*(\\d+),\\s*(\\d+),\\s*(\\d+(?:\\.\\d*)?|\\.\\d+)\\)");

    public static final int argbWithAdjustedAlpha(int i10, float f10) {
        int b10;
        b10 = c.b(Color.alpha(i10) * f10);
        return Color.argb(b10, Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public static final int getColorCompat(Context context, int i10) {
        q.h(context, "<this>");
        return context.getColor(i10);
    }

    public static final int getThemeColor(Context context, int i10, int i11) {
        q.h(context, "<this>");
        return getThemeColor(context, i10, i11, ThemeManagerKt.getTheme());
    }

    public static final int rgbaToArgb(String str) {
        if (str == null) {
            return 0;
        }
        MatchResult f10 = rgbaPattern.f(str);
        if (f10 == null) {
            return -16777216;
        }
        MatchResult.b a10 = f10.a();
        return Color.argb((int) (Double.parseDouble(a10.a().b().get(4)) * 255), Integer.parseInt(a10.a().b().get(1)), Integer.parseInt(a10.a().b().get(2)), Integer.parseInt(a10.a().b().get(3)));
    }

    public static final void setTintColor(ImageView imageView, Integer num) {
        q.h(imageView, "<this>");
        g.c(imageView, num != null ? ColorStateList.valueOf(num.intValue()) : null);
    }

    public static final int getColorCompat(View view, int i10) {
        q.h(view, "<this>");
        Context context = view.getContext();
        q.g(context, "context");
        return getColorCompat(context, i10);
    }

    public static final int getThemeColor(Context context, int i10, int i11, DiscordTheme theme) {
        q.h(context, "<this>");
        q.h(theme, "theme");
        return getColorCompat(context, theme.getColorRes(i10, i11));
    }

    public static final void setTintColor(SimpleDraweeView simpleDraweeView, Integer num) {
        q.h(simpleDraweeView, "<this>");
        if (num == null) {
            simpleDraweeView.clearColorFilter();
        } else {
            simpleDraweeView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }
}
