package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import u0.a;


public final class RoleIconViewBinding {
    public final SimpleDraweeSpanTextView roleIconViewUnicodeEmoji;
    private final View rootView;

    private RoleIconViewBinding(View view, SimpleDraweeSpanTextView simpleDraweeSpanTextView) {
        this.rootView = view;
        this.roleIconViewUnicodeEmoji = simpleDraweeSpanTextView;
    }

    public static RoleIconViewBinding bind(View view) {
        int i10 = R.id.role_icon_view_unicode_emoji;
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.a(view, i10);
        if (simpleDraweeSpanTextView != null) {
            return new RoleIconViewBinding(view, simpleDraweeSpanTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static RoleIconViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.role_icon_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
