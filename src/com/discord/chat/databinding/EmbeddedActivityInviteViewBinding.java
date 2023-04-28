package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.C3147R;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
public final class EmbeddedActivityInviteViewBinding {
    public final Barrier barrierFooter;
    public final ConstraintLayout itemBottomContainer;
    public final TextView itemHeader;
    public final SimpleDraweeView itemHero;
    public final MessageContentView itemSubtitle;
    public final TextView itemTitle;
    public final DCDButton launchButton;
    public final TextView noParticipantsText;
    public final OverlappingCirclesView participants;
    public final FrameLayout participantsContainer;
    private final View rootView;
    public final SimpleDraweeView subtitleIcon;
    public final Barrier subtitleTopBarrier;

    private EmbeddedActivityInviteViewBinding(View view, Barrier barrier, ConstraintLayout constraintLayout, TextView textView, SimpleDraweeView simpleDraweeView, MessageContentView messageContentView, TextView textView2, DCDButton dCDButton, TextView textView3, OverlappingCirclesView overlappingCirclesView, FrameLayout frameLayout, SimpleDraweeView simpleDraweeView2, Barrier barrier2) {
        this.rootView = view;
        this.barrierFooter = barrier;
        this.itemBottomContainer = constraintLayout;
        this.itemHeader = textView;
        this.itemHero = simpleDraweeView;
        this.itemSubtitle = messageContentView;
        this.itemTitle = textView2;
        this.launchButton = dCDButton;
        this.noParticipantsText = textView3;
        this.participants = overlappingCirclesView;
        this.participantsContainer = frameLayout;
        this.subtitleIcon = simpleDraweeView2;
        this.subtitleTopBarrier = barrier2;
    }

    public static EmbeddedActivityInviteViewBinding bind(View view) {
        int i = C3147R.C3149id.barrier_footer;
        Barrier barrier = (Barrier) C13836a.m2313a(view, i);
        if (barrier != null) {
            i = C3147R.C3149id.item_bottom_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) C13836a.m2313a(view, i);
            if (constraintLayout != null) {
                i = C3147R.C3149id.item_header;
                TextView textView = (TextView) C13836a.m2313a(view, i);
                if (textView != null) {
                    i = C3147R.C3149id.item_hero;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
                    if (simpleDraweeView != null) {
                        i = C3147R.C3149id.item_subtitle;
                        MessageContentView messageContentView = (MessageContentView) C13836a.m2313a(view, i);
                        if (messageContentView != null) {
                            i = C3147R.C3149id.item_title;
                            TextView textView2 = (TextView) C13836a.m2313a(view, i);
                            if (textView2 != null) {
                                i = C3147R.C3149id.launch_button;
                                DCDButton dCDButton = (DCDButton) C13836a.m2313a(view, i);
                                if (dCDButton != null) {
                                    i = C3147R.C3149id.no_participants_text;
                                    TextView textView3 = (TextView) C13836a.m2313a(view, i);
                                    if (textView3 != null) {
                                        i = C3147R.C3149id.participants;
                                        OverlappingCirclesView overlappingCirclesView = (OverlappingCirclesView) C13836a.m2313a(view, i);
                                        if (overlappingCirclesView != null) {
                                            i = C3147R.C3149id.participants_container;
                                            FrameLayout frameLayout = (FrameLayout) C13836a.m2313a(view, i);
                                            if (frameLayout != null) {
                                                i = C3147R.C3149id.subtitle_icon;
                                                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C13836a.m2313a(view, i);
                                                if (simpleDraweeView2 != null) {
                                                    i = C3147R.C3149id.subtitle_top_barrier;
                                                    Barrier barrier2 = (Barrier) C13836a.m2313a(view, i);
                                                    if (barrier2 != null) {
                                                        return new EmbeddedActivityInviteViewBinding(view, barrier, constraintLayout, textView, simpleDraweeView, messageContentView, textView2, dCDButton, textView3, overlappingCirclesView, frameLayout, simpleDraweeView2, barrier2);
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

    public static EmbeddedActivityInviteViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.embedded_activity_invite_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
