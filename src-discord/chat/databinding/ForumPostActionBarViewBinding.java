package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.discord.reactions.AddReactionView;
import com.discord.reactions.ReactionsView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import u0.a;


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
    public final DCDButton sharePromptCloseButton;
    public final ConstraintLayout sharePromptContainer;
    public final DCDButton sharePromptCopyLinkButton;
    public final SimpleDraweeView sharePromptIcon;
    public final SimpleDraweeSpanTextView sharePromptSubtitle;
    public final TextView sharePromptTitle;
    public final Space spacer;
    public final Space startSpacer;

    private ForumPostActionBarViewBinding(View view, AddReactionView addReactionView, DCDButton dCDButton, Barrier barrier, View view2, Barrier barrier2, View view3, DCDButton dCDButton2, ReactionsView reactionsView, DCDButton dCDButton3, DCDButton dCDButton4, ConstraintLayout constraintLayout, DCDButton dCDButton5, SimpleDraweeView simpleDraweeView, SimpleDraweeSpanTextView simpleDraweeSpanTextView, TextView textView, Space space, Space space2) {
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
        this.sharePromptCloseButton = dCDButton4;
        this.sharePromptContainer = constraintLayout;
        this.sharePromptCopyLinkButton = dCDButton5;
        this.sharePromptIcon = simpleDraweeView;
        this.sharePromptSubtitle = simpleDraweeSpanTextView;
        this.sharePromptTitle = textView;
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
                                    i10 = R.id.share_prompt_close_button;
                                    DCDButton dCDButton4 = (DCDButton) a.a(view, i10);
                                    if (dCDButton4 != null) {
                                        i10 = R.id.share_prompt_container;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, i10);
                                        if (constraintLayout != null) {
                                            i10 = R.id.share_prompt_copy_link_button;
                                            DCDButton dCDButton5 = (DCDButton) a.a(view, i10);
                                            if (dCDButton5 != null) {
                                                i10 = R.id.share_prompt_icon;
                                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
                                                if (simpleDraweeView != null) {
                                                    i10 = R.id.share_prompt_subtitle;
                                                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.a(view, i10);
                                                    if (simpleDraweeSpanTextView != null) {
                                                        i10 = R.id.share_prompt_title;
                                                        TextView textView = (TextView) a.a(view, i10);
                                                        if (textView != null) {
                                                            i10 = R.id.spacer;
                                                            Space space = (Space) a.a(view, i10);
                                                            if (space != null) {
                                                                i10 = R.id.start_spacer;
                                                                Space space2 = (Space) a.a(view, i10);
                                                                if (space2 != null) {
                                                                    return new ForumPostActionBarViewBinding(view, addReactionView, dCDButton, barrier, a10, barrier2, a11, dCDButton2, reactionsView, dCDButton3, dCDButton4, constraintLayout, dCDButton5, simpleDraweeView, simpleDraweeSpanTextView, textView, space, space2);
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
