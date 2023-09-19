package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.ObscureOverlayView;
import com.discord.chat.presentation.message.view.SpoilerOverlayView;
import u0.a;


public final class SpoilerViewBinding {
    public final ObscureOverlayView obscure;
    private final View rootView;
    public final SpoilerOverlayView spoiler;

    private SpoilerViewBinding(View view, ObscureOverlayView obscureOverlayView, SpoilerOverlayView spoilerOverlayView) {
        this.rootView = view;
        this.obscure = obscureOverlayView;
        this.spoiler = spoilerOverlayView;
    }

    public static SpoilerViewBinding bind(View view) {
        int i10 = R.id.obscure;
        ObscureOverlayView obscureOverlayView = (ObscureOverlayView) a.a(view, i10);
        if (obscureOverlayView != null) {
            i10 = R.id.spoiler;
            SpoilerOverlayView spoilerOverlayView = (SpoilerOverlayView) a.a(view, i10);
            if (spoilerOverlayView != null) {
                return new SpoilerViewBinding(view, obscureOverlayView, spoilerOverlayView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SpoilerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.spoiler_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
