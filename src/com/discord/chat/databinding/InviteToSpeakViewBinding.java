package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.C3147R;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
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
        int i = C3147R.C3149id.invite_to_speak_text;
        TextView textView = (TextView) C13836a.m2313a(view, i);
        if (textView != null) {
            i = C3147R.C3149id.move_to_speaker_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
            if (simpleDraweeView != null) {
                return new InviteToSpeakViewBinding(view, textView, simpleDraweeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static InviteToSpeakViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.invite_to_speak_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
