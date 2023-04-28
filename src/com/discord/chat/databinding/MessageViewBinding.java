package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import com.discord.chat.C4254R;
import com.discord.chat.presentation.message.ConnectionsRoleTagView;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.chat.presentation.message.MessageFrameHeaderView;
import com.discord.chat.presentation.message.MessageHighlightHeader;
import com.discord.chat.presentation.message.MessageTagView;
import com.discord.chat.presentation.message.MessageViewReplyPreview;
import com.discord.chat.presentation.message.RoleDotView;
import com.discord.chat.presentation.message.RoleIconView;
import com.discord.chat.presentation.message.ThreadStarterMessageHeaderView;
import com.facebook.drawee.view.SimpleDraweeView;
import p412x1.C13922a;

/* loaded from: classes4.dex */
public final class MessageViewBinding {
    public final MessageAccessoriesView accessoriesView;
    public final SimpleDraweeView authorAvatar;
    public final SimpleDraweeView authorAvatarDecoration;
    public final TextView authorName;
    public final ConnectionsRoleTagView connectionsRoleTag;
    public final SimpleDraweeView guildCommunicationDisabledIcon;
    public final MessageHighlightHeader highlightHeader;
    public final Guideline messageEndGuideline;
    public final MessageFrameHeaderView messageFrameHeader;
    public final Barrier messageHeaderBarrier;
    public final View messageHeaderDivider;
    public final MessageTagView messageTagView;
    public final MessageViewReplyPreview replyPreview;
    public final RoleDotView roleDot;
    public final RoleIconView roleIcon;
    private final View rootView;
    public final SimpleDraweeView suppressNotificationsIcon;
    public final ThreadStarterMessageHeaderView threadStarterHeader;
    public final TextView timestamp;

    private MessageViewBinding(View view, MessageAccessoriesView messageAccessoriesView, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, TextView textView, ConnectionsRoleTagView connectionsRoleTagView, SimpleDraweeView simpleDraweeView3, MessageHighlightHeader messageHighlightHeader, Guideline guideline, MessageFrameHeaderView messageFrameHeaderView, Barrier barrier, View view2, MessageTagView messageTagView, MessageViewReplyPreview messageViewReplyPreview, RoleDotView roleDotView, RoleIconView roleIconView, SimpleDraweeView simpleDraweeView4, ThreadStarterMessageHeaderView threadStarterMessageHeaderView, TextView textView2) {
        this.rootView = view;
        this.accessoriesView = messageAccessoriesView;
        this.authorAvatar = simpleDraweeView;
        this.authorAvatarDecoration = simpleDraweeView2;
        this.authorName = textView;
        this.connectionsRoleTag = connectionsRoleTagView;
        this.guildCommunicationDisabledIcon = simpleDraweeView3;
        this.highlightHeader = messageHighlightHeader;
        this.messageEndGuideline = guideline;
        this.messageFrameHeader = messageFrameHeaderView;
        this.messageHeaderBarrier = barrier;
        this.messageHeaderDivider = view2;
        this.messageTagView = messageTagView;
        this.replyPreview = messageViewReplyPreview;
        this.roleDot = roleDotView;
        this.roleIcon = roleIconView;
        this.suppressNotificationsIcon = simpleDraweeView4;
        this.threadStarterHeader = threadStarterMessageHeaderView;
        this.timestamp = textView2;
    }

    public static MessageViewBinding bind(View view) {
        View a;
        int i = C4254R.C4256id.accessories_view;
        MessageAccessoriesView messageAccessoriesView = (MessageAccessoriesView) C13922a.m2313a(view, i);
        if (messageAccessoriesView != null) {
            i = C4254R.C4256id.author_avatar;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13922a.m2313a(view, i);
            if (simpleDraweeView != null) {
                i = C4254R.C4256id.author_avatar_decoration;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C13922a.m2313a(view, i);
                if (simpleDraweeView2 != null) {
                    i = C4254R.C4256id.author_name;
                    TextView textView = (TextView) C13922a.m2313a(view, i);
                    if (textView != null) {
                        i = C4254R.C4256id.connections_role_tag;
                        ConnectionsRoleTagView connectionsRoleTagView = (ConnectionsRoleTagView) C13922a.m2313a(view, i);
                        if (connectionsRoleTagView != null) {
                            i = C4254R.C4256id.guild_communication_disabled_icon;
                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) C13922a.m2313a(view, i);
                            if (simpleDraweeView3 != null) {
                                i = C4254R.C4256id.highlight_header;
                                MessageHighlightHeader messageHighlightHeader = (MessageHighlightHeader) C13922a.m2313a(view, i);
                                if (messageHighlightHeader != null) {
                                    i = C4254R.C4256id.message_end_guideline;
                                    Guideline guideline = (Guideline) C13922a.m2313a(view, i);
                                    if (guideline != null) {
                                        i = C4254R.C4256id.message_frame_header;
                                        MessageFrameHeaderView messageFrameHeaderView = (MessageFrameHeaderView) C13922a.m2313a(view, i);
                                        if (messageFrameHeaderView != null) {
                                            i = C4254R.C4256id.message_header_barrier;
                                            Barrier barrier = (Barrier) C13922a.m2313a(view, i);
                                            if (!(barrier == null || (a = C13922a.m2313a(view, (i = C4254R.C4256id.message_header_divider))) == null)) {
                                                i = C4254R.C4256id.message_tag_view;
                                                MessageTagView messageTagView = (MessageTagView) C13922a.m2313a(view, i);
                                                if (messageTagView != null) {
                                                    i = C4254R.C4256id.reply_preview;
                                                    MessageViewReplyPreview messageViewReplyPreview = (MessageViewReplyPreview) C13922a.m2313a(view, i);
                                                    if (messageViewReplyPreview != null) {
                                                        i = C4254R.C4256id.role_dot;
                                                        RoleDotView roleDotView = (RoleDotView) C13922a.m2313a(view, i);
                                                        if (roleDotView != null) {
                                                            i = C4254R.C4256id.role_icon;
                                                            RoleIconView roleIconView = (RoleIconView) C13922a.m2313a(view, i);
                                                            if (roleIconView != null) {
                                                                i = C4254R.C4256id.suppress_notifications_icon;
                                                                SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) C13922a.m2313a(view, i);
                                                                if (simpleDraweeView4 != null) {
                                                                    i = C4254R.C4256id.thread_starter_header;
                                                                    ThreadStarterMessageHeaderView threadStarterMessageHeaderView = (ThreadStarterMessageHeaderView) C13922a.m2313a(view, i);
                                                                    if (threadStarterMessageHeaderView != null) {
                                                                        i = C4254R.C4256id.timestamp;
                                                                        TextView textView2 = (TextView) C13922a.m2313a(view, i);
                                                                        if (textView2 != null) {
                                                                            return new MessageViewBinding(view, messageAccessoriesView, simpleDraweeView, simpleDraweeView2, textView, connectionsRoleTagView, simpleDraweeView3, messageHighlightHeader, guideline, messageFrameHeaderView, barrier, a, messageTagView, messageViewReplyPreview, roleDotView, roleIconView, simpleDraweeView4, threadStarterMessageHeaderView, textView2);
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

    public static MessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4254R.layout.message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
