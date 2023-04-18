.class public final Lgg/k$d;
.super Lgg/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgg/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0005\u001a\u0004\u0008\t\u0010\u0007\u00a8\u0006\r"
    }
    d2 = {
        "Lgg/k$d;",
        "Lgg/k;",
        "",
        "a",
        "Lgg/j$e;",
        "Lgg/j$e;",
        "b",
        "()Lgg/j$e;",
        "getterSignature",
        "c",
        "setterSignature",
        "<init>",
        "(Lgg/j$e;Lgg/j$e;)V",
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
.field private final a:Lgg/j$e;

.field private final b:Lgg/j$e;


# direct methods
.method public constructor <init>(Lgg/j$e;Lgg/j$e;)V
    .locals 1

    .line 1
    const-string v0, "getterSignature"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lgg/k;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lgg/k$d;->a:Lgg/j$e;

    .line 11
    .line 12
    iput-object p2, p0, Lgg/k$d;->b:Lgg/j$e;

    .line 13
    .line 14
    return-void
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
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgg/k$d;->a:Lgg/j$e;

    invoke-virtual {v0}, Lgg/j$e;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lgg/j$e;
    .locals 1

    iget-object v0, p0, Lgg/k$d;->a:Lgg/j$e;

    return-object v0
.end method

.method public final c()Lgg/j$e;
    .locals 1

    iget-object v0, p0, Lgg/k$d;->b:Lgg/j$e;

    return-object v0
.end method
