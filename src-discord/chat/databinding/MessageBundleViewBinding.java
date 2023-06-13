package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.R;
import com.discord.chat.presentation.list.messagebundling.MessageBundleRecyclerView;
import com.discord.chat.presentation.message.MessageFrameFeedHeaderView;
import x1.a;

/* loaded from: classes8.dex */
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
        int i10 = R.id.chat_list_view;
        MessageBundleRecyclerView messageBundleRecyclerView = (MessageBundleRecyclerView) a.a(view, i10);
        if (messageBundleRecyclerView != null) {
            i10 = R.id.message_frame_header;
            MessageFrameFeedHeaderView messageFrameFeedHeaderView = (MessageFrameFeedHeaderView) a.a(view, i10);
            if (messageFrameFeedHeaderView != null) {
                return new MessageBundleViewBinding(view, messageBundleRecyclerView, messageFrameFeedHeaderView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static MessageBundleViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.message_bundle_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
