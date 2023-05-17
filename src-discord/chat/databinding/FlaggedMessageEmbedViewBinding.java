package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.discord.chat.R;
import com.discord.chat.presentation.message.ConnectionsRoleTagView;
import com.discord.chat.presentation.message.RoleIconView;
import com.discord.chat.presentation.message.view.FlaggedMessageEmbedFooterView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes5.dex */
public final class FlaggedMessageEmbedViewBinding {
    public final SimpleDraweeView authorAvatar;
    public final TextView authorName;
    public final ConnectionsRoleTagView connectionsRoleTag;
    public final FlaggedMessageEmbedFooterView contentFooterView;
    public final MessageContentView contentView;
    public final SimpleDraweeView guildCommunicationDisabledIcon;
    public final Guideline messageEndGuideline;
    public final Guideline messageStartGuideline;
    public final RoleIconView roleIcon;
    private final View rootView;

    private FlaggedMessageEmbedViewBinding(View view, SimpleDraweeView simpleDraweeView, TextView textView, ConnectionsRoleTagView connectionsRoleTagView, FlaggedMessageEmbedFooterView flaggedMessageEmbedFooterView, MessageContentView messageContentView, SimpleDraweeView simpleDraweeView2, Guideline guideline, Guideline guideline2, RoleIconView roleIconView) {
        this.rootView = view;
        this.authorAvatar = simpleDraweeView;
        this.authorName = textView;
        this.connectionsRoleTag = connectionsRoleTagView;
        this.contentFooterView = flaggedMessageEmbedFooterView;
        this.contentView = messageContentView;
        this.guildCommunicationDisabledIcon = simpleDraweeView2;
        this.messageEndGuideline = guideline;
        this.messageStartGuideline = guideline2;
        this.roleIcon = roleIconView;
    }

    public static FlaggedMessageEmbedViewBinding bind(View view) {
        int i10 = R.id.author_avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.author_name;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                i10 = R.id.connections_role_tag;
                ConnectionsRoleTagView connectionsRoleTagView = (ConnectionsRoleTagView) a.a(view, i10);
                if (connectionsRoleTagView != null) {
                    i10 = R.id.content_footer_view;
                    FlaggedMessageEmbedFooterView flaggedMessageEmbedFooterView = (FlaggedMessageEmbedFooterView) a.a(view, i10);
                    if (flaggedMessageEmbedFooterView != null) {
                        i10 = R.id.content_view;
                        MessageContentView messageContentView = (MessageContentView) a.a(view, i10);
                        if (messageContentView != null) {
                            i10 = R.id.guild_communication_disabled_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                            if (simpleDraweeView2 != null) {
                                i10 = R.id.message_end_guideline;
                                Guideline guideline = (Guideline) a.a(view, i10);
                                if (guideline != null) {
                                    i10 = R.id.message_start_guideline;
                                    Guideline guideline2 = (Guideline) a.a(view, i10);
                                    if (guideline2 != null) {
                                        i10 = R.id.role_icon;
                                        RoleIconView roleIconView = (RoleIconView) a.a(view, i10);
                                        if (roleIconView != null) {
                                            return new FlaggedMessageEmbedViewBinding(view, simpleDraweeView, textView, connectionsRoleTagView, flaggedMessageEmbedFooterView, messageContentView, simpleDraweeView2, guideline, guideline2, roleIconView);
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

    public static FlaggedMessageEmbedViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.flagged_message_embed_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
