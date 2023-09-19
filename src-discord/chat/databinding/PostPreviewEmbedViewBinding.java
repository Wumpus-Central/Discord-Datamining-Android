package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.discord.core.DCDButton;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import u0.a;


public final class PostPreviewEmbedViewBinding {
    public final SimpleDraweeView backgroundImage;
    public final SimpleDraweeView coverImage;
    public final DCDButton coverImageOverlayButton;
    public final DCDButton cta;
    public final SimpleDraweeSpanTextView footer;
    public final View headerDivider;
    public final FrameLayout imageBlurBg;
    private final View rootView;
    public final SpoilerView spoiler;
    public final TextView subtitle;
    public final TextView title;

    private PostPreviewEmbedViewBinding(View view, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, DCDButton dCDButton, DCDButton dCDButton2, SimpleDraweeSpanTextView simpleDraweeSpanTextView, View view2, FrameLayout frameLayout, SpoilerView spoilerView, TextView textView, TextView textView2) {
        this.rootView = view;
        this.backgroundImage = simpleDraweeView;
        this.coverImage = simpleDraweeView2;
        this.coverImageOverlayButton = dCDButton;
        this.cta = dCDButton2;
        this.footer = simpleDraweeSpanTextView;
        this.headerDivider = view2;
        this.imageBlurBg = frameLayout;
        this.spoiler = spoilerView;
        this.subtitle = textView;
        this.title = textView2;
    }

    public static PostPreviewEmbedViewBinding bind(View view) {
        View a10;
        int i10 = R.id.background_image;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.cover_image;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
            if (simpleDraweeView2 != null) {
                i10 = R.id.cover_image_overlay_button;
                DCDButton dCDButton = (DCDButton) a.a(view, i10);
                if (dCDButton != null) {
                    i10 = R.id.cta;
                    DCDButton dCDButton2 = (DCDButton) a.a(view, i10);
                    if (dCDButton2 != null) {
                        i10 = R.id.footer;
                        SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.a(view, i10);
                        if (!(simpleDraweeSpanTextView == null || (a10 = a.a(view, (i10 = R.id.header_divider))) == null)) {
                            i10 = R.id.image_blur_bg;
                            FrameLayout frameLayout = (FrameLayout) a.a(view, i10);
                            if (frameLayout != null) {
                                i10 = R.id.spoiler;
                                SpoilerView spoilerView = (SpoilerView) a.a(view, i10);
                                if (spoilerView != null) {
                                    i10 = R.id.subtitle;
                                    TextView textView = (TextView) a.a(view, i10);
                                    if (textView != null) {
                                        i10 = R.id.title;
                                        TextView textView2 = (TextView) a.a(view, i10);
                                        if (textView2 != null) {
                                            return new PostPreviewEmbedViewBinding(view, simpleDraweeView, simpleDraweeView2, dCDButton, dCDButton2, simpleDraweeSpanTextView, a10, frameLayout, spoilerView, textView, textView2);
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

    public static PostPreviewEmbedViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.post_preview_embed_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
