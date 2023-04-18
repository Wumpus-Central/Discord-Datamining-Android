.class final enum Lnet/time4j/g$d;
.super Lnet/time4j/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lnet/time4j/g;-><init>(Ljava/lang/String;ILnet/time4j/g$a;)V

    return-void
.end method


# virtual methods
.method public b()C
    .locals 1

    const/16 v0, 0x33

    return v0
.end method

.method public getLength()D
    .locals 2

    const-wide v0, 0x3f50624dd2f1a9fcL    # 0.001

    return-wide v0
.end method
