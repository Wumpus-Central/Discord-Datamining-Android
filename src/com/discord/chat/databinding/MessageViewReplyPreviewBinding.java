package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.channel_spine.ChannelSpineView;
import com.discord.chat.C3147R;
import com.discord.chat.presentation.message.RoleDotView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
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
        int i = C3147R.C3149id.reply_author_avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
        if (simpleDraweeView != null) {
            i = C3147R.C3149id.reply_author_name;
            TextView textView = (TextView) C13836a.m2313a(view, i);
            if (textView != null) {
                i = C3147R.C3149id.reply_icon;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C13836a.m2313a(view, i);
                if (simpleDraweeView2 != null) {
                    i = C3147R.C3149id.reply_leading_views;
                    LinearLayout linearLayout = (LinearLayout) C13836a.m2313a(view, i);
                    if (linearLayout != null) {
                        i = C3147R.C3149id.reply_role_dot;
                        RoleDotView roleDotView = (RoleDotView) C13836a.m2313a(view, i);
                        if (roleDotView != null) {
                            i = C3147R.C3149id.reply_spline;
                            ChannelSpineView channelSpineView = (ChannelSpineView) C13836a.m2313a(view, i);
                            if (channelSpineView != null) {
                                i = C3147R.C3149id.reply_text;
                                MessageContentView messageContentView = (MessageContentView) C13836a.m2313a(view, i);
                                if (messageContentView != null) {
                                    return new MessageViewReplyPreviewBinding(view, simpleDraweeView, textView, simpleDraweeView2, linearLayout, roleDotView, channelSpineView, messageContentView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageViewReplyPreviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.message_view_reply_preview, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
