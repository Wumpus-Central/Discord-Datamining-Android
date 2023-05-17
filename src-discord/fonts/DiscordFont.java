package com.discord.fonts;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.react.views.text.ReactFontManager;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/discord/fonts/DiscordFont;", "", "rawName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawName", "()Ljava/lang/String;", "typeface", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "typeface$fonts_release", "SourceCodePro", "PrimaryNormal", "PrimaryNormalItalic", "PrimaryMedium", "PrimarySemibold", "PrimaryBold", "PrimaryExtraBold", "fonts_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public enum DiscordFont {
    SourceCodePro("SourceCodePro-Semibold"),
    PrimaryNormal("ggsans-Normal, NotoSans-Normal"),
    PrimaryNormalItalic("ggsans-NormalItalic, NotoSans-NormalItalic"),
    PrimaryMedium("ggsans-Medium, NotoSans-Medium"),
    PrimarySemibold("ggsans-Semibold, NotoSans-Semibold"),
    PrimaryBold("ggsans-Bold, NotoSans-Bold"),
    PrimaryExtraBold("ggsans-ExtraBold, NotoSans-ExtraBold");
    
    private final String rawName;

    DiscordFont(String str) {
        this.rawName = str;
    }

    public final String getRawName() {
        return this.rawName;
    }

    public final Typeface typeface$fonts_release(Context context) {
        q.g(context, "context");
        Typeface typeface = ReactFontManager.getInstance().getTypeface(this.rawName, 0, context.getAssets());
        q.f(typeface, "getInstance()\n          …e.NORMAL, context.assets)");
        if (!q.b(typeface, Typeface.DEFAULT)) {
            return typeface;
        }
        String str = this.rawName;
        throw new IllegalStateException(("Cannot find typeface " + str).toString());
    }
}
