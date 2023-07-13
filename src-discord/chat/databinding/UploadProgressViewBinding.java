package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import v0.a;


public final class UploadProgressViewBinding {
    public final Barrier barrier;
    public final View progressBar;
    public final FrameLayout progressBg;
    public final SimpleDraweeView progressCancel;
    public final SimpleDraweeView progressFileImage;
    public final TextView progressSubtext;
    public final TextView progressText;
    private final View rootView;

    private UploadProgressViewBinding(View view, Barrier barrier, View view2, FrameLayout frameLayout, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, TextView textView, TextView textView2) {
        this.rootView = view;
        this.barrier = barrier;
        this.progressBar = view2;
        this.progressBg = frameLayout;
        this.progressCancel = simpleDraweeView;
        this.progressFileImage = simpleDraweeView2;
        this.progressSubtext = textView;
        this.progressText = textView2;
    }

    public static UploadProgressViewBinding bind(View view) {
        View a10;
        int i10 = R.id.barrier;
        Barrier barrier = (Barrier) a.a(view, i10);
        if (!(barrier == null || (a10 = a.a(view, (i10 = R.id.progress_bar))) == null)) {
            i10 = R.id.progress_bg;
            FrameLayout frameLayout = (FrameLayout) a.a(view, i10);
            if (frameLayout != null) {
                i10 = R.id.progress_cancel;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
                if (simpleDraweeView != null) {
                    i10 = R.id.progress_file_image;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                    if (simpleDraweeView2 != null) {
                        i10 = R.id.progress_subtext;
                        TextView textView = (TextView) a.a(view, i10);
                        if (textView != null) {
                            i10 = R.id.progress_text;
                            TextView textView2 = (TextView) a.a(view, i10);
                            if (textView2 != null) {
                                return new UploadProgressViewBinding(view, barrier, a10, frameLayout, simpleDraweeView, simpleDraweeView2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static UploadProgressViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.upload_progress_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
