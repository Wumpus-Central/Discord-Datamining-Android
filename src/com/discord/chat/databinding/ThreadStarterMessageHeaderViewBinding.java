package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.C3147R;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
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
        int i = C3147R.C3149id.thread_starter_header_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
        if (simpleDraweeView != null) {
            i = C3147R.C3149id.thread_starter_header_text;
            TextView textView = (TextView) C13836a.m2313a(view, i);
            if (textView != null) {
                return new ThreadStarterMessageHeaderViewBinding(view, simpleDraweeView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ThreadStarterMessageHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.thread_starter_message_header_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
