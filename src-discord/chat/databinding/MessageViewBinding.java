package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import com.discord.chat.R;
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
import x1.a;

/* loaded from: classes5.dex */
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
        View a10;
        int i10 = R.id.accessories_view;
        MessageAccessoriesView messageAccessoriesView = (MessageAccessoriesView) a.a(view, i10);
        if (messageAccessoriesView != null) {
            i10 = R.id.author_avatar;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
            if (simpleDraweeView != null) {
                i10 = R.id.author_avatar_decoration;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                if (simpleDraweeView2 != null) {
                    i10 = R.id.author_name;
                    TextView textView = (TextView) a.a(view, i10);
                    if (textView != null) {
                        i10 = R.id.connections_role_tag;
                        ConnectionsRoleTagView connectionsRoleTagView = (ConnectionsRoleTagView) a.a(view, i10);
                        if (connectionsRoleTagView != null) {
                            i10 = R.id.guild_communication_disabled_icon;
                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.a(view, i10);
                            if (simpleDraweeView3 != null) {
                                i10 = R.id.highlight_header;
                                MessageHighlightHeader messageHighlightHeader = (MessageHighlightHeader) a.a(view, i10);
                                if (messageHighlightHeader != null) {
                                    i10 = R.id.message_end_guideline;
                                    Guideline guideline = (Guideline) a.a(view, i10);
                                    if (guideline != null) {
                                        i10 = R.id.message_frame_header;
                                        MessageFrameHeaderView messageFrameHeaderView = (MessageFrameHeaderView) a.a(view, i10);
                                        if (messageFrameHeaderView != null) {
                                            i10 = R.id.message_header_barrier;
                                            Barrier barrier = (Barrier) a.a(view, i10);
                                            if (!(barrier == null || (a10 = a.a(view, (i10 = R.id.message_header_divider))) == null)) {
                                                i10 = R.id.message_tag_view;
                                                MessageTagView messageTagView = (MessageTagView) a.a(view, i10);
                                                if (messageTagView != null) {
                                                    i10 = R.id.reply_preview;
                                                    MessageViewReplyPreview messageViewReplyPreview = (MessageViewReplyPreview) a.a(view, i10);
                                                    if (messageViewReplyPreview != null) {
                                                        i10 = R.id.role_dot;
                                                        RoleDotView roleDotView = (RoleDotView) a.a(view, i10);
                                                        if (roleDotView != null) {
                                                            i10 = R.id.role_icon;
                                                            RoleIconView roleIconView = (RoleIconView) a.a(view, i10);
                                                            if (roleIconView != null) {
                                                                i10 = R.id.suppress_notifications_icon;
                                                                SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) a.a(view, i10);
                                                                if (simpleDraweeView4 != null) {
                                                                    i10 = R.id.thread_starter_header;
                                                                    ThreadStarterMessageHeaderView threadStarterMessageHeaderView = (ThreadStarterMessageHeaderView) a.a(view, i10);
                                                                    if (threadStarterMessageHeaderView != null) {
                                                                        i10 = R.id.timestamp;
                                                                        TextView textView2 = (TextView) a.a(view, i10);
                                                                        if (textView2 != null) {
                                                                            return new MessageViewBinding(view, messageAccessoriesView, simpleDraweeView, simpleDraweeView2, textView, connectionsRoleTagView, simpleDraweeView3, messageHighlightHeader, guideline, messageFrameHeaderView, barrier, a10, messageTagView, messageViewReplyPreview, roleDotView, roleIconView, simpleDraweeView4, threadStarterMessageHeaderView, textView2);
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

    public static MessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
