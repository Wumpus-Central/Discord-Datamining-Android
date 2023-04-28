package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.discord.chat.C4254R;
import p412x1.C13922a;

/* loaded from: classes4.dex */
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
        int i = C4254R.C4256id.role_dot_view_background;
        FrameLayout frameLayout = (FrameLayout) C13922a.m2313a(view, i);
        if (frameLayout != null) {
            i = C4254R.C4256id.role_dot_view_dot;
            ImageView imageView = (ImageView) C13922a.m2313a(view, i);
            if (imageView != null) {
                return new RoleDotViewBinding(view, frameLayout, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static RoleDotViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4254R.layout.role_dot_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
