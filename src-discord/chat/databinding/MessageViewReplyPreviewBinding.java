package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.channel_spine.ChannelSpineView;
import com.discord.chat.R;
import com.discord.chat.presentation.message.RoleDotView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.facebook.drawee.view.SimpleDraweeView;
import v0.a;


public final class MessageViewReplyPreviewBinding {
    public final SimpleDraweeView replyAuthorAvatar;
    public final TextView replyAuthorName;
    public final SimpleDraweeView replyIcon;
    public final LinearLayout replyLeadingViews;
    public final RoleDotView replyRoleDot;
    public final ChannelSpineView replySpline;
    public final MessageContentView replyText;
    private final View rootView;

    private MessageViewReplyPreviewBinding(View view, SimpleDraweeView simpleDraweeView, TextView textView, SimpleDraweeView simpleDraweeView2, LinearLayout linearLayout, RoleDotView roleDotView, ChannelSpineView channelSpineView, MessageContentView messageContentView) {
        this.rootView = view;
        this.replyAuthorAvatar = simpleDraweeView;
        this.replyAuthorName = textView;
        this.replyIcon = simpleDraweeView2;
        this.replyLeadingViews = linearLayout;
        this.replyRoleDot = roleDotView;
        this.replySpline = channelSpineView;
        this.replyText = messageContentView;
    }

    public static MessageViewReplyPreviewBinding bind(View view) {
        int i10 = R.id.reply_author_avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.reply_author_name;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                i10 = R.id.reply_icon;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                if (simpleDraweeView2 != null) {
                    i10 = R.id.reply_leading_views;
                    LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
                    if (linearLayout != null) {
                        i10 = R.id.reply_role_dot;
                        RoleDotView roleDotView = (RoleDotView) a.a(view, i10);
                        if (roleDotView != null) {
                            i10 = R.id.reply_spline;
                            ChannelSpineView channelSpineView = (ChannelSpineView) a.a(view, i10);
                            if (channelSpineView != null) {
                                i10 = R.id.reply_text;
                                MessageContentView messageContentView = (MessageContentView) a.a(view, i10);
                                if (messageContentView != null) {
                                    return new MessageViewReplyPreviewBinding(view, simpleDraweeView, textView, simpleDraweeView2, linearLayout, roleDotView, channelSpineView, messageContentView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static MessageViewReplyPreviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.message_view_reply_preview, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
