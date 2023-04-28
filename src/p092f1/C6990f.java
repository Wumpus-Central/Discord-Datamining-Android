package p092f1;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.util.C2513d;
import androidx.core.util.C2517g;
import androidx.core.view.C2733w0;
import androidx.core.view.ContentInfoCompat;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: f1.f */
/* loaded from: classes.dex */
public final class C6990f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f1.f$a */
    /* loaded from: classes.dex */
    public class C6991a extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ AbstractC6993c f15263a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6991a(InputConnection inputConnection, boolean z, AbstractC6993c cVar) {
            super(inputConnection, z);
            this.f15263a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f15263a.mo23717a(C6998k.m23707f(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f1.f$b */
    /* loaded from: classes.dex */
    public class C6992b extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ AbstractC6993c f15264a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6992b(InputConnection inputConnection, boolean z, AbstractC6993c cVar) {
            super(inputConnection, z);
            this.f15264a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C6990f.m23719e(str, bundle, this.f15264a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: f1.f$c */
    /* loaded from: classes.dex */
    public interface AbstractC6993c {
        /* renamed from: a */
        boolean mo23717a(C6998k kVar, int i, Bundle bundle);
    }

    /* renamed from: b */
    private static AbstractC6993c m23722b(final View view) {
        C2517g.m37588g(view);
        return new AbstractC6993c() { // from class: f1.e
            @Override // p092f1.C6990f.AbstractC6993c
            /* renamed from: a */
            public final boolean mo23717a(C6998k kVar, int i, Bundle bundle) {
                boolean f;
                f = C6990f.m23718f(view, kVar, i, bundle);
                return f;
            }
        };
    }

    /* renamed from: c */
    public static InputConnection m23721c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return m23720d(inputConnection, editorInfo, m23722b(view));
    }

    @Deprecated
    /* renamed from: d */
    public static InputConnection m23720d(InputConnection inputConnection, EditorInfo editorInfo, AbstractC6993c cVar) {
        C2513d.m37598d(inputConnection, "inputConnection must be non-null");
        C2513d.m37598d(editorInfo, "editorInfo must be non-null");
        C2513d.m37598d(cVar, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new C6991a(inputConnection, false, cVar);
        }
        if (C6987d.m23732a(editorInfo).length == 0) {
            return inputConnection;
        }
        return new C6992b(inputConnection, false, cVar);
    }

    /* renamed from: e */
    static boolean m23719e(String str, Bundle bundle, AbstractC6993c cVar) {
        boolean z;
        String str2;
        Throwable th2;
        ResultReceiver resultReceiver;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z2 = false;
        z2 = false;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z = false;
        } else if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            return false;
        } else {
            z = true;
        }
        if (z) {
            str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        } else {
            str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(str2);
            if (z) {
                str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            } else {
                str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            }
            try {
                Uri uri = (Uri) bundle.getParcelable(str3);
                if (z) {
                    str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                } else {
                    str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                }
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
                if (z) {
                    str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                } else {
                    str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                }
                Uri uri2 = (Uri) bundle.getParcelable(str5);
                if (z) {
                    str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                } else {
                    str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                }
                int i = bundle.getInt(str6);
                if (z) {
                    str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                } else {
                    str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                }
                Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
                if (!(uri == null || clipDescription == null)) {
                    z2 = cVar.mo23717a(new C6998k(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver != null) {
                    int i2 = z2 ? 1 : 0;
                    int i3 = z2 ? 1 : 0;
                    int i4 = z2 ? 1 : 0;
                    int i5 = z2 ? 1 : 0;
                    resultReceiver.send(i2, null);
                }
                return z2;
            } catch (Throwable th3) {
                th2 = th3;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            resultReceiver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ boolean m23718f(View view, C6998k kVar, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                kVar.m23709d();
                InputContentInfo inputContentInfo = (InputContentInfo) kVar.m23708e();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        if (C2733w0.m37010g0(view, new ContentInfoCompat.C2521a(new ClipData(kVar.m23711b(), new ClipData.Item(kVar.m23712a())), 2).m37561e(kVar.m23710c()).m37563c(bundle).m37565a()) == null) {
            return true;
        }
        return false;
    }
}
