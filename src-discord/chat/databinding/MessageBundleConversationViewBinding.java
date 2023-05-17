package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.reactions.ReactionsView;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes5.dex */
public final class MessageBundleConversationViewBinding {
    public final Barrier barrier;
    public final ReactionsView reactionsView;
    public final SimpleDraweeView replyAuthorAvatar;
    public final TextView replyAuthorName;
    public final MessageContentView replyText;
    private final View rootView;

    private MessageBundleConversationViewBinding(View view, Barrier barrier, ReactionsView reactionsView, SimpleDraweeView simpleDraweeView, TextView textView, MessageContentView messageContentView) {
        this.rootView = view;
        this.barrier = barrier;
        this.reactionsView = reactionsView;
        this.replyAuthorAvatar = simpleDraweeView;
        this.replyAuthorName = textView;
        this.replyText = messageContentView;
    }

    public static MessageBundleConversationViewBinding bind(View view) {
        int i10 = R.id.barrier;
        Barrier barrier = (Barrier) a.a(view, i10);
        if (barrier != null) {
            i10 = R.id.reactions_view;
            ReactionsView reactionsView = (ReactionsView) a.a(view, i10);
            if (reactionsView != null) {
                i10 = R.id.reply_author_avatar;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
                if (simpleDraweeView != null) {
                    i10 = R.id.reply_author_name;
                    TextView textView = (TextView) a.a(view, i10);
                    if (textView != null) {
                        i10 = R.id.reply_text;
                        MessageContentView messageContentView = (MessageContentView) a.a(view, i10);
                        if (messageContentView != null) {
                            return new MessageBundleConversationViewBinding(view, barrier, reactionsView, simpleDraweeView, textView, messageContentView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static MessageBundleConversationViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.message_bundle_conversation_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
