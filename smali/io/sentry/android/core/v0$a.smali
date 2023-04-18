.class final Lio/sentry/android/core/v0$a;
.super Landroid/telephony/PhoneStateListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/android/core/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:Lio/sentry/f0;


# direct methods
.method constructor <init>(Lio/sentry/f0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/v0$a;->a:Lio/sentry/f0;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public onCallStateChanged(ILjava/lang/String;)V
    .locals 1

    .line 1
    const/4 p2, 0x1

    .line 2
    if-ne p1, p2, :cond_0

    .line 3
    .line 4
    new-instance p1, Lio/sentry/d;

    .line 5
    .line 6
    invoke-direct {p1}, Lio/sentry/d;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string p2, "system"

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Lio/sentry/d;->p(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string p2, "device.event"

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lio/sentry/d;->l(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string p2, "action"

    .line 20
    .line 21
    const-string v0, "CALL_STATE_RINGING"

    .line 22
    .line 23
    invoke-virtual {p1, p2, v0}, Lio/sentry/d;->m(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const-string p2, "Device ringing"

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Lio/sentry/d;->o(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object p2, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Lio/sentry/d;->n(Lio/sentry/n3;)V

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, Lio/sentry/android/core/v0$a;->a:Lio/sentry/f0;

    .line 37
    .line 38
    invoke-interface {p2, p1}, Lio/sentry/f0;->e(Lio/sentry/d;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method
