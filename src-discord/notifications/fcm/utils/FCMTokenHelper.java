package com.discord.notifications.fcm.utils;

import com.discord.logging.Log;
import com.discord.notifications.fcm.utils.FCMTokenHelper;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import ga.d;
import ga.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¨\u0006\u000b"}, d2 = {"Lcom/discord/notifications/fcm/utils/FCMTokenHelper;", "", "", "", "logError", "Lkotlin/Function1;", "", "onToken", "getToken", "<init>", "()V", "notification_fcm_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FCMTokenHelper {
    public static final FCMTokenHelper INSTANCE = new FCMTokenHelper();

    private FCMTokenHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$0(Exception e10) {
        q.g(e10, "e");
        INSTANCE.logError(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$1(Function1 onToken, Task task) {
        q.g(onToken, "$onToken");
        q.g(task, "task");
        try {
            String str = (String) task.k();
            if (str == null || !task.o()) {
                Exception j10 = task.j();
                if (j10 != null) {
                    INSTANCE.logError(j10);
                }
            } else {
                onToken.invoke(str);
            }
        } catch (Exception e10) {
            INSTANCE.logError(e10);
        }
    }

    private final void logError(Throwable th2) {
        Log log = Log.INSTANCE;
        String simpleName = th2.getClass().getSimpleName();
        q.f(simpleName, "javaClass.simpleName");
        log.w(simpleName, "Fetching FCM registration token failed", th2);
    }

    public final void getToken(final Function1<? super String, Unit> onToken) {
        q.g(onToken, "onToken");
        try {
            FirebaseMessaging.l().o().d(new e() { // from class: l2.a
                @Override // ga.e
                public final void onFailure(Exception exc) {
                    FCMTokenHelper.getToken$lambda$0(exc);
                }
            }).b(new d() { // from class: l2.b
                @Override // ga.d
                public final void a(Task task) {
                    FCMTokenHelper.getToken$lambda$1(Function1.this, task);
                }
            });
        } catch (Exception e10) {
            logError(e10);
        }
    }
}
