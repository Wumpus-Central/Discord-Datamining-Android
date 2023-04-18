.class public abstract Lya/b;
.super Lqa/b;
.source "SourceFile"

# interfaces
.implements Lya/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.nearby.messages.internal.ISubscribeCallback"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lqa/b;-><init>(Ljava/lang/String;)V

    .line 4
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
.end method


# virtual methods
.method protected final b(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    invoke-interface {p0}, Lya/c;->a()V

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
