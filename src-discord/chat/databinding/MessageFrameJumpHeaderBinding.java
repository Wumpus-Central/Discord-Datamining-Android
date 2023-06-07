package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.R;
import x1.a;

/* loaded from: classes7.dex */
public final class MessageFrameJumpHeaderBinding {
    public final TextView messageHeaderSubtitle;
    public final TextView messageHeaderTitle;
    private final View rootView;

    private MessageFrameJumpHeaderBinding(View view, TextView textView, TextView textView2) {
        this.rootView = view;
        this.messageHeaderSubtitle = textView;
        this.messageHeaderTitle = textView2;
    }

    public static MessageFrameJumpHeaderBinding bind(View view) {
        int i10 = R.id.message_header_subtitle;
        TextView textView = (TextView) a.a(view, i10);
        if (textView != null) {
            i10 = R.id.message_header_title;
            TextView textView2 = (TextView) a.a(view, i10);
            if (textView2 != null) {
                return new MessageFrameJumpHeaderBinding(view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static MessageFrameJumpHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.message_frame_jump_header, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
