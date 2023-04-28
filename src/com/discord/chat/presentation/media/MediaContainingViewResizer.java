package com.discord.chat.presentation.media;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f¨\u0006\u000e"}, m15073d2 = {"Lcom/discord/chat/presentation/media/MediaContainingViewResizer;", "", "()V", "resizeLayoutParams", "", "Landroid/view/View;", "targetWidthPx", "", "targetHeightPx", "maxWidthPx", "maxHeightPx", ViewProps.RESIZE_MODE, "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", "ResizeMode", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class MediaContainingViewResizer {
    public static final MediaContainingViewResizer INSTANCE = new MediaContainingViewResizer();

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", "", "(Ljava/lang/String;I)V", "Fill", "Wrap", "Cover", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public enum ResizeMode {
        Fill,
        Wrap,
        Cover
    }

    private MediaContainingViewResizer() {
    }

    public static /* synthetic */ void resizeLayoutParams$default(MediaContainingViewResizer mediaContainingViewResizer, View view, int i, int i2, int i3, int i4, ResizeMode resizeMode, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            resizeMode = ResizeMode.Fill;
        }
        mediaContainingViewResizer.resizeLayoutParams(view, i, i2, i3, i4, resizeMode);
    }

    public final void resizeLayoutParams(View view, int i, int i2, int i3, int i4, ResizeMode resizeMode) {
        boolean z;
        float f;
        C9971q.m14633g(view, "<this>");
        C9971q.m14633g(resizeMode, "resizeMode");
        boolean z2 = false;
        if (resizeMode == ResizeMode.Fill || resizeMode == ResizeMode.Cover || i > i3 || i2 > i4) {
            z = true;
        } else {
            z = false;
        }
        float f2 = view.getResources().getDisplayMetrics().density;
        float f3 = 1.0f;
        if (z) {
            float f4 = i;
            f = Math.min(i3, f4 * f2) / f4;
        } else {
            f = 1.0f;
        }
        if (z) {
            float f5 = i2;
            f3 = Math.min(i4, f2 * f5) / f5;
        }
        float min = Math.min(f3, f);
        int i5 = (int) (i * min);
        int i6 = (int) (i2 * min);
        if (resizeMode == ResizeMode.Cover) {
            i5 = Math.max(i5, i6);
            i6 = i5;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (!(i5 == layoutParams.width && i6 == layoutParams.height)) {
                z2 = true;
            }
            if (z2) {
                layoutParams.width = i5;
                layoutParams.height = i6;
            }
            view.setLayoutParams(layoutParams);
            return;
        }
        view.setLayoutParams(new ViewGroup.LayoutParams(i5, i6));
    }
}
