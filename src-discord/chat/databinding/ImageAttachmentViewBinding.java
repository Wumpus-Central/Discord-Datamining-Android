package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.AltTextButtonView;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes5.dex */
public final class ImageAttachmentViewBinding {
    public final SimpleDraweeView image;
    public final TextView imageAltText;
    public final AltTextButtonView mediaViewAltTextButton;
    private final View rootView;
    public final SpoilerView spoiler;
    public final AttachmentUploadOverlayView uploadOverlay;

    private ImageAttachmentViewBinding(View view, SimpleDraweeView simpleDraweeView, TextView textView, AltTextButtonView altTextButtonView, SpoilerView spoilerView, AttachmentUploadOverlayView attachmentUploadOverlayView) {
        this.rootView = view;
        this.image = simpleDraweeView;
        this.imageAltText = textView;
        this.mediaViewAltTextButton = altTextButtonView;
        this.spoiler = spoilerView;
        this.uploadOverlay = attachmentUploadOverlayView;
    }

    public static ImageAttachmentViewBinding bind(View view) {
        int i10 = R.id.image;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.image_alt_text;
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
                            return new ImageAttachmentViewBinding(view, simpleDraweeView, textView, altTextButtonView, spoilerView, attachmentUploadOverlayView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ImageAttachmentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.image_attachment_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
