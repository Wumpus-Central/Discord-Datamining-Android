package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.GuildView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes5.dex */
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
        int i10 = R.id.barrier_button;
        Barrier barrier = (Barrier) a.a(view, i10);
        if (barrier != null) {
            i10 = R.id.barrier_header;
            Barrier barrier2 = (Barrier) a.a(view, i10);
            if (barrier2 != null) {
                i10 = R.id.item_bottom_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, i10);
                if (constraintLayout != null) {
                    i10 = R.id.item_invite_disabled_icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
                    if (simpleDraweeView != null) {
                        i10 = R.id.item_invite_header;
                        TextView textView = (TextView) a.a(view, i10);
                        if (textView != null) {
                            i10 = R.id.item_invite_help_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                            if (simpleDraweeView2 != null) {
                                i10 = R.id.item_invite_image;
                                GuildView guildView = (GuildView) a.a(view, i10);
                                if (guildView != null) {
                                    i10 = R.id.item_invite_subtitle;
                                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.a(view, i10);
                                    if (simpleDraweeSpanTextView != null) {
                                        i10 = R.id.item_invite_title;
                                        TextView textView2 = (TextView) a.a(view, i10);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static GuildInviteDisabledViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.guild_invite_disabled_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
