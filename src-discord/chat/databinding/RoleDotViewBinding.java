package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.discord.chat.R;
import v0.a;


public final class RoleDotViewBinding {
    public final FrameLayout roleDotViewBackground;
    public final ImageView roleDotViewDot;
    private final View rootView;

    private RoleDotViewBinding(View view, FrameLayout frameLayout, ImageView imageView) {
        this.rootView = view;
        this.roleDotViewBackground = frameLayout;
        this.roleDotViewDot = imageView;
    }

    public static RoleDotViewBinding bind(View view) {
        int i10 = R.id.role_dot_view_background;
        FrameLayout frameLayout = (FrameLayout) a.a(view, i10);
        if (frameLayout != null) {
            i10 = R.id.role_dot_view_dot;
            ImageView imageView = (ImageView) a.a(view, i10);
            if (imageView != null) {
                return new RoleDotViewBinding(view, frameLayout, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static RoleDotViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.role_dot_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
