package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.discord.chat.R;
import u0.a;


public final class SpoilerOverlayViewBinding {
    public final TextView label;
    public final FrameLayout overlayContainer;
    private final View rootView;

    private SpoilerOverlayViewBinding(View view, TextView textView, FrameLayout frameLayout) {
        this.rootView = view;
        this.label = textView;
        this.overlayContainer = frameLayout;
    }

    public static SpoilerOverlayViewBinding bind(View view) {
        int i10 = R.id.label;
        TextView textView = (TextView) a.a(view, i10);
        if (textView != null) {
            i10 = R.id.overlay_container;
            FrameLayout frameLayout = (FrameLayout) a.a(view, i10);
            if (frameLayout != null) {
                return new SpoilerOverlayViewBinding(view, textView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SpoilerOverlayViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.spoiler_overlay_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
