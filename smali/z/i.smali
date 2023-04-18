.class public interface abstract Lz/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/i2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lw/i2;"
    }
.end annotation


# static fields
.field public static final s:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final t:Lw/r0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/r0$a<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "camerax.core.target.name"

    .line 2
    .line 3
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lz/i;->s:Lw/r0$a;

    .line 10
    .line 11
    const-string v0, "camerax.core.target.class"

    .line 12
    .line 13
    const-class v1, Ljava/lang/Class;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lw/r0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/r0$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lz/i;->t:Lw/r0$a;

    .line 20
    .line 21
    return-void
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
.method public abstract r(Ljava/lang/String;)Ljava/lang/String;
.end method
