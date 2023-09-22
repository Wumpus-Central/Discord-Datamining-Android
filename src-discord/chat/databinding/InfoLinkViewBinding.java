package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import u0.a;


public final class InfoLinkViewBinding {
    public final TextView description;
    public final SimpleDraweeView icon;
    public final ConstraintLayout infoLinkContainer;
    private final View rootView;

    private InfoLinkViewBinding(View view, TextView textView, SimpleDraweeView simpleDraweeView, ConstraintLayout constraintLayout) {
        this.rootView = view;
        this.description = textView;
        this.icon = simpleDraweeView;
        this.infoLinkContainer = constraintLayout;
    }

    public static InfoLinkViewBinding bind(View view) {
        int i10 = R.id.description;
        TextView textView = (TextView) a.a(view, i10);
        if (textView != null) {
            i10 = R.id.icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
            if (simpleDraweeView != null) {
                i10 = R.id.info_link_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, i10);
                if (constraintLayout != null) {
                    return new InfoLinkViewBinding(view, textView, simpleDraweeView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static InfoLinkViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.info_link_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
