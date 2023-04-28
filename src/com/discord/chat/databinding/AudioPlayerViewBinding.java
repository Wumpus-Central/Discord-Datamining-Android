package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.discord.chat.C4254R;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.voicemessages.AudioWaveView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import p412x1.C13922a;

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
        int i = C4254R.C4256id.button;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13922a.m2313a(view, i);
        if (!(simpleDraweeView == null || (a = C13922a.m2313a(view, (i = C4254R.C4256id.button_container))) == null)) {
            i = C4254R.C4256id.player_container;
            LinearLayout linearLayout = (LinearLayout) C13922a.m2313a(view, i);
            if (linearLayout != null) {
                i = C4254R.C4256id.progress;
                ProgressBar progressBar = (ProgressBar) C13922a.m2313a(view, i);
                if (progressBar != null) {
                    i = C4254R.C4256id.text;
                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C13922a.m2313a(view, i);
                    if (simpleDraweeSpanTextView != null) {
                        i = C4254R.C4256id.upload_overlay;
                        AttachmentUploadOverlayView attachmentUploadOverlayView = (AttachmentUploadOverlayView) C13922a.m2313a(view, i);
                        if (attachmentUploadOverlayView != null) {
                            i = C4254R.C4256id.upload_overlay_background;
                            LinearLayout linearLayout2 = (LinearLayout) C13922a.m2313a(view, i);
                            if (linearLayout2 != null) {
                                i = C4254R.C4256id.wave;
                                AudioWaveView audioWaveView = (AudioWaveView) C13922a.m2313a(view, i);
                                if (!(audioWaveView == null || (a2 = C13922a.m2313a(view, (i = C4254R.C4256id.wipe))) == null)) {
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
            layoutInflater.inflate(C4254R.layout.audio_player_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
