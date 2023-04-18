.class final Landroidx/core/view/ContentInfoCompat$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/ContentInfoCompat$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/ContentInfoCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private final a:Landroid/view/ContentInfo;


# direct methods
.method constructor <init>(Landroid/view/ContentInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroidx/core/util/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/view/ContentInfo;

    .line 9
    .line 10
    iput-object p1, p0, Landroidx/core/view/ContentInfoCompat$e;->a:Landroid/view/ContentInfo;

    .line 11
    .line 12
    return-void
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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method


# virtual methods
.method public getExtras()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/ContentInfoCompat$e;->a:Landroid/view/ContentInfo;

    invoke-static {v0}, Landroidx/core/view/i;->a(Landroid/view/ContentInfo;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, Landroidx/core/view/ContentInfoCompat$e;->a:Landroid/view/ContentInfo;

    invoke-static {v0}, Landroidx/core/view/l;->a(Landroid/view/ContentInfo;)I

    move-result v0

    return v0
.end method

.method public k()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/ContentInfoCompat$e;->a:Landroid/view/ContentInfo;

    invoke-static {v0}, Landroidx/core/view/j;->a(Landroid/view/ContentInfo;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public l()Landroid/content/ClipData;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/ContentInfoCompat$e;->a:Landroid/view/ContentInfo;

    invoke-static {v0}, Landroidx/core/view/h;->a(Landroid/view/ContentInfo;)Landroid/content/ClipData;

    move-result-object v0

    return-object v0
.end method

.method public m()I
    .locals 1

    iget-object v0, p0, Landroidx/core/view/ContentInfoCompat$e;->a:Landroid/view/ContentInfo;

    invoke-static {v0}, Landroidx/core/view/k;->a(Landroid/view/ContentInfo;)I

    move-result v0

    return v0
.end method

.method public n()Landroid/view/ContentInfo;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/ContentInfoCompat$e;->a:Landroid/view/ContentInfo;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContentInfoCompat{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/core/view/ContentInfoCompat$e;->a:Landroid/view/ContentInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
