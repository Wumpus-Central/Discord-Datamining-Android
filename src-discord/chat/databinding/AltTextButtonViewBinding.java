package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.discord.chat.R;
import x1.a;

/* loaded from: classes8.dex */
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
        int i10 = R.id.alt_text_container;
        FrameLayout frameLayout = (FrameLayout) a.a(view, i10);
        if (frameLayout != null) {
            i10 = R.id.alt_text_label;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                return new AltTextButtonViewBinding((FrameLayout) view, frameLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AltTextButtonViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AltTextButtonViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.alt_text_button_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
