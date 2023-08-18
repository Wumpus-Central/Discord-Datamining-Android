package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.discord.mobile_voice_overlay.R;
import com.facebook.drawee.view.SimpleDraweeView;
import u0.a;


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
        int i10 = R.id.trash_wrap_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.trash_wrap_target_container;
            FrameLayout frameLayout = (FrameLayout) a.a(view, i10);
            if (frameLayout != null) {
                i10 = R.id.trash_wrap_target_zone;
                FrameLayout frameLayout2 = (FrameLayout) a.a(view, i10);
                if (frameLayout2 != null) {
                    return new TrashWrapBinding(view, simpleDraweeView, frameLayout, frameLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static TrashWrapBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.trash_wrap, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
