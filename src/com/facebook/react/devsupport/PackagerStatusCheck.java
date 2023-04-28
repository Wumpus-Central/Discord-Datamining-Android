package com.facebook.react.devsupport;

import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p307qj.AbstractC12216d;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public class PackagerStatusCheck {
    private static final int HTTP_CONNECT_TIMEOUT_MS = 5000;
    private static final String PACKAGER_OK_STATUS = "packager-status:running";
    private static final String PACKAGER_STATUS_URL_TEMPLATE = "http://%s/status";
    private final OkHttpClient mClient;

    public PackagerStatusCheck() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.mClient = builder.m9912e(5000L, timeUnit).m9918O(0L, timeUnit).m9917P(0L, timeUnit).m9914c();
    }

    private static String createPackagerStatusURL(String str) {
        return String.format(Locale.US, PACKAGER_STATUS_URL_TEMPLATE, str);
    }

    public void run(String str, final PackagerStatusCallback packagerStatusCallback) {
        this.mClient.mo9954a(new Request.Builder().m9865l(createPackagerStatusURL(str)).m9875b()).mo3413p(new AbstractC12216d() { // from class: com.facebook.react.devsupport.PackagerStatusCheck.1
            @Override // p307qj.AbstractC12216d
            public void onFailure(Call call, IOException iOException) {
                C13925a.m2304H(ReactConstants.TAG, "The packager does not seem to be running as we got an IOException requesting its status: " + iOException.getMessage());
                packagerStatusCallback.onPackagerStatusFetched(false);
            }

            @Override // p307qj.AbstractC12216d
            public void onResponse(Call call, Response response) {
                if (!response.m9847X()) {
                    C13925a.m2288j(ReactConstants.TAG, "Got non-success http code from packager when requesting status: " + response.m9839l());
                    packagerStatusCallback.onPackagerStatusFetched(false);
                    return;
                }
                ResponseBody b = response.m9845b();
                if (b == null) {
                    C13925a.m2288j(ReactConstants.TAG, "Got null body response from packager when requesting status");
                    packagerStatusCallback.onPackagerStatusFetched(false);
                    return;
                }
                String string = b.string();
                if (!PackagerStatusCheck.PACKAGER_OK_STATUS.equals(string)) {
                    C13925a.m2288j(ReactConstants.TAG, "Got unexpected response from packager when requesting status: " + string);
                    packagerStatusCallback.onPackagerStatusFetched(false);
                    return;
                }
                packagerStatusCallback.onPackagerStatusFetched(true);
            }
        });
    }

    public PackagerStatusCheck(OkHttpClient okHttpClient) {
        this.mClient = okHttpClient;
    }
}
