package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.C4254R;
import com.discord.chat.presentation.message.MessageView;
import p412x1.C13922a;

/* loaded from: classes4.dex */
public final class DecoratedMessageViewBinding {
    public final MessageView messageView;
    private final View rootView;

    private DecoratedMessageViewBinding(View view, MessageView messageView) {
        this.rootView = view;
        this.messageView = messageView;
    }

    public static DecoratedMessageViewBinding bind(View view) {
        int i = C4254R.C4256id.message_view;
        MessageView messageView = (MessageView) C13922a.m2313a(view, i);
        if (messageView != null) {
            return new DecoratedMessageViewBinding(view, messageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static DecoratedMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4254R.layout.decorated_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
