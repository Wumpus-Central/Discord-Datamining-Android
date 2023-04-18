.class final Lwj/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwj/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB\u0019\u0008\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u0011R!\u0010\u0006\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\nR\u0017\u0010\r\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\t\u001a\u0004\u0008\u000c\u0010\n\u00a8\u0006\u0012"
    }
    d2 = {
        "Lwj/k$a;",
        "",
        "",
        "a",
        "[Lwj/k$a;",
        "()[Lwj/k$a;",
        "children",
        "",
        "b",
        "I",
        "()I",
        "symbol",
        "c",
        "terminalBitCount",
        "<init>",
        "()V",
        "bits",
        "(II)V",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field private final a:[Lwj/k$a;

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    new-array v0, v0, [Lwj/k$a;

    iput-object v0, p0, Lwj/k$a;->a:[Lwj/k$a;

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwj/k$a;->b:I

    .line 3
    iput v0, p0, Lwj/k$a;->c:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lwj/k$a;->a:[Lwj/k$a;

    .line 5
    iput p1, p0, Lwj/k$a;->b:I

    and-int/lit8 p1, p2, 0x7

    if-nez p1, :cond_0

    const/16 p1, 0x8

    .line 6
    :cond_0
    iput p1, p0, Lwj/k$a;->c:I

    return-void
.end method


# virtual methods
.method public final a()[Lwj/k$a;
    .locals 1

    iget-object v0, p0, Lwj/k$a;->a:[Lwj/k$a;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lwj/k$a;->b:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lwj/k$a;->c:I

    return v0
.end method
