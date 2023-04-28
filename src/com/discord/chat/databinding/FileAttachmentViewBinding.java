package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.C3147R;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
public final class FileAttachmentViewBinding {
    public final ConstraintLayout fileActionGroup;
    public final TextView fileAttachmentDescription;
    public final SimpleDraweeView fileAttachmentDownload;
    public final Barrier fileAttachmentDownloadIconBarrier;
    public final ProgressBar fileAttachmentDownloadProgressBar;
    public final SimpleDraweeView fileAttachmentIcon;
    public final TextView fileAttachmentName;
    private final View rootView;
    public final SpoilerView spoiler;
    public final AttachmentUploadOverlayView uploadOverlay;
    public final LinearLayout uploadOverlayBackground;

    private FileAttachmentViewBinding(View view, ConstraintLayout constraintLayout, TextView textView, SimpleDraweeView simpleDraweeView, Barrier barrier, ProgressBar progressBar, SimpleDraweeView simpleDraweeView2, TextView textView2, SpoilerView spoilerView, AttachmentUploadOverlayView attachmentUploadOverlayView, LinearLayout linearLayout) {
        this.rootView = view;
        this.fileActionGroup = constraintLayout;
        this.fileAttachmentDescription = textView;
        this.fileAttachmentDownload = simpleDraweeView;
        this.fileAttachmentDownloadIconBarrier = barrier;
        this.fileAttachmentDownloadProgressBar = progressBar;
        this.fileAttachmentIcon = simpleDraweeView2;
        this.fileAttachmentName = textView2;
        this.spoiler = spoilerView;
        this.uploadOverlay = attachmentUploadOverlayView;
        this.uploadOverlayBackground = linearLayout;
    }

    public static FileAttachmentViewBinding bind(View view) {
        int i = C3147R.C3149id.file_action_group;
        ConstraintLayout constraintLayout = (ConstraintLayout) C13836a.m2313a(view, i);
        if (constraintLayout != null) {
            i = C3147R.C3149id.file_attachment_description;
            TextView textView = (TextView) C13836a.m2313a(view, i);
            if (textView != null) {
                i = C3147R.C3149id.file_attachment_download;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
                if (simpleDraweeView != null) {
                    i = C3147R.C3149id.file_attachment_download_icon_barrier;
                    Barrier barrier = (Barrier) C13836a.m2313a(view, i);
                    if (barrier != null) {
                        i = C3147R.C3149id.file_attachment_download_progress_bar;
                        ProgressBar progressBar = (ProgressBar) C13836a.m2313a(view, i);
                        if (progressBar != null) {
                            i = C3147R.C3149id.file_attachment_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C13836a.m2313a(view, i);
                            if (simpleDraweeView2 != null) {
                                i = C3147R.C3149id.file_attachment_name;
                                TextView textView2 = (TextView) C13836a.m2313a(view, i);
                                if (textView2 != null) {
                                    i = C3147R.C3149id.spoiler;
                                    SpoilerView spoilerView = (SpoilerView) C13836a.m2313a(view, i);
                                    if (spoilerView != null) {
                                        i = C3147R.C3149id.upload_overlay;
                                        AttachmentUploadOverlayView attachmentUploadOverlayView = (AttachmentUploadOverlayView) C13836a.m2313a(view, i);
                                        if (attachmentUploadOverlayView != null) {
                                            i = C3147R.C3149id.upload_overlay_background;
                                            LinearLayout linearLayout = (LinearLayout) C13836a.m2313a(view, i);
                                            if (linearLayout != null) {
                                                return new FileAttachmentViewBinding(view, constraintLayout, textView, simpleDraweeView, barrier, progressBar, simpleDraweeView2, textView2, spoilerView, attachmentUploadOverlayView, linearLayout);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FileAttachmentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.file_attachment_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
