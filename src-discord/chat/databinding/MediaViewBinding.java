package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import u0.a;


public final class MediaViewBinding {
    public final ConstraintLayout attachmentTag;
    public final SimpleDraweeView attachmentTagIcon;
    public final TextView attachmentTagText;
    public final SimpleDraweeView inlineMediaGifIndicator;
    public final SimpleDraweeView inlineMediaImagePreview;
    public final ProgressBar inlineMediaLoadingIndicator;
    public final ImageView inlineMediaPlayButton;
    public final SimpleDraweeView inlineMediaVolumeToggle;
    private final View rootView;

    private MediaViewBinding(View view, ConstraintLayout constraintLayout, SimpleDraweeView simpleDraweeView, TextView textView, SimpleDraweeView simpleDraweeView2, SimpleDraweeView simpleDraweeView3, ProgressBar progressBar, ImageView imageView, SimpleDraweeView simpleDraweeView4) {
        this.rootView = view;
        this.attachmentTag = constraintLayout;
        this.attachmentTagIcon = simpleDraweeView;
        this.attachmentTagText = textView;
        this.inlineMediaGifIndicator = simpleDraweeView2;
        this.inlineMediaImagePreview = simpleDraweeView3;
        this.inlineMediaLoadingIndicator = progressBar;
        this.inlineMediaPlayButton = imageView;
        this.inlineMediaVolumeToggle = simpleDraweeView4;
    }

    public static MediaViewBinding bind(View view) {
        int i10 = R.id.attachment_tag;
        ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, i10);
        if (constraintLayout != null) {
            i10 = R.id.attachment_tag_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
            if (simpleDraweeView != null) {
                i10 = R.id.attachment_tag_text;
                TextView textView = (TextView) a.a(view, i10);
                if (textView != null) {
                    i10 = R.id.inline_media_gif_indicator;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                    if (simpleDraweeView2 != null) {
                        i10 = R.id.inline_media_image_preview;
                        SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.a(view, i10);
                        if (simpleDraweeView3 != null) {
                            i10 = R.id.inline_media_loading_indicator;
                            ProgressBar progressBar = (ProgressBar) a.a(view, i10);
                            if (progressBar != null) {
                                i10 = R.id.inline_media_play_button;
                                ImageView imageView = (ImageView) a.a(view, i10);
                                if (imageView != null) {
                                    i10 = R.id.inline_media_volume_toggle;
                                    SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) a.a(view, i10);
                                    if (simpleDraweeView4 != null) {
                                        return new MediaViewBinding(view, constraintLayout, simpleDraweeView, textView, simpleDraweeView2, simpleDraweeView3, progressBar, imageView, simpleDraweeView4);
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

    public static MediaViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.media_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
