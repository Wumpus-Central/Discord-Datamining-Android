package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.C4254R;
import com.facebook.drawee.view.SimpleDraweeView;
import p412x1.C13922a;

/* loaded from: classes4.dex */
public final class MessageHighlightHeaderBinding {
    public final TextView header;
    public final SimpleDraweeView highlightIcon;
    private final View rootView;

    private MessageHighlightHeaderBinding(View view, TextView textView, SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.header = textView;
        this.highlightIcon = simpleDraweeView;
    }

    public static MessageHighlightHeaderBinding bind(View view) {
        int i = C4254R.C4256id.header;
        TextView textView = (TextView) C13922a.m2313a(view, i);
        if (textView != null) {
            i = C4254R.C4256id.highlight_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13922a.m2313a(view, i);
            if (simpleDraweeView != null) {
                return new MessageHighlightHeaderBinding(view, textView, simpleDraweeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MessageHighlightHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4254R.layout.message_highlight_header, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
