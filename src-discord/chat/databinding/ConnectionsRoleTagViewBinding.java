package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.discord.chat.R;
import u0.a;


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
        int i10 = R.id.connections_role_tag_container;
        CardView cardView = (CardView) a.a(view, i10);
        if (cardView != null) {
            i10 = R.id.role_name;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                i10 = R.id.verified_check_icon;
                ImageView imageView = (ImageView) a.a(view, i10);
                if (imageView != null) {
                    i10 = R.id.verified_check_icon_background;
                    ImageView imageView2 = (ImageView) a.a(view, i10);
                    if (imageView2 != null) {
                        i10 = R.id.verified_check_icon_container;
                        FrameLayout frameLayout = (FrameLayout) a.a(view, i10);
                        if (frameLayout != null) {
                            return new ConnectionsRoleTagViewBinding(view, cardView, textView, imageView, imageView2, frameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ConnectionsRoleTagViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.connections_role_tag_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
