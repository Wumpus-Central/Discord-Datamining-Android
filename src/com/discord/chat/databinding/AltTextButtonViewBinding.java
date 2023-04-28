package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.discord.chat.C3147R;
import p413x1.C13836a;

/* loaded from: classes4.dex */
public final class AltTextButtonViewBinding {
    public final FrameLayout altTextContainer;
    public final TextView altTextLabel;
    private final FrameLayout rootView;

    private AltTextButtonViewBinding(FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView) {
        this.rootView = frameLayout;
        this.altTextContainer = frameLayout2;
        this.altTextLabel = textView;
    }

    public static AltTextButtonViewBinding bind(View view) {
        int i = C3147R.C3149id.alt_text_container;
        FrameLayout frameLayout = (FrameLayout) C13836a.m2313a(view, i);
        if (frameLayout != null) {
            i = C3147R.C3149id.alt_text_label;
            TextView textView = (TextView) C13836a.m2313a(view, i);
            if (textView != null) {
                return new AltTextButtonViewBinding((FrameLayout) view, frameLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static AltTextButtonViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AltTextButtonViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C3147R.layout.alt_text_button_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
