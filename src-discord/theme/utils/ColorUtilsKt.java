package com.discord.theme.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.h;
import com.discord.theme.DiscordTheme;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0001H\u0007\u001a \u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00012\b\b\u0001\u0010\b\u001a\u00020\u0001H\u0007\u001a(\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00012\b\b\u0001\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u001b\u0010\u000b\u001a\u00020\f*\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\u000b\u001a\u00020\f*\u00020\u00102\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"getColorCompat", "", "Landroid/content/Context;", "id", "Landroid/view/View;", "colorRes", "getThemeColor", "lightColorRes", "darkColorRes", "theme", "Lcom/discord/theme/DiscordTheme;", "setTintColor", "", "Landroid/widget/ImageView;", "colorInt", "(Landroid/widget/ImageView;Ljava/lang/Integer;)V", "Lcom/facebook/drawee/view/SimpleDraweeView;", "(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V", "theme_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ColorUtilsKt {
    public static final int getColorCompat(Context context, int i10) {
        q.g(context, "<this>");
        return context.getColor(i10);
    }

    public static final int getThemeColor(Context context, int i10, int i11) {
        q.g(context, "<this>");
        return getThemeColor(context, i10, i11, ThemeManagerKt.getTheme());
    }

    public static final void setTintColor(ImageView imageView, Integer num) {
        q.g(imageView, "<this>");
        h.c(imageView, num != null ? ColorStateList.valueOf(num.intValue()) : null);
    }

    public static final int getColorCompat(View view, int i10) {
        q.g(view, "<this>");
        Context context = view.getContext();
        q.f(context, "context");
        return getColorCompat(context, i10);
    }

    public static final int getThemeColor(Context context, int i10, int i11, DiscordTheme theme) {
        q.g(context, "<this>");
        q.g(theme, "theme");
        return getColorCompat(context, theme.getColorRes(i10, i11));
    }

    public static final void setTintColor(SimpleDraweeView simpleDraweeView, Integer num) {
        q.g(simpleDraweeView, "<this>");
        if (num == null) {
            simpleDraweeView.clearColorFilter();
        } else {
            simpleDraweeView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }
}
