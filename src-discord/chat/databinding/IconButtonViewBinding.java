package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import u0.a;


public final class IconButtonViewBinding {
    public final SimpleDraweeView iconButton;
    public final FrameLayout iconContainer;
    private final View rootView;

    private IconButtonViewBinding(View view, SimpleDraweeView simpleDraweeView, FrameLayout frameLayout) {
        this.rootView = view;
        this.iconButton = simpleDraweeView;
        this.iconContainer = frameLayout;
    }

    public static IconButtonViewBinding bind(View view) {
        int i10 = R.id.icon_button;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.icon_container;
            FrameLayout frameLayout = (FrameLayout) a.a(view, i10);
            if (frameLayout != null) {
                return new IconButtonViewBinding(view, simpleDraweeView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IconButtonViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.icon_button_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
