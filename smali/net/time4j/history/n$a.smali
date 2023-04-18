.class final enum Lnet/time4j/history/n$a;
.super Lnet/time4j/history/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/history/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lnet/time4j/history/n;-><init>(Ljava/lang/String;ILnet/time4j/history/n$a;)V

    return-void
.end method


# virtual methods
.method a(Lnet/time4j/history/o;Lnet/time4j/history/h;)I
    .locals 0

    invoke-virtual {p2}, Lnet/time4j/history/h;->f()I

    move-result p1

    return p1
.end method

.method b(Lnet/time4j/history/j;I)Lnet/time4j/history/h;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, p2, v0, v0}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    move-result-object p1

    return-object p1
.end method
