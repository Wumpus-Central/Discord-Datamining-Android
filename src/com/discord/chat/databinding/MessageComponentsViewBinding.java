package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.discord.chat.C4254R;
import p412x1.C13922a;

/* loaded from: classes4.dex */
public final class MessageComponentsViewBinding {
    public final LinearLayout itemComponentsRoot;
    private final View rootView;

    private MessageComponentsViewBinding(View view, LinearLayout linearLayout) {
        this.rootView = view;
        this.itemComponentsRoot = linearLayout;
    }

    public static MessageComponentsViewBinding bind(View view) {
        int i = C4254R.C4256id.item_components_root;
        LinearLayout linearLayout = (LinearLayout) C13922a.m2313a(view, i);
        if (linearLayout != null) {
            return new MessageComponentsViewBinding(view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageComponentsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4254R.layout.message_components_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
