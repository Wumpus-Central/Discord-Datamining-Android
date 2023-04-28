package com.henninghall.date_picker;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import fj.C7349a;

/* loaded from: classes6.dex */
public class DatePickerModule extends ReactContextBaseJavaModule {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.henninghall.date_picker.DatePickerModule$a */
    /* loaded from: classes6.dex */
    public class DialogInterface$OnCancelListenerC5878a implements DialogInterface.OnCancelListener {

        /* renamed from: k */
        final /* synthetic */ Callback f11688k;

        DialogInterface$OnCancelListenerC5878a(Callback callback) {
            this.f11688k = callback;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f11688k.invoke(new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.henninghall.date_picker.DatePickerModule$b */
    /* loaded from: classes6.dex */
    public class DialogInterface$OnClickListenerC5879b implements DialogInterface.OnClickListener {

        /* renamed from: k */
        final /* synthetic */ Callback f11690k;

        DialogInterface$OnClickListenerC5879b(Callback callback) {
            this.f11690k = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f11690k.invoke(new Object[0]);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.henninghall.date_picker.DatePickerModule$c */
    /* loaded from: classes6.dex */
    public class DialogInterface$OnClickListenerC5880c implements DialogInterface.OnClickListener {

        /* renamed from: k */
        final /* synthetic */ Callback f11692k;

        /* renamed from: l */
        final /* synthetic */ C5893h f11693l;

        DialogInterface$OnClickListenerC5880c(Callback callback, C5893h hVar) {
            this.f11692k = callback;
            this.f11693l = hVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f11692k.invoke(this.f11693l.getDate());
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DatePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C7349a.m22849b(reactApplicationContext, false);
    }

    private AlertDialog createDialog(ReadableMap readableMap, C5893h hVar, Callback callback, Callback callback2) {
        String string = readableMap.getString("title");
        String string2 = readableMap.getString("confirmText");
        return new AlertDialog.Builder(C5882b.f11696a.getCurrentActivity()).setTitle(string).setCancelable(true).setView(withTopMargin(hVar)).setPositiveButton(string2, new DialogInterface$OnClickListenerC5880c(callback, hVar)).setNegativeButton(readableMap.getString("cancelText"), new DialogInterface$OnClickListenerC5879b(callback2)).setOnCancelListener(new DialogInterface$OnCancelListenerC5878a(callback2)).create();
    }

    private C5893h createPicker(ReadableMap readableMap) {
        C5893h hVar = new C5893h(new LinearLayout.LayoutParams(-1, C5899l.m26914l(180)));
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(nextKey);
            if (!nextKey.equals("style")) {
                try {
                    hVar.m26958d(nextKey, dynamic);
                } catch (Exception unused) {
                }
            }
        }
        hVar.m26959c();
        return hVar;
    }

    private View withTopMargin(C5893h hVar) {
        LinearLayout linearLayout = new LinearLayout(C5882b.f11696a);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(hVar);
        linearLayout.setPadding(0, C5899l.m26914l(20), 0, 0);
        return linearLayout;
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNDatePicker";
    }

    @ReactMethod
    public void openPicker(ReadableMap readableMap, Callback callback, Callback callback2) {
        createDialog(readableMap, createPicker(readableMap), callback, callback2).show();
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}
