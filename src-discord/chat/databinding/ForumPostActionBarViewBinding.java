package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.discord.reactions.AddReactionView;
import com.discord.reactions.ReactionsView;
import x1.a;

/* loaded from: classes4.dex */
public final class ForumPostActionBarViewBinding {
    public final AddReactionView addReaction;
    public final DCDButton followButton;
    public final Barrier footerBarrier;
    public final View footerDivider;
    public final Barrier headerBarrier;
    public final View headerDivider;
    public final DCDButton otherReactionsCount;
    public final ReactionsView reactionsView;
    private final View rootView;
    public final DCDButton shareButton;
    public final Space spacer;
    public final Space startSpacer;

    private ForumPostActionBarViewBinding(View view, AddReactionView addReactionView, DCDButton dCDButton, Barrier barrier, View view2, Barrier barrier2, View view3, DCDButton dCDButton2, ReactionsView reactionsView, DCDButton dCDButton3, Space space, Space space2) {
        this.rootView = view;
        this.addReaction = addReactionView;
        this.followButton = dCDButton;
        this.footerBarrier = barrier;
        this.footerDivider = view2;
        this.headerBarrier = barrier2;
        this.headerDivider = view3;
        this.otherReactionsCount = dCDButton2;
        this.reactionsView = reactionsView;
        this.shareButton = dCDButton3;
        this.spacer = space;
        this.startSpacer = space2;
    }

    public static ForumPostActionBarViewBinding bind(View view) {
        View a10;
        View a11;
        int i10 = R.id.add_reaction;
        AddReactionView addReactionView = (AddReactionView) a.a(view, i10);
        if (addReactionView != null) {
            i10 = R.id.follow_button;
            DCDButton dCDButton = (DCDButton) a.a(view, i10);
            if (dCDButton != null) {
                i10 = R.id.footer_barrier;
                Barrier barrier = (Barrier) a.a(view, i10);
                if (!(barrier == null || (a10 = a.a(view, (i10 = R.id.footer_divider))) == null)) {
                    i10 = R.id.header_barrier;
                    Barrier barrier2 = (Barrier) a.a(view, i10);
                    if (!(barrier2 == null || (a11 = a.a(view, (i10 = R.id.header_divider))) == null)) {
                        i10 = R.id.other_reactions_count;
                        DCDButton dCDButton2 = (DCDButton) a.a(view, i10);
                        if (dCDButton2 != null) {
                            i10 = R.id.reactions_view;
                            ReactionsView reactionsView = (ReactionsView) a.a(view, i10);
                            if (reactionsView != null) {
                                i10 = R.id.share_button;
                                DCDButton dCDButton3 = (DCDButton) a.a(view, i10);
                                if (dCDButton3 != null) {
                                    i10 = R.id.spacer;
                                    Space space = (Space) a.a(view, i10);
                                    if (space != null) {
                                        i10 = R.id.start_spacer;
                                        Space space2 = (Space) a.a(view, i10);
                                        if (space2 != null) {
                                            return new ForumPostActionBarViewBinding(view, addReactionView, dCDButton, barrier, a10, barrier2, a11, dCDButton2, reactionsView, dCDButton3, space, space2);
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

    public static ForumPostActionBarViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.forum_post_action_bar_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
