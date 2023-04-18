.class final Lio/sentry/o2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/o2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lio/sentry/d;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/sentry/o2$a;)V
    .locals 0

    invoke-direct {p0}, Lio/sentry/o2$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/sentry/d;Lio/sentry/d;)I
    .locals 0

    invoke-virtual {p1}, Lio/sentry/d;->j()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p2}, Lio/sentry/d;->j()Ljava/util/Date;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lio/sentry/d;

    check-cast p2, Lio/sentry/d;

    invoke-virtual {p0, p1, p2}, Lio/sentry/o2$b;->a(Lio/sentry/d;Lio/sentry/d;)I

    move-result p1

    return p1
.end method
