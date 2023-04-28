package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import com.discord.chat.C4254R;
import com.discord.core.DCDButton;
import com.discord.reactions.AddReactionView;
import com.discord.reactions.ReactionsView;
import p412x1.C13922a;

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
        View a;
        View a2;
        int i = C4254R.C4256id.add_reaction;
        AddReactionView addReactionView = (AddReactionView) C13922a.m2313a(view, i);
        if (addReactionView != null) {
            i = C4254R.C4256id.follow_button;
            DCDButton dCDButton = (DCDButton) C13922a.m2313a(view, i);
            if (dCDButton != null) {
                i = C4254R.C4256id.footer_barrier;
                Barrier barrier = (Barrier) C13922a.m2313a(view, i);
                if (!(barrier == null || (a = C13922a.m2313a(view, (i = C4254R.C4256id.footer_divider))) == null)) {
                    i = C4254R.C4256id.header_barrier;
                    Barrier barrier2 = (Barrier) C13922a.m2313a(view, i);
                    if (!(barrier2 == null || (a2 = C13922a.m2313a(view, (i = C4254R.C4256id.header_divider))) == null)) {
                        i = C4254R.C4256id.other_reactions_count;
                        DCDButton dCDButton2 = (DCDButton) C13922a.m2313a(view, i);
                        if (dCDButton2 != null) {
                            i = C4254R.C4256id.reactions_view;
                            ReactionsView reactionsView = (ReactionsView) C13922a.m2313a(view, i);
                            if (reactionsView != null) {
                                i = C4254R.C4256id.share_button;
                                DCDButton dCDButton3 = (DCDButton) C13922a.m2313a(view, i);
                                if (dCDButton3 != null) {
                                    i = C4254R.C4256id.spacer;
                                    Space space = (Space) C13922a.m2313a(view, i);
                                    if (space != null) {
                                        i = C4254R.C4256id.start_spacer;
                                        Space space2 = (Space) C13922a.m2313a(view, i);
                                        if (space2 != null) {
                                            return new ForumPostActionBarViewBinding(view, addReactionView, dCDButton, barrier, a, barrier2, a2, dCDButton2, reactionsView, dCDButton3, space, space2);
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

    public static ForumPostActionBarViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4254R.layout.forum_post_action_bar_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
