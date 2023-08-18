package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import u0.a;


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
        int i10 = R.id.accept_button;
        DCDButton dCDButton = (DCDButton) a.a(view, i10);
        if (dCDButton != null) {
            i10 = R.id.badge_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, i10);
            if (constraintLayout != null) {
                i10 = R.id.badge_icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
                if (simpleDraweeView != null) {
                    i10 = R.id.badge_text;
                    TextView textView = (TextView) a.a(view, i10);
                    if (textView != null) {
                        i10 = R.id.channel_bottom_barrier;
                        Barrier barrier = (Barrier) a.a(view, i10);
                        if (barrier != null) {
                            i10 = R.id.channel_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                            if (simpleDraweeView2 != null) {
                                i10 = R.id.channel_name;
                                TextView textView2 = (TextView) a.a(view, i10);
                                if (textView2 != null) {
                                    i10 = R.id.channel_start_barrier;
                                    Barrier barrier2 = (Barrier) a.a(view, i10);
                                    if (barrier2 != null) {
                                        i10 = R.id.channel_top_barrier;
                                        Barrier barrier3 = (Barrier) a.a(view, i10);
                                        if (barrier3 != null) {
                                            i10 = R.id.creator_avatar;
                                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.a(view, i10);
                                            if (simpleDraweeView3 != null) {
                                                i10 = R.id.description_text;
                                                MessageContentView messageContentView = (MessageContentView) a.a(view, i10);
                                                if (messageContentView != null) {
                                                    i10 = R.id.guild_icon;
                                                    SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) a.a(view, i10);
                                                    if (simpleDraweeView4 != null) {
                                                        i10 = R.id.guild_name;
                                                        TextView textView3 = (TextView) a.a(view, i10);
                                                        if (textView3 != null) {
                                                            i10 = R.id.header_barrier;
                                                            Barrier barrier4 = (Barrier) a.a(view, i10);
                                                            if (barrier4 != null) {
                                                                i10 = R.id.header_icon;
                                                                SimpleDraweeView simpleDraweeView5 = (SimpleDraweeView) a.a(view, i10);
                                                                if (simpleDraweeView5 != null) {
                                                                    i10 = R.id.header_text;
                                                                    TextView textView4 = (TextView) a.a(view, i10);
                                                                    if (textView4 != null) {
                                                                        i10 = R.id.secondary_button;
                                                                        SimpleDraweeView simpleDraweeView6 = (SimpleDraweeView) a.a(view, i10);
                                                                        if (simpleDraweeView6 != null) {
                                                                            i10 = R.id.title_text;
                                                                            TextView textView5 = (TextView) a.a(view, i10);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static GuildEventInviteViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.guild_event_invite_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
