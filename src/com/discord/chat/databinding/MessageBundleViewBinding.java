package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.C3147R;
import com.discord.chat.presentation.list.messagebundling.MessageBundleRecyclerView;
import com.discord.chat.presentation.message.MessageFrameFeedHeaderView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
public final class MessageBundleViewBinding {
    public final MessageBundleRecyclerView chatListView;
    public final MessageFrameFeedHeaderView messageFrameHeader;
    private final View rootView;

    private MessageBundleViewBinding(View view, MessageBundleRecyclerView messageBundleRecyclerView, MessageFrameFeedHeaderView messageFrameFeedHeaderView) {
        this.rootView = view;
        this.chatListView = messageBundleRecyclerView;
        this.messageFrameHeader = messageFrameFeedHeaderView;
    }

    public static MessageBundleViewBinding bind(View view) {
        int i = C3147R.C3149id.chat_list_view;
        MessageBundleRecyclerView messageBundleRecyclerView = (MessageBundleRecyclerView) C13836a.m2313a(view, i);
        if (messageBundleRecyclerView != null) {
            i = C3147R.C3149id.message_frame_header;
            MessageFrameFeedHeaderView messageFrameFeedHeaderView = (MessageFrameFeedHeaderView) C13836a.m2313a(view, i);
            if (messageFrameFeedHeaderView != null) {
                return new MessageBundleViewBinding(view, messageBundleRecyclerView, messageFrameFeedHeaderView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageBundleViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.message_bundle_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
