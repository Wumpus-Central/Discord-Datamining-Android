package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.C4254R;
import com.discord.chat.presentation.message.view.AltTextButtonView;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.MediaView;
import com.discord.chat.presentation.message.view.SpoilerView;
import p412x1.C13922a;

/* loaded from: classes4.dex */
public final class VideoAttachmentViewBinding {
    public final MediaView mediaView;
    public final TextView mediaViewAltText;
    public final AltTextButtonView mediaViewAltTextButton;
    private final View rootView;
    public final SpoilerView spoiler;
    public final AttachmentUploadOverlayView uploadOverlay;

    private VideoAttachmentViewBinding(View view, MediaView mediaView, TextView textView, AltTextButtonView altTextButtonView, SpoilerView spoilerView, AttachmentUploadOverlayView attachmentUploadOverlayView) {
        this.rootView = view;
        this.mediaView = mediaView;
        this.mediaViewAltText = textView;
        this.mediaViewAltTextButton = altTextButtonView;
        this.spoiler = spoilerView;
        this.uploadOverlay = attachmentUploadOverlayView;
    }

    public static VideoAttachmentViewBinding bind(View view) {
        int i = C4254R.C4256id.media_view;
        MediaView mediaView = (MediaView) C13922a.m2313a(view, i);
        if (mediaView != null) {
            i = C4254R.C4256id.media_view_alt_text;
            TextView textView = (TextView) C13922a.m2313a(view, i);
            if (textView != null) {
                i = C4254R.C4256id.media_view_alt_text_button;
                AltTextButtonView altTextButtonView = (AltTextButtonView) C13922a.m2313a(view, i);
                if (altTextButtonView != null) {
                    i = C4254R.C4256id.spoiler;
                    SpoilerView spoilerView = (SpoilerView) C13922a.m2313a(view, i);
                    if (spoilerView != null) {
                        i = C4254R.C4256id.upload_overlay;
                        AttachmentUploadOverlayView attachmentUploadOverlayView = (AttachmentUploadOverlayView) C13922a.m2313a(view, i);
                        if (attachmentUploadOverlayView != null) {
                            return new VideoAttachmentViewBinding(view, mediaView, textView, altTextButtonView, spoilerView, attachmentUploadOverlayView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static VideoAttachmentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4254R.layout.video_attachment_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
