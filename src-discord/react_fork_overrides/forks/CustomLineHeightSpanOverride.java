package com.discord.react_fork_overrides.forks;

import android.graphics.Paint;
import com.discord.react_fork_overrides.forks.CustomLineHeightSpanOverride;
import com.facebook.react.bridge.Callback;
import com.facebook.react.views.text.CustomLineHeightSpan;
import dg.c;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, d2 = {"Lcom/discord/react_fork_overrides/forks/CustomLineHeightSpanOverride;", "", "()V", "override", "", "overrideLineHeight", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "mHeight", "", "react_fork_overrides_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class CustomLineHeightSpanOverride {
    public static final CustomLineHeightSpanOverride INSTANCE = new CustomLineHeightSpanOverride();

    private CustomLineHeightSpanOverride() {
    }

    
    public static final void override$lambda$0(Object[] objArr) {
        q.g(objArr, "(fm, mHeight)");
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        CustomLineHeightSpanOverride customLineHeightSpanOverride = INSTANCE;
        q.f(obj, "null cannot be cast to non-null type android.graphics.Paint.FontMetricsInt");
        q.f(obj2, "null cannot be cast to non-null type kotlin.Int");
        customLineHeightSpanOverride.overrideLineHeight((Paint.FontMetricsInt) obj, ((Integer) obj2).intValue());
    }

    private final void overrideLineHeight(Paint.FontMetricsInt fontMetricsInt, int i10) {
        boolean z10;
        int b10;
        int i11 = fontMetricsInt.bottom;
        int i12 = fontMetricsInt.top;
        if (i10 >= i11 - i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            double d10 = (i10 - ((-i12) + i11)) / 2.0f;
            fontMetricsInt.top = i12 - ((int) Math.ceil(d10));
            int floor = fontMetricsInt.bottom + ((int) Math.floor(d10));
            fontMetricsInt.bottom = floor;
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = floor;
            return;
        }
        int i13 = fontMetricsInt.descent;
        int i14 = i13 - fontMetricsInt.ascent;
        if (i14 > 0) {
            b10 = c.b(i13 * ((i10 * 0.75f) / i14));
            fontMetricsInt.descent = b10;
            fontMetricsInt.ascent = b10 - i10;
        }
    }

    public final void override() {
        CustomLineHeightSpan.chooseHeightOverride = new Callback() { 
            @Override 
            public final void invoke(Object[] objArr) {
                CustomLineHeightSpanOverride.override$lambda$0(objArr);
            }
        };
    }
}
