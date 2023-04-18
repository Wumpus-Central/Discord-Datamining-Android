.class public final Lgg/x$a;
.super Lgg/c0$c;
.source "SourceFile"

# interfaces
.implements Ldg/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgg/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Lgg/c0$c<",
        "TR;>;",
        "Ldg/g$a<",
        "TR;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000*\u0006\u0008\u0001\u0010\u0001 \u00012\u0008\u0012\u0004\u0012\u00028\u00010\u00022\u0008\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0004\u001a\u00028\u0001H\u0096\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R \u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lgg/x$a;",
        "R",
        "Lgg/c0$c;",
        "Ldg/g$a;",
        "invoke",
        "()Ljava/lang/Object;",
        "Lgg/x;",
        "r",
        "Lgg/x;",
        "D",
        "()Lgg/x;",
        "property",
        "<init>",
        "(Lgg/x;)V",
        "kotlin-reflection"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final r:Lgg/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgg/x<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgg/x;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgg/x<",
            "+TR;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "property"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lgg/c0$c;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lgg/x$a;->r:Lgg/x;

    .line 10
    .line 11
    return-void
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
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public bridge synthetic B()Lgg/c0;
    .locals 1

    invoke-virtual {p0}, Lgg/x$a;->D()Lgg/x;

    move-result-object v0

    return-object v0
.end method

.method public D()Lgg/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgg/x<",
            "TR;>;"
        }
    .end annotation

    iget-object v0, p0, Lgg/x$a;->r:Lgg/x;

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    invoke-virtual {p0}, Lgg/x$a;->D()Lgg/x;

    move-result-object v0

    invoke-virtual {v0}, Lgg/x;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic n()Lkotlin/reflect/KProperty;
    .locals 1

    invoke-virtual {p0}, Lgg/x$a;->D()Lgg/x;

    move-result-object v0

    return-object v0
.end method
