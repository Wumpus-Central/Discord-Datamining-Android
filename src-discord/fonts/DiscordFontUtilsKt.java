package com.discord.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\b"}, d2 = {"getDiscordTypefaceFor", "Landroid/graphics/Typeface;", "Landroid/content/Context;", "font", "Lcom/discord/fonts/DiscordFont;", "setDiscordFont", "", "Landroid/widget/TextView;", "fonts_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class DiscordFontUtilsKt {
    public static final Typeface getDiscordTypefaceFor(Context context, DiscordFont font) {
        q.h(context, "<this>");
        q.h(font, "font");
        return font.typeface$fonts_release(context);
    }

    public static final void setDiscordFont(TextView textView, DiscordFont font) {
        q.h(textView, "<this>");
        q.h(font, "font");
        Context context = textView.getContext();
        q.g(context, "context");
        textView.setTypeface(getDiscordTypefaceFor(context, font));
    }
}
