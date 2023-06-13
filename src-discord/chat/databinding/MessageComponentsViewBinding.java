package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.discord.chat.R;
import x1.a;

/* loaded from: classes8.dex */
public final class MessageComponentsViewBinding {
    public final LinearLayout itemComponentsRoot;
    private final View rootView;

    private MessageComponentsViewBinding(View view, LinearLayout linearLayout) {
        this.rootView = view;
        this.itemComponentsRoot = linearLayout;
    }

    public static MessageComponentsViewBinding bind(View view) {
        int i10 = R.id.item_components_root;
        LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
        if (linearLayout != null) {
            return new MessageComponentsViewBinding(view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static MessageComponentsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.message_components_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
