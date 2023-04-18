.class public Lqc/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lic/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lic/d<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lqc/i$a;

    invoke-direct {v0}, Lqc/i$a;-><init>()V

    const-class v1, Lqc/h;

    invoke-static {v0, v1}, Lic/d;->i(Ljava/lang/Object;Ljava/lang/Class;)Lic/d;

    move-result-object v0

    return-object v0
.end method
