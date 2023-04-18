.class public final Ldk/p;
.super Lmf/c;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldk/p$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lmf/c<",
        "Lokio/ByteString;",
        ">;",
        "Ljava/util/RandomAccess;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0005\n\u0002\u0010\u0015\n\u0002\u0008\u000c\u0018\u0000 \u00182\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0019B!\u0008\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u0008\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002R\"\u0010\r\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0012\u001a\u00020\u000e8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\t\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001a"
    }
    d2 = {
        "Ldk/p;",
        "Lmf/c;",
        "Lokio/ByteString;",
        "Ljava/util/RandomAccess;",
        "Lkotlin/collections/RandomAccess;",
        "",
        "index",
        "h",
        "",
        "l",
        "[Lokio/ByteString;",
        "i",
        "()[Lokio/ByteString;",
        "byteStrings",
        "",
        "m",
        "[I",
        "()[I",
        "trie",
        "b",
        "()I",
        "size",
        "<init>",
        "([Lokio/ByteString;[I)V",
        "n",
        "a",
        "okio"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final n:Ldk/p$a;


# instance fields
.field private final l:[Lokio/ByteString;

.field private final m:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldk/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldk/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldk/p;->n:Ldk/p$a;

    return-void
.end method

.method private constructor <init>([Lokio/ByteString;[I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lmf/c;-><init>()V

    iput-object p1, p0, Ldk/p;->l:[Lokio/ByteString;

    iput-object p2, p0, Ldk/p;->m:[I

    return-void
.end method

.method public synthetic constructor <init>([Lokio/ByteString;[ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ldk/p;-><init>([Lokio/ByteString;[I)V

    return-void
.end method

.method public static final varargs r([Lokio/ByteString;)Ldk/p;
    .locals 1

    sget-object v0, Ldk/p;->n:Ldk/p$a;

    invoke-virtual {v0, p0}, Ldk/p$a;->d([Lokio/ByteString;)Ldk/p;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget-object v0, p0, Ldk/p;->l:[Lokio/ByteString;

    array-length v0, v0

    return v0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lokio/ByteString;

    if-eqz v0, :cond_0

    check-cast p1, Lokio/ByteString;

    invoke-virtual {p0, p1}, Ldk/p;->f(Lokio/ByteString;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge f(Lokio/ByteString;)Z
    .locals 0

    invoke-super {p0, p1}, Lmf/a;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ldk/p;->h(I)Lokio/ByteString;

    move-result-object p1

    return-object p1
.end method

.method public h(I)Lokio/ByteString;
    .locals 1

    iget-object v0, p0, Ldk/p;->l:[Lokio/ByteString;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final i()[Lokio/ByteString;
    .locals 1

    iget-object v0, p0, Ldk/p;->l:[Lokio/ByteString;

    return-object v0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lokio/ByteString;

    if-eqz v0, :cond_0

    check-cast p1, Lokio/ByteString;

    invoke-virtual {p0, p1}, Ldk/p;->n(Lokio/ByteString;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final l()[I
    .locals 1

    iget-object v0, p0, Ldk/p;->m:[I

    return-object v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lokio/ByteString;

    if-eqz v0, :cond_0

    check-cast p1, Lokio/ByteString;

    invoke-virtual {p0, p1}, Ldk/p;->q(Lokio/ByteString;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public bridge n(Lokio/ByteString;)I
    .locals 0

    invoke-super {p0, p1}, Lmf/c;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge q(Lokio/ByteString;)I
    .locals 0

    invoke-super {p0, p1}, Lmf/c;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
