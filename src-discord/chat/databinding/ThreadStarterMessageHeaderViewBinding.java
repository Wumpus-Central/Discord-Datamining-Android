package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import v0.a;

/* loaded from: classes3.dex */
public final class ThreadStarterMessageHeaderViewBinding {
    private final View rootView;
    public final SimpleDraweeView threadStarterHeaderIcon;
    public final TextView threadStarterHeaderText;

    private ThreadStarterMessageHeaderViewBinding(View view, SimpleDraweeView simpleDraweeView, TextView textView) {
        this.rootView = view;
        this.threadStarterHeaderIcon = simpleDraweeView;
        this.threadStarterHeaderText = textView;
    }

    public static ThreadStarterMessageHeaderViewBinding bind(View view) {
        int i10 = R.id.thread_starter_header_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.thread_starter_header_text;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                return new ThreadStarterMessageHeaderViewBinding(view, simpleDraweeView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ThreadStarterMessageHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.thread_starter_message_header_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
