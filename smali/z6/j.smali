.class public final Lz6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz6/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt6/b<",
        "Lz6/e;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lz6/j;
    .locals 1

    invoke-static {}, Lz6/j$a;->a()Lz6/j;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lz6/e;
    .locals 2

    invoke-static {}, Lz6/f;->d()Lz6/e;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Lt6/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/e;

    return-object v0
.end method


# virtual methods
.method public b()Lz6/e;
    .locals 1

    invoke-static {}, Lz6/j;->c()Lz6/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz6/j;->b()Lz6/e;

    move-result-object v0

    return-object v0
.end method
