package com.discord.chat.presentation.media;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/presentation/media/MediaContainingViewResizer;", "", "()V", "resizeLayoutParams", "", "Landroid/view/View;", "targetWidthPx", "", "targetHeightPx", "maxWidthPx", "maxHeightPx", ViewProps.RESIZE_MODE, "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", "ResizeMode", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediaContainingViewResizer {
    public static final MediaContainingViewResizer INSTANCE = new MediaContainingViewResizer();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", "", "(Ljava/lang/String;I)V", "Fill", "Wrap", "Cover", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public enum ResizeMode {
        Fill,
        Wrap,
        Cover
    }

    private MediaContainingViewResizer() {
    }

    public static /* synthetic */ void resizeLayoutParams$default(MediaContainingViewResizer mediaContainingViewResizer, View view, int i10, int i11, int i12, int i13, ResizeMode resizeMode, int i14, Object obj) {
        if ((i14 & 16) != 0) {
            resizeMode = ResizeMode.Fill;
        }
        mediaContainingViewResizer.resizeLayoutParams(view, i10, i11, i12, i13, resizeMode);
    }

    public final void resizeLayoutParams(View view, int i10, int i11, int i12, int i13, ResizeMode resizeMode) {
        boolean z10;
        float f10;
        q.g(view, "<this>");
        q.g(resizeMode, "resizeMode");
        boolean z11 = false;
        if (resizeMode == ResizeMode.Fill || resizeMode == ResizeMode.Cover || i10 > i12 || i11 > i13) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = view.getResources().getDisplayMetrics().density;
        float f12 = 1.0f;
        if (z10) {
            float f13 = i10;
            f10 = Math.min(i12, f13 * f11) / f13;
        } else {
            f10 = 1.0f;
        }
        if (z10) {
            float f14 = i11;
            f12 = Math.min(i13, f11 * f14) / f14;
        }
        float min = Math.min(f12, f10);
        int i14 = (int) (i10 * min);
        int i15 = (int) (i11 * min);
        if (resizeMode == ResizeMode.Cover) {
            i14 = Math.max(i14, i15);
            i15 = i14;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (!(i14 == layoutParams.width && i15 == layoutParams.height)) {
                z11 = true;
            }
            if (z11) {
                layoutParams.width = i14;
                layoutParams.height = i15;
            }
            view.setLayoutParams(layoutParams);
            return;
        }
        view.setLayoutParams(new ViewGroup.LayoutParams(i14, i15));
    }
}
