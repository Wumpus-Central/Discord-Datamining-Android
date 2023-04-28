package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.C3147R;
import com.discord.sticker.StickerView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
public final class WelcomeStickerViewBinding {
    private final View rootView;
    public final StickerView stickerView;
    public final TextView welcomeReplyText;

    private WelcomeStickerViewBinding(View view, StickerView stickerView, TextView textView) {
        this.rootView = view;
        this.stickerView = stickerView;
        this.welcomeReplyText = textView;
    }

    public static WelcomeStickerViewBinding bind(View view) {
        int i = C3147R.C3149id.sticker_view;
        StickerView stickerView = (StickerView) C13836a.m2313a(view, i);
        if (stickerView != null) {
            i = C3147R.C3149id.welcome_reply_text;
            TextView textView = (TextView) C13836a.m2313a(view, i);
            if (textView != null) {
                return new WelcomeStickerViewBinding(view, stickerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static WelcomeStickerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.welcome_sticker_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
