.class public final Lio/sentry/protocol/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/protocol/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/sentry/r0<",
        "Lio/sentry/protocol/p;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lio/sentry/x0;Lio/sentry/g0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lio/sentry/protocol/p$a;->b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/protocol/p;

    move-result-object p1

    return-object p1
.end method

.method public b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/protocol/p;
    .locals 0

    new-instance p2, Lio/sentry/protocol/p;

    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->t0()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lio/sentry/protocol/p;-><init>(Ljava/lang/String;)V

    return-object p2
.end method
