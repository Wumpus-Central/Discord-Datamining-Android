package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import v0.a;


public final class AutoModerationNotificationEmbedViewBinding {
    public final LinearLayout actions;
    public final DCDButton actionsButton;
    public final TextView body;
    public final DCDButton feedbackButton;
    public final TextView header;
    private final View rootView;
    public final ImageView separatorDot;
    public final ImageView subtitleDivider;
    public final TextView subtitleSeverity;
    public final TextView subtitleStartTime;
    public final ImageView warningIcon;

    private AutoModerationNotificationEmbedViewBinding(View view, LinearLayout linearLayout, DCDButton dCDButton, TextView textView, DCDButton dCDButton2, TextView textView2, ImageView imageView, ImageView imageView2, TextView textView3, TextView textView4, ImageView imageView3) {
        this.rootView = view;
        this.actions = linearLayout;
        this.actionsButton = dCDButton;
        this.body = textView;
        this.feedbackButton = dCDButton2;
        this.header = textView2;
        this.separatorDot = imageView;
        this.subtitleDivider = imageView2;
        this.subtitleSeverity = textView3;
        this.subtitleStartTime = textView4;
        this.warningIcon = imageView3;
    }

    public static AutoModerationNotificationEmbedViewBinding bind(View view) {
        int i10 = R.id.actions;
        LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
        if (linearLayout != null) {
            i10 = R.id.actions_button;
            DCDButton dCDButton = (DCDButton) a.a(view, i10);
            if (dCDButton != null) {
                i10 = R.id.body;
                TextView textView = (TextView) a.a(view, i10);
                if (textView != null) {
                    i10 = R.id.feedback_button;
                    DCDButton dCDButton2 = (DCDButton) a.a(view, i10);
                    if (dCDButton2 != null) {
                        i10 = R.id.header;
                        TextView textView2 = (TextView) a.a(view, i10);
                        if (textView2 != null) {
                            i10 = R.id.separator_dot;
                            ImageView imageView = (ImageView) a.a(view, i10);
                            if (imageView != null) {
                                i10 = R.id.subtitle_divider;
                                ImageView imageView2 = (ImageView) a.a(view, i10);
                                if (imageView2 != null) {
                                    i10 = R.id.subtitle_severity;
                                    TextView textView3 = (TextView) a.a(view, i10);
                                    if (textView3 != null) {
                                        i10 = R.id.subtitle_start_time;
                                        TextView textView4 = (TextView) a.a(view, i10);
                                        if (textView4 != null) {
                                            i10 = R.id.warning_icon;
                                            ImageView imageView3 = (ImageView) a.a(view, i10);
                                            if (imageView3 != null) {
                                                return new AutoModerationNotificationEmbedViewBinding(view, linearLayout, dCDButton, textView, dCDButton2, textView2, imageView, imageView2, textView3, textView4, imageView3);
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

    public static AutoModerationNotificationEmbedViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.auto_moderation_notification_embed_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
