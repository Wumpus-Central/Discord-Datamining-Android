.class public Lnet/time4j/calendar/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/time4j/calendar/b$e;,
        Lnet/time4j/calendar/b$f;,
        Lnet/time4j/calendar/b$b;,
        Lnet/time4j/calendar/b$c;,
        Lnet/time4j/calendar/b$d;,
        Lnet/time4j/calendar/b$g;
    }
.end annotation


# static fields
.field public static final a:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lnet/time4j/calendar/m;->k:Lnet/time4j/calendar/m;

    sput-object v0, Lnet/time4j/calendar/b;->a:Lfj/p;

    return-void
.end method

.method static synthetic a(J)Lnet/time4j/x0;
    .locals 0

    invoke-static {p0, p1}, Lnet/time4j/calendar/b;->c(J)Lnet/time4j/x0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lfj/p;Lfj/q;)I
    .locals 0

    invoke-static {p0, p1}, Lnet/time4j/calendar/b;->d(Lfj/p;Lfj/q;)I

    move-result p0

    return p0
.end method

.method private static c(J)Lnet/time4j/x0;
    .locals 2

    const-wide/16 v0, 0x5

    add-long/2addr p0, v0

    const/4 v0, 0x7

    invoke-static {p0, p1, v0}, Lnet/time4j/base/c;->d(JI)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lnet/time4j/x0;->h(I)Lnet/time4j/x0;

    move-result-object p0

    return-object p0
.end method

.method private static d(Lfj/p;Lfj/q;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Lfj/q<",
            "TD;>;>(",
            "Lfj/p<",
            "*>;TD;)I"
        }
    .end annotation

    const-class v0, Ljava/lang/Integer;

    invoke-virtual {p1, p0}, Lfj/q;->c(Lfj/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method
