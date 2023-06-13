package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes8.dex */
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
        int i10 = R.id.file_action_group;
        ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, i10);
        if (constraintLayout != null) {
            i10 = R.id.file_attachment_description;
            TextView textView = (TextView) a.a(view, i10);
            if (textView != null) {
                i10 = R.id.file_attachment_download;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
                if (simpleDraweeView != null) {
                    i10 = R.id.file_attachment_download_icon_barrier;
                    Barrier barrier = (Barrier) a.a(view, i10);
                    if (barrier != null) {
                        i10 = R.id.file_attachment_download_progress_bar;
                        ProgressBar progressBar = (ProgressBar) a.a(view, i10);
                        if (progressBar != null) {
                            i10 = R.id.file_attachment_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                            if (simpleDraweeView2 != null) {
                                i10 = R.id.file_attachment_name;
                                TextView textView2 = (TextView) a.a(view, i10);
                                if (textView2 != null) {
                                    i10 = R.id.spoiler;
                                    SpoilerView spoilerView = (SpoilerView) a.a(view, i10);
                                    if (spoilerView != null) {
                                        i10 = R.id.upload_overlay;
                                        AttachmentUploadOverlayView attachmentUploadOverlayView = (AttachmentUploadOverlayView) a.a(view, i10);
                                        if (attachmentUploadOverlayView != null) {
                                            i10 = R.id.upload_overlay_background;
                                            LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FileAttachmentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.file_attachment_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
