.class public abstract Lzh/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzh/z$a;,
        Lzh/z$b;
    }
.end annotation


# instance fields
.field private final a:Lih/c;

.field private final b:Lih/g;

.field private final c:Lmg/a1;


# direct methods
.method private constructor <init>(Lih/c;Lih/g;Lmg/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lzh/z;->a:Lih/c;

    .line 3
    iput-object p2, p0, Lzh/z;->b:Lih/g;

    .line 4
    iput-object p3, p0, Lzh/z;->c:Lmg/a1;

    return-void
.end method

.method public synthetic constructor <init>(Lih/c;Lih/g;Lmg/a1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lzh/z;-><init>(Lih/c;Lih/g;Lmg/a1;)V

    return-void
.end method


# virtual methods
.method public abstract a()Llh/c;
.end method

.method public final b()Lih/c;
    .locals 1

    iget-object v0, p0, Lzh/z;->a:Lih/c;

    return-object v0
.end method

.method public final c()Lmg/a1;
    .locals 1

    iget-object v0, p0, Lzh/z;->c:Lmg/a1;

    return-object v0
.end method

.method public final d()Lih/g;
    .locals 1

    iget-object v0, p0, Lzh/z;->b:Lih/g;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lzh/z;->a()Llh/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
