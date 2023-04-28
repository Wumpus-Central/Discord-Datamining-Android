package com.discord.chat.presentation.textutils;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m15073d2 = {"Lcom/discord/chat/presentation/textutils/DiscordFontSpan;", "Landroid/text/style/MetricAffectingSpan;", "context", "Landroid/content/Context;", "discordFont", "Lcom/discord/fonts/DiscordFont;", "(Landroid/content/Context;Lcom/discord/fonts/DiscordFont;)V", "font", "Landroid/graphics/Typeface;", "updateDrawState", "", "paint", "Landroid/text/TextPaint;", "updateMeasureState", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class DiscordFontSpan extends MetricAffectingSpan {
    private final Typeface font;

    public DiscordFontSpan(Context context, DiscordFont discordFont) {
        C9677q.m14633g(context, "context");
        C9677q.m14633g(discordFont, "discordFont");
        this.font = DiscordFontUtilsKt.getDiscordTypefaceFor(context, discordFont);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        C9677q.m14633g(paint, "paint");
        paint.setTypeface(this.font);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        C9677q.m14633g(paint, "paint");
        paint.setTypeface(this.font);
    }
}
