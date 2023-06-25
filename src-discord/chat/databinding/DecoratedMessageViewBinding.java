package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.R;
import com.discord.chat.presentation.message.MessageView;
import v0.a;

/* loaded from: classes8.dex */
public final class DecoratedMessageViewBinding {
    public final MessageView messageView;
    private final View rootView;

    private DecoratedMessageViewBinding(View view, MessageView messageView) {
        this.rootView = view;
        this.messageView = messageView;
    }

    public static DecoratedMessageViewBinding bind(View view) {
        int i10 = R.id.message_view;
        MessageView messageView = (MessageView) a.a(view, i10);
        if (messageView != null) {
            return new DecoratedMessageViewBinding(view, messageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DecoratedMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.decorated_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
