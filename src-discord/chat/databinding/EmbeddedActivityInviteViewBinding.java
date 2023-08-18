package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import u0.a;


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
        int i10 = R.id.barrier_footer;
        Barrier barrier = (Barrier) a.a(view, i10);
        if (barrier != null) {
            i10 = R.id.item_bottom_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, i10);
            if (constraintLayout != null) {
                i10 = R.id.item_header;
                TextView textView = (TextView) a.a(view, i10);
                if (textView != null) {
                    i10 = R.id.item_hero;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
                    if (simpleDraweeView != null) {
                        i10 = R.id.item_subtitle;
                        MessageContentView messageContentView = (MessageContentView) a.a(view, i10);
                        if (messageContentView != null) {
                            i10 = R.id.item_title;
                            TextView textView2 = (TextView) a.a(view, i10);
                            if (textView2 != null) {
                                i10 = R.id.launch_button;
                                DCDButton dCDButton = (DCDButton) a.a(view, i10);
                                if (dCDButton != null) {
                                    i10 = R.id.no_participants_text;
                                    TextView textView3 = (TextView) a.a(view, i10);
                                    if (textView3 != null) {
                                        i10 = R.id.participants;
                                        OverlappingCirclesView overlappingCirclesView = (OverlappingCirclesView) a.a(view, i10);
                                        if (overlappingCirclesView != null) {
                                            i10 = R.id.participants_container;
                                            FrameLayout frameLayout = (FrameLayout) a.a(view, i10);
                                            if (frameLayout != null) {
                                                i10 = R.id.subtitle_icon;
                                                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                                                if (simpleDraweeView2 != null) {
                                                    i10 = R.id.subtitle_top_barrier;
                                                    Barrier barrier2 = (Barrier) a.a(view, i10);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static EmbeddedActivityInviteViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.embedded_activity_invite_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
