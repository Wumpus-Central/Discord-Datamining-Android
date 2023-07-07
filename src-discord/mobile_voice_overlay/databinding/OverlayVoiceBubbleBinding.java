package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.mobile_voice_overlay.R;
import com.facebook.drawee.view.SimpleDraweeView;

/* loaded from: classes6.dex */
public final class OverlayVoiceBubbleBinding {
    public final SimpleDraweeView overlayBubbleIv;
    private final SimpleDraweeView rootView;

    private OverlayVoiceBubbleBinding(SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2) {
        this.rootView = simpleDraweeView;
        this.overlayBubbleIv = simpleDraweeView2;
    }

    public static OverlayVoiceBubbleBinding bind(View view) {
        if (view != null) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view;
            return new OverlayVoiceBubbleBinding(simpleDraweeView, simpleDraweeView);
        }
        throw new NullPointerException("rootView");
    }

    public static OverlayVoiceBubbleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static OverlayVoiceBubbleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.overlay_voice_bubble, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public SimpleDraweeView getRoot() {
        return this.rootView;
    }
}
