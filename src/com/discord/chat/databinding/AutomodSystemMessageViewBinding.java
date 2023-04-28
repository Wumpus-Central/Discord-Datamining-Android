package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import com.discord.chat.C4254R;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.chat.presentation.message.MessageTagView;
import com.discord.chat.presentation.message.MessageViewReplyPreview;
import com.discord.chat.presentation.message.ThreadStarterMessageHeaderView;
import com.facebook.drawee.view.SimpleDraweeView;
import p412x1.C13922a;

/* loaded from: classes4.dex */
public final class AutomodSystemMessageViewBinding {
    public final MessageAccessoriesView accessoriesView;
    public final SimpleDraweeView authorAvatar;
    public final TextView authorName;
    public final TextView automodMessageChannel;
    public final TextView automodMessageContextHeader;
    public final SimpleDraweeView guildCommunicationDisabledIcon;
    public final Guideline messageEndGuideline;
    public final Barrier messageHeaderBarrier;
    public final View messageHeaderDivider;
    public final TextView messageHeaderSubtitle;
    public final TextView messageHeaderTitle;
    public final MessageTagView messageTagView;
    public final MessageViewReplyPreview replyPreview;
    private final View rootView;
    public final ThreadStarterMessageHeaderView threadStarterHeader;
    public final TextView timestamp;

    private AutomodSystemMessageViewBinding(View view, MessageAccessoriesView messageAccessoriesView, SimpleDraweeView simpleDraweeView, TextView textView, TextView textView2, TextView textView3, SimpleDraweeView simpleDraweeView2, Guideline guideline, Barrier barrier, View view2, TextView textView4, TextView textView5, MessageTagView messageTagView, MessageViewReplyPreview messageViewReplyPreview, ThreadStarterMessageHeaderView threadStarterMessageHeaderView, TextView textView6) {
        this.rootView = view;
        this.accessoriesView = messageAccessoriesView;
        this.authorAvatar = simpleDraweeView;
        this.authorName = textView;
        this.automodMessageChannel = textView2;
        this.automodMessageContextHeader = textView3;
        this.guildCommunicationDisabledIcon = simpleDraweeView2;
        this.messageEndGuideline = guideline;
        this.messageHeaderBarrier = barrier;
        this.messageHeaderDivider = view2;
        this.messageHeaderSubtitle = textView4;
        this.messageHeaderTitle = textView5;
        this.messageTagView = messageTagView;
        this.replyPreview = messageViewReplyPreview;
        this.threadStarterHeader = threadStarterMessageHeaderView;
        this.timestamp = textView6;
    }

    public static AutomodSystemMessageViewBinding bind(View view) {
        View a;
        int i = C4254R.C4256id.accessories_view;
        MessageAccessoriesView messageAccessoriesView = (MessageAccessoriesView) C13922a.m2313a(view, i);
        if (messageAccessoriesView != null) {
            i = C4254R.C4256id.author_avatar;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13922a.m2313a(view, i);
            if (simpleDraweeView != null) {
                i = C4254R.C4256id.author_name;
                TextView textView = (TextView) C13922a.m2313a(view, i);
                if (textView != null) {
                    i = C4254R.C4256id.automod_message_channel;
                    TextView textView2 = (TextView) C13922a.m2313a(view, i);
                    if (textView2 != null) {
                        i = C4254R.C4256id.automod_message_context_header;
                        TextView textView3 = (TextView) C13922a.m2313a(view, i);
                        if (textView3 != null) {
                            i = C4254R.C4256id.guild_communication_disabled_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C13922a.m2313a(view, i);
                            if (simpleDraweeView2 != null) {
                                i = C4254R.C4256id.message_end_guideline;
                                Guideline guideline = (Guideline) C13922a.m2313a(view, i);
                                if (guideline != null) {
                                    i = C4254R.C4256id.message_header_barrier;
                                    Barrier barrier = (Barrier) C13922a.m2313a(view, i);
                                    if (!(barrier == null || (a = C13922a.m2313a(view, (i = C4254R.C4256id.message_header_divider))) == null)) {
                                        i = C4254R.C4256id.message_header_subtitle;
                                        TextView textView4 = (TextView) C13922a.m2313a(view, i);
                                        if (textView4 != null) {
                                            i = C4254R.C4256id.message_header_title;
                                            TextView textView5 = (TextView) C13922a.m2313a(view, i);
                                            if (textView5 != null) {
                                                i = C4254R.C4256id.message_tag_view;
                                                MessageTagView messageTagView = (MessageTagView) C13922a.m2313a(view, i);
                                                if (messageTagView != null) {
                                                    i = C4254R.C4256id.reply_preview;
                                                    MessageViewReplyPreview messageViewReplyPreview = (MessageViewReplyPreview) C13922a.m2313a(view, i);
                                                    if (messageViewReplyPreview != null) {
                                                        i = C4254R.C4256id.thread_starter_header;
                                                        ThreadStarterMessageHeaderView threadStarterMessageHeaderView = (ThreadStarterMessageHeaderView) C13922a.m2313a(view, i);
                                                        if (threadStarterMessageHeaderView != null) {
                                                            i = C4254R.C4256id.timestamp;
                                                            TextView textView6 = (TextView) C13922a.m2313a(view, i);
                                                            if (textView6 != null) {
                                                                return new AutomodSystemMessageViewBinding(view, messageAccessoriesView, simpleDraweeView, textView, textView2, textView3, simpleDraweeView2, guideline, barrier, a, textView4, textView5, messageTagView, messageViewReplyPreview, threadStarterMessageHeaderView, textView6);
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

    public static AutomodSystemMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4254R.layout.automod_system_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
