package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes7.dex */
public final class InviteToSpeakViewBinding {
    public final TextView inviteToSpeakText;
    public final SimpleDraweeView moveToSpeakerIcon;
    private final View rootView;

    private InviteToSpeakViewBinding(View view, TextView textView, SimpleDraweeView simpleDraweeView) {
        this.rootView = view;
        this.inviteToSpeakText = textView;
        this.moveToSpeakerIcon = simpleDraweeView;
    }

    public static InviteToSpeakViewBinding bind(View view) {
        int i10 = R.id.invite_to_speak_text;
        TextView textView = (TextView) a.a(view, i10);
        if (textView != null) {
            i10 = R.id.move_to_speaker_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
            if (simpleDraweeView != null) {
                return new InviteToSpeakViewBinding(view, textView, simpleDraweeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static InviteToSpeakViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.invite_to_speak_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
