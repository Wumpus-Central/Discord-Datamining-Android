package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.C3147R;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
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
        int i = C3147R.C3149id.accessories_view;
        MessageAccessoriesView messageAccessoriesView = (MessageAccessoriesView) C13836a.m2313a(view, i);
        if (messageAccessoriesView != null) {
            i = C3147R.C3149id.icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
            if (simpleDraweeView != null) {
                return new SystemMessageViewBinding(view, messageAccessoriesView, simpleDraweeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static SystemMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.system_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
