package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.C3147R;
import com.discord.chat.presentation.message.view.GuildView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
public final class GuildInviteDisabledViewBinding {
    public final Barrier barrierButton;
    public final Barrier barrierHeader;
    public final ConstraintLayout itemBottomContainer;
    public final SimpleDraweeView itemInviteDisabledIcon;
    public final TextView itemInviteHeader;
    public final SimpleDraweeView itemInviteHelpIcon;
    public final GuildView itemInviteImage;
    public final SimpleDraweeSpanTextView itemInviteSubtitle;
    public final TextView itemInviteTitle;
    private final View rootView;

    private GuildInviteDisabledViewBinding(View view, Barrier barrier, Barrier barrier2, ConstraintLayout constraintLayout, SimpleDraweeView simpleDraweeView, TextView textView, SimpleDraweeView simpleDraweeView2, GuildView guildView, SimpleDraweeSpanTextView simpleDraweeSpanTextView, TextView textView2) {
        this.rootView = view;
        this.barrierButton = barrier;
        this.barrierHeader = barrier2;
        this.itemBottomContainer = constraintLayout;
        this.itemInviteDisabledIcon = simpleDraweeView;
        this.itemInviteHeader = textView;
        this.itemInviteHelpIcon = simpleDraweeView2;
        this.itemInviteImage = guildView;
        this.itemInviteSubtitle = simpleDraweeSpanTextView;
        this.itemInviteTitle = textView2;
    }

    public static GuildInviteDisabledViewBinding bind(View view) {
        int i = C3147R.C3149id.barrier_button;
        Barrier barrier = (Barrier) C13836a.m2313a(view, i);
        if (barrier != null) {
            i = C3147R.C3149id.barrier_header;
            Barrier barrier2 = (Barrier) C13836a.m2313a(view, i);
            if (barrier2 != null) {
                i = C3147R.C3149id.item_bottom_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) C13836a.m2313a(view, i);
                if (constraintLayout != null) {
                    i = C3147R.C3149id.item_invite_disabled_icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
                    if (simpleDraweeView != null) {
                        i = C3147R.C3149id.item_invite_header;
                        TextView textView = (TextView) C13836a.m2313a(view, i);
                        if (textView != null) {
                            i = C3147R.C3149id.item_invite_help_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C13836a.m2313a(view, i);
                            if (simpleDraweeView2 != null) {
                                i = C3147R.C3149id.item_invite_image;
                                GuildView guildView = (GuildView) C13836a.m2313a(view, i);
                                if (guildView != null) {
                                    i = C3147R.C3149id.item_invite_subtitle;
                                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C13836a.m2313a(view, i);
                                    if (simpleDraweeSpanTextView != null) {
                                        i = C3147R.C3149id.item_invite_title;
                                        TextView textView2 = (TextView) C13836a.m2313a(view, i);
                                        if (textView2 != null) {
                                            return new GuildInviteDisabledViewBinding(view, barrier, barrier2, constraintLayout, simpleDraweeView, textView, simpleDraweeView2, guildView, simpleDraweeSpanTextView, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static GuildInviteDisabledViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.guild_invite_disabled_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
