package com.discord.p048qr.scanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.budiyev.android.codescanner.CodeScannerView;
import com.discord.p048qr.scanner.C4638R;
import p412x1.C13922a;

/* renamed from: com.discord.qr.scanner.databinding.QrScannerBinding */
/* loaded from: classes3.dex */
public final class QrScannerBinding {
    public final CodeScannerView qrScanner;
    private final View rootView;

    private QrScannerBinding(View view, CodeScannerView codeScannerView) {
        this.rootView = view;
        this.qrScanner = codeScannerView;
    }

    public static QrScannerBinding bind(View view) {
        int i = C4638R.C4640id.qr_scanner;
        CodeScannerView codeScannerView = (CodeScannerView) C13922a.m2313a(view, i);
        if (codeScannerView != null) {
            return new QrScannerBinding(view, codeScannerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static QrScannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4638R.layout.qr_scanner, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
