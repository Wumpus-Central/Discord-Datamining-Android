.class public final Lqa/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/io/File;


# direct methods
.method static a()Ljava/io/File;
    .locals 1

    sget-object v0, Lqa/r0;->a:Ljava/io/File;

    return-object v0
.end method

.method public static b(Ljava/io/File;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "NearbyConnections"

    .line 4
    .line 5
    const-string v0, "Cannot set null temp directory"

    .line 6
    .line 7
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sput-object p0, Lqa/r0;->a:Ljava/io/File;

    .line 12
    .line 13
    return-void
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
