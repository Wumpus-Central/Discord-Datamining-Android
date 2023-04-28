package com.discord.theme.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.C1622h;
import com.discord.theme.DiscordTheme;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0001H\u0007\u001a \u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00012\b\b\u0001\u0010\b\u001a\u00020\u0001H\u0007\u001a(\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00012\b\b\u0001\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u001b\u0010\u000b\u001a\u00020\f*\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\u000b\u001a\u00020\f*\u00020\u00102\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m15073d2 = {"getColorCompat", "", "Landroid/content/Context;", "id", "Landroid/view/View;", "colorRes", "getThemeColor", "lightColorRes", "darkColorRes", "theme", "Lcom/discord/theme/DiscordTheme;", "setTintColor", "", "Landroid/widget/ImageView;", "colorInt", "(Landroid/widget/ImageView;Ljava/lang/Integer;)V", "Lcom/facebook/drawee/view/SimpleDraweeView;", "(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V", "theme_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class ColorUtilsKt {
    public static final int getColorCompat(Context context, int i) {
        C9677q.m14633g(context, "<this>");
        return context.getColor(i);
    }

    public static final int getThemeColor(Context context, int i, int i2) {
        C9677q.m14633g(context, "<this>");
        return getThemeColor(context, i, i2, ThemeManagerKt.getTheme());
    }

    public static final void setTintColor(ImageView imageView, Integer num) {
        C9677q.m14633g(imageView, "<this>");
        C1622h.m36708c(imageView, num != null ? ColorStateList.valueOf(num.intValue()) : null);
    }

    public static final int getColorCompat(View view, int i) {
        C9677q.m14633g(view, "<this>");
        Context context = view.getContext();
        C9677q.m14634f(context, "context");
        return getColorCompat(context, i);
    }

    public static final int getThemeColor(Context context, int i, int i2, DiscordTheme theme) {
        C9677q.m14633g(context, "<this>");
        C9677q.m14633g(theme, "theme");
        return getColorCompat(context, theme.getColorRes(i, i2));
    }

    public static final void setTintColor(SimpleDraweeView simpleDraweeView, Integer num) {
        C9677q.m14633g(simpleDraweeView, "<this>");
        if (num == null) {
            simpleDraweeView.clearColorFilter();
        } else {
            simpleDraweeView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }
}
