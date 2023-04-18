.class public final Llf/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llf/g0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Llf/g0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\n\n\u0002\u0008\n\u0008\u0087@\u0018\u0000 \u00152\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0014\u0008\u0001\u0012\u0006\u0010\u0012\u001a\u00020\r\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00d6\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u0012\u0004\u0008\u0010\u0010\u0011\u0088\u0001\u0012\u0092\u0001\u00020\r\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0017"
    }
    d2 = {
        "Llf/g0;",
        "",
        "",
        "f",
        "(S)Ljava/lang/String;",
        "",
        "e",
        "(S)I",
        "",
        "other",
        "",
        "c",
        "(SLjava/lang/Object;)Z",
        "",
        "k",
        "S",
        "getData$annotations",
        "()V",
        "data",
        "b",
        "(S)S",
        "l",
        "a",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final l:Llf/g0$a;


# instance fields
.field private final k:S


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llf/g0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llf/g0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llf/g0;->l:Llf/g0$a;

    return-void
.end method

.method private synthetic constructor <init>(S)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-short p1, p0, Llf/g0;->k:S

    return-void
.end method

.method public static final synthetic a(S)Llf/g0;
    .locals 1

    new-instance v0, Llf/g0;

    invoke-direct {v0, p0}, Llf/g0;-><init>(S)V

    return-object v0
.end method

.method public static b(S)S
    .locals 0

    return p0
.end method

.method public static c(SLjava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Llf/g0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Llf/g0;

    invoke-virtual {p1}, Llf/g0;->h()S

    move-result p1

    if-eq p0, p1, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static e(S)I
    .locals 0

    return p0
.end method

.method public static f(S)Ljava/lang/String;
    .locals 1

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Llf/g0;

    invoke-virtual {p1}, Llf/g0;->h()S

    move-result p1

    invoke-virtual {p0}, Llf/g0;->h()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    and-int/2addr p1, v1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/q;->i(II)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-short v0, p0, Llf/g0;->k:S

    invoke-static {v0, p1}, Llf/g0;->c(SLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic h()S
    .locals 1

    iget-short v0, p0, Llf/g0;->k:S

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-short v0, p0, Llf/g0;->k:S

    invoke-static {v0}, Llf/g0;->e(S)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-short v0, p0, Llf/g0;->k:S

    invoke-static {v0}, Llf/g0;->f(S)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
