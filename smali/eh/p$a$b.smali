.class public final Leh/p$a$b;
.super Leh/p$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leh/p$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Leh/r;

.field private final b:[B


# direct methods
.method public constructor <init>(Leh/r;[B)V
    .locals 1

    const-string v0, "kotlinJvmBinaryClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Leh/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Leh/p$a$b;->a:Leh/r;

    iput-object p2, p0, Leh/p$a$b;->b:[B

    return-void
.end method

.method public synthetic constructor <init>(Leh/r;[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Leh/p$a$b;-><init>(Leh/r;[B)V

    return-void
.end method


# virtual methods
.method public final b()Leh/r;
    .locals 1

    iget-object v0, p0, Leh/p$a$b;->a:Leh/r;

    return-object v0
.end method
