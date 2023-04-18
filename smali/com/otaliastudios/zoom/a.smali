.class public final Lcom/otaliastudios/zoom/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0005J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/otaliastudios/zoom/a;",
        "",
        "",
        "alignment",
        "a",
        "(I)I",
        "b",
        "",
        "c",
        "(I)Z",
        "valueIfNone",
        "d",
        "(II)I",
        "e",
        "<init>",
        "()V",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final a:Lcom/otaliastudios/zoom/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/otaliastudios/zoom/a;

    invoke-direct {v0}, Lcom/otaliastudios/zoom/a;-><init>()V

    sput-object v0, Lcom/otaliastudios/zoom/a;->a:Lcom/otaliastudios/zoom/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 0

    and-int/lit16 p1, p1, 0xf0

    return p1
.end method

.method public final b(I)I
    .locals 0

    and-int/lit16 p1, p1, -0xf1

    return p1
.end method

.method public final c(I)Z
    .locals 1

    const/16 v0, 0x44

    if-eq p1, v0, :cond_1

    if-eqz p1, :cond_1

    const/16 v0, 0x40

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final d(II)I
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RtlHardcoded"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/otaliastudios/zoom/a;->a(I)I

    move-result p1

    const/16 v0, 0x10

    if-eq p1, v0, :cond_2

    const/16 v0, 0x20

    if-eq p1, v0, :cond_1

    const/16 v0, 0x30

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x5

    goto :goto_0

    :cond_2
    const/4 p2, 0x3

    :goto_0
    return p2
.end method

.method public final e(II)I
    .locals 1

    invoke-virtual {p0, p1}, Lcom/otaliastudios/zoom/a;->b(I)I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 p2, 0x10

    goto :goto_0

    :cond_1
    const/16 p2, 0x50

    goto :goto_0

    :cond_2
    const/16 p2, 0x30

    :goto_0
    return p2
.end method
