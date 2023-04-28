package com.discord.notifications.fcm.utils;

import com.discord.logging.Log;
import com.discord.notifications.fcm.utils.FCMTokenHelper;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p064db.AbstractC6424d;
import p064db.AbstractC6425e;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¨\u0006\u000b"}, m15073d2 = {"Lcom/discord/notifications/fcm/utils/FCMTokenHelper;", "", "", "", "logError", "Lkotlin/Function1;", "", "onToken", "getToken", "<init>", "()V", "notification_fcm_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FCMTokenHelper {
    public static final FCMTokenHelper INSTANCE = new FCMTokenHelper();

    private FCMTokenHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$0(Exception e) {
        C9971q.m14633g(e, "e");
        INSTANCE.logError(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$1(Function1 onToken, Task task) {
        C9971q.m14633g(onToken, "$onToken");
        C9971q.m14633g(task, "task");
        try {
            String str = (String) task.mo28862k();
            if (str == null || !task.mo28858o()) {
                Exception j = task.mo28863j();
                if (j != null) {
                    INSTANCE.logError(j);
                }
            } else {
                onToken.invoke(str);
            }
        } catch (Exception e) {
            INSTANCE.logError(e);
        }
    }

    private final void logError(Throwable th2) {
        Log log = Log.INSTANCE;
        String simpleName = th2.getClass().getSimpleName();
        C9971q.m14634f(simpleName, "javaClass.simpleName");
        log.m32175w(simpleName, "Fetching FCM registration token failed", th2);
    }

    public final void getToken(final Function1<? super String, Unit> onToken) {
        C9971q.m14633g(onToken, "onToken");
        try {
            FirebaseMessaging.m27266l().m27263o().mo28869d(new AbstractC6425e() { // from class: k3.a
                @Override // p064db.AbstractC6425e
                public final void onFailure(Exception exc) {
                    FCMTokenHelper.getToken$lambda$0(exc);
                }
            }).mo28871b(new AbstractC6424d() { // from class: k3.b
                @Override // p064db.AbstractC6424d
                /* renamed from: a */
                public final void mo4743a(Task task) {
                    FCMTokenHelper.getToken$lambda$1(Function1.this, task);
                }
            });
        } catch (Exception e) {
            logError(e);
        }
    }
}
