package io.sentry;

/* renamed from: io.sentry.f1 */
/* loaded from: classes8.dex */
public interface AbstractC8862f1 {

    /* renamed from: io.sentry.f1$a */
    /* loaded from: classes8.dex */
    public enum EnumC8863a implements AbstractC8862f1 {
        NANOSECOND,
        MICROSECOND,
        MILLISECOND,
        SECOND,
        MINUTE,
        HOUR,
        DAY,
        WEEK;

        public /* bridge */ /* synthetic */ String apiName() {
            return C8853e1.m17865a(this);
        }
    }

    String name();
}
