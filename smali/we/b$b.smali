.class public final Lwe/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\nR(\u0010\u000b\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0003\u0010\u0004\u0012\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R(\u0010\u000f\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0004\u0008\u000c\u0010\u0004\u0012\u0004\u0008\u000e\u0010\n\u001a\u0004\u0008\u0003\u0010\u0006\"\u0004\u0008\r\u0010\u0008R(\u0010\u0012\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0005\u0010\u0004\u0012\u0004\u0008\u0011\u0010\n\u001a\u0004\u0008\u000c\u0010\u0006\"\u0004\u0008\u0010\u0010\u0008R\"\u0010\u0019\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0014\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001b"
    }
    d2 = {
        "Lwe/b$b;",
        "",
        "",
        "a",
        "I",
        "c",
        "()I",
        "h",
        "(I)V",
        "getMinValue$library_release$annotations",
        "()V",
        "minValue",
        "b",
        "e",
        "getCurrentValue$library_release$annotations",
        "currentValue",
        "g",
        "getMaxValue$library_release$annotations",
        "maxValue",
        "",
        "d",
        "Z",
        "()Z",
        "f",
        "(Z)V",
        "isInOverPan",
        "<init>",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lwe/b$b;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lwe/b$b;->c:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lwe/b$b;->a:I

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lwe/b$b;->d:Z

    return v0
.end method

.method public final e(I)V
    .locals 0

    iput p1, p0, Lwe/b$b;->b:I

    return-void
.end method

.method public final f(Z)V
    .locals 0

    iput-boolean p1, p0, Lwe/b$b;->d:Z

    return-void
.end method

.method public final g(I)V
    .locals 0

    iput p1, p0, Lwe/b$b;->c:I

    return-void
.end method

.method public final h(I)V
    .locals 0

    iput p1, p0, Lwe/b$b;->a:I

    return-void
.end method
