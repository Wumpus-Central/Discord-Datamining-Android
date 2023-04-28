package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.C3147R;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
public final class GuildViewBinding {
    public final SimpleDraweeView guildAvatar;
    public final TextView guildText;
    private final View rootView;

    private GuildViewBinding(View view, SimpleDraweeView simpleDraweeView, TextView textView) {
        this.rootView = view;
        this.guildAvatar = simpleDraweeView;
        this.guildText = textView;
    }

    public static GuildViewBinding bind(View view) {
        int i = C3147R.C3149id.guild_avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
        if (simpleDraweeView != null) {
            i = C3147R.C3149id.guild_text;
            TextView textView = (TextView) C13836a.m2313a(view, i);
            if (textView != null) {
                return new GuildViewBinding(view, simpleDraweeView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static GuildViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.guild_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
