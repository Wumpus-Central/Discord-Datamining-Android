package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.discord.chat.C3147R;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
public final class MediaViewBinding {
    public final SimpleDraweeView inlineMediaGifIndicator;
    public final SimpleDraweeView inlineMediaImagePreview;
    public final ProgressBar inlineMediaLoadingIndicator;
    public final ImageView inlineMediaPlayButton;
    public final SimpleDraweeView inlineMediaVolumeToggle;
    private final View rootView;

    private MediaViewBinding(View view, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, ProgressBar progressBar, ImageView imageView, SimpleDraweeView simpleDraweeView3) {
        this.rootView = view;
        this.inlineMediaGifIndicator = simpleDraweeView;
        this.inlineMediaImagePreview = simpleDraweeView2;
        this.inlineMediaLoadingIndicator = progressBar;
        this.inlineMediaPlayButton = imageView;
        this.inlineMediaVolumeToggle = simpleDraweeView3;
    }

    public static MediaViewBinding bind(View view) {
        int i = C3147R.C3149id.inline_media_gif_indicator;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
        if (simpleDraweeView != null) {
            i = C3147R.C3149id.inline_media_image_preview;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C13836a.m2313a(view, i);
            if (simpleDraweeView2 != null) {
                i = C3147R.C3149id.inline_media_loading_indicator;
                ProgressBar progressBar = (ProgressBar) C13836a.m2313a(view, i);
                if (progressBar != null) {
                    i = C3147R.C3149id.inline_media_play_button;
                    ImageView imageView = (ImageView) C13836a.m2313a(view, i);
                    if (imageView != null) {
                        i = C3147R.C3149id.inline_media_volume_toggle;
                        SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) C13836a.m2313a(view, i);
                        if (simpleDraweeView3 != null) {
                            return new MediaViewBinding(view, simpleDraweeView, simpleDraweeView2, progressBar, imageView, simpleDraweeView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MediaViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.media_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
