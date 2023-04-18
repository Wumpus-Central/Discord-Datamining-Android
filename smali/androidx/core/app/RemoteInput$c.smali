.class Landroidx/core/app/RemoteInput$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/RemoteInput;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# direct methods
.method static a(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Landroid/app/RemoteInput;

    invoke-static {p0}, Landroidx/core/app/w3;->a(Landroid/app/RemoteInput;)I

    move-result p0

    return p0
.end method

.method static b(Landroid/app/RemoteInput$Builder;I)Landroid/app/RemoteInput$Builder;
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/app/v3;->a(Landroid/app/RemoteInput$Builder;I)Landroid/app/RemoteInput$Builder;

    move-result-object p0

    return-object p0
.end method
