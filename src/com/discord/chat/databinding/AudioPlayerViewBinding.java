package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.discord.chat.C3147R;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.voicemessages.AudioWaveView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
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
        View a;
        View a2;
        int i = C3147R.C3149id.button;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
        if (!(simpleDraweeView == null || (a = C13836a.m2313a(view, (i = C3147R.C3149id.button_container))) == null)) {
            i = C3147R.C3149id.player_container;
            LinearLayout linearLayout = (LinearLayout) C13836a.m2313a(view, i);
            if (linearLayout != null) {
                i = C3147R.C3149id.progress;
                ProgressBar progressBar = (ProgressBar) C13836a.m2313a(view, i);
                if (progressBar != null) {
                    i = C3147R.C3149id.text;
                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C13836a.m2313a(view, i);
                    if (simpleDraweeSpanTextView != null) {
                        i = C3147R.C3149id.upload_overlay;
                        AttachmentUploadOverlayView attachmentUploadOverlayView = (AttachmentUploadOverlayView) C13836a.m2313a(view, i);
                        if (attachmentUploadOverlayView != null) {
                            i = C3147R.C3149id.upload_overlay_background;
                            LinearLayout linearLayout2 = (LinearLayout) C13836a.m2313a(view, i);
                            if (linearLayout2 != null) {
                                i = C3147R.C3149id.wave;
                                AudioWaveView audioWaveView = (AudioWaveView) C13836a.m2313a(view, i);
                                if (!(audioWaveView == null || (a2 = C13836a.m2313a(view, (i = C3147R.C3149id.wipe))) == null)) {
                                    return new AudioPlayerViewBinding(view, simpleDraweeView, a, linearLayout, progressBar, simpleDraweeSpanTextView, attachmentUploadOverlayView, linearLayout2, audioWaveView, a2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static AudioPlayerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.audio_player_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
