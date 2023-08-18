package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.R;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import u0.a;


public final class MessageFrameFeedHeaderBinding {
    public final SimpleDraweeView feedChannelIcon;
    public final TextView feedChannelText;
    public final TextView feedReplyCount;
    public final SimpleDraweeView feedReplyIcon;
    public final OverlappingCirclesView feedReplyParticipants;
    private final View rootView;

    private MessageFrameFeedHeaderBinding(View view, SimpleDraweeView simpleDraweeView, TextView textView, TextView textView2, SimpleDraweeView simpleDraweeView2, OverlappingCirclesView overlappingCirclesView) {
        this.rootView = view;
        this.feedChannelIcon = simpleDraweeView;
        this.feedChannelText = textView;
        this.feedReplyCount = textView2;
        this.feedReplyIcon = simpleDraweeView2;
        this.feedReplyParticipants = overlappingCirclesView;
    }

    public static MessageFrameFeedHeaderBinding bind(View view) {
        int i10 = R.id.feed_channel_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.feed_channel_text;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                i10 = R.id.feed_reply_count;
                TextView textView2 = (TextView) a.a(view, i10);
                if (textView2 != null) {
                    i10 = R.id.feed_reply_icon;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                    if (simpleDraweeView2 != null) {
                        i10 = R.id.feed_reply_participants;
                        OverlappingCirclesView overlappingCirclesView = (OverlappingCirclesView) a.a(view, i10);
                        if (overlappingCirclesView != null) {
                            return new MessageFrameFeedHeaderBinding(view, simpleDraweeView, textView, textView2, simpleDraweeView2, overlappingCirclesView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static MessageFrameFeedHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.message_frame_feed_header, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
