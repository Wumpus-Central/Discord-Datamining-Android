package com.discord.qr.scanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.budiyev.android.codescanner.CodeScannerView;
import com.discord.qr.scanner.R;
import x1.a;

/* loaded from: classes4.dex */
public final class QrScannerBinding {
    public final CodeScannerView qrScanner;
    private final View rootView;

    private QrScannerBinding(View view, CodeScannerView codeScannerView) {
        this.rootView = view;
        this.qrScanner = codeScannerView;
    }

    public static QrScannerBinding bind(View view) {
        int i10 = R.id.qr_scanner;
        CodeScannerView codeScannerView = (CodeScannerView) a.a(view, i10);
        if (codeScannerView != null) {
            return new QrScannerBinding(view, codeScannerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static QrScannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.qr_scanner, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
