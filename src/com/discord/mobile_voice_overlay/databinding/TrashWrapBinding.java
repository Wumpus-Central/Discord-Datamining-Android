package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.discord.mobile_voice_overlay.C3521R;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes5.dex */
public final class TrashWrapBinding {
    private final View rootView;
    public final SimpleDraweeView trashWrapIcon;
    public final FrameLayout trashWrapTargetContainer;
    public final FrameLayout trashWrapTargetZone;

    private TrashWrapBinding(View view, SimpleDraweeView simpleDraweeView, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.rootView = view;
        this.trashWrapIcon = simpleDraweeView;
        this.trashWrapTargetContainer = frameLayout;
        this.trashWrapTargetZone = frameLayout2;
    }

    public static TrashWrapBinding bind(View view) {
        int i = C3521R.C3523id.trash_wrap_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
        if (simpleDraweeView != null) {
            i = C3521R.C3523id.trash_wrap_target_container;
            FrameLayout frameLayout = (FrameLayout) C13836a.m2313a(view, i);
            if (frameLayout != null) {
                i = C3521R.C3523id.trash_wrap_target_zone;
                FrameLayout frameLayout2 = (FrameLayout) C13836a.m2313a(view, i);
                if (frameLayout2 != null) {
                    return new TrashWrapBinding(view, simpleDraweeView, frameLayout, frameLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static TrashWrapBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3521R.layout.trash_wrap, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
