package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.AltTextButtonView;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.MediaView;
import com.discord.chat.presentation.message.view.SpoilerView;
import v0.a;


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
        int i10 = R.id.media_view;
        MediaView mediaView = (MediaView) a.a(view, i10);
        if (mediaView != null) {
            i10 = R.id.media_view_alt_text;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                i10 = R.id.media_view_alt_text_button;
                AltTextButtonView altTextButtonView = (AltTextButtonView) a.a(view, i10);
                if (altTextButtonView != null) {
                    i10 = R.id.spoiler;
                    SpoilerView spoilerView = (SpoilerView) a.a(view, i10);
                    if (spoilerView != null) {
                        i10 = R.id.upload_overlay;
                        AttachmentUploadOverlayView attachmentUploadOverlayView = (AttachmentUploadOverlayView) a.a(view, i10);
                        if (attachmentUploadOverlayView != null) {
                            return new VideoAttachmentViewBinding(view, mediaView, textView, altTextButtonView, spoilerView, attachmentUploadOverlayView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VideoAttachmentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.video_attachment_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
