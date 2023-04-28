package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import com.discord.chat.C4254R;
import com.facebook.drawee.view.SimpleDraweeView;
import p412x1.C13922a;

/* loaded from: classes4.dex */
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
        View a;
        int i = C4254R.C4256id.barrier;
        Barrier barrier = (Barrier) C13922a.m2313a(view, i);
        if (!(barrier == null || (a = C13922a.m2313a(view, (i = C4254R.C4256id.progress_bar))) == null)) {
            i = C4254R.C4256id.progress_bg;
            FrameLayout frameLayout = (FrameLayout) C13922a.m2313a(view, i);
            if (frameLayout != null) {
                i = C4254R.C4256id.progress_cancel;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13922a.m2313a(view, i);
                if (simpleDraweeView != null) {
                    i = C4254R.C4256id.progress_file_image;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C13922a.m2313a(view, i);
                    if (simpleDraweeView2 != null) {
                        i = C4254R.C4256id.progress_subtext;
                        TextView textView = (TextView) C13922a.m2313a(view, i);
                        if (textView != null) {
                            i = C4254R.C4256id.progress_text;
                            TextView textView2 = (TextView) C13922a.m2313a(view, i);
                            if (textView2 != null) {
                                return new UploadProgressViewBinding(view, barrier, a, frameLayout, simpleDraweeView, simpleDraweeView2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static UploadProgressViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4254R.layout.upload_progress_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
