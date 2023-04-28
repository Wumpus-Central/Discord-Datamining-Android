package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.C3147R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
public final class RoleIconViewBinding {
    public final SimpleDraweeSpanTextView roleIconViewUnicodeEmoji;
    private final View rootView;

    private RoleIconViewBinding(View view, SimpleDraweeSpanTextView simpleDraweeSpanTextView) {
        this.rootView = view;
        this.roleIconViewUnicodeEmoji = simpleDraweeSpanTextView;
    }

    public static RoleIconViewBinding bind(View view) {
        int i = C3147R.C3149id.role_icon_view_unicode_emoji;
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C13836a.m2313a(view, i);
        if (simpleDraweeSpanTextView != null) {
            return new RoleIconViewBinding(view, simpleDraweeSpanTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static RoleIconViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.role_icon_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
