package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.discord.chat.C3147R;
import p413x1.C13836a;

/* loaded from: classes4.dex */
public final class ConnectionsRoleTagViewBinding {
    public final CardView connectionsRoleTagContainer;
    public final TextView roleName;
    private final View rootView;
    public final ImageView verifiedCheckIcon;
    public final ImageView verifiedCheckIconBackground;
    public final FrameLayout verifiedCheckIconContainer;

    private ConnectionsRoleTagViewBinding(View view, CardView cardView, TextView textView, ImageView imageView, ImageView imageView2, FrameLayout frameLayout) {
        this.rootView = view;
        this.connectionsRoleTagContainer = cardView;
        this.roleName = textView;
        this.verifiedCheckIcon = imageView;
        this.verifiedCheckIconBackground = imageView2;
        this.verifiedCheckIconContainer = frameLayout;
    }

    public static ConnectionsRoleTagViewBinding bind(View view) {
        int i = C3147R.C3149id.connections_role_tag_container;
        CardView cardView = (CardView) C13836a.m2313a(view, i);
        if (cardView != null) {
            i = C3147R.C3149id.role_name;
            TextView textView = (TextView) C13836a.m2313a(view, i);
            if (textView != null) {
                i = C3147R.C3149id.verified_check_icon;
                ImageView imageView = (ImageView) C13836a.m2313a(view, i);
                if (imageView != null) {
                    i = C3147R.C3149id.verified_check_icon_background;
                    ImageView imageView2 = (ImageView) C13836a.m2313a(view, i);
                    if (imageView2 != null) {
                        i = C3147R.C3149id.verified_check_icon_container;
                        FrameLayout frameLayout = (FrameLayout) C13836a.m2313a(view, i);
                        if (frameLayout != null) {
                            return new ConnectionsRoleTagViewBinding(view, cardView, textView, imageView, imageView2, frameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ConnectionsRoleTagViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.connections_role_tag_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
