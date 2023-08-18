package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import u0.a;


public final class AttachmentUploadOverlayViewBinding {
    private final View rootView;
    public final SimpleDraweeView uploadCancel;
    public final SimpleDraweeView uploadComplete;
    public final MaterialCardView uploadCompleteBackground;
    public final ConstraintLayout uploadCompleteLayout;
    public final CircularProgressIndicator uploadProgress;
    public final View uploadProgressBackground;
    public final ConstraintLayout uploadProgressLayout;

    private AttachmentUploadOverlayViewBinding(View view, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, MaterialCardView materialCardView, ConstraintLayout constraintLayout, CircularProgressIndicator circularProgressIndicator, View view2, ConstraintLayout constraintLayout2) {
        this.rootView = view;
        this.uploadCancel = simpleDraweeView;
        this.uploadComplete = simpleDraweeView2;
        this.uploadCompleteBackground = materialCardView;
        this.uploadCompleteLayout = constraintLayout;
        this.uploadProgress = circularProgressIndicator;
        this.uploadProgressBackground = view2;
        this.uploadProgressLayout = constraintLayout2;
    }

    public static AttachmentUploadOverlayViewBinding bind(View view) {
        View a10;
        int i10 = R.id.upload_cancel;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.upload_complete;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
            if (simpleDraweeView2 != null) {
                i10 = R.id.upload_complete_background;
                MaterialCardView materialCardView = (MaterialCardView) a.a(view, i10);
                if (materialCardView != null) {
                    i10 = R.id.upload_complete_layout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, i10);
                    if (constraintLayout != null) {
                        i10 = R.id.upload_progress;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) a.a(view, i10);
                        if (!(circularProgressIndicator == null || (a10 = a.a(view, (i10 = R.id.upload_progress_background))) == null)) {
                            i10 = R.id.upload_progress_layout;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) a.a(view, i10);
                            if (constraintLayout2 != null) {
                                return new AttachmentUploadOverlayViewBinding(view, simpleDraweeView, simpleDraweeView2, materialCardView, constraintLayout, circularProgressIndicator, a10, constraintLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AttachmentUploadOverlayViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.attachment_upload_overlay_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
