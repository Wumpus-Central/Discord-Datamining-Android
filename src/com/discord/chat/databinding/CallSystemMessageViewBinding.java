package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.C3147R;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
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
        int i = C3147R.C3149id.icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
        if (simpleDraweeView != null) {
            i = C3147R.C3149id.info;
            TextView textView = (TextView) C13836a.m2313a(view, i);
            if (textView != null) {
                i = C3147R.C3149id.message;
                TextView textView2 = (TextView) C13836a.m2313a(view, i);
                if (textView2 != null) {
                    i = C3147R.C3149id.participants;
                    OverlappingCirclesView overlappingCirclesView = (OverlappingCirclesView) C13836a.m2313a(view, i);
                    if (overlappingCirclesView != null) {
                        return new CallSystemMessageViewBinding(view, simpleDraweeView, textView, textView2, overlappingCirclesView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static CallSystemMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.call_system_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
