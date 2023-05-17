package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.voicemessages.AudioWaveView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes5.dex */
public final class AudioPlayerViewBinding {
    public final SimpleDraweeView button;
    public final View buttonContainer;
    public final LinearLayout playerContainer;
    public final ProgressBar progress;
    private final View rootView;
    public final SimpleDraweeSpanTextView text;
    public final AttachmentUploadOverlayView uploadOverlay;
    public final LinearLayout uploadOverlayBackground;
    public final AudioWaveView wave;
    public final View wipe;

    private AudioPlayerViewBinding(View view, SimpleDraweeView simpleDraweeView, View view2, LinearLayout linearLayout, ProgressBar progressBar, SimpleDraweeSpanTextView simpleDraweeSpanTextView, AttachmentUploadOverlayView attachmentUploadOverlayView, LinearLayout linearLayout2, AudioWaveView audioWaveView, View view3) {
        this.rootView = view;
        this.button = simpleDraweeView;
        this.buttonContainer = view2;
        this.playerContainer = linearLayout;
        this.progress = progressBar;
        this.text = simpleDraweeSpanTextView;
        this.uploadOverlay = attachmentUploadOverlayView;
        this.uploadOverlayBackground = linearLayout2;
        this.wave = audioWaveView;
        this.wipe = view3;
    }

    public static AudioPlayerViewBinding bind(View view) {
        View a10;
        View a11;
        int i10 = R.id.button;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (!(simpleDraweeView == null || (a10 = a.a(view, (i10 = R.id.button_container))) == null)) {
            i10 = R.id.player_container;
            LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
            if (linearLayout != null) {
                i10 = R.id.progress;
                ProgressBar progressBar = (ProgressBar) a.a(view, i10);
                if (progressBar != null) {
                    i10 = R.id.text;
                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.a(view, i10);
                    if (simpleDraweeSpanTextView != null) {
                        i10 = R.id.upload_overlay;
                        AttachmentUploadOverlayView attachmentUploadOverlayView = (AttachmentUploadOverlayView) a.a(view, i10);
                        if (attachmentUploadOverlayView != null) {
                            i10 = R.id.upload_overlay_background;
                            LinearLayout linearLayout2 = (LinearLayout) a.a(view, i10);
                            if (linearLayout2 != null) {
                                i10 = R.id.wave;
                                AudioWaveView audioWaveView = (AudioWaveView) a.a(view, i10);
                                if (!(audioWaveView == null || (a11 = a.a(view, (i10 = R.id.wipe))) == null)) {
                                    return new AudioPlayerViewBinding(view, simpleDraweeView, a10, linearLayout, progressBar, simpleDraweeSpanTextView, attachmentUploadOverlayView, linearLayout2, audioWaveView, a11);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AudioPlayerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.audio_player_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
