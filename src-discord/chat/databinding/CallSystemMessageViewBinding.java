package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.R;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes8.dex */
public final class CallSystemMessageViewBinding {
    public final SimpleDraweeView icon;
    public final TextView info;
    public final TextView message;
    public final OverlappingCirclesView participants;
    private final View rootView;

    private CallSystemMessageViewBinding(View view, SimpleDraweeView simpleDraweeView, TextView textView, TextView textView2, OverlappingCirclesView overlappingCirclesView) {
        this.rootView = view;
        this.icon = simpleDraweeView;
        this.info = textView;
        this.message = textView2;
        this.participants = overlappingCirclesView;
    }

    public static CallSystemMessageViewBinding bind(View view) {
        int i10 = R.id.icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.info;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                i10 = R.id.message;
                TextView textView2 = (TextView) a.a(view, i10);
                if (textView2 != null) {
                    i10 = R.id.participants;
                    OverlappingCirclesView overlappingCirclesView = (OverlappingCirclesView) a.a(view, i10);
                    if (overlappingCirclesView != null) {
                        return new CallSystemMessageViewBinding(view, simpleDraweeView, textView, textView2, overlappingCirclesView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static CallSystemMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.call_system_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
