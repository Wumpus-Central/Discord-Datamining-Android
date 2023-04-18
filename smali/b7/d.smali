.class public final Lb7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb7/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt6/b<",
        "Lb7/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lb7/d;
    .locals 1

    invoke-static {}, Lb7/d$a;->a()Lb7/d;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lb7/a;
    .locals 2

    invoke-static {}, Lb7/b;->b()Lb7/a;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Lt6/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb7/a;

    return-object v0
.end method


# virtual methods
.method public b()Lb7/a;
    .locals 1

    invoke-static {}, Lb7/d;->c()Lb7/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb7/d;->b()Lb7/a;

    move-result-object v0

    return-object v0
.end method
