package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.R;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes5.dex */
public final class SystemMessageViewBinding {
    public final MessageAccessoriesView accessoriesView;
    public final SimpleDraweeView icon;
    private final View rootView;

    private SystemMessageViewBinding(View view, MessageAccessoriesView messageAccessoriesView, SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.accessoriesView = messageAccessoriesView;
        this.icon = simpleDraweeView;
    }

    public static SystemMessageViewBinding bind(View view) {
        int i10 = R.id.accessories_view;
        MessageAccessoriesView messageAccessoriesView = (MessageAccessoriesView) a.a(view, i10);
        if (messageAccessoriesView != null) {
            i10 = R.id.icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
            if (simpleDraweeView != null) {
                return new SystemMessageViewBinding(view, messageAccessoriesView, simpleDraweeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SystemMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.system_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
