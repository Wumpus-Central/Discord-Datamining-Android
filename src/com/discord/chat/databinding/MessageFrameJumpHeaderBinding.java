package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.C4254R;
import p412x1.C13922a;

/* loaded from: classes4.dex */
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
        int i = C4254R.C4256id.message_header_subtitle;
        TextView textView = (TextView) C13922a.m2313a(view, i);
        if (textView != null) {
            i = C4254R.C4256id.message_header_title;
            TextView textView2 = (TextView) C13922a.m2313a(view, i);
            if (textView2 != null) {
                return new MessageFrameJumpHeaderBinding(view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageFrameJumpHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4254R.layout.message_frame_jump_header, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
