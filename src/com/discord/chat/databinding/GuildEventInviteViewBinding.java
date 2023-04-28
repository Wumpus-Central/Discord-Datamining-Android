package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.C4254R;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import p412x1.C13922a;

/* loaded from: classes4.dex */
public final class GuildEventInviteViewBinding {
    public final DCDButton acceptButton;
    public final ConstraintLayout badgeContainer;
    public final SimpleDraweeView badgeIcon;
    public final TextView badgeText;
    public final Barrier channelBottomBarrier;
    public final SimpleDraweeView channelIcon;
    public final TextView channelName;
    public final Barrier channelStartBarrier;
    public final Barrier channelTopBarrier;
    public final SimpleDraweeView creatorAvatar;
    public final MessageContentView descriptionText;
    public final SimpleDraweeView guildIcon;
    public final TextView guildName;
    public final Barrier headerBarrier;
    public final SimpleDraweeView headerIcon;
    public final TextView headerText;
    private final View rootView;
    public final SimpleDraweeView secondaryButton;
    public final TextView titleText;

    private GuildEventInviteViewBinding(View view, DCDButton dCDButton, ConstraintLayout constraintLayout, SimpleDraweeView simpleDraweeView, TextView textView, Barrier barrier, SimpleDraweeView simpleDraweeView2, TextView textView2, Barrier barrier2, Barrier barrier3, SimpleDraweeView simpleDraweeView3, MessageContentView messageContentView, SimpleDraweeView simpleDraweeView4, TextView textView3, Barrier barrier4, SimpleDraweeView simpleDraweeView5, TextView textView4, SimpleDraweeView simpleDraweeView6, TextView textView5) {
        this.rootView = view;
        this.acceptButton = dCDButton;
        this.badgeContainer = constraintLayout;
        this.badgeIcon = simpleDraweeView;
        this.badgeText = textView;
        this.channelBottomBarrier = barrier;
        this.channelIcon = simpleDraweeView2;
        this.channelName = textView2;
        this.channelStartBarrier = barrier2;
        this.channelTopBarrier = barrier3;
        this.creatorAvatar = simpleDraweeView3;
        this.descriptionText = messageContentView;
        this.guildIcon = simpleDraweeView4;
        this.guildName = textView3;
        this.headerBarrier = barrier4;
        this.headerIcon = simpleDraweeView5;
        this.headerText = textView4;
        this.secondaryButton = simpleDraweeView6;
        this.titleText = textView5;
    }

    public static GuildEventInviteViewBinding bind(View view) {
        int i = C4254R.C4256id.accept_button;
        DCDButton dCDButton = (DCDButton) C13922a.m2313a(view, i);
        if (dCDButton != null) {
            i = C4254R.C4256id.badge_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) C13922a.m2313a(view, i);
            if (constraintLayout != null) {
                i = C4254R.C4256id.badge_icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13922a.m2313a(view, i);
                if (simpleDraweeView != null) {
                    i = C4254R.C4256id.badge_text;
                    TextView textView = (TextView) C13922a.m2313a(view, i);
                    if (textView != null) {
                        i = C4254R.C4256id.channel_bottom_barrier;
                        Barrier barrier = (Barrier) C13922a.m2313a(view, i);
                        if (barrier != null) {
                            i = C4254R.C4256id.channel_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C13922a.m2313a(view, i);
                            if (simpleDraweeView2 != null) {
                                i = C4254R.C4256id.channel_name;
                                TextView textView2 = (TextView) C13922a.m2313a(view, i);
                                if (textView2 != null) {
                                    i = C4254R.C4256id.channel_start_barrier;
                                    Barrier barrier2 = (Barrier) C13922a.m2313a(view, i);
                                    if (barrier2 != null) {
                                        i = C4254R.C4256id.channel_top_barrier;
                                        Barrier barrier3 = (Barrier) C13922a.m2313a(view, i);
                                        if (barrier3 != null) {
                                            i = C4254R.C4256id.creator_avatar;
                                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) C13922a.m2313a(view, i);
                                            if (simpleDraweeView3 != null) {
                                                i = C4254R.C4256id.description_text;
                                                MessageContentView messageContentView = (MessageContentView) C13922a.m2313a(view, i);
                                                if (messageContentView != null) {
                                                    i = C4254R.C4256id.guild_icon;
                                                    SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) C13922a.m2313a(view, i);
                                                    if (simpleDraweeView4 != null) {
                                                        i = C4254R.C4256id.guild_name;
                                                        TextView textView3 = (TextView) C13922a.m2313a(view, i);
                                                        if (textView3 != null) {
                                                            i = C4254R.C4256id.header_barrier;
                                                            Barrier barrier4 = (Barrier) C13922a.m2313a(view, i);
                                                            if (barrier4 != null) {
                                                                i = C4254R.C4256id.header_icon;
                                                                SimpleDraweeView simpleDraweeView5 = (SimpleDraweeView) C13922a.m2313a(view, i);
                                                                if (simpleDraweeView5 != null) {
                                                                    i = C4254R.C4256id.header_text;
                                                                    TextView textView4 = (TextView) C13922a.m2313a(view, i);
                                                                    if (textView4 != null) {
                                                                        i = C4254R.C4256id.secondary_button;
                                                                        SimpleDraweeView simpleDraweeView6 = (SimpleDraweeView) C13922a.m2313a(view, i);
                                                                        if (simpleDraweeView6 != null) {
                                                                            i = C4254R.C4256id.title_text;
                                                                            TextView textView5 = (TextView) C13922a.m2313a(view, i);
                                                                            if (textView5 != null) {
                                                                                return new GuildEventInviteViewBinding(view, dCDButton, constraintLayout, simpleDraweeView, textView, barrier, simpleDraweeView2, textView2, barrier2, barrier3, simpleDraweeView3, messageContentView, simpleDraweeView4, textView3, barrier4, simpleDraweeView5, textView4, simpleDraweeView6, textView5);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    public static GuildEventInviteViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4254R.layout.guild_event_invite_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
