package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.R;
import com.discord.sticker.StickerView;
import x1.a;

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
        int i10 = R.id.sticker_view;
        StickerView stickerView = (StickerView) a.a(view, i10);
        if (stickerView != null) {
            i10 = R.id.welcome_reply_text;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                return new WelcomeStickerViewBinding(view, stickerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static WelcomeStickerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.welcome_sticker_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}