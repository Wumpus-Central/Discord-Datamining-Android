package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes8.dex */
public final class ThreadEmbedViewBinding {
    private final View rootView;
    public final SimpleDraweeView threadEmbedIcon;
    public final TextView threadEmbedMessagesCount;
    public final SimpleDraweeView threadEmbedMostRecentMessageAvatar;
    public final SimpleDraweeSpanTextView threadEmbedMostRecentMessageContent;
    public final LinearLayout threadEmbedMostRecentMessageHeader;
    public final TextView threadEmbedMostRecentMessageName;
    public final TextView threadEmbedName;

    private ThreadEmbedViewBinding(View view, SimpleDraweeView simpleDraweeView, TextView textView, SimpleDraweeView simpleDraweeView2, SimpleDraweeSpanTextView simpleDraweeSpanTextView, LinearLayout linearLayout, TextView textView2, TextView textView3) {
        this.rootView = view;
        this.threadEmbedIcon = simpleDraweeView;
        this.threadEmbedMessagesCount = textView;
        this.threadEmbedMostRecentMessageAvatar = simpleDraweeView2;
        this.threadEmbedMostRecentMessageContent = simpleDraweeSpanTextView;
        this.threadEmbedMostRecentMessageHeader = linearLayout;
        this.threadEmbedMostRecentMessageName = textView2;
        this.threadEmbedName = textView3;
    }

    public static ThreadEmbedViewBinding bind(View view) {
        int i10 = R.id.thread_embed_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.thread_embed_messages_count;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                i10 = R.id.thread_embed_most_recent_message_avatar;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                if (simpleDraweeView2 != null) {
                    i10 = R.id.thread_embed_most_recent_message_content;
                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.a(view, i10);
                    if (simpleDraweeSpanTextView != null) {
                        i10 = R.id.thread_embed_most_recent_message_header;
                        LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
                        if (linearLayout != null) {
                            i10 = R.id.thread_embed_most_recent_message_name;
                            TextView textView2 = (TextView) a.a(view, i10);
                            if (textView2 != null) {
                                i10 = R.id.thread_embed_name;
                                TextView textView3 = (TextView) a.a(view, i10);
                                if (textView3 != null) {
                                    return new ThreadEmbedViewBinding(view, simpleDraweeView, textView, simpleDraweeView2, simpleDraweeSpanTextView, linearLayout, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ThreadEmbedViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.thread_embed_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
