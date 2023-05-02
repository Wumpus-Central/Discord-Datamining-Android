package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes4.dex */
public final class BlockedMessageGroupViewBinding {
    public final TextView blockedMessageGroupButton;
    public final RecyclerView blockedMessages;
    public final SimpleDraweeView closeIcon;
    private final View rootView;

    private BlockedMessageGroupViewBinding(View view, TextView textView, RecyclerView recyclerView, SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.blockedMessageGroupButton = textView;
        this.blockedMessages = recyclerView;
        this.closeIcon = simpleDraweeView;
    }

    public static BlockedMessageGroupViewBinding bind(View view) {
        int i10 = R.id.blocked_message_group_button;
        TextView textView = (TextView) a.a(view, i10);
        if (textView != null) {
            i10 = R.id.blocked_messages;
            RecyclerView recyclerView = (RecyclerView) a.a(view, i10);
            if (recyclerView != null) {
                i10 = R.id.close_icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
                if (simpleDraweeView != null) {
                    return new BlockedMessageGroupViewBinding(view, textView, recyclerView, simpleDraweeView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static BlockedMessageGroupViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.blocked_message_group_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}