package com.discord.span.utilities.spannable;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\tR\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/span/utilities/spannable/SpoilerSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "isRevealed", "", "hiddenColor", "", "revealedColor", "(ZII)V", "()Z", "updateDrawState", "", "tp", "Landroid/text/TextPaint;", "span_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SpoilerSpan extends CharacterStyle implements UpdateAppearance {
    private final int hiddenColor;
    private final boolean isRevealed;
    private final int revealedColor;

    public SpoilerSpan(boolean z10, int i10, int i11) {
        this.isRevealed = z10;
        this.hiddenColor = i10;
        this.revealedColor = i11;
    }

    public final boolean isRevealed() {
        return this.isRevealed;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint tp) {
        q.g(tp, "tp");
        if (this.isRevealed) {
            tp.bgColor = this.revealedColor;
            return;
        }
        tp.bgColor = this.hiddenColor;
        tp.setColor(Color.argb(0, 0, 0, 0));
    }
}
